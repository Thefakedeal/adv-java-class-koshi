import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProductInterface extends Remote{
    public int product(int n1,int n2) throws RemoteException;
}
