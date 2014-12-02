package Controlador;

import DAO.Conexion;
import Entidades.Entrega;
import DAO.EntregaDAO;

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

public class EntregaControlador {
 
    /**
     * Método encargado de crear una entrega dentro de la base de datos.
     * 
     * @param entrega, es una variable que contiene todo los datos de una entrega.
     */
    
    public void crearEntrega (Entrega entrega){
        
        EntregaDAO entregaDAO = new EntregaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try{
            
            entregaDAO.crearEntrega(entrega);
            
        }
        catch(Exception e) {
            e = new Exception("Error en EntregaControlador");
        }
    }
    
    /**
     * Método encargado de validar si una entrega al momento de ser registrada,
     * ya se encuentra guardada en la base de datos.
     * 
     * @param cod, variable que contiene el código de la entrega a registrar
     * en el sistema.
     * @return existe, variable que retornara false si la entrega no existe o
     * verdadero si la entrega existe.
     */
     
    public boolean validarCodigo (String cod) {
        
        boolean existe= false;
        EntregaDAO entregaDAO = new EntregaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Entrega entrega = null;
        
        try {
             
            entrega = entregaDAO.buscarEntrega(cod);
            
            if(entrega.getCodigo().equals(cod))
            {
                existe = true;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en EntregaControlador");
        }
        
         return existe;
    }
    
    public Entrega buscarEntrega (String cod) {
        
        EntregaDAO entregaDAO = new EntregaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Entrega entrega = null;
        
        try {
                
            entrega = entregaDAO.buscarEntrega(cod);
        } 
        catch (Exception e) {
                
            new Exception("Error en EntregaControlador");
        }
        
         return entrega;
    }
    
    /**
    * Método encargado de buscar una entrega para poder ser modificada, y asignar
    * la nueva información cambiada de la entrega.
    * 
    * @param cod, variable que contiene el código de la entrega a modificar en el sistema.
    * @param obser, variable que contiene la nueva observación de la entrega a modificar en
    * el sistema.
    * @param estado, variable que contiene el nuevo estado de la entrega a modificar
    * en el sistema.
    * @return una variable de tipo boolean, la cual contiene true si modifica los datos 
    * en la base de datos o false si no entra a la base de datos.
    */
     
    public boolean buscarModificarEntrega (String cod, String obser, String estado) {
        
        EntregaDAO entregaDAO = new EntregaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));

        Entrega entrega = null;
        
        try {
                
            entregaDAO.modificarEntrega(cod, obser, estado);
            return true;
        } 
        catch (Exception e) {
                
            new Exception("Error en EntregaControlador");
            return false;
        }
    }
    
    public void eliminarEntrega (String cod, String estado)
    {
        EntregaDAO entregaDAO = new EntregaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try 
        {
            entregaDAO.eliminarEntrega(cod, estado);
        }
        catch(Exception e)
        {
            new Exception("Error en EntregaControlador");
        }
    }
}
