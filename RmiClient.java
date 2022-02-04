import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
  
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.getRegistry();

            RadiusCircleInterface stub = (RadiusCircleInterface) reg.lookup("koshi");

            double area = stub.calculateArea(100);
            System.out.println(area);
            stub.printMsg("Hello From Client");
            System.out.println("Method Invoked");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
