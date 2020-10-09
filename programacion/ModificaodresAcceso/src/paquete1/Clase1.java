package paquete1;

/**
 *
 * @author snake
 */
public class Clase1 {

    public String atributoPublico = "aributo publico";
    protected String atributoPotegido = "atributo protegido";
    private String atributoPrivado = "Atributo privado";

    public Clase1() {
        this(123);
        System.out.println("Constructor Publico");
    }

    protected Clase1(String cadena) {
        System.out.println("Calse de tipo protegida" + cadena);
    }

    private Clase1(int entero) {
        System.out.println("Clase privada" + entero);
    }

    public void metodoPublico() {
        System.out.println("Metodo Publico");
    }

    protected void metodoProtegido() {
        System.out.println("Metodo Protegido");
    }

    private void metodoPrivado() {
        System.out.println("Metodo Privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
