package Controlador;

import DAO.Conexion;
import Entidades.Bolsa;
import DAO.BolsaDAO;

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

public class BolsaControlador {
    
    /**
     * Método encargado de crear una bolsa dentro de la base de datos.
     * 
     * @param bolsa, es una variable que contiene todo los datos de una bolsa.
     */
    
    public void crearBolsa (Bolsa bolsa){
        
        BolsaDAO bolsaDAO = new BolsaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try{
            
            bolsaDAO.crearBolsa(bolsa);
        }
        catch(Exception e) {
            e = new Exception("Error en BolsaControlador");
        }
    }
    
    /**
     * Método encargado de validar si una bolsa al momento de ser registrada,
     * ya se encuentra guardada en la base de datos.
     * 
     * @param cod, variable que contiene el código de la bolsa a registrar
     * en el sistema.
     * @return existe, variable que retornara false si la bolsa no existe o
     * verdadero si la bolsa existe.
     */
     
    public boolean validarCodigo (String cod) {
        
        boolean existe= false;
        BolsaDAO bolsaDAO = new BolsaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Bolsa bolsa = null;
        
        try {
             
            bolsa = bolsaDAO.buscarBolsa(cod);
            
            if(bolsa.getCodigo().equals(cod))
            {
                existe = true;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en BolsaControlador");
        }
        
         return existe;
    }
    
    public Bolsa buscarBolsa (String cod) {
        
        BolsaDAO bolsaDAO = new BolsaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Bolsa bolsa = null;
        
        try {
                
            bolsa = bolsaDAO.buscarBolsa(cod);
        } 
        catch (Exception e) {
                
            new Exception("Error en BolsaControlador");
        }
        
         return bolsa;
    }
    
    /**
    * Método encargado de buscar una bolsa para poder ser modificada, y asignar
    * la nueva información cambiada de la bolsa.
    * 
    * @param cod, variable que contiene el código de la bolsa a modificar en el sistema.
    * @param obser, variable que contiene la nueva observación de la bolsa a modificar en
    * el sistema.
    * @param estado, variable que contiene el nuevo estado de la bolsa a modificar
    * en el sistema.
    * @return una variable de tipo boolean, la cual contiene true si modifica los datos 
    * en la base de datos o false si no entra a la base de datos.
    */
     
    public boolean buscarModificarBolsa(String cod, String obser, String estado) {
        
        BolsaDAO bolsaDAO = new BolsaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));

        Bolsa bolsa = null;
        
        try {
                
            bolsaDAO.modificarBolsa(cod, obser, estado);
            return true;
        } 
        catch (Exception e) {
                
            new Exception("Error en BolsaControlador");
            return false;
        }
    }
    
    public void eliminarBolsa (String cod, String estado)
    {
        BolsaDAO bolsaDAO = new BolsaDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try 
        {
            bolsaDAO.eliminarBolsa(cod, estado);
        }
        catch(Exception e)
        {
            new Exception("Error en BolsaControlador");
        }
    }
}
