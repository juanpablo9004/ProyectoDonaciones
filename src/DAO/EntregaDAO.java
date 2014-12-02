package DAO;

import Entidades.Entrega;
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

public class EntregaDAO extends BaseDAO {
    
    /**
    * Constructor de la clase la cual permite llamar la BaseDAO para poder
    * ejecutar las operaciones con la base de datos.
    * 
    * @param connectionMananger, variable encargada de hacer la conexión.
    */
    
    public EntregaDAO (Conexion connectionMananger){
        
        super(connectionMananger);
    }
    
    /**
     * Método que crea una entrega para poder guardarlo en la base de datos. 
     * 
     *@param entrega, variable que contiene todos los datos que son ingresados
     * en los campos del formulario.
     */
    
    public void crearEntrega (Entrega entrega){
        
        Connection connection = null;
        PreparedStatement ps = null;
        
        try {
            
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("insert into entregas(Codig_Entre, Grupo_Entre, Rh_Entre, FechVenc_Entre, FechRecol_Entre,"
                   + " Nit_Entre, RazonSoc_Entre, CantEntre_Entre, Obser_Entre, Estado_Entre)"
                   + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, entrega.getCodigo());
            ps.setString(2, entrega.getGrupo());
            ps.setString(3, entrega.getRh());
            ps.setString(4, entrega.getFechvenc());
            ps.setString(5, entrega.getFechrecol());
            ps.setString(6, entrega.getNit());
            ps.setString(7, entrega.getRazon());
            ps.setLong(8, entrega.getCantentre());
            ps.setString(9, entrega.getObserv());
            ps.setString(10, entrega.getEstado());
                        
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
     * Método que busca una entrega en la base de datos. 
     * 
     *@param cod, variable que contiene el código de una entrega para poderla buscar
     * en la base de datos.
     * @return una variable de tipo Entrega, la cual contiene todos los datos 
     * que pertenezcan al código que llega como parámetro.
     */
    
    public Entrega buscarEntrega (String cod) {
         
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("select * from entregas where Codig_Entre=?");

             ps.setString(1, cod);

             rs = ps.executeQuery();

             while (rs.next()) {

                return new Entrega(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getLong(8), rs.getString(9), rs.getString(10));
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
    * Método que modifica los datos de una entrega. 
    * 
    * @param cod, variable que contiene el código de una entrega a modificar en el sistema.
    * @param obser, variable que contiene la nueva observación de la entrega a modificar en
    * el sistema.
    * @param estado, variable que contiene el nuevo estado de la entrega a modificar
    * en el sistema.
    * @return una variable de tipo boolean, la cual contiene true si modifica los datos 
    * en la base de datos o false si no entra a la base de datos.
    */
       
    public boolean modificarEntrega (String cod, String obser, String estado) {
         
         boolean r=false;
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update entregas set Obser_Entre=?, Estado_Entre=? where Codig_Entre=?");

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
    
    public boolean eliminarEntrega (String cod, String estado) {
         
        boolean r=false;
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update entregas set Estado_Entre=? where Codig_Entre=?");

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
