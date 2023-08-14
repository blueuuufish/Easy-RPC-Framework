package programpoppy.rpc.transport;

import com.alibaba.nacos.common.utils.ReflectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import programpoppy.rpc.provider.ServiceProvider;
import programpoppy.rpc.registry.ServiceRegistry;
import programpoppy.rpc.util.ReflectUtil;

public abstract class AbstractRpcServer implements RpcServer{
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected String host;
    protected int port;

    protected ServiceRegistry serviceRegistry;
    protected ServiceProvider serviceProvider;

    public void scanServices() {
        String mainClassName = ReflectUtil.getStackTrace();
        Class<?> startClass;
        try {
            startClass = Class.forName(mainClassName);
        } catch () {

        }
    }

}
