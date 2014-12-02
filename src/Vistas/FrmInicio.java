package Vistas;

import Controlador.UsuarioControlador;
import Entidades.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 * Formulario que es el inicio del aplicativo, aquí es donde 
 * se hace el logging del usuario para poder entrar al 
 * aplicativo.
 * 
 * @author Manuel Alejandro Correa
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 */

public class FrmInicio extends javax.swing.JFrame {
    
    UsuarioControlador usuariocontrolador = new UsuarioControlador();
    /**
     * Este es el constructor del formulario, es donde se
     * inicializan todos los atributos que posee el formulario.
     */
    
    
    public FrmInicio() {
               
        initComponents();
        setSize(350,250);
        setLocationRelativeTo(null);
        setResizable(false);
        
        FondoImagen fondoImagen = new FondoImagen(345, 230);
        this.add( fondoImagen , BorderLayout.CENTER);
        fondoImagen.repaint();
    }

    /**
     * Este método es llamado desde el constructor para iniciar 
     * el formulario.
     * ADVERTENCIA: El código que contiene el metodo no se puede modificar.
     * el contenido del método es generado automáticamente por el editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusuario = new javax.swing.JLabel();
        lblcontra = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jpfcontra = new javax.swing.JPasswordField();
        btnolvidocontra = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Donaciones");

        lblusuario.setText("USUARIO");

        lblcontra.setText("CONTRASEÑA");

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir inicio.png"))); // NOI18N
        btncancelar.setToolTipText("Salir ");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnolvidocontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/olvido contraseña.png"))); // NOI18N
        btnolvidocontra.setToolTipText("Olvido Contraseña");
        btnolvidocontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnolvidocontraActionPerformed(evt);
            }
        });

        txtusuario.setToolTipText("Ingrese usuario para ingresar"); // NOI18N
        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingreso.png"))); // NOI18N
        btningresar.setToolTipText("Ingresar al Sistema");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblcontra, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(lblusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpfcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnolvidocontra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblusuario)
                        .addGap(17, 17, 17)
                        .addComponent(lblcontra))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpfcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btningresar)
                    .addComponent(btncancelar)
                    .addComponent(btnolvidocontra))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método que es ejecutado al presionar el botón aceptar del 
     * formulario, permite el ingreso al usuario a la funcionalidad
     * del sistema.
     * @param evt es un evento de la clase ActionListener, el cual 
     * quiere decir que al dar clic al botón ejecute el método.
     */
    
    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        
       boolean existe = false;
       String perfil = "";
       Usuario usuario;
       String usu = txtusuario.getText();
       String contra = new String(jpfcontra.getPassword());
        
       if(usu.equals("")) {
           
           JOptionPane.showMessageDialog(this,"Ingrese nombre de usuario para entrar al aplicativo","ERROR",JOptionPane.ERROR_MESSAGE);
           txtusuario.requestFocusInWindow();
       }
       else {
           
           if(contra.equals("")) {
               
               JOptionPane.showMessageDialog(this,"Debe ingresar la contraseña para entrar al aplicativo","ERROR",JOptionPane.ERROR_MESSAGE);
               jpfcontra.requestFocusInWindow();
           }
           else {
               
               existe = usuariocontrolador.ExisteUsuario(usu,contra);
               perfil = usuariocontrolador.PerfilUsuario(usu,contra);
               usuario = usuariocontrolador.DatosUsuario(usu, contra);
               
               if(existe == true && usuario.getEstado().equals("Activo")) 
               {
                   
                   FrmMenu menu = new FrmMenu(usuario);
                   menu.setVisible(true); 
                   this.setVisible(false);
                   
                   txtusuario.setText("");
               }
               else {
                   
                   JOptionPane.showMessageDialog(this,"El usuario o contraseña no son Correctos","Advertencia",JOptionPane.INFORMATION_MESSAGE);
                   txtusuario.setText("");
                   jpfcontra.setText("");
                   txtusuario.requestFocusInWindow();
               }
               
           }
       }
    }//GEN-LAST:event_btningresarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnolvidocontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnolvidocontraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnolvidocontraActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnolvidocontra;
    private javax.swing.JPasswordField jpfcontra;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}
