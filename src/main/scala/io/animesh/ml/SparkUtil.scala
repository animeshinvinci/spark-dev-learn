package io.animesh.ml

import org.apache.spark.sql.SparkSession

object SparkUtil {

  val sparkSession = SparkSession.builder.master("local[*]")
    .appName("SparkAppRun")
    .getOrCreate()
  val sc=sparkSession.sparkContext

  val sqlContext= sparkSession.sqlContext

}
