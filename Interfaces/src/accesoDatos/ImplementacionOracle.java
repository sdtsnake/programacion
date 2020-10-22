
package accesoDatos;

/**
 *
 * @author oscar
 */
public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualiza() {
        System.out.println("Actualiza desde Oracle");
        
    }

    @Override
    public void elimina() {
        System.out.println("Eliminar desde Oracle");
        
    }
    
}
