PASTAJAVA := $(shell ../../../scripts/findjava.sh)
INCL=-I../../../diversity/c/headers -I$(PASTAJAVA)/include/ -I$(PASTAJAVA)/include/linux -I../../protobuf/array/build
LIBS=-L $(PASTAJAVA)/jre/lib/amd64/server
#INCL += `PKG_CONFIG_PATH=../../../protobuf/build/lib/pkgconfig pkg-config --cflags --libs libprotobuf-c protobuf | sed 's/-lprotobuf-c//' | sed 's/-lprotobuf//'`
INCL += `PKG_CONFIG_PATH=../../../protobuf/build/lib/pkgconfig pkg-config --cflags --libs protobuf | sed 's/-lprotobuf//'`
CCFLAGS=-g -Wextra -Wall 
CPFLAGS=-g -Wextra -Wall -fpermissive --std=c++0x
#SFX=../../../protobuf/build/lib/libprotobuf-c.a
SFX=../../../protobuf/build/lib/libprotobuf.a

bench_server: 
	-mkdir build
	g++ $(CPFLAGS) -o build/bench_server.out $(INCL) $(LIBS) ../../protobuf/array/build/*.pb.cc bench_server.cpp ../../../diversity/c/build/wrapper.o ../../../diversity/c/build/bftsmart-c-server.o $(SFX) -ljvm

.PHONY: clean

clean:
	rm -rfv *.o *~ *.out build



   


