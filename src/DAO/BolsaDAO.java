package DAO;

import Entidades.Bolsa;
import java.sql.*;
import java.text.DateFormat;
import java.util.Calendar;

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

public class BolsaDAO extends BaseDAO {
    
    /**
     * Constructor de la clase la cual permite llamar la BaseDAO para poder
     * ejecutar las operaciones con la base de datos.
     * 
     * @param connectionMananger, variable encargada de hacer la conexión.
     */
    
    public BolsaDAO (Conexion connectionMananger)
    {
        super(connectionMananger);
    }
    
     /**
     * Método que crea una bolsa para poder guardarla en la base de datos. 
     * 
     *@param bolsa, variable que contiene todos los datos que son ingresados
     * en los campos del formulario.
     */
    
    public void crearBolsa (Bolsa bolsa)
    {
        
        Connection connection = null;
        PreparedStatement ps = null;
        
        try {
            
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("insert into bolsas(Codig_Bol, Grupo_Bol, Rh_Bol, FechRecol_Bol, FechVenc_Bol, Cant_Bol, Obser_Bol, Estado_Bol)"
                   + "values (?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, bolsa.getCodigo());
            ps.setString(2, bolsa.getGrupo());
            ps.setString(3, bolsa.getRh());
            ps.setString(4, bolsa.getFechrecol());
            ps.setString(5, bolsa.getFechvenc());
            ps.setLong(6, bolsa.getCant());
            ps.setString(7, bolsa.getObser());
            ps.setString(8, bolsa.getEstado());

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
     * Método que busca una bolsa en la base de datos. 
     * 
     *@param cod, variable que contiene el código de una bolsa para poderla buscar
     * en la base de datos.
     * @return una variable de tipo Bolsa, la cual contiene todos los datos 
     * que pertenezcan al código que llega como parámetro.
     */
    
    public Bolsa buscarBolsa (String cod) {
         
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("select * from bolsas where Codig_Bol=?");

             ps.setString(1, cod);

             rs = ps.executeQuery();

             while (rs.next()) {

                return new Bolsa(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getLong(6), rs.getString(7), rs.getString(8));
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
    * Método que modifica los datos de una bolsa. 
    * 
    * @param cod, variable que contiene el código de una bolsa a modificar en el sistema.
    * @param obser, variable que contiene la nueva observación de la bolsa a modificar en
    * el sistema.
    * @param estado, variable que contiene el nuevo estado de la bolsa a modificar
    * en el sistema.
    * @return una variable de tipo boolean, la cual contiene true si modifica los datos 
    * en la base de datos o false si no entra a la base de datos.
    */
       
    public boolean modificarBolsa (String cod, String obser, String estado) {
         
         boolean r=false;
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update bolsas set Obser_Bol=?, Estado_Bol=? where Codig_Bol=?");

             ps.setString(1, obser);
             ps.setString(2, estado);
             ps.setString(3, cod);

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
    
     public boolean eliminarBolsa (String cod, String estado) {
         
        boolean r=false;
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update bolsas set Estado_Bol=? where Codig_Bol=?");

             ps.setString(1, estado);
             ps.setString(2, cod);

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
}
