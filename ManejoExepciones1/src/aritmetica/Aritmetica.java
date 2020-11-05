
package aritmetica;

import excepciones.OperacionExepcion;

/**
 *
 * @author oscar
 */
public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionExepcion{
        if(denominador == 0){
            throw new  OperacionExepcion("Divicion ente cero");
        }
        return numerador / denominador;
    }
    
}
