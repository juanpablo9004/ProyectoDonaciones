package DAO;

import Entidades.Hospital;
import java.sql.*;

/**
 * Clase en donde se encuentran los metodos encargados de hacer las
 * operaciones con la base de datos.
 * 
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * 
 */

public class HospitalDAO extends BaseDAO {
    
    /**
     * Constructor de la clase la cual permite llamar la BaseDAO para poder
     * ejecutar las operaciones con la base de datos.
     * 
     * @param connectionMananger, variable encargada de hacer la conexión.
     */
    
    public HospitalDAO(Conexion connectionMananger)
    {
        super(connectionMananger);
    }
    
    /**
     * Método que crea un hospital para poder guardarlo en la base de datos. 
     * 
     *@param hospital, variable que contiene todos los datos que son ingresados
     * en los campos del formulario.
     */
    
    public void crearHospital (Hospital hospital)
    {
        
        Connection connection = null;
        PreparedStatement ps = null;
        
        try {
            
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("insert into hospitales(TipoHosp_Hosp, Nit_Hosp, RazonSoc_Hosp, Direcc_Hosp, Telef_Hosp,"
                    + "Repre_Hosp, TelRepre_Hosp, CorreoRepre_Hosp, Nivel_Hosp, Estado_Hosp)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, hospital.getTipohosp());
            ps.setString(2, hospital.getNit());
            ps.setString(3, hospital.getRazonsoc());
            ps.setString(4, hospital.getDirecc());
            ps.setString(5, hospital.getTelef());
            ps.setString(6, hospital.getRepresen());
            ps.setString(7, hospital.getTelrepre());
            ps.setString(8, hospital.getCorreorepre());
            ps.setString(9, hospital.getNivelhosp());
            ps.setString(10, hospital.getEstado());
            
            ps.execute();
        }
        catch(Exception e) {
            
            new Exception("No inserto datos");
            System.out.println("No se guardo"+e.toString());
        }
        
        /*finally {
            
            try {
          
                //if (ps != null && !ps.isClosed()){
                 
                    ps.close();
                //}
            }
            catch(Exception e) {
                
                new Exception("No se cerro");
            }
            
            connetionMananger.CerrarBD(connection);     
        }
                */
    }
    
    /**
     * Método que busca un hospital en la base de datos. 
     * 
     *@param nit, variable que contiene el nit de un hospital para poderlo buscar
     * en la base de datos.
     * @return una variable de tipo Hospital, la cual contiene todos los datos 
     * que pertenezcan al nit que llega como parámetro.
     */
    
    public Hospital buscarHospital (String nit) {
         
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("select * from hospitales where Nit_Hosp=?");

             ps.setString(1, nit);

             rs = ps.executeQuery();

             while (rs.next()) {

                return new Hospital(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }

        }
        catch(Exception e) {
                
             new Exception("No se pudo consultar");
        }
        /*finally {
                
            try {
                    
               if (ps != null && !ps.isClosed()) {
             
                   ps.close();
                    
               }
            }
            catch (SQLException e) {
                    
                new Exception("No se cerro");
            }
                connetionMananger.CerrarBD(connection);
       }*/
            
          return null;
    }
    
    /**
    * Método que modifica los datos de un hospital. 
    * 
    * @param nit, variable que contiene el nit de un hospital a modificar en el sistema.
    * @param direcc, variable que contiene la nueva dirección del hospital a modificar en
    * el sistema.
    * @param telef, variable que contiene el nuevo teléfono del hospital a modificar en
    * el sistema.
    * @param telrepre, variable que contiene el nuevo teléfono del representante del hospital
    * a modificar en el sistema.
    * @param correorepre, variable que contiene el nuevo correo del representante del hospital
    * a modificar en el sistema.
    * @param estado, variable que contiene el nuevo estado del hospital a modificar
    * en el sistema.
    */
       
    public boolean modificarHospital (String nit, String direcc, String telef, String telrepre, String correorepre, String estado) {
         
         boolean r=false;
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update hospitales set Direcc_Hosp=?, Telef_Hosp=?, TelRepre_Hosp=?, CorreoRepre_Hosp=?, Estado_Hosp=? where Nit_Hosp=?");

             ps.setString(1, direcc);
             ps.setString(2, telef);
             ps.setString(3, telrepre);
             ps.setString(4, correorepre);
             ps.setString(5, estado);
             ps.setString(6, nit);

             ps.executeUpdate();
             
             r = true;
        }
        catch(Exception e) {
                
             new Exception("No se pudo consultar");
        }
        /*finally {
                
            try {
                    
               if (ps != null && !ps.isClosed()) {
             
                   ps.close();
                    
               }
            }
            catch (SQLException e) {
                    
                new Exception("No se cerro");
            }
                connetionMananger.CerrarBD(connection);
       }*/
          
         return r;
    }
    
    public boolean eliminarHospital (String nit, String estado) {
         
        boolean r=false;
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update hospitales set Estado_Hosp=? where Nit_Hosp=?");

             ps.setString(1, estado);
             ps.setString(2, nit);

             ps.executeUpdate();
             
             r = true;
        }
        catch(Exception e) {
                
             new Exception("No se pudo consultar");
        }
        /*finally {
                
            try {
                    
               if (ps != null && !ps.isClosed()) {
             
                   ps.close();
                    
               }
            }
            catch (SQLException e) {
                    
                new Exception("No se cerro");
            }
                connetionMananger.CerrarBD(connection);
       }*/
          
         return r;
    }
    
    public Hospital buscarHospitalNombre(String razon) 
    {     
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try 
        {
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("select * from hospitales where RazonSoc_Hosp=?");

            ps.setString(1, razon);

            rs = ps.executeQuery();

            while (rs.next()) {

               return new Hospital(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
            }

        }
        catch(Exception e) {
                
             new Exception("No se pudo consultar");
        }
        /*finally {
                
            try {
                    
               if (ps != null && !ps.isClosed()) {
             
                   ps.close();
                    
               }
            }
            catch (SQLException e) {
                    
                new Exception("No se cerro");
            }
                connetionMananger.CerrarBD(connection);
       }*/
            
        return null;
    }
}
