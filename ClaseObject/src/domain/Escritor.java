
package domain;

/**
 *
 * @author oscar
 */
public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre,double sueldo, TipoEscritura tipoEscritura1){
        super(nombre,sueldo);
        this.tipoEscritura = tipoEscritura1;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + "} " + super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
    
    
}
