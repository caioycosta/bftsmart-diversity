package main

import "bftsmartserver"
import "os"
import "fmt"
import "bftbench"
import "github.com/golang/protobuf/proto"
import "strconv"

type replica struct {
    resp_size int
    interval int
}

func (r * replica) ExecuteOrdered(command []byte) []byte {
    return r.execute(command);
}

func (r * replica) ExecuteUnordered(command []byte) []byte {
    return r.execute(command);
}

func (r * replica) GetSnapshot() []byte {
    est := new(bftbench.Estado)
    data, err := proto.Marshal(est)
    chekError(err)
    return data;
}

func (r * replica) InstallSnapshot(state []byte) {
    est := new(bftbench.Estado)
    err := proto.Unmarshasl(state, est)
    checkError(err)
}

func (r * replica) execute(command []byte) []byte {
	req := new(bftbench.Request)
	err := proto.Unmarshal(command, req)
	checkError(err)

	rsp := new(bftbench.Response)

	var resp []byte = make([]byte, r.resp_size);
	for i, _ := range resp {
		resp[i] = 0xFF;
        }
	rsp.Data = resp;

	data, err := proto.Marshal(rsp)
	checkError(err)
	return data;
}

func main() {
	i, err := strconv.Atoi(os.Args[1])
	checkError(err)
	s, err := strconv.Atoi(os.Args[3])
	checkError(err)
        inte, err := strconv.Atoi(os.Args[4])
        checkError(err)
	r := replica{ resp_size: s, interval: inte }
	bftsmartserver.StartServiceReplica(i, os.Args[2], &r);
	bftsmartserver.FinalizarJvm()
	fmt.Println("main finalizou")
}


func checkError(err error){
	if err != nil {
		fmt.Fprintf(os.Stderr, "Fatal error: %s", err.Error())
		os.Exit(1)
	}
}