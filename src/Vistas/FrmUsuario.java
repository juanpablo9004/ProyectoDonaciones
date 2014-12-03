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
public class FrmUsuario extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioControlador usuariocontrolador;
    int sw =0;

    /**
     * Este es el constructor del formulario, es donde se inicializan todos los
     * atributos que posee el formulario.
     */
    public FrmUsuario() {

        initComponents();

        setLocationRelativeTo(null);
        setSize(550, 550);
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

        lblnombre = new javax.swing.JLabel();
        btnnuevo = new javax.swing.JButton();
        txtnombres = new javax.swing.JTextField();
        jpfconfcontra = new javax.swing.JPasswordField();
        txtcorreo = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        lblrepetircontra = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        txtidentif = new javax.swing.JTextField();
        jcomboperfil = new javax.swing.JComboBox();
        lblcontra = new javax.swing.JLabel();
        txtapellido2 = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        txtapellido1 = new javax.swing.JTextField();
        btnmodificar = new javax.swing.JButton();
        jpfcontra = new javax.swing.JPasswordField();
        lblestado = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        lblperfil = new javax.swing.JLabel();
        lblidentif = new javax.swing.JLabel();
        lblapellido1 = new javax.swing.JLabel();
        jcomboestado = new javax.swing.JComboBox();
        lblapellido2 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbleliminados = new javax.swing.JLabel();
        jmenbarusuarios = new javax.swing.JMenuBar();
        jmenuayuda = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Usuarios");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblnombre.setText("Nombres *");

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo1.png"))); // NOI18N
        btnnuevo.setToolTipText("Nuevo Registro");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        txtnombres.setEnabled(false);
        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        jpfconfcontra.setEnabled(false);

        txtcorreo.setEnabled(false);
        txtcorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcorreoFocusLost(evt);
            }
        });

        txtusuario.setEnabled(false);

        lblrepetircontra.setText("Confirmar Contraseña *");

        lblcorreo.setText("Correo");

        txtidentif.setEnabled(false);
        txtidentif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentifActionPerformed(evt);
            }
        });
        txtidentif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentifKeyTyped(evt);
            }
        });

        jcomboperfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Perfil", "Administrador", "Médico", "Enfermero", "Auxiliar", "Bacteriólogo" }));
        jcomboperfil.setEnabled(false);

        lblcontra.setText("Contraseña *");

        txtapellido2.setEnabled(false);
        txtapellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellido2ActionPerformed(evt);
            }
        });
        txtapellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellido2KeyTyped(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar1.png"))); // NOI18N
        btneliminar.setToolTipText("Eliminar Registro");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnconsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar1.png"))); // NOI18N
        btnconsultar.setToolTipText("Consultar Registro");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        txtapellido1.setEnabled(false);
        txtapellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellido1ActionPerformed(evt);
            }
        });
        txtapellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellido1KeyTyped(evt);
            }
        });

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar1.png"))); // NOI18N
        btnmodificar.setToolTipText("Modificar Registro");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        jpfcontra.setEnabled(false);

        lblestado.setText("Estado *");

        lblusuario.setText("Usuario *");

        lblperfil.setText("Perfil de Usuario *");

        lblidentif.setText("Identificación *");

        lblapellido1.setText("Primer Apellido *");

        jcomboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Activo", "Inactivo" }));
        jcomboestado.setEnabled(false);

        lblapellido2.setText("Segundo Apellido");

        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar1.png"))); // NOI18N
        btnguardar.setToolTipText("Guardar Cambios");
        btnguardar.setEnabled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar1.png"))); // NOI18N
        btncancelar.setToolTipText("Cancelar Cambios");
        btncancelar.setEnabled(false);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("* Campos Obligatorios");

        lbleliminados.setForeground(new java.awt.Color(255, 0, 0));

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
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnnuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnmodificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnconsultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblcorreo)
                                    .addComponent(lblusuario)
                                    .addComponent(lblcontra)
                                    .addComponent(lblrepetircontra)
                                    .addComponent(lblperfil)
                                    .addComponent(lblestado)
                                    .addComponent(lblapellido2)
                                    .addComponent(lblidentif)
                                    .addComponent(lblapellido1)
                                    .addComponent(lblnombre))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpfcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jpfconfcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcomboperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtapellido2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtapellido1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtidentif, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtnombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lbleliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbleliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidentif)
                    .addComponent(txtidentif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellido1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellido2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblusuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfcontra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfconfcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrepetircontra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblperfil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo)
                            .addComponent(btnmodificar)
                            .addComponent(btnconsultar)
                            .addComponent(btneliminar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnguardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncancelar))))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtapellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellido2ActionPerformed

    private void txtidentifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentifActionPerformed

    }//GEN-LAST:event_txtidentifActionPerformed

    /**
     * Método que es ejecutado al presionar el botón registrar del formulario,
     * permite guardar la información que fue ingresada en los campos del
     * formulario.
     *
     * @param evt es un evento de la clase ActionListener, el cual quiere decir
     * que al dar clic al botón ejecute el método.
     */

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed

        habilitarCampos();
        habiliarBotones();
        txtidentif.requestFocusInWindow();
    }//GEN-LAST:event_btnnuevoActionPerformed

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

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        
        long idusuario;
        String email;
        String datoid;
        String datousu;
        Object[] opciones = { "Identificación", "Usuario" };
        Object seleccion = JOptionPane.showInputDialog(this,"Seleccione item de búsqueda",
                "Seleccionar Opción",JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        
        if(seleccion == null)
        {
            JOptionPane.showMessageDialog(this, "Seleccione item para realizar la búsqueda");
            return;
        }
        
        if(seleccion == opciones[0])
        {
            datoid = JOptionPane.showInputDialog(this, "Ingrese Identificación","Buscar Usuario",
                    JOptionPane.QUESTION_MESSAGE);
            
            if(datoid == null)
            {
                JOptionPane.showMessageDialog(this, "Ingrese identificación si desea realizar la búsqueda");
            }
            
            else
            {
                if(Formatos.datosNumericos(datoid))
                {
                    idusuario = Long.parseLong(datoid);
                    usuario = new Usuario();
                    usuariocontrolador = new UsuarioControlador();
                    usuario = usuariocontrolador.BuscarUsuario(idusuario);
                    
                    if (usuario == null)
                    {
                        JOptionPane.showMessageDialog(this, "El usuario no existe");
                    }
                    else 
                    {                        
                        if(usuario.getEstado().equals("Inactivo"))
                        {
                            JOptionPane.showMessageDialog(this, "El usuario esta Inactivo y no se puede modificar");
                        }
                        else
                        {
                            habiliarBotones();
                            habilitarCamposModificar();

                            txtidentif.setText(usuario.getIdentif());
                            txtnombres.setText(usuario.getNomb());
                            txtapellido1.setText(usuario.getApell1());
                            txtapellido2.setText(usuario.getApell2());
                            txtcorreo.setText(usuario.getCorreo());
                            txtusuario.setText(usuario.getUsuario());
                            jpfcontra.setText(usuario.getContra());
                            jpfconfcontra.setText(usuario.getConcontra());
                            jcomboperfil.setSelectedItem(usuario.getPerfil().toString());
                            jcomboestado.setSelectedItem(usuario.getEstado().toString());
                  
                            sw = 1;
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "La identificación deben ser numerica");
                }
            }
        }
        
        if(seleccion == opciones[1])
        {
            datousu = JOptionPane.showInputDialog(this, "Ingrese Nombre de usuario");

            if (datousu == null) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nombre de usuario si desea realizar la búsqueda");
            } 
            else 
            {
               
                usuario = new Usuario();
                usuariocontrolador = new UsuarioControlador();
                usuario = usuariocontrolador.BuscarUsuarioNombre(datousu);

                if (usuario == null) 
                {
                    JOptionPane.showMessageDialog(this, "El usuario no existe");
                }
                else 
                {
                    if(usuario.getEstado().equals("Inactivo"))
                    {
                        JOptionPane.showMessageDialog(this, "El usuario esta Inactivo y no se puede modificar");
                    }
                    else
                    {
                        habiliarBotones();
                        habilitarCamposModificar();

                        txtidentif.setText(usuario.getIdentif());
                        txtnombres.setText(usuario.getNomb());
                        txtapellido1.setText(usuario.getApell1());
                        txtapellido2.setText(usuario.getApell2());
                        txtcorreo.setText(usuario.getCorreo());
                        txtusuario.setText(usuario.getUsuario());
                        jpfcontra.setText(usuario.getContra());
                        jpfconfcontra.setText(usuario.getConcontra());
                        jcomboperfil.setSelectedItem(usuario.getPerfil().toString());
                        jcomboestado.setSelectedItem(usuario.getEstado().toString());

                        sw = 1;
                    }
                }  
            }
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed

        long idusuario;
        String datoid;
        String datousu;
        Object[] opciones = { "Identificación", "Usuario" };
        Object seleccion = JOptionPane.showInputDialog(this,"Seleccione item de búsqueda",
                "Seleccionar Opción",JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == null) 
        {
            JOptionPane.showMessageDialog(this, "Seleccione item para realizar la búsqueda");
            return;
        }
        
        if(seleccion == opciones[0])
        {
            datoid = JOptionPane.showInputDialog(this, "Ingrese Identificación","Buscar Usuario",
                    JOptionPane.QUESTION_MESSAGE);
            
            if(datoid == null)
            {
                JOptionPane.showMessageDialog(this, "Ingrese identificación si desea realizar la búsqueda");
            }
            
            else
            {
                if(Formatos.datosNumericos(datoid))
                {
                    idusuario = Long.parseLong(datoid);
                    usuario = new Usuario();
                    usuariocontrolador = new UsuarioControlador();
                    usuario = usuariocontrolador.BuscarUsuario(idusuario);
                    
                    if (usuario == null)
                    {
                        JOptionPane.showMessageDialog(this, "El usuario no existe");
                    }
                    else 
                    {
                        habiliarBotones();
                        deshabilitarCampos();
                        
                        txtidentif.setText(usuario.getIdentif());
                        txtnombres.setText(usuario.getNomb());
                        txtapellido1.setText(usuario.getApell1());
                        txtapellido2.setText(usuario.getApell2());
                        txtcorreo.setText(usuario.getCorreo());
                        txtusuario.setText(usuario.getUsuario());
                        jpfcontra.setText(usuario.getContra());
                        jpfconfcontra.setText(usuario.getConcontra());
                        jcomboperfil.setSelectedItem(usuario.getPerfil().toString());
                        jcomboestado.setSelectedItem(usuario.getEstado().toString());
                        btnguardar.setEnabled(false);
                        
                        if(jcomboestado.getSelectedItem().toString().equals("Inactivo"))
                        {
                            lbleliminados.setText("EL USUARIO ESTA INACTIVO");
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "La identificación deben ser numerica");
                }
            }
        }
        
        if(seleccion == opciones[1])
        {
            datousu = JOptionPane.showInputDialog(this, "Ingrese Nombre de usuario");

            if (datousu == null) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nombre de usuario si desea realizar la búsqueda");
            } 
            else 
            {
                usuario = new Usuario();
                usuariocontrolador = new UsuarioControlador();
                usuario = usuariocontrolador.BuscarUsuarioNombre(datousu);

                if (usuario == null) 
                {
                    JOptionPane.showMessageDialog(this, "El usuario no existe");
                }
                else 
                {
                    habiliarBotones();
                    deshabilitarCampos();

                    txtidentif.setText(usuario.getIdentif());
                    txtnombres.setText(usuario.getNomb());
                    txtapellido1.setText(usuario.getApell1());
                    txtapellido2.setText(usuario.getApell2());
                    txtcorreo.setText(usuario.getCorreo());
                    txtusuario.setText(usuario.getUsuario());
                    jpfcontra.setText(usuario.getContra());
                    jpfconfcontra.setText(usuario.getConcontra());
                    jcomboperfil.setSelectedItem(usuario.getPerfil().toString());
                    jcomboestado.setSelectedItem(usuario.getEstado().toString());
                    btnguardar.setEnabled(false);
                    
                    if(jcomboestado.getSelectedItem().toString().equals("Inactivo"))
                    {
                        lbleliminados.setText("EL USUARIO ESTA INACTIVO");
                    }
                }  
            }
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if(sw == 0)
        {
            String idusuario = txtidentif.getText();
            String nombre = txtnombres.getText();
            String apellido1 = txtapellido1.getText();
            String apellido2 = txtapellido2.getText();
            String correo = txtcorreo.getText();
            String nombusua = txtusuario.getText();
            String contra = new String(jpfcontra.getPassword());
            String concontra = new String(jpfconfcontra.getPassword());
            String perfil = jcomboperfil.getSelectedItem().toString();
            String estado = jcomboestado.getSelectedItem().toString();
            boolean existe;
            boolean existeusu;
            boolean email;
            usuariocontrolador = new UsuarioControlador();

            if (idusuario.equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese Identificación", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtidentif.requestFocusInWindow();
                return;
            }

            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese Nombre(s)", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtnombres.requestFocusInWindow();
                return;
            }

            if (apellido1.equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese Primer Apellido", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtapellido1.requestFocusInWindow();
                return;
            }

            if (nombusua.equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese Nombre de Usuario", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtusuario.requestFocusInWindow();
                return;
            }

            if (contra.equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese Contraseña", "Información", JOptionPane.INFORMATION_MESSAGE);
                jpfcontra.requestFocusInWindow();
                return;
            }

            if (concontra.equals("")) {
                JOptionPane.showMessageDialog(this, "Ingrese Confirmar Contraseña", "Información", JOptionPane.INFORMATION_MESSAGE);
                jpfconfcontra.requestFocusInWindow();
                return;
            }

            if (jcomboperfil.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione un perfil de usuario", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboperfil.requestFocusInWindow();
                return;
            }

            if (jcomboestado.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione estado del usuario", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboestado.requestFocusInWindow();
                return;
            }

            if (!estado.equals("Activo")) {
                JOptionPane.showMessageDialog(this, "El Estado debe estar Activo", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboestado.requestFocusInWindow();
                return;
            }

            existe = usuariocontrolador.ValidarId(idusuario);

            if (existe == true) {
                JOptionPane.showMessageDialog(this, "El Id ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                txtidentif.requestFocusInWindow();
                return;
            }

            existeusu = usuariocontrolador.ValidarUsuario(nombusua);

            if (existeusu == true) {
                JOptionPane.showMessageDialog(this, "El Nombre de usuario ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                txtusuario.requestFocusInWindow();
                return;
            }

            if (!contra.equals(concontra)) {
                JOptionPane.showMessageDialog(this, "Las contraseñas del usuario no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                jpfcontra.setText("");
                jpfconfcontra.setText("");
                jpfcontra.requestFocusInWindow();
                return;
            }

            email = Email(correo);

            if (email == true || correo.equals("")) {
                usuario = new Usuario(idusuario, nombre, apellido1, apellido2, correo, nombusua, contra, concontra, perfil, estado);
                usuariocontrolador.CrearUsuario(usuario);
                JOptionPane.showMessageDialog(this, "Usuario registrado");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            } else {
                JOptionPane.showMessageDialog(this, "El correo es incorrecto");
                txtcorreo.requestFocusInWindow();
                return;
            }
        }
        
        if(sw == 1)
        {
            String idusuario;
            String correo;
            String perfil;
            String estado;
            boolean r;
            usuariocontrolador = new UsuarioControlador();
        
            idusuario = txtidentif.getText();
            correo = txtcorreo.getText();
            perfil = jcomboperfil.getSelectedItem().toString();
            estado = jcomboestado.getSelectedItem().toString();
        
            usuariocontrolador.BuscarModificarUsuario(idusuario, correo, perfil, estado);
            
            r = Email(correo);
            
            if(r == true || correo.equals(""))
            {
                JOptionPane.showMessageDialog(this, "El usuario fue modificado");
        
                LimpiarRegistro();
                deshabilitarBotones();
                deshabilitarCampos();
                
                sw = 0;
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El correo es incorrecto");
                txtcorreo.requestFocusInWindow();
                return;
            }
        }
        
        if(sw == 2)
        {
            String id;
            String perf;
            String usu;
            int per;
            
            id = txtidentif.getText();
            usu = txtusuario.getText();
            per = jcomboestado.getSelectedIndex();
            perf = jcomboestado.getSelectedItem().toString();
            
            if(per == 0)
            {
                JOptionPane.showMessageDialog(this, "Se debe seleccionar otra opción");
                jcomboestado.requestFocusInWindow();
                return;
            }
            
            usuariocontrolador = new UsuarioControlador();
            
            usuariocontrolador.eliminarUsuario(id, perf);
            usuario = usuariocontrolador.BuscarUsuarioNombre(usu);
            
            if(usuario.getEstado().equals("Activo"))
            {
                JOptionPane.showMessageDialog(this, "El Usuario fue Activado");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El usuario fue Inactivado");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            }
            
            sw = 0;
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        
        sw = 0;
        LimpiarRegistro();
        deshabilitarBotones();
        deshabilitarCampos();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        
        long idusuario;
        String datoid;
        String datousu;
        Object[] opciones = { "Identificación", "Usuario" };
        Object seleccion = JOptionPane.showInputDialog(this,"Seleccione item de búsqueda",
                "Seleccionar Opción",JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == null) 
        {
            JOptionPane.showMessageDialog(this, "Seleccione item para realizar la búsqueda");
            return;
        }
        
        if(seleccion == opciones[0])
        {
            datoid = JOptionPane.showInputDialog(this, "Ingrese Identificación","Buscar Usuario",
                    JOptionPane.QUESTION_MESSAGE);
            
            if(datoid == null)
            {
                JOptionPane.showMessageDialog(this, "Ingrese identificación si desea realizar la búsqueda");
            }
            
            else
            {
                if(Formatos.datosNumericos(datoid))
                {
                    idusuario = Long.parseLong(datoid);
                    usuario = new Usuario();
                    usuariocontrolador = new UsuarioControlador();
                    usuario = usuariocontrolador.BuscarUsuario(idusuario);
                    
                    if (usuario == null)
                    {
                        JOptionPane.showMessageDialog(this, "El usuario no existe");
                    }
                    else 
                    {
                        habiliarBotones();
                        deshabilitarCampos();
                        
                        txtidentif.setText(usuario.getIdentif());
                        txtnombres.setText(usuario.getNomb());
                        txtapellido1.setText(usuario.getApell1());
                        txtapellido2.setText(usuario.getApell2());
                        txtcorreo.setText(usuario.getCorreo());
                        txtusuario.setText(usuario.getUsuario());
                        jpfcontra.setText(usuario.getContra());
                        jpfconfcontra.setText(usuario.getConcontra());
                        jcomboperfil.setSelectedItem(usuario.getPerfil().toString());
                        jcomboestado.setSelectedItem(usuario.getEstado().toString());
                        jcomboestado.setEnabled(true);
                        
                        sw = 2;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "La identificación deben ser numerica");
                }
            }
        }
        
        if(seleccion == opciones[1])
        {
            datousu = JOptionPane.showInputDialog(this, "Ingrese Nombre de usuario");

            if (datousu == null) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nombre de usuario si desea realizar la búsqueda");
            } 
            else 
            {
                usuario = new Usuario();
                usuariocontrolador = new UsuarioControlador();
                usuario = usuariocontrolador.BuscarUsuarioNombre(datousu);

                if (usuario == null) 
                {
                    JOptionPane.showMessageDialog(this, "El usuario no existe");
                }
                else 
                {
                    habiliarBotones();
                    deshabilitarCampos();

                    txtidentif.setText(usuario.getIdentif());
                    txtnombres.setText(usuario.getNomb());
                    txtapellido1.setText(usuario.getApell1());
                    txtapellido2.setText(usuario.getApell2());
                    txtcorreo.setText(usuario.getCorreo());
                    txtusuario.setText(usuario.getUsuario());
                    jpfcontra.setText(usuario.getContra());
                    jpfconfcontra.setText(usuario.getConcontra());
                    jcomboperfil.setSelectedItem(usuario.getPerfil().toString());
                    jcomboestado.setSelectedItem(usuario.getEstado().toString());
                    jcomboestado.setEnabled(true);
                    
                    sw = 2;
                }  
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtidentifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentifKeyTyped

        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtidentifKeyTyped

    private void txtapellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellido1ActionPerformed

    private void txtapellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellido1KeyTyped

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellido1KeyTyped

    private void txtapellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellido2KeyTyped

        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtapellido2KeyTyped

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

    private void txtcorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcorreoFocusLost

    }//GEN-LAST:event_txtcorreoFocusLost

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        FrmMenu.control=false;
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox jcomboestado;
    private javax.swing.JComboBox jcomboperfil;
    private javax.swing.JMenuBar jmenbarusuarios;
    private javax.swing.JMenu jmenuayuda;
    private javax.swing.JMenu jmenusalir;
    private javax.swing.JPasswordField jpfconfcontra;
    private javax.swing.JPasswordField jpfcontra;
    private javax.swing.JLabel lblapellido1;
    private javax.swing.JLabel lblapellido2;
    private javax.swing.JLabel lblcontra;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbleliminados;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblidentif;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblperfil;
    private javax.swing.JLabel lblrepetircontra;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JTextField txtapellido1;
    private javax.swing.JTextField txtapellido2;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtidentif;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtusuario;
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

    public void LimpiarRegistro() {
        lbleliminados.setText("");
        txtidentif.setText("");
        txtnombres.setText("");
        txtapellido1.setText("");
        txtapellido2.setText("");
        txtcorreo.setText("");
        txtusuario.setText("");
        jpfcontra.setText("");
        jpfconfcontra.setText("");
        jcomboperfil.setSelectedIndex(0);
        jcomboestado.setSelectedIndex(0);
    }

    public void habilitarCampos() {
        txtidentif.setEnabled(true);
        txtnombres.setEnabled(true);
        txtapellido1.setEnabled(true);
        txtapellido2.setEnabled(true);
        txtcorreo.setEnabled(true);
        txtusuario.setEnabled(true);
        jpfcontra.setEnabled(true);
        jpfconfcontra.setEnabled(true);
        jpfcontra.setEnabled(true);
        jcomboperfil.setEnabled(true);
        jcomboestado.setEnabled(true);
    }

    public void deshabilitarCampos() {
        txtidentif.setEnabled(false);
        txtnombres.setEnabled(false);
        txtapellido1.setEnabled(false);
        txtapellido2.setEnabled(false);
        txtcorreo.setEnabled(false);
        txtusuario.setEnabled(false);
        jpfcontra.setEnabled(false);
        jpfconfcontra.setEnabled(false);
        jpfcontra.setEnabled(false);
        jcomboperfil.setEnabled(false);
        jcomboestado.setEnabled(false);
    }

    public void habiliarBotones() {
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btnnuevo.setEnabled(false);
        btnmodificar.setEnabled(false);
        btnconsultar.setEnabled(false);
        btneliminar.setEnabled(false);
    }

    public void deshabilitarBotones() {
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btnnuevo.setEnabled(true);
        btnmodificar.setEnabled(true);
        btnconsultar.setEnabled(true);
        btneliminar.setEnabled(true);
    }
    
    public void habilitarCamposModificar()
    {
        txtcorreo.setEnabled(true);
        jcomboperfil.setEnabled(true);
    }
}
