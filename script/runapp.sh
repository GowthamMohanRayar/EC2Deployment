#!/bin/bash
echo 'Starting my app'
for entry in "$search_dir"/*
do
  echo "$entry"
done
java -jar Ec2Deploy-0.0.1-SNAPSHOT.jar