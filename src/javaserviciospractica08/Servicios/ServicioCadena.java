
package javaserviciospractica08.Servicios;

import java.util.Scanner;
import javaserviciospractica08.Entidades.Cadena;


public class ServicioCadena {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearFrase(){
        Cadena c=new Cadena();
        System.out.println("Ingrese una frase o palabra:");
        c.setFrase(leer.next());
        c.setLongitud(c.getFrase().length());
        return c;        
    }
    
    public void mostrarVocales(Cadena c){
        int contador=0;
        for (int i = 0; i < c.getFrase().length(); i++) {
            if (c.getFrase().charAt(i)=='a'||c.getFrase().charAt(i)=='e'||c.getFrase().charAt(i)=='i'||c.getFrase().charAt(i)=='o'||c.getFrase().charAt(i)=='u') {
                contador++;
            }  
        }
        System.out.println("");
        System.out.println("La frase/palabra ingresada tiene "+contador+" vocales");
    }
    
    public void invertirFrase(Cadena c){
        for (int i = c.getFrase().length()-1; i >=0; i--) {
            String cadenaInvertida="";
           cadenaInvertida=cadenaInvertida+c.getFrase().charAt(i);
            
            System.out.print(cadenaInvertida);
           
        }
       System.out.println("");    
    }
    
    public void vecesRepetido(Cadena c){// esta no quedó bien
        System.out.println("Ingrese una letra a buscar en la frase/palabra: ");
        String letra=leer.next();
        int cont=0;
           
         if (c.getFrase().contains(letra)) {
            cont++;
        }
          System.out.println("La letra **"+ letra +"** aparece "+ cont + " veces en la frase/palabra ingresada");
    }
         
    public void compararLongitud(Cadena c){
        System.out.println("");
        System.out.println("Ingrese una nueva palabra/frase");
        String nuevaFrase=leer.next();
        if (c.getFrase().length()==nuevaFrase.length()) {
            System.out.println("Las palabras/frases ingresadas tienen la misma longitud");
        }else{
            System.out.println("Las palabras/frases ingresadas tienen diferente longitud");
        } 
        
    }
    
    public void unirFrases(Cadena c){
        System.out.println("Ingrese otra frase/palabra:");
        String otraFrase=leer.next();
        System.out.println(c.getFrase().concat(otraFrase));
    }

    public void reemplazar(Cadena c){
        String replace=c.getFrase().replace("a", "@");
        System.out.println(replace);
    }  
    
    public void contiene(Cadena c) {
        System.out.println("Indique una letra:");
        String let=leer.next();
        if (c.getFrase().contains(let)) {
            System.out.println("La letra está en la frase/palabra");
        }else{
            System.out.println("La letra no está en la frase/palabra");
        }
    }   



}
            
        






    
    
    

