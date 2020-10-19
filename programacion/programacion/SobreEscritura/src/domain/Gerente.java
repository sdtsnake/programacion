
package domain;

/**
 *
 * @author oscar
 */
public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre,sueldo);
        this.departamento=departamento;
    }
    
    //sobre escritura
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: " +this.departamento;
    }
    
    public void sueldo(){
        
    }
    
    
}
