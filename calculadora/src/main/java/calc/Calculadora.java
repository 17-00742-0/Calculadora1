/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author lubuntu
 */
public interface Calculadora extends Remote{
    public String notifyme (String Message) throws java.rmi.RemoteException;
    public int suma(int a, int b)throws RemoteException;
    public int resta(int a, int b)throws RemoteException;
    public int multiplicacion(int a, int b)throws RemoteException;
    public int division(int a, int b)throws RemoteException;
    public int Modulo(int a, int b)throws RemoteException;
}

    
