
package test;

/**
 *
 * @author oscar
 */
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            int rsultado = 10 / 0;
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("resultado = " + resultado);
    }   
}
