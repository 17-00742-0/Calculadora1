/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author lubuntu
 */
public class Cliente {
    public static void main(String[] args){
       
        String Ip = new String();
        Ip =  JOptionPane.showInputDialog("localhost");
        
        try{
            
            Registry miRegistro = LocateRegistry.getRegistry(Ip, 1099);

            Calculadora c = (Calculadora) Naming.lookup("//"+Ip+"/Calc");
            boolean Seguir = true;
            while (Seguir){
               String menu = JOptionPane.showInputDialog("Bienvenido a Calculadora!!!\n"
                       + "1- Suma\n"
                       + "2- Resta\n"
                       + "3- Multiplicacion\n"
                       + "4- Division\n"
                       + "5- Modulo\n "
                       + "exit) Salir");
               
               switch(menu){
                   case "1":{
                       try
                       { 
                            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el digito 1"));                    
                            int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el digito 2"));
                            JOptionPane.showMessageDialog(null,"El resutado de la suma de "+x+" + "+y+" es: " +c.suma(x, y));
                       }
                       catch(NumberFormatException e)
                       {
                            JOptionPane.showMessageDialog(null,"ERROR! El numero no es correcto"+ e.getMessage());
                       }
                       
                            break;
                                
                   }
                   case "2":{
                       try
                       {
                            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el digito 1"));                    
                            int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el digito 2"));
                            JOptionPane.showMessageDialog(null,"El resutado de la resta de "+x+" - "+y+" es: " +c.resta(x, y));
                       }
                       catch(NumberFormatException e)
                       {
                            JOptionPane.showMessageDialog(null,"ERROR! El numero no es correcto"+ e.getMessage());
                       }
                         
                            break;
                   }
                   case "3":{
                       try
                       {
                            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));                    
                            int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                            JOptionPane.showMessageDialog(null,"El resutado de la multiplicacion de "+x+" * "+y+" es: " +c.multiplicacion(x, y));
                       }
                       catch(NumberFormatException e)
                       {
                            JOptionPane.showMessageDialog(null,"ERROR! El numero no es correcto"+ e.getMessage());
                       }
                         
                            break;
                   }
                   case "4":{

                        try{
                            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));                    
                            int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                            int resul =  c.division(x, y);
                            if (resul ==0) 
                            {
                                JOptionPane.showMessageDialog(null,"ERROR! No se puede dividir entre 0");
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"El resutado de la de "+x+" / "+y+" es: " +c.division(x, y));
                            }                           
                            }catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null,"ERROR! El numero no es correcto"+ e.getMessage());                          
                            }                                   
                                break;}
                                
                   case "5":{

                        try{
                            int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));                    
                            int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                            int resul= c.Modulo(x, y);
                            
                                JOptionPane.showMessageDialog(null,"El resutado de la de "+x+" % "+y+" es: " +c.Modulo(x, y));
                                                     
                            }catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null,"ERROR! El numero no es correcto"+ e.getMessage());                          
                            }                                   
                                break;
                    }

                   case "exit":{                      
                       JOptionPane.showMessageDialog(null,"Se ha dado de alta de Calculadora!\n");                       
                       Seguir = false;                       
                   }
                }
            }            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR! No existe conexion con el servidor");
        }   
    }
}
