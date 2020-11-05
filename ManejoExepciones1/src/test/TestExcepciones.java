
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExepcion;

/**
 *
 * @author oscar
 */
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 0);
        }catch(OperacionExepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        
        }catch(Exception e){
            System.out.println("Ocurrio un error de tipo Exepcion");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Se reviso la division ente crero");
        }
        System.out.println("resultado = " + resultado);
    }   
}