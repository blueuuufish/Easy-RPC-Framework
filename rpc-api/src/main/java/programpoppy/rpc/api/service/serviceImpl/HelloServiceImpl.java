package programpoppy.rpc.api.service.serviceImpl;


import lombok.extern.slf4j.Slf4j;
import programpoppy.rpc.api.dto.HelloObject;
import programpoppy.rpc.api.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到：{}", object.getMessage());
        return "这是掉用的返回值，id=" + object.getId();
    }
}
