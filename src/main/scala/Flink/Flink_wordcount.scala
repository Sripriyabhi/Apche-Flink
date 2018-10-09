package Flink

import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.api.windowing.time.Time


object Flink_wordcount {


  def main(args: Array[String]): Unit = {

  // env is like sc in spark
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    //create stream using socket
    val socketStream = env.socketTextStream("localhost",9000)

    //wordcount Logic
    val wordsStream = socketStream.flatMap(value => value.split("\\s+")).map(value => (value,1))

    //val keyValuePair = wordsStream.keyBy(0)

    //Windowing
    //creates a window using timeWindow API. timeWindow API internally uses tumbling window API
    // to do the windowing operation.
    // In this case, the wordcount will be counted for each 15 seconds and then forgotten.
    val keyValuePair = wordsStream.keyBy(0).timeWindow(Time.seconds(5))

    val countPair = keyValuePair.sum(1)



    countPair.print()

    //start streaming
    env.execute()


  }

}
