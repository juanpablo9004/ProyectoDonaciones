package DAO;


/**
 * Clase en donde se encuentra la conexion a la base de datos.
 * 
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class BaseDAO {
    
    protected Conexion connetionMananger;
    
    /**
     * Constructor de la clase encargado de conectar el sistema con la 
     * base de datos.
     * 
     * @param connetionMananger , variable encargada de hacer la conexión.
     */
    
    public BaseDAO(Conexion connetionMananger) {
        
        this.connetionMananger = connetionMananger;
    }
    
}
