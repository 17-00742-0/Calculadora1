/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
/**
 *
 * @author lubuntu
 */
public class RMI extends UnicastRemoteObject implements Calculadora{
    public RMI ()throws RemoteException{super( );
        int a, b;
    }
    public String notifyme (String message){
        String returnMessage = "Call back received: " + message;
        System.out.println(returnMessage);
        return returnMessage;
    }
    public int suma(int a, int b) throws RemoteException{
        return a + b;
    }
    public int resta(int a, int b) throws RemoteException{
        return a - b;
    }
    public int multiplicacion(int a, int b) throws RemoteException{
        return a * b;
    }
    public int division(int a, int b) throws RemoteException{
        if (b==0) 
        {
            return 0;
            
        }
        return a / b;
    }
    public int Modulo(int a, int b) throws RemoteException{
        if (b==0) 
        {
            return 0;
            
        }
        return a % b;
    }
}
