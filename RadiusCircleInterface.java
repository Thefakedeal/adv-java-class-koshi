import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RadiusCircleInterface extends Remote{
    public double calculateArea(int radius) throws RemoteException;
    public void printMsg(String msg) throws RemoteException;
}
