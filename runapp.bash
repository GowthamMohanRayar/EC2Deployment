#!/bin/bash
echo 'Starting my app'
cd /home/ec2-user/jarFromCode
java -jar Ec2Deploy-0.0.1-SNAPSHOT.jar > /dev/null 2>&1
exit 0