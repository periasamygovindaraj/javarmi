import java.rmi.*;  
public class MyClient{  
public static void main(String args[]){  
try{  
Iremote stub=(Iremote)Naming.lookup("rmi://localhost:5000/sonoo");  
System.out.println(stub.multi(34,4));  
}catch(Exception e){}  
}  
}  
