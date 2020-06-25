#!/bin/bash

mvn clean verify

  'OR'
  
mvn clean package -DskipTests=true
