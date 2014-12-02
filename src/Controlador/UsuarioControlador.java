package Controlador;

import DAO.Conexion;
import Entidades.Usuario;
import DAO.UsuarioDAO;

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

public class UsuarioControlador {
    
    /**
     * Método encargado de crear un usuario dentro de la base de datos.
     * 
     * @param usuario, es una variable que contiene todo los datos de un usuario.
     */
    
    public void CrearUsuario(Usuario usuario){
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try{
            
            usuarioDAO.CrearUsuario(usuario);
        }
        catch(Exception e) {
            e = new Exception("Error en UsuarioControlador");
        }
    }
    
    /**
     * Método encargado de buscar un usuario dentro de la base de datos.
     * 
     * @param id, variable que contiene el número de identificación de un usuario.
     * @return usuario, variable de tipo Usuario, la cual contiene los
     * datos que pertenecen al id ingresado, en caso de que el usuario no se encuentre
     * asignara null a la variable.
     */
    
    public Usuario BuscarUsuario(long id) {
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Usuario usuario = null;
        
        try {
                
            usuario = usuarioDAO.BuscarUsuario(Long.toString(id));
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
         return usuario;
    }
    
    /**
     * Método encargado de buscar un usuario dentro de la base de datos.
     * 
     * @param usu, variable que contiene el número de identificación de un usuario.
     * @return usuario, variable de tipo Usuario, la cual contiene los
     * datos que pertenecen al nombre de usuario ingresado, en caso de que el usuario no se encuentre
     * asignara null a la variable.
     */
    
    public Usuario BuscarUsuarioNombre(String usu) {
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Usuario usuario = null;
        
        try {
                
            usuario = usuarioDAO.BuscarUsuarioNombre(usu);
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
         return usuario;
    }
    
     /**
     * Método encargado de validar si un usuario ésta guardado en la base de
     * datos.
     * 
     * @param usu, variable que contiene el nombre de usuario de la persona 
     * que ingresara al sistema.
     * @param contra, variable que contiene la contraseña de usuario de la persona 
     * que ingresara al sistema.
     * @return existe, variable que retornara false si el usuario no existe o
     * verdadero si el usuario existe.
     */
    
    public boolean ExisteUsuario(String usu, String contra) {
        
        boolean existe= false;
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Usuario usuario = null;
        
        try {
                
            usuario = usuarioDAO.Validar(usu);
            
            if(usuario.getUsuario().equals(usu) && usuario.getContra().equals(contra))
            {
                existe = true;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
         return existe;
    }
    
    
     /**
     * Método encargado de buscar un usuario en la base de datos, y saber su
     * tipo de perfil.
     * 
     * @param usu, variable que contiene el nombre de usuario de la persona 
     * que ingresara al sistema.
     * @param contra, variable que contiene la contraseña de usuario de la persona 
     * que ingresara al sistema.
     * @return perfil, retornara una cadena con el perfil que pertenece al usuario
     * que ingresa al sistema.
     */
    
    public String PerfilUsuario(String usu, String contra) {
        
        String perfil= "";
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Usuario usuario = null;
        
        try {
                
            usuario = usuarioDAO.Validar(usu);
            
            if(usuario.getUsuario().equals(usu) && usuario.getContra().equals(contra))
            {
                perfil = usuario.getPerfil();
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
         return perfil;
    }
    
     /**
     * Método encargado de buscar un usuario dentro de la base de datos.
     * 
     * @param usu, variable que contiene el nombre de usuario de la persona 
     * que ingresara al sistema.
     * @param contra, variable que contiene la contraseña de usuario de la persona 
     * que ingresara al sistema.
     * @return usuario, variable de tipo Usuario, la cual contiene los
     * datos que pertenecen al id ingresado, en caso de que el usuario no se encuentre
     * asignara null a la variable.
     */
    
     public Usuario DatosUsuario(String usu, String contra) {
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Usuario usuario = null;
        
        try {
                
            usuario = usuarioDAO.Validar(usu);
            
            if(usuario.getUsuario().equals(usu) && usuario.getContra().equals(contra))
            {
                 return usuario;
            }
            else
            {
                usuario = null;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        return usuario;
    }
    
     /**
     * Método encargado de validar si un usuario al momento de ser registrado,
     * ya se encuentra guardado en la base de datos.
     * 
     * @param id, variable que contiene el número de identificación del usuario.
     * a registrar en el sistema.
     * @return existe, variable que retornara false si el usuario no existe o
     * verdadero si el usuario existe.
     */
     
    public boolean ValidarId(String id) {
        
        boolean existe= false;
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Usuario usuario = null;
        
        try {
             
            usuario = usuarioDAO.BuscarUsuario(id);
            
            if(usuario.getIdentif().equals(id))
            {
                existe = true;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
         return existe;
    }
    
     /**
     * Método encargado de validar si el nombre de usuario de la persona a registrar
     * no lo posee otro usuario en la base de datos.
     * 
     * @param usu, variable que contiene el nombre de usuario de la persona 
     * a registrar en el sistema.
     * @return existe, variable que retornara false si el nombre de usuario no 
     * existe o verdadero si el nombre de usuario existe.
     */
    
     public boolean ValidarUsuario(String usu) {
        
        boolean existe= false;
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        Usuario usuario = null;
        
        try {
             
            usuario = usuarioDAO.Validar(usu);
            
            if(usuario.getUsuario().equals(usu))
            {
                existe = true;
            }
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
         return existe;
    }
    
    /**
     * Método encargado de buscar un usuario para poder ser modificado, y asignar
     * la nueva información cambiada del usuario.
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
     
    public void BuscarModificarUsuario(String id, String correo, String perfil, String estado) {
        
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));

        Usuario usuario = null;
        
        try {
                
            usuarioDAO.ModificarUsuario(id, correo, perfil, estado);
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
    }
    
    public void eliminarUsuario(String id, String estado)
    {
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        
        try 
        {
            usuarioDAO.eliminarUsuario(id, estado);
        }
        catch(Exception e)
        {
            new Exception("Error en UsuarioControlador");
        }
    }
    
    public boolean modificarContrasena (String id, String contra, String confcontra) 
    {
        UsuarioDAO usuarioDAO = new UsuarioDAO(new Conexion("dba_donaciones","donaciones","jdbc:mysql://localhost/donaciones"));
        boolean r = false;
        
        try {
                
            r = usuarioDAO.modificarContrasena(id, contra, confcontra);
        } 
        catch (Exception e) {
                
            new Exception("Error en UsuarioControlador");
        }
        
        return r;
    }
}
