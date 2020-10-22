package test;

import domain.Empleado;

/**
 *
 * @author oscar
 */
public class TestClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        if(empleado1==empleado2){
            System.out.println("Tienen las misma referencia de memora");
        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        if(empleado1.equals(empleado2)){
            System.out.println("Los Objetos son iguales en contenido");
        }else{
            System.out.println("Los Objetos son diferentes en su contenido");
        }
        
        if(empleado1.hashCode()== empleado2.hashCode()){
            System.out.println("El hash es el mismo = " + empleado2.hashCode());
            
        }else{
            System.out.println("diferentes hash 1= " + empleado2.hashCode()+ " hash 2=" + empleado1.hashCode());
        }
            
            
            
        
    }

}
