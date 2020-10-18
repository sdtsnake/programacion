
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author snake
 */
public class ClaseHija extends Clase1 {
    public ClaseHija(){
        super("si esta es la clase protegida");
        this.atributoPotegido = "Moficacion atributo protected";
        System.out.println("contenido->" + this.atributoPotegido);
        this.metodoProtegido();
    }
    
}
