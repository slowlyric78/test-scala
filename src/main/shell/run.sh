#!/usr/bin/env bash

export BASE="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

$SPARK_HOME/bin/spark-submit --class lyric.slow.spark.SparkPi --master yarn $BASE/../../../target/scala-2.11/test-scala_2.11-0.5.jar