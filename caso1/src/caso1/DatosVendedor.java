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
public class DatosVendedor {
    //Atributos de la clase vendedor
    
    public String agentevendedor;
    public int codigo;
    public String mes;
    public String sucursal;
    public String vehiculo;
    
    //Metodos de la clase vendedor
    
    public void preguntarPorInfo(){
        agentevendedor = JOptionPane.showInputDialog("Digite su nombre:");
        codigo = Integer.parseInt("Digite el codigo de factura:");
        mes = JOptionPane.showInputDialog("Digite el mes:");
        sucursal = JOptionPane.showInputDialog("Digite la sucursal en la que trabaja:");
        vehiculo = JOptionPane.showInputDialog("¿Cuenta con carro propio?:");
        
    }
    public void despliegueInfo(){
        System.out.println("Agente vendedor:" + agentevendedor);
        System.out.println("Codigo:" + codigo);
        System.out.println("Mes" +  mes);
        System.out.println("Sucursal en la que trabaja" + sucursal);
        System.out.println("Vehiculo propio:"+ vehiculo);
       
}
    
     //Bloque de variables de los productos 
   if ()
    
    
   
    
    
    
}
