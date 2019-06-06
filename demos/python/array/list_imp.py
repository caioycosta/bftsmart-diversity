#!/usr/bin/python

import sys
import logging
import Estado_pb2
import Request_pb2
import Response_pb2
import monotonic
from bftsmart_serverlib import *
from array import array

class BFTList(BFTSMaRtServer):
    def __init__(self,classpth,id,dllpath,respsize,interval):
        super(BFTList,self).__init__(classpth,id,dllpath)
        self.respsize = int(respsize)
        self.rqst_count = 0
        self.interval = int(interval)
        self.start_time = 0

    def execute(self, input):
        if self.start_time == 0:
            self.start_time = monotonic.monotonic()
        logging.info("execute")
        req = Request_pb2.Request()
        req.ParseFromString(input)
        rsp = Response_pb2.Response()
        x = bytearray(self.respsize)
        s = array('B', x)
	rsp.Data = s.tostring()
        self.rqst_count = self.rqst_count+1
        print self.rqst_count
        print self.interval
        if self.rqst_count >= self.interval:
            print "yes"
            now = monotonic.monotonic()
            print "Throughput: {0} /s".format(self.rqst_count / (now - self.start_time))
            self.rqst_count = 0
            self.start_time = monotonic.monotonic()
        return rsp.SerializeToString()

    def invokeOrdered(self, input):
        return self.execute(input)

    def invokeUnordered(self, input):
        return self.execute(input)

    def getSnapshot(self):
        est = Estado_pb2.Estado()
        return est.SerializeToString()

    def installSnapshot(self, input):
        est = Estado_pb2.Estado()
        est.ParseFromString(input)



