package Vistas;

import Entidades.Usuario;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.*;
import Controlador.UsuarioControlador;
import Utilidades.Formatos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 * Formulario en donde el administrador del aplicativo podrá ingresar la
 * información necesaria para crear un usuario, el cual luego de ser registrado
 * podrá ingresar al sistema.
 *
 * @author Manuel Alejandro Correa
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 */
public class FrmCambioContrasena extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioControlador usuariocontrolador;

    /**
     * Este es el constructor del formulario, es donde se inicializan todos los
     * atributos que posee el formulario.
     */
    public FrmCambioContrasena() {

        initComponents();

        setLocationRelativeTo(null);
        setSize(550, 310);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);     
    }

    /**
     * Este método es llamado desde el constructor para iniciar el formulario.
     * ADVERTENCIA: El código que contiene el metodo no se puede modificar. el
     * contenido del método es generado automáticamente por el editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcontranueva = new javax.swing.JLabel();
        lblcontraant = new javax.swing.JLabel();
        lblcontraconfir = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passcontraant = new javax.swing.JPasswordField();
        passcontranueva = new javax.swing.JPasswordField();
        passcontraconfir = new javax.swing.JPasswordField();
        jmenbarusuarios = new javax.swing.JMenuBar();
        jmenuayuda = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cambio de Contraseña");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblcontranueva.setText("Contraseña Nueva *");

        lblcontraant.setText("Contraseña Anterior *");

        lblcontraconfir.setText("Primer Apellido *");

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar1.png"))); // NOI18N
        btnguardar.setToolTipText("Guardar Cambios");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar1.png"))); // NOI18N
        btncancelar.setToolTipText("Cancelar Cambios");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("* Campos Obligatorios");

        jmenuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        jmenuayuda.setText("Ayuda");
        jmenuayuda.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jmenuayudaMenuSelected(evt);
            }
        });
        jmenbarusuarios.add(jmenuayuda);

        jmenusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jmenusalir.setText("Salir");
        jmenusalir.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jmenusalirMenuSelected(evt);
            }
        });
        jmenusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenusalirActionPerformed(evt);
            }
        });
        jmenbarusuarios.add(jmenusalir);

        setJMenuBar(jmenbarusuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontraant)
                            .addComponent(lblcontraconfir)
                            .addComponent(lblcontranueva))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passcontraant)
                            .addComponent(passcontranueva)
                            .addComponent(passcontraconfir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncancelar)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontraant)
                    .addComponent(passcontraant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontranueva)
                    .addComponent(passcontranueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcontraconfir)
                    .addComponent(passcontraconfir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncancelar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que es ejecutado al abrir el formulario, el cual permite
     * instanciar un objeto de la clase FondoImagen donde se pintara la imagen
     * que se pondrá de fondo en el formulario.
     *
     * @param evt es un evento de la clase Window, el cual quiere decir que al
     * abrir el formulario ejecute el método.
     */

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        /*FondoImagen fondo = new FondoImagen();
         this.add( fondo , BorderLayout.CENTER);
         fondo.repaint();*/

    }//GEN-LAST:event_formWindowOpened

    /**
     * Método que es ejecutado al presionar la opción del menú salir, el cual
     * permite salir del aplicativo.
     *
     * @param evt es un evento de la clase Menú, el cual quiere decir que al
     * presionar esa opción del menú, podrá cerrar la aplicación.
     */

    private void jmenusalirMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmenusalirMenuSelected

        int opcion;
        opcion = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (opcion == 0) {

            System.exit(0);
        } else {

            this.setVisible(true);
        }
    }//GEN-LAST:event_jmenusalirMenuSelected

    private void jmenusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenusalirActionPerformed

    }//GEN-LAST:event_jmenusalirActionPerformed

    private void jmenuayudaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmenuayudaMenuSelected

        String ruta = "";
        ruta = System.getProperty("user.dir") + "\\build\\classes\\Archivos\\Manual.pdf";
        mostrarArchivo(ruta.toString());
    }//GEN-LAST:event_jmenuayudaMenuSelected

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        String contraant = new String (passcontraant.getPassword());
        String contranueva = new String (passcontranueva.getPassword());
        String contraconfir = new String (passcontraconfir.getPassword());
        boolean r;
           
        usuariocontrolador = new UsuarioControlador();
        
        if(contraant.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar su contraseña anterior",
                         "Error",JOptionPane.ERROR_MESSAGE);
            passcontraant.requestFocusInWindow();
            return;
        }
        
        if(contranueva.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar su contraseña nueva",
                         "Error",JOptionPane.ERROR_MESSAGE);
            passcontranueva.requestFocusInWindow();
            return;
        }
        
        if(contraconfir.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Debe ingresar confirmar contraseña",
                         "Error",JOptionPane.ERROR_MESSAGE);
            passcontraconfir.requestFocusInWindow();
            return;
        }
        
        if(!usuario.getContra().equals(contraant))
        {
            JOptionPane.showMessageDialog(this, "La contraseña anterior es incorrecta",
                         "Error",JOptionPane.ERROR_MESSAGE);
            passcontraant.setText("");
            passcontraconfir.setText("");
            passcontranueva.setText("");
            passcontraant.requestFocusInWindow();
            return;
        }
        
        if(!contranueva.equals(contraconfir))
        {
            JOptionPane.showMessageDialog(this, "La contraseña nueva y la confirmacion no son iguales",
                         "Error",JOptionPane.ERROR_MESSAGE);
            passcontraant.setText("");
            passcontraconfir.setText("");
            passcontranueva.setText("");
            passcontranueva.requestFocusInWindow();
            return;
        }
        
        r = usuariocontrolador.modificarContrasena(usuario.getIdentif(), contranueva, contraconfir);
        
        if(r == true)
        {
            JOptionPane.showMessageDialog(this, "La contraseña fue modificada");
            LimpiarRegistro();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "La contraseña no se modifico");
            LimpiarRegistro();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed

        LimpiarRegistro();
        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

    public boolean Email(String correo) {
        Pattern pat = null;
        Matcher mat = null;

        pat = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        mat = pat.matcher(correo);

        if (mat.find()) {
            return true;
        } else {
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jmenbarusuarios;
    private javax.swing.JMenu jmenuayuda;
    private javax.swing.JMenu jmenusalir;
    private javax.swing.JLabel lblcontraant;
    private javax.swing.JLabel lblcontraconfir;
    private javax.swing.JLabel lblcontranueva;
    private javax.swing.JPasswordField passcontraant;
    private javax.swing.JPasswordField passcontraconfir;
    private javax.swing.JPasswordField passcontranueva;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo encargado de abrir el pdf manual de usuario del aplicativo.
     *
     * @param nombreArchivo es la ruta del pdf que se va abrir.
     */
    public void mostrarArchivo(String nombreArchivo) {
        String comando[] = {"C:\\Program Files (x86)\\Adobe\\Reader 11.0\\Reader\\AcroRd32.exe", nombreArchivo};
        try {
            Runtime.getRuntime().exec(comando);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Usuario obtenerDatos(Usuario usuario)
    {
        this.usuario = usuario;
        
        return usuario;
    }

    public void LimpiarRegistro() {
        
        passcontraant.setText("");
        passcontraconfir.setText("");
        passcontranueva.setText("");
    }
}
