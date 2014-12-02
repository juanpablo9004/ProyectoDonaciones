package Principal;

import Vistas.FrmInicio;

/**
 * Esta es la clase principal de El Sistema Donaciones de Sangre
 * que es una aplicación que brinda la función de guardar los datos
 * y funciones necesarias dentro de un proceso de donación de sangre.
 * 
 * @author Manuel Alejandro Correa
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * @Desde 2013-04-04
 */

public class ClsPrincipal {

    /**
     * El metodo main es el encargado de iniciar el formulario
     * principal del aplicativo llamado FrmInicio.
     * @param args argumento de la linea.
     */
    
    public static void main(String[] args) {
        
       FrmInicio frminicio = new FrmInicio(); 
       frminicio.setVisible(true);
    }
    
}
