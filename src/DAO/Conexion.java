package DAO;

/**
 * Clase en donde se encuentran los metodos de conectar y desconectar
 * la base de datos.
 * 
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    String usuario;
    String password;
    String url;
    
    /**
     * Constructor de la clase la cual permite la conexión entre el sistema
     * y la base de datos.
     * 
     * @param usuario, variable que tiene el nombre de usuario de la base de 
     * datos a la que nos conectaremos.
     * @param password, variable que tiene la contraseña de usuario que pertenece
     * al usuario de la base de datos.
     * @param url, variable que contiene la ruta de la base de datos a la cual nos
     * vamos a conectar.
     */
    
    public Conexion(String usuario, String password, String url) {
        
        this.usuario = usuario;
        this.password = password;
        this.url = url;
    }
    
     /**
     * Método que conecta la interfaz con la base de datos. 
     * @return La conexión que se obtiene dentro del método.
     */
    
    public Connection Conectar() throws Exception {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            return DriverManager.getConnection(url, usuario, password);
        }
        catch(Exception e){
            
           e = new Exception("Error al conectar");
        }
        
        return null;
    }
    
    /**
     * Método que cierra la conexión con la base de datos. 
     */
    
    public void CerrarBD(Connection connection) {
        
        try {
            
            if(connection != null  && !connection.isClosed()){
                
                connection.close();
            }
        }
        catch(Exception e) {
            
            new Exception("Error al cerrar la conexión", e);
        }
    }
    
}
