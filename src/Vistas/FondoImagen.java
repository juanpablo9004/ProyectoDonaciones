package Vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 * Clase creada para poner imagen de fondo en todos
 * los formularios del aplicativo.
 * Hereda del objeto Jpanel.
 * 
 * @author Manuel Alejandro Correa
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 * @Desde 2013-04-04
 */

public class FondoImagen extends javax.swing.JPanel {
    
    /**
     * Este es el constructor de la clase en donde se
     * inicializan todos los atributos que posee la clase.
     */
    
    public FondoImagen(int x, int y) {    
        
        this.setSize(x, y);
    }
        
    /**
     * Método que permite llamar la imagen que queremos  
     * de fondo para nuestros formularios, y en donde se le
     * asigna un tamaño.
     * @param g el cual permite dibujar la imagen dentro
     * del formulario.
     */
    
    public void paint(Graphics g){
        
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Imagenes/Fondonuevo.png"));        
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);        
        setOpaque(false);
        super.paintComponent(g);
    }
}
