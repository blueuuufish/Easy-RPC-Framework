package programpoppy.rpc.provider;

public interface ServiceProvider {

    <T> void addServiceProvider(T service, String serviceName);

    Object gerServiceProvider(String serviceName);
}
