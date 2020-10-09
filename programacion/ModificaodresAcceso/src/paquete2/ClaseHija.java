
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author snake
 */
public class ClaseHija extends Clase1 {
    public ClaseHija(){
      //  super("si esta es la clase protegida");
        super();
        this.atributoPotegido = "Moficacion atributo protected";
        System.out.println("contenido->" + this.atributoPotegido);
        this.metodoProtegido();
        
        Clase1 clase1 = new Clase1();
        System.out.println("contenido privado->" + clase1.getAtributoPrivado());
    }
    
}
