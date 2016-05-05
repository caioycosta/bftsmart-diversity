#!/bin/bash

[ $# -eq 0 ] && { echo "Usage: $0 config_folder id_replica"; exit 1; }


#sair imediatamente em caso de erro
set -e

BASEFOLDER=`pwd`/`dirname $0`

LIBCLSPTH=../../../lib
DIVCLSPTH=../../../bft-smart/java/dist
FACDCLSPTH=../../../python
DLLCLSPTH=../../../bft-smart/intermediate/dist
PROTOCLSPTH=../protobuf/build

PASTAJAVA=$($BASEFOLDER/../../../../util/findjava.sh)

export LD_LIBRARY_PATH=$PASTAJAVA/jre/lib/amd64/server
export PYTHONPATH=$BASEFOLDER/$FACDCLSPTH:$BASEFOLDER:$BASEFOLDER/$PROTOCLSPTH:$BASEFOLDER/../../protobuf/build/lib/python2.7/site-packages

echo 'Library path' $LD_LIBRARY_PATH
echo 'python path' $PYTHONPATH

cd $1

echo "-Djava.class.path=$BASEFOLDER/$LIBCLSPTH/BFT-SMaRt.jar:$BASEFOLDER/$LIBCLSPTH/sl4j-api-1.5.8.jar:$BASEFOLDER/$LIBCLSPATH/slf4j-jdk14-1.5.8.jar:$BASEFOLDER/$LIBCLSPATH/netty-3.1.1.GA.jar:$BASEFOLDER/$LIBCLSPATH/commons-codec-1.5.jar:$BASEFOLDER/$DIVCLSPTH/bftsmart-diversity.jar" $2 $BASEFOLDER/$DLLCLSPTH/libbftsmr.so

echo
echo

$BASEFOLDER/build/bench_server.out $2 "-Djava.class.path=$BASEFOLDER/$LIBCLSPTH/BFT-SMaRt.jar:"\
"$BASEFOLDER/$LIBCLSPTH/sl4j-api-1.5.8.jar:"\
"$BASEFOLDER/$LIBCLSPTH/slf4j-jdk14-1.5.8.jar:"\
"$BASEFOLDER/$LIBCLSPTH/netty-3.1.1.GA.jar:"\
"$BASEFOLDER/$LIBCLSPTH/commons-codec-1.5.jar:"\
"$BASEFOLDER/$DIVCLSPTH/bftsmart-diversity.jar"



