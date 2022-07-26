import java.rmi.*;  
import java.rmi.server.*; 

public class Exremote extends UnicastRemoteObject implements Iremote
{
 
Exremote()throws RemoteException{  
super();  
}  
public int multi(int x,int y){return x*y;}  
}  	

