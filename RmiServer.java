import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer {
    public RmiServer(){

    }   
    
    public static void main(String[] args) {
        try{
            Product p = new Product();

            ProductInterface skeleton = (ProductInterface) UnicastRemoteObject.exportObject(p, 1111);
            Registry reg = LocateRegistry.getRegistry();
            reg.bind("koshi1", skeleton);
            // reg.unbind("koshi");
            System.out.println("Registry Complete");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
