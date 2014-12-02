package DAO;

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

import Entidades.Jornada;
import java.sql.*;

public class JornadaDAO extends BaseDAO {
    
     /**
     * Constructor de la clase la cual permite llamar la BaseDAO para poder
     * ejecutar las operaciones con la base de datos.
     * 
     * @param connectionMananger, variable encargada de hacer la conexión.
     */
    
    public JornadaDAO(Conexion connectionMananger){
        
        super(connectionMananger);
        
    }
    
    /**
     * Método que crea una jornada para poder guardarlo en la base de datos. 
     * 
     *@param jornada, variable que contiene todos los datos que son ingresados
     * en los campos del formulario.
     */
    
    public void crearJornada(Jornada jornada){
        
        Connection connection = null;
        PreparedStatement ps = null;
        
        try {
            
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("insert into jornadas(Codig_Jorn, FechProg_Jorn, Horas_Jorn, Minut_Jorn, Direcc_Jorn,"
                   + " CantDonan_Jorn, CantAPos_Jorn, CantANeg_Jorn, CantBPos_Jorn, CantBNeg_Jorn, CantOPos_Jorn, CantONeg_Jorn,"
                   + " CantAbPos_Jorn, CantAbNeg_Jorn, Obser_Jorn, Estado_Jorn)"
                   + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, jornada.getCodigo());
            ps.setString(2, jornada.getFechaprogra());
            ps.setString(3, jornada.getHoras());
            ps.setString(4, jornada.getMinutos());
            ps.setString(5, jornada.getDirecc());
            ps.setLong(6, jornada.getCantdonan());
            ps.setLong(7, jornada.getCantapos());
            ps.setLong(8, jornada.getCantaneg());
            ps.setLong(9, jornada.getCantbpos());
            ps.setLong(10, jornada.getCantbneg());
            ps.setLong(11, jornada.getCantopos());
            ps.setLong(12, jornada.getCantoneg());
            ps.setLong(13, jornada.getCantabpos());
            ps.setLong(14, jornada.getCantabneg());
            ps.setString(15, jornada.getObserv());
            ps.setString(16, jornada.getEstado());
            
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
     * Método que busca una jornada en la base de datos. 
     * 
     *@param codigo, variable que contiene el código de una jornada para poderla buscar
     * en la base de datos.
     * @return una variable de tipo Jornada, la cual contiene todos los datos 
     * que pertenezcan al código que llega como parámetro.
     */
    
    public Jornada buscarJornada(String codigo) {
         
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("select * from jornadas where Codig_Jorn=?");

             ps.setString(1, codigo);

             rs = ps.executeQuery();

             while (rs.next()) {

                return new Jornada(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getLong(6), rs.getLong(7), rs.getLong(8), rs.getLong(9), rs.getLong(10), rs.getLong(11), rs.getLong(12), rs.getLong(13), rs.getLong(14), rs.getString(15), rs.getString(16));
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
    * Método que modifica los datos de una jornada. 
    * 
    * @param cod, variable que contiene el número de identificación de la jornada 
    * a modificar en el sistema.
    * @param direcc, variable que contiene la nueva dirección de la jornada a modificar en
    * el sistema.
    * @param obser, variable que contiene la nueva observación de la jornada a modificar en
    * el sistema.
    * @param estado, variable que contiene el nuevo estado de la jornada a modificar
    * en el sistema.
    */
       
    public boolean modificarJornada (String cod, String direcc, String obser, String estado) {
         
         boolean r=false;
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update jornadas set Direcc_Jorn=?, Obser_Jorn=?, Estado_Jorn=? where Codig_Jorn=?");

             ps.setString(1, direcc);
             ps.setString(2, obser);
             ps.setString(3, estado);
             ps.setString(4, cod);

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
    
    public boolean eliminarJornada (String cod, String estado) {
         
        boolean r=false;
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update jornadas set Estado_Jorn=? where Codig_Jorn=?");

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
