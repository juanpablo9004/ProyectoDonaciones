package Vistas;

import Controlador.UsuarioControlador;
import Entidades.Usuario;
import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 * Formulario que es el menú del aplicativo, aquí es donde 
 * dependiendo el perfil de usuario brinde sus diferentes
 * funciones.
 * 
 * @author Manuel Alejandro Correa
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 */

public class FrmMenu extends javax.swing.JFrame {
    
    /**
     * Este es el constructor del formulario, es donde se
     * inicializan todos los atributos que posee el formulario.
     */
    private String perfil;
    private FrmCambioContrasena cambioContrasena;
    private Usuario datosusuario;
    public static boolean control = false;
    
    public FrmMenu() {
        initComponents();
        setSize(550,400);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public FrmMenu(Usuario usuario) {
        
        initComponents();
        lblresulperfil.setText(usuario.getPerfil());
        perfil = usuario.getPerfil();
        setSize(550,400);
        setLocationRelativeTo(null);
        setResizable(false);
        datosusuario = usuario;
        
        if(perfil.equals("Administrador"))
        {
           jmenitedonante.setVisible(false);
           jmenitehospital.setVisible(false);
           jmenitejornadas.setVisible(false);
           jmeniteentrega.setVisible(false);
           jmenitembolsas.setVisible(false);
        }
        else
        {
            if(perfil.equals("Medico"))
            {
                jmeniteregistrar.setVisible(false);
            }
            else
            {
                if(perfil.equals("Enfermero"))
                {
                    jmeniteregistrar.setVisible(false);
                    jmenitehospital.setVisible(false);
                    jmenitejornadas.setVisible(false);
                }
                else
                {
                    if(perfil.equals("Bacteriólogo"))
                    {
                        jmeniteregistrar.setVisible(false);
                        jmenitedonante.setVisible(false);
                        jmenitehospital.setVisible(false);
                        jmenitejornadas.setVisible(false);
                        jmeniteentrega.setVisible(false);
                    }
                    else
                    {
                        if(perfil.equals("Auxiliar"))
                        {
                            jmeniteregistrar.setVisible(false);
                            jmenitehospital.setVisible(false);
                            jmenitejornadas.setVisible(false);
                            jmeniteentrega.setVisible(false);
                        }
                    }
                }
            }
        }
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

        lblperfilmenu = new javax.swing.JLabel();
        lblresulperfil = new javax.swing.JLabel();
        jmenbarppal = new javax.swing.JMenuBar();
        jmenugestionar = new javax.swing.JMenu();
        jmenuusuarios = new javax.swing.JMenu();
        jmeniteregistrar = new javax.swing.JMenuItem();
        jmenitecambiarcontra = new javax.swing.JMenuItem();
        jmenitedonante = new javax.swing.JMenuItem();
        jmenitehospital = new javax.swing.JMenuItem();
        jmenitejornadas = new javax.swing.JMenuItem();
        jmenitembolsas = new javax.swing.JMenuItem();
        jmeniteentrega = new javax.swing.JMenuItem();
        jmenuayudas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Gestión Donaciones de Sangre");

        lblperfilmenu.setText("Perfil:");

        jmenugestionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestionar.png"))); // NOI18N
        jmenugestionar.setText("Gestionar");

        jmenuusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/users.png"))); // NOI18N
        jmenuusuarios.setText("Usuarios");

        jmeniteregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrar.png"))); // NOI18N
        jmeniteregistrar.setText("Registrar");
        jmeniteregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmeniteregistrarActionPerformed(evt);
            }
        });
        jmenuusuarios.add(jmeniteregistrar);

        jmenitecambiarcontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/key.png"))); // NOI18N
        jmenitecambiarcontra.setText("Cambiar Contraseña");
        jmenitecambiarcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenitecambiarcontraActionPerformed(evt);
            }
        });
        jmenuusuarios.add(jmenitecambiarcontra);

        jmenugestionar.add(jmenuusuarios);

        jmenitedonante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jeringa.png"))); // NOI18N
        jmenitedonante.setText("Donantes");
        jmenitedonante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenitedonanteActionPerformed(evt);
            }
        });
        jmenugestionar.add(jmenitedonante);

        jmenitehospital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hospital.png"))); // NOI18N
        jmenitehospital.setText("Hospitales");
        jmenitehospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenitehospitalActionPerformed(evt);
            }
        });
        jmenugestionar.add(jmenitehospital);

        jmenitejornadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendar.png"))); // NOI18N
        jmenitejornadas.setText("Jornadas de Donación");
        jmenitejornadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenitejornadasActionPerformed(evt);
            }
        });
        jmenugestionar.add(jmenitejornadas);

        jmenitembolsas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrega.png"))); // NOI18N
        jmenitembolsas.setText("Bolsas de Sangre");
        jmenitembolsas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenitembolsasActionPerformed(evt);
            }
        });
        jmenugestionar.add(jmenitembolsas);

        jmeniteentrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bag1.png"))); // NOI18N
        jmeniteentrega.setText("Entrega de Sangre");
        jmeniteentrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmeniteentregaActionPerformed(evt);
            }
        });
        jmenugestionar.add(jmeniteentrega);

        jmenbarppal.add(jmenugestionar);

        jmenuayudas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/help.png"))); // NOI18N
        jmenuayudas.setText("Ayudas");
        jmenuayudas.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jmenuayudasMenuSelected(evt);
            }
        });

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        jMenuItem1.setText("Manual Usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmenuayudas.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        jMenuItem2.setText("Manual Sistema");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmenuayudas.add(jMenuItem2);

        jMenuItem3.setText("Acerca De");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmenuayudas.add(jMenuItem3);

        jmenbarppal.add(jmenuayudas);

        jmenusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jmenusalir.setText("Salir");
        jmenusalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmenusalirMouseClicked(evt);
            }
        });
        jmenbarppal.add(jmenusalir);

        setJMenuBar(jmenbarppal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(lblperfilmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblresulperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblperfilmenu)
                    .addComponent(lblresulperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método que es ejecutado al presionar la opción del menú Usuario, el 
     * cual permite ingresar al formulario usuarios.
     * 
     * @param evt es un evento de la clase Menú, el cual 
     * quiere decir que al presionar esa opción del menú, podrá ingresar
     * al formulario usuario.
     */
    
    private void jmeniteregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmeniteregistrarActionPerformed
        // TODO add your handling code here:
        
            if(control == false)
            {
                control=true;
                FrmUsuario frmusuario = new FrmUsuario();
                frmusuario.setVisible(true);
            } 
    }//GEN-LAST:event_jmeniteregistrarActionPerformed

   
   
    /**
     * Método que es ejecutado al presionar la opción del menú Donantes, el 
     * cual permite ingresar al formulario donantes.
     * 
     * @param evt es un evento de la clase Menú, el cual 
     * quiere decir que al presionar esa opción del menú, podrá ingresar
     * al formulario donantes.
     */
    
    private void jmenitedonanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenitedonanteActionPerformed
        
        if(control == false)
        {
            control=true;
            FrmDonante frmDonante = new FrmDonante();
            frmDonante.setVisible(true);
        }    
    }//GEN-LAST:event_jmenitedonanteActionPerformed

    /**
     * Método que es ejecutado al presionar la opción del menú Hospital, el 
     * cual permite ingresar al formulario donantes.
     * 
     * @param evt es un evento de la clase Menú, el cual 
     * quiere decir que al presionar esa opción del menú, podrá ingresar
     * al formulario hospital.
     */
    
    private void jmenitehospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenitehospitalActionPerformed
        
        if(control == false)
        {
            control=true;
            FrmHospital frmHospital = new FrmHospital();
            frmHospital.setVisible(true);
        } 
    }//GEN-LAST:event_jmenitehospitalActionPerformed
    
    /**
     * Método que es ejecutado al presionar la opción del menú jornadas, el 
     * cual permite ingresar al formulario jornadas.
     * 
     * @param evt es un evento de la clase Menú, el cual quiere
     * decir que al presionar esa opción del menú, podrá ingresar
     * al formulario jornadas.
     */
    
    private void jmenitejornadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenitejornadasActionPerformed
        
        if(control == false)
        {
            control=true;
            FrmJornada frmJornada = new FrmJornada();
            frmJornada.setVisible(true);
        }  
    }//GEN-LAST:event_jmenitejornadasActionPerformed
    
    /**
     * Método que es ejecutado al presionar la opción del menú bolsas, el 
     * cual permite ingresar al formulario bolsas.
     * 
     * @param evt es un evento de la clase Menú, el cual quiere
     * decir que al presionar esa opción del menú, podrá ingresar
     * al formulario bolsas.
     */
    
    private void jmenitembolsasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenitembolsasActionPerformed
        
        if(control == false)
        {
            control=true;
            FrmBolsa frmBolsa = new FrmBolsa();
            frmBolsa.setVisible(true);
        }    
    }//GEN-LAST:event_jmenitembolsasActionPerformed
    
    /**
     * Método que es ejecutado al presionar la opción del menú entrega, el 
     * cual permite ingresar al formulario entrega de sangre.
     * 
     * @param evt es un evento de la clase Menú, el cual quiere
     * decir que al presionar esa opción del menú, podrá ingresar
     * al formulario entrega de sangre.
     */
    
    private void jmeniteentregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmeniteentregaActionPerformed
        
        if(control == false)
        {
            control=true;
            FrmEntrega frmEntrega = new FrmEntrega();
            frmEntrega.setVisible(true);
        }
    }//GEN-LAST:event_jmeniteentregaActionPerformed

    private void jmenuayudasMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jmenuayudasMenuSelected

    }//GEN-LAST:event_jmenuayudasMenuSelected

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        String ruta="";
        ruta = System.getProperty("user.dir")+"\\build\\classes\\Archivos\\Manual.pdf";
        mostrarArchivo(ruta.toString());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        String ruta="";
        ruta = System.getProperty("user.dir")+"\\build\\classes\\Archivos\\ManualSistema.pdf";
        mostrarArchivo(ruta.toString());
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        if(control == false)
        {
            control=true;
            FrmAcercaDe acerca = new FrmAcercaDe();
            acerca.setVisible(true);
        }  
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmenusalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenusalirMouseClicked
        
        int opcion;
        opcion = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación", "Confirmación", JOptionPane.YES_NO_OPTION);
        
        if(opcion == 0) {
            
             System.exit(0);
        }
        else {
            
            this.setVisible(true);
        } 
    }//GEN-LAST:event_jmenusalirMouseClicked

    private void jmenitecambiarcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenitecambiarcontraActionPerformed
       
        if(control == false)
        {
            control=true;
            cambioContrasena = new FrmCambioContrasena();
            cambioContrasena.obtenerDatos(datosusuario);
            cambioContrasena.setVisible(true);
        }   
    }//GEN-LAST:event_jmenitecambiarcontraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar jmenbarppal;
    private javax.swing.JMenuItem jmenitecambiarcontra;
    private javax.swing.JMenuItem jmenitedonante;
    private javax.swing.JMenuItem jmeniteentrega;
    private javax.swing.JMenuItem jmenitehospital;
    private javax.swing.JMenuItem jmenitejornadas;
    private javax.swing.JMenuItem jmenitembolsas;
    private javax.swing.JMenuItem jmeniteregistrar;
    private javax.swing.JMenu jmenuayudas;
    private javax.swing.JMenu jmenugestionar;
    private javax.swing.JMenu jmenusalir;
    private javax.swing.JMenu jmenuusuarios;
    private javax.swing.JLabel lblperfilmenu;
    private javax.swing.JLabel lblresulperfil;
    // End of variables declaration//GEN-END:variables
   
     /**
     * Metodo encargado de abrir el pdf manual de usuario
     * del aplicativo.
     * @param nombreArchivo es la ruta del pdf que se va abrir.
     */
    
    public void mostrarArchivo(String nombreArchivo)
    {
          String comando[] = {"C:\\Program Files (x86)\\Adobe\\Reader 11.0\\Reader\\AcroRd32.exe", nombreArchivo };
            try
            {
                Runtime.getRuntime().exec(comando);
             }
            catch (Exception e) 
            {
                e.printStackTrace();
            }       
    }
}


