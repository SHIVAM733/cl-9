// Creating a Search interface
import java.rmi.*;
public interface Search extends Remote
{
	// Declaring the method prototype
	public String query(String search,String s2) throws RemoteException;
}
