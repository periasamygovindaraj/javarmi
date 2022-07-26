
import java.rmi.*;

public interface Iremote extends Remote
{
	public int multi(int x,int y)throws RemoteException ;
}
