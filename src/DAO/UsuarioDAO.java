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

import Entidades.Usuario;
import java.sql.*;

public class UsuarioDAO extends BaseDAO{
   
    /**
     * Constructor de la clase la cual permite llamar la BaseDAO para poder
     * ejecutar las operaciones con la base de datos.
     * 
     * @param connectionMananger, variable encargada de hacer la conexión.
     */
    
    public UsuarioDAO(Conexion connectionMananger){
        
        super(connectionMananger);
        
    }
    
    /**
     * Método que crea un usuario para poder guardarlo en la base de datos. 
     * 
     *@param usuario, variable que contiene todos los datos que son ingresados
     * en los campos del formulario.
     */
    
    public void CrearUsuario(Usuario usuario){
        
        Connection connection = null;
        PreparedStatement ps = null;
        
        try {
            
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("insert into usuarios(Identif_Usu, Nombre_Usu, PApellido_Usu, SApellido_Usu, Correo_Usu, Usuario_Usu, Contrasena_Usu, CContrasena_Usu, Perfil_Usu, Estado_Usu)"
                   + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            ps.setString(1, usuario.getIdentif());
            ps.setString(2, usuario.getNomb());
            ps.setString(3, usuario.getApell1());
            ps.setString(4, usuario.getApell2());
            ps.setString(5, usuario.getCorreo());
            ps.setString(6, usuario.getUsuario());
            ps.setString(7, usuario.getContra());
            ps.setString(8, usuario.getConcontra());
            ps.setString(9, usuario.getPerfil());
            ps.setString(10, usuario.getEstado());
            
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
     * Método que busca un usuario en la base de datos. 
     * 
     *@param id, variable que contiene el id de un usuario para poderlo buscar
     * en la base de datos.
     * @return una variable de tipo Usuario, la cual contiene todos los datos 
     * que pertenezcan al id que llega como parámetro.
     */
    
    public Usuario BuscarUsuario(String id) {
         
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("select * from usuarios where Identif_Usu=?");

             ps.setString(1, id);

             rs = ps.executeQuery();

             while (rs.next()) {

                return new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
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
    
    public Usuario BuscarUsuarioNombre(String usu) 
    {     
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try 
        {
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("select * from usuarios where Usuario_Usu=?");

            ps.setString(1, usu);

            rs = ps.executeQuery();

            while (rs.next()) {

               return new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
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
     * Método que valida el nombre de usuario de una persona que se encuentra
     * en la base de datos. 
     * 
     *@param usu, variable que contiene el nombre de usuario a registrar para
     * poder comprobar si es igual al ingresado.
     * @return una variable de tipo Usuario, la cual contiene todos los datos 
     * que pertenezcan al id que llega como parámetro.
     */
    
       public Usuario Validar(String usu)
       {
           Connection connection;
           
           PreparedStatement ps = null;
           
           ResultSet rs;
           
           try {
               
               connection = connetionMananger.Conectar();
               ps = connection.prepareStatement("select * from usuarios where Usuario_Usu=?");
               ps.setString(1, usu);
               
               rs = ps.executeQuery();
               
               while(rs.next()) {
                   
                   return new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10));
               }
           }
           catch (Exception e) {
               new Exception("Error al autenticar");
           }
           
           return null;
       }
       
     /**
     * Método que modifica los datos de un usuario. 
     * 
     * @param id, variable que contiene el número de identificación del usuario 
     * a modificar en el sistema.
     * @param correo, variable que contiene el nuevo correo del usuario a modificar
     * en el sistema.
     * @param perfil, variable que contiene el nuevo perfil de usuario a modificar en
     * el sistema.
     * @param estado, variable que contiene el nuevo estado del usuario a modificar
     * en el sistema.
     */
       
       public boolean ModificarUsuario(String id, String correo, String perfil, String estado) {
         
         boolean r=false;
         Connection connection = null;
         PreparedStatement ps = null;
            
         ResultSet rs;
            
         try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update Usuarios set Correo_Usu=?, Perfil_Usu=?, Estado_Usu=? where Identif_Usu=?");

             ps.setString(1, correo);
             ps.setString(2, perfil);
             ps.setString(3, estado);
             ps.setString(4, id);

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
       
       public boolean eliminarUsuario(String id, String estado) {
         
        boolean r=false;
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try {
                
             connection = connetionMananger.Conectar();
             ps = connection.prepareStatement("Update Usuarios set Estado_Usu=? where Identif_Usu=?");

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
       
    public boolean modificarContrasena(String id, String contra, String confcontra) 
    {
         
        boolean r=false;
        Connection connection = null;
        PreparedStatement ps = null;
            
        ResultSet rs;
            
        try 
        {
            connection = connetionMananger.Conectar();
            ps = connection.prepareStatement("Update Usuarios set Contrasena_Usu=?, CContrasena_Usu=? where Identif_Usu=?");

            ps.setString(1, contra);
            ps.setString(2, confcontra);
            ps.setString(3, id);
            

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
