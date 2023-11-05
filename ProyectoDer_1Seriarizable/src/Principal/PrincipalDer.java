/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import controlador.Controlador;
import proyectoder.Cliente;
import java.io.IOException;
import org.xml.sax.SAXException;
import proyectoder.Ventana1;

/**
 *
 * @author raulm
 */
public class PrincipalDer{
    public static void main (String[] avgs){
        
        try{
           Ventana1 ventana1 = new Ventana1();
           ventana1.setVisible(true);
           Controlador controlador = new Controlador();
           Cliente cliente1 = new Cliente("000A", "Raúl", "Martin", 1999);
            System.out.println(cliente1.toString());
            System.out.println();
            
        }catch(IOException ioe){
            System.out.println("Error");
            System.out.println(ioe.getMessage());
        }
        catch(ClassNotFoundException ce){
            System.out.println("Error");
            System.out.println(ce.getMessage());
        }
        catch(SAXException se){
            System.out.println("Error");
            System.out.println(se.getMessage());
        }  
    }
}