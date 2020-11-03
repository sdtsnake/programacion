
package test;

import static aritmetica.Aritmetica.division;

/**
 *
 * @author oscar
 */
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = division(10, 0);
        }catch(Exception e){
            //con esta instruccion sale la listra de los errores en la excepcio
  //          e.printStackTrace();
            // y con este accedemos solo al mensaje del error controlado.
            System.out.println(e.getMessage());
        }
        System.out.println("resultado = " + resultado);
    }   
}
