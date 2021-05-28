/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.rmi.registry.Registry;
import javax.swing.JOptionPane;


public class Calc {
     public static void main(String[] args) {
        try{
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
                r.rebind("Calc", new RMI());
                JOptionPane.showMessageDialog(null, "EL Servidor se ha conectado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR!! EL Servidor no concectado"+ e);
        }
    }   
}
