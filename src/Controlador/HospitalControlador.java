package Controlador;

import DAO.Conexion;
import Entidades.Hospital;
import DAO.HospitalDAO;

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

public class HospitalControlador {
    
    /**
     * Método encargado de crear un hospital dentro de la base de datos.
     * 
     * @param donante, es una variable que contiene todo los datos de un donante.
     */
    
    public void crearHospital (Hospital hospital){
        
        HospitalDAO hospitalDAO = new HospitalDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try{
            
            hospitalDAO.crearHospital(hospital);
        }
        catch(Exception e) {
            e = new Exception("Error en UsuarioControlador");
        }
    }
    
    /**
     * Método encargado de validar si un hospital al momento de ser registrado,
     * ya se encuentra guardado en la base de datos.
     * 
     * @param nit, variable que contiene el nit del hospital a registrar en el sistema.
     * @return existe, variable que retornara false si el hospital no existe o
     * verdadero si el hospital existe.
     */
     
    public boolean validarNit (String nit) {
        
        boolean existe= false;
        HospitalDAO hospitalDAO = new HospitalDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Hospital hospital = null;
        
        try {
             
            hospital = hospitalDAO.buscarHospital(nit);
            
            if(hospital.getNit().equals(nit))
            {
                existe = true;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en HospitalControlador");
        }
        
         return existe;
    }
    
    public Hospital buscarHospital(String nit) {
        
        HospitalDAO hospitalDAO = new HospitalDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Hospital hospital = null;
        
        try {
                
            hospital = hospitalDAO.buscarHospital(nit);
        } 
        catch (Exception e) {
                
            new Exception("Error en HospitalControlador");
        }
        
         return hospital;
    }
    
    /**
    * Método encargado de buscar un hospital para poder ser modificado, y asignar
    * la nueva información cambiada del hospital.
    * 
    * @param nit, variable que contiene el nit del hospital a modificar en el sistema.
    * @param direcc, variable que contiene la nueva dirección del hospital a modificar
    * en el sistema.
    * @param telef, variable que contiene el nuevo teléfono del hospital a modificar en
    * el sistema.
    * @param telrepre, variable que contiene el nuevo teléfono del representante del hospital
    * a modificar en el sistema.
    * @param correorepre, variable que contiene el nuevo correo del representante del hospital
    * a modificar en el sistema.
    * @param estado, variable que contiene el nuevo estado del donante a modificar
    * en el sistema.
    * 
    */
     
    public void buscarModificarHospital (String nit, String direcc, String telef, String telrepre, String correorepre, String estado) {
        
        HospitalDAO hospitalDAO = new HospitalDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));

        Hospital hospital = null;
        
        try {
                
            hospitalDAO.modificarHospital(nit, direcc, telef, telrepre, correorepre, estado);
        } 
        catch (Exception e) {
                
            new Exception("Error en HospitalControlador");
        }
    }
    
    public void eliminarHospital (String nit, String estado)
    {
        HospitalDAO hospitalDAO = new HospitalDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try 
        {
            hospitalDAO.eliminarHospital(nit, estado);
        }
        catch(Exception e)
        {
            new Exception("Error en HospitalControlador");
        }
    }
    
    /**
     * Método encargado de buscar un hospital dentro de la base de datos.
     * 
     * @param razon, variable que contiene la razón social de un hospital.
     * @return hospital, variable de tipo Hospital, la cual contiene los
     * datos que pertenecen al nombre del hospital ingresado, en caso de que el 
     * hospital no se encuentre, asignara null a la variable.
     */
    
    public Hospital BuscarHospitalNombre(String razon) {
        
        HospitalDAO hospitalDAO = new HospitalDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Hospital hospital = null;
        
        try {
                
            hospital = hospitalDAO.buscarHospitalNombre(razon);
        } 
        catch (Exception e) {
                
            new Exception("Error en HospitalControlador");
        }
        
         return hospital;
    }
}
