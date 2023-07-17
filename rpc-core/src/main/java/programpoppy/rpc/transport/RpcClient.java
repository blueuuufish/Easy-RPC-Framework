package programpoppy.rpc.transport;

import programpoppy.rpc.entity.RpcRequest;
import programpoppy.rpc.serializer.CommonSerializer;

public interface RpcClient {
    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);
}
