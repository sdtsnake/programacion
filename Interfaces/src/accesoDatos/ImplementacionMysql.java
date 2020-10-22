
package accesoDatos;

/**
 *
 * @author oscar
 */
public class ImplementacionMysql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualiza() {
        System.out.println("Actualiza desde Mysql");
        
    }

    @Override
    public void elimina() {
        System.out.println("Eliminar desde Mysql");
        
    }
    
}
