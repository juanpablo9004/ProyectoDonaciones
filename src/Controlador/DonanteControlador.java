package Controlador;

import DAO.Conexion;
import Entidades.Donante;
import DAO.DonanteDAO;

/**
 * Clase en donde se encuentran los metodos necesarios
 * para poder comunicar las entidades con la base de datos.
 * 
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class DonanteControlador {
    
    /**
     * Método encargado de crear un donante dentro de la base de datos.
     * 
     * @param donante, es una variable que contiene todo los datos de un donante.
     */
    
    public void crearDonante (Donante donante){
        
        DonanteDAO donanteDAO = new DonanteDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try{
            
            donanteDAO.crearDonante(donante);
        }
        catch(Exception e) {
            e = new Exception("Error en UsuarioControlador");
        }
    }
    
    /**
     * Método encargado de validar si un donante al momento de ser registrado,
     * ya se encuentra guardado en la base de datos.
     * 
     * @param id, variable que contiene el número de identificación del donante
     * a registrar en el sistema.
     * @return existe, variable que retornara false si el donante no existe o
     * verdadero si el donante existe.
     */
     
    public boolean validarId(String id) {
        
        boolean existe= false;
        DonanteDAO donanteDAO = new DonanteDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Donante donante = null;
        
        try {
             
            donante = donanteDAO.buscarDonante(id);
            
            if(donante.getIdentif().equals(id))
            {
                existe = true;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
         return existe;
    }
    
    public Donante buscarDonante(String id) {
        
        DonanteDAO donanteDAO = new DonanteDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Donante donante = null;
        
        try {
                
            donante = donanteDAO.buscarDonante(id);
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
         return donante;
    }
    
     /**
     * Método encargado de buscar un donante para poder ser modificado, y asignar
     * la nueva información cambiada del donante.
     * 
     * @param id, variable que contiene el número de identificación del donante 
     * a modificar en el sistema.
     * @param correo, variable que contiene el nuevo correo del donante a modificar
     * en el sistema.
     * @param telef, variable que contiene el nuevo teléfono del donante a modificar en
     * el sistema.
     * @param direcc, variable que contiene la nueva dirección del donante a modificar
     * en el sistema.
     * @param estado, variable que contiene el nuevo estado del donante a modificar
     * en el sistema.
     * 
     */
     
    public void buscarModificarDonante(String id, String telef, String direcc, String correo, String estado) {
        
        DonanteDAO donanteDAO = new DonanteDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));

        Donante donante = null;
        
        try {
                
            donanteDAO.modificarDonante(id, telef, direcc, correo, estado);
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
    }
    
    public void eliminarDonante (String id, String estado)
    {
        DonanteDAO donanteDAO = new DonanteDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try 
        {
            donanteDAO.eliminarDonante(id, estado);
        }
        catch(Exception e)
        {
            new Exception("Error en UsuarioControlador");
        }
    }
}
