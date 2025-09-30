import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Connexion au registre RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Recherche de l'objet distant
            MyRemoteService service = (MyRemoteService) registry.lookup("MyRemoteService");

            // Appel de la méthode distante
            String response = service.sayHello();
            System.out.println("Response from server: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}