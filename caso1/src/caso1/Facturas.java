/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Facturas {
    //Atributos de las facturas
       
    public String nombre;
    public int id;
    public int codigo;
    public float monto;
    public String mes;
    public int facturas;
    
   
    
    //Metodos de las facturas
    public void recolectarInfo(){
        nombre = JOptionPane.showInputDialog("Digite el nombre del cliente:");
        id = Integer.parseInt("Digite la identificación:");
        codigo = Integer.parseInt("Digite el codigo de factura:");
        monto = Integer.parseInt("Digite el monto de la factura:");
        mes = JOptionPane.showInputDialog("Digite el mes:");
        
        
    }
    
    public void despliegueDeInfo(){
        System.out.println("Cliente:" + nombre);
        System.out.println("Cedula:" + id);
        System.out.println("Codigo" +  codigo);
        System.out.println("Monto" + monto);
        System.out.println("mes"+ mes);
       
}
    
    
    //Bloque de salida para la cantidad de facturas
    if (facturas >= )
    
    
    
  
    

