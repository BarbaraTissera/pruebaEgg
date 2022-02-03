
package javaserviciospractica08;

import javaserviciospractica08.Entidades.Cadena;
import javaserviciospractica08.Servicios.ServicioCadena;


public class JavaServiciosPractica08 {

    public static void main(String[] args) {
     
        ServicioCadena sc=new ServicioCadena();
        Cadena c=sc.crearFrase();
        
        sc.mostrarVocales(c);
        System.out.println("");
        sc.invertirFrase(c);
        sc.vecesRepetido(c); // este no quedó bien
        sc.compararLongitud(c);
        sc.unirFrases(c);
        sc.reemplazar(c);
        sc.contiene(c);
    }
    
}
