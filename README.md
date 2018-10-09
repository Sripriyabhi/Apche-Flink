# Flink 

What is Flink?

Now a days  stream processing is becoming more and more prevalent in data processing, Apache Flink is one of the powerful stream processing engine with features like fault tolerant, distributed, low latency and high throughput . 

It is a very fast new generation Big data processing framework also known as 4G of Big data. It is a Single unified framework for:
Batch processing,
Interactive processing,
Real-time processing,
Graph processing,
Iterative processing,
In-memory processing,
Machine Learning.

In this post I will show how to  write a  simple stream processing  algorithm using  Apache Flink. 


Why Flink when we have Spark?


Both Flink and Spark are unified processing platform where you can run batch, streaming, interactive, graph processing, Machine Learning etc. Flink doesn’t differ much in terms of ideology compared to Spark but they do differ a lot in the implementation details. Flink is needed when an application requires real time processing though Spark 2.3 has a new concept called  “continuous stream processing” which is still experimental.

