module no.ssb.dapla.metadata.distributor.protobuf {
    requires com.google.common;
    requires io.grpc;
    requires grpc.stub;
    requires com.google.protobuf;
    requires grpc.protobuf;
    requires java.annotation;

    exports no.ssb.dapla.metadata.distributor.protobuf;
    opens no.ssb.dapla.metadata.distributor.protobuf;
}