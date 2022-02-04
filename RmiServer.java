import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer {
    public RmiServer(){

    }   
    
    public static void main(String[] args) {
        try{
            RadiusCircle rc = new RadiusCircle();

            RadiusCircleInterface skeleton = (RadiusCircleInterface) UnicastRemoteObject.exportObject(rc, 1111);
            Registry reg = LocateRegistry.getRegistry();
            reg.bind("koshi", skeleton);
            // reg.unbind("koshi");
            System.out.println("Registry Complete");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
