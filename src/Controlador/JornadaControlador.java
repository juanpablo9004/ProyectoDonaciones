package Controlador;

import DAO.Conexion;
import Entidades.Jornada;
import DAO.JornadaDAO;

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

public class JornadaControlador {
    
    /**
     * Método encargado de crear una jornada dentro de la base de datos.
     * 
     * @param jornada, es una variable que contiene todo los datos de una jornada.
     */
    
    public void crearJornada (Jornada jornada){
        
        JornadaDAO jornadaDAO = new JornadaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try{
            
            jornadaDAO.crearJornada(jornada);
        }
        catch(Exception e) {
            
            e = new Exception("Error en UsuarioControlador");
        }
    }
    
    /**
     * Método encargado de validar si una jornada al momento de ser registrada,
     * ya se encuentra guardado en la base de datos.
     * 
     * @param codigo, variable que contiene el código de la jornada a registrar en el sistema.
     * @return existe, variable que retornara false si la jornada no existe o
     * verdadero si la jornada existe.
     */
     
    public boolean validarCodigo (String codigo) {
        
        boolean existe= false;
        JornadaDAO jornadaDAO = new JornadaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Jornada jornada = null;
        
        try {
             
            jornada = jornadaDAO.buscarJornada(codigo);
            
            if(jornada.getCodigo().equals(codigo))
            {
                existe = true;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en JornadaControlador");
        }
        
         return existe;
    }
    
    public Jornada buscarJornada(String cod) {
        
        JornadaDAO jornadaDAO = new JornadaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Jornada jornada = null;
        
        try {
                
            jornada = jornadaDAO.buscarJornada(cod);
        } 
        catch (Exception e) {
                
            new Exception("Error en JornadaControlador");
        }
        
         return jornada;
    }
    
     /**
     * Método encargado de buscar una jornada para poder ser modificado, y asignar
     * la nueva información cambiada de la jornada.
     * 
     * @param cod, variable que contiene el número de identificación de la jornada 
     * a modificar en el sistema.
     * @param direcc, variable que contiene la nueva dirección de la jornada a modificar
     * en el sistema.
     * @param obser, variable que contiene la nueva observación de la jornada a modificar en
     * el sistema.
     * @param estado, variable que contiene el nuevo estado de la jornada a modificar
     * en el sistema. 
     */
     
    public boolean buscarModificarJornada (String cod, String direcc, String obser, String estado) {
        
        JornadaDAO jornadaDAO = new JornadaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));

        Jornada jornada = null;
        
        try {
                
            jornadaDAO.modificarJornada(cod, direcc, obser, estado);
            return true;
        } 
        catch (Exception e) {
                
            new Exception("Error en JornadaControlador");
            return false;
        }
    }
    
    public void eliminarJlornada (String cod, String estado)
    {
        JornadaDAO jornadaDAO = new JornadaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try 
        {
            jornadaDAO.eliminarJornada(cod, estado);
        }
        catch(Exception e)
        {
            new Exception("Error en JornadaControlador");
        }
    }
}
