import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            // création de l'objet distant
            MyRemoteService service = new MyRemoteServiceImpl();

            // creation du registre RMI sur le port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Enregistrement de l'objet distant dans le registre
            registry.rebind("MyRemoteService", service);

            System.out.println("RMI server is ready");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
