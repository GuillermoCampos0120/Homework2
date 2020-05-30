package com.spark.guillermo

import org.apache.spark._
import org.apache.spark.SparkContext._
import org.apache.log4j._
import org.apache.spark.sql.SparkSession



object prb1 {
  def main(args: Array[String]) {
    val retval = for{ a <- 1 to 45
                      if a % 3 == 0
                      
    } yield a
    val sum = retval.reduceLeft[Int](_+_)
    println("The sum of all multiples of 4  is " + sum)
  }
}