import java.rmi.RemoteException;

public class RadiusCircle implements RadiusCircleInterface{
    public double calculateArea(int radius) throws RemoteException{
        System.out.println("Calculating The Area with given radius");
        return 3.1415 * radius * radius;
    }
    
    @Override
    public void printMsg(String msg) throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println(msg);
        
    }
}
