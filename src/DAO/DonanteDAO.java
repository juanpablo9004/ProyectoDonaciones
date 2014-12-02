package DAO;

import Entidades.Donante;
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

public class DonanteDAO extends BaseDAO {
    
    /**
     * Constructor de la clase la cual permite llamar la BaseDAO para poder
     * ejecutar las operaciones con la base de datos.
     * 
     * @param connectionMananger, variable encargada de hacer la conexión.
     */
    
    public DonanteDAO(Conexion connectionMananger)
    {
        super(connectionMananger);
    }
    
    /**
     * Método que crea un usuario para poder guardarlo en la base de datos. 
     * 
     *@param donante, variable que contiene todos los datos que son ingresados
     * en los campos del formulario.
     */
    
    public void crearDonante (Donante donante)
    {
        
        Connection connection = null;
        PreparedStatement ps = null;
        
        try {
            
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("insert into donantes(TipoDoc_Donan, Ident_Donan, Nombres_Donan, PApell_Donan, SApell_Donan,"
                    + "Telef_Donan, Direcc_Donan, Genero_Donan, Correo_Donan, FecNac_Donan, FecUltDon_Donan, Enferm_Donan, Habitos_Donan, Estado_Donan)"
                    + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, donante.getTipodoc());
            ps.setString(2, donante.getIdentif());
            ps.setString(3, donante.getNombres());
            ps.setString(4, donante.getApell1());
            ps.setString(5, donante.getApell2());
            ps.setString(6, donante.getTelef());
            ps.setString(7, donante.getDirecc());
            ps.setString(8, donante.getGenero());
            ps.setString(9, donante.getCorreo());
            ps.setString(10, donante.getFechanacim());
            ps.setString(11, donante.getFechaultimdon());
            ps.setString(12, donante.getEnferm());
            ps.setString(13, donante.getHabito());
            ps.setString(14, donante.getEstado());
            
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
     * Método que busca un donante en la base de datos. 
     * 
     *@param id, variable que contiene el id de un donante para poderlo buscar
     * en la base de datos.
     * @return una variable de tipo Donante, la cual contiene todos los datos 
     * que pertenezcan al id que llega como parámetro.
     */
    
    public Donante buscarDonante (String id) {
         
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("select * from donantes where Ident_Donan=?");

             ps.setString(1, id);

             rs = ps.executeQuery();

             while (rs.next()) {

                return new Donante(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14));
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
    * Método que modifica los datos de un donante. 
    * 
    * @param id, variable que contiene el número de identificación del donante 
    * a modificar en el sistema.
    * @param correo, variable que contiene el nuevo correo del donante a modificar
    * en el sistema.
    * @param telef, variable que contiene el nuevo teléfono del donante a modificar en
    * el sistema.
    * @param direcc, variable que contiene la nueva dirección del donante a modificar en
    * el sistema.
    * @param estado, variable que contiene el nuevo estado del donante a modificar
    * en el sistema.
    */
       
    public boolean modificarDonante (String id, String telef, String direcc, String correo, String estado) {
         
         boolean r=false;
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update donantes set Telef_Donan=?, Direcc_Donan=?, Correo_Donan=?, Estado_Donan=? where Ident_Donan=?");

             ps.setString(1, telef);
             ps.setString(2, direcc);
             ps.setString(3, correo);
             ps.setString(4, estado);
             ps.setString(5, id);

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
    
    public boolean eliminarDonante (String id, String estado) {
         
        boolean r=false;
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update donantes set Estado_Donan=? where Ident_Donan=?");

             ps.setString(1, estado);
             ps.setString(2, id);

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
