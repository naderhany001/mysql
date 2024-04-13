#!/bin/bash

JAVA_LIBS='/usr/share/java/mysql-connector-java-8.3.0.jar'


# Check if at least one argument is provided
if [ $# -eq 0 ]; then
  echo "Error: Please provide an argument (run or clean)."
  exit 1
fi

# Check the first argument
if [ "$1" == "run" ]; then
  echo "compiling helloMysql..."
  javac -cp .:${JAVA_LIBS} helloMysql.java
  echo "running helloMysql..."
  java  -cp .:${JAVA_LIBS} helloMysql
  echo "ending helloMysql..."

elif [ "$1" == "clean" ]; then
  echo "Cleaning helloMysql..."
  rm -rf *.class
else
  echo "Error: Invalid argument. Please use 'run' or 'clean'."
  exit 1
fi