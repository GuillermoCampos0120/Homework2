package com.spark.guillermo

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import scala.util.Random
import org.apache.spark.mllib.stat.Statistics



object exercise3 {
  def main(args: Array[String]) {
    val bigrng = scala.util.Random.shuffle(1 to 1000000)
    val bigrng2 = bigrng.map(_ * 2)
    bigrng.min
    bigrng.max
    
    
 }
   