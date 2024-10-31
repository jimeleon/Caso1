/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author DELL
 */
public class Comisiones {
    
    //Atributos 
    public String facturas;
    public int montofacturas;
    public int comisionfacturas;
    public int puntosfacturas;
    public int totalpuntosacumulados;
    public int totalcomisionesacumuladas;
    
    
    
    //Bloque de variable del monto de la factura
    if (facturas.getMontoFacturas() > 50000) {
        ComisionFacturas += facturas.getMontoFacturas() * 0.05;
        puntosFacturas += 1;

            
  //Bloque de la efectividad del vendedor
        totalComisionesAcumuladas += ComisionFacturas;
        totalPuntosAcumulados += puntosFacturas;
    }
    

    // Bloque del total acumulado de comisiones generadas por todas las facturas 
    public double obtenerTotalComisiones() { return totalComisionesAcumuladas; }

    // Bloque del total acumulado de puntos obtenidos por todas las facturas evaluadas
    public int obtenerTotalPuntos() { return totalPuntosAcumulados; }
}
       
    
}
