import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class MyRemoteServiceImpl extends UnicastRemoteObject implements MyRemoteService {
    protected MyRemoteServiceImpl() throws RemoteException {
        super();
    }
    @Override
    public String sayHello() throws RemoteException {
        return "Hello from the RMI server";
    }
}
