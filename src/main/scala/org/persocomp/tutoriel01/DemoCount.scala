package org.persocomp.tutoriel01

import org.apache.spark.{SparkConf, SparkContext}

object DemoCount {
  def main(args: Array[String]): Unit ={
    val myFile = "src/main/scala/org/persocomp/tutoriel1/DemoCount.scala"
    val conf = new SparkConf().setAppName("Hello Spark").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val textFileFile = sc.textFile(myFile,2).cache()
    val numAs = textFileFile.filter(line => line.contains("val")).count()
    println("#### Hello Spark")
    println("#### Lines with word val: %s".format(numAs))
  }
}