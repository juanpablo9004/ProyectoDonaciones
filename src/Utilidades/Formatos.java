package Utilidades;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
/**
 *
 * @author usuario
 */

public class Formatos {
  
    public static boolean datosNumericos(String dato)
    {
        try
        {
            long num = Long.parseLong(dato);
            
            return true;
            
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    
    public static String formatoFechas(Date fecha)
    {
        DateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
        String nuevafecha = null;
        
        try 
        {
            nuevafecha = formatofecha.format(fecha);
            return nuevafecha;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return nuevafecha;
        }    
    }
    
    public static Date formatoFechasDate (String fecha)
    {
        DateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
        Date nuevafecha = null;
        
        try 
        {
            nuevafecha = formatofecha.parse(fecha);
            return nuevafecha;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            return nuevafecha;
        }    
    }
}
