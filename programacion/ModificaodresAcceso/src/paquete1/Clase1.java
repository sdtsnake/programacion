package paquete1;

/**
 *
 * @author snake
 */
public class Clase1 {
    public String atributoPublico = "aributo publico";
    protected String atributoPotegido = "atributo protegido";
    public Clase1(){
        System.out.println("Constructor Publico");
    }
    
    protected Clase1(String cadena){
            System.out.println("Calse de tipo protegida" + cadena);
    }
    
    public void metodoPublico(){
        System.out.println("Metodo Publico");
    }
    
    protected void metodoProtegido(){
        System.out.println("Metodo Protegido");
    }  
}
