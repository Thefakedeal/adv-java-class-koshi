import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
  
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.getRegistry();

            ProductInterface stub = (ProductInterface) reg.lookup("koshi1");

            System.out.println(stub.product(2, 3));
            System.out.println("Method Invoked");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
