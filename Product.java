import java.rmi.RemoteException;

public class Product implements ProductInterface {
    
    public int product(int n1, int n2) throws RemoteException{
        return n1*n2;
    }
}
