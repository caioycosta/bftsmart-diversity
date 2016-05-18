# bftsmart-diversity
bftsmart-diversity is a library for creating diversified applications in BFT-SMaRt.

## Requirements
* GNU Make
* java-7-openjdk-amd64 (should work with Java 8, but must be 64bit at the moment)
* Following libraries in lib:
    * BFT-SMaRt.jar  
    * commons-codec-1.5.jar  
    * core-0.1.4.jar  
    * netty-all-4.0.25.Final.jar  
    * slf4j-api-1.5.8.jar  
    * slf4j-jdk14-1.5.8.jar
* gcc and g++
* python
* python setuptools

## Building
1. Run make
2. That's all!

## Running
Run "make run id=0" inside each demo folder to run that specific demo
(e.g. demos/list/python) with replica id "0" (zero).
"id" is the id of the replica, configure accordingly.
