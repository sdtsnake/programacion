
package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

/**
 *
 * @author oscar
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan",5000,TipoEscritura.CLASICO);
        
       // System.out.println("empleado = " + empleado);
        
       // System.out.println(empleado.obtenerDetalles());
        // aun que el tipo de la nueva referencia de memoria es tipo escritor de la clase hija
        // la instancia es de la padre y no puede acceder a los metodos de la hija entonces 
        // llamar de manera directa el metodo no es posible.
        
        
        //empleado.getTipoEscritura();
        
        
        //enotnces para poder hacer la llamada de ese metodo hay que hacer casteo de objetos asi como en los
        //tipos primitivos.
        
        // downcasting
        ((Escritor)empleado).getTipoEscritura();       
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscritura());
        
        //Up Casting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
    }
    
}
