package Vistas;

import Entidades.Donante;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.*;
import Controlador.DonanteControlador;
import Utilidades.Formatos;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import java.util.Date;

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
public class FrmDonante extends javax.swing.JFrame {

    Donante donante;
    DonanteControlador donanteControlador;
    int sw =0;

    /**
     * Este es el constructor del formulario, es donde se inicializan todos los
     * atributos que posee el formulario.
     */
    public FrmDonante() {

        initComponents();

        setLocationRelativeTo(null);
        setSize(550, 700);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        jchoserfechnac.setCalendar(Calendar.getInstance());
    }

    /**
     * Este método es llamado desde el constructor para iniciar el formulario.
     * ADVERTENCIA: El código que contiene el metodo no se puede modificar. el
     * contenido del método es generado automáticamente por el editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnuevo = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbleliminados = new javax.swing.JLabel();
        lbltipodoc = new javax.swing.JLabel();
        lblident = new javax.swing.JLabel();
        lblapelli2 = new javax.swing.JLabel();
        lbltel = new javax.swing.JLabel();
        lblnombres = new javax.swing.JLabel();
        lblapelli1 = new javax.swing.JLabel();
        jcombenfer = new javax.swing.JComboBox();
        lblenferme = new javax.swing.JLabel();
        jchoserfechultdon = new com.toedter.calendar.JDateChooser();
        jchoserfechnac = new com.toedter.calendar.JDateChooser();
        txtcorreo = new javax.swing.JTextField();
        jcombogene = new javax.swing.JComboBox();
        txttel = new javax.swing.JTextField();
        txtdirecc = new javax.swing.JTextField();
        txtapellido1 = new javax.swing.JTextField();
        txtapellido2 = new javax.swing.JTextField();
        lblfechanac = new javax.swing.JLabel();
        lblfechultdon = new javax.swing.JLabel();
        lblhabitos = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        jcombotipo = new javax.swing.JComboBox();
        txtidentif = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        jcomboestado = new javax.swing.JComboBox();
        jcombhabit = new javax.swing.JComboBox();
        lbldirecc = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lblgenero = new javax.swing.JLabel();
        jmenbarusuarios = new javax.swing.JMenuBar();
        jmenuayuda = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Donantes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo1.png"))); // NOI18N
        btnnuevo.setToolTipText("Nuevo Registro");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
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

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar1.png"))); // NOI18N
        btnmodificar.setToolTipText("Modificar Registro");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

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

        lbltipodoc.setText("Tipo Documento *");

        lblident.setText("Identificación *");

        lblapelli2.setText("Segundo Apellido");

        lbltel.setText("Teléfono");

        lblnombres.setText("Nombres *");

        lblapelli1.setText("Primer Apellido *");

        jcombenfer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Enfermedad", "Hepatitis", "Asma", "Leucemia", "VIH", "Tiroides", "Ninguna" }));
        jcombenfer.setEnabled(false);

        lblenferme.setText("Enfermedades *");

        jchoserfechultdon.setEnabled(false);

        jchoserfechnac.setEnabled(false);

        txtcorreo.setEnabled(false);

        jcombogene.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Genero", "Masculino", "Femenino" }));
        jcombogene.setEnabled(false);

        txttel.setEnabled(false);
        txttel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelKeyTyped(evt);
            }
        });

        txtdirecc.setEnabled(false);

        txtapellido1.setEnabled(false);
        txtapellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellido1KeyTyped(evt);
            }
        });

        txtapellido2.setEnabled(false);
        txtapellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellido2KeyTyped(evt);
            }
        });

        lblfechanac.setText("Fecha Nacimiento *");

        lblfechultdon.setText("Fecha Ultima Donación");

        lblhabitos.setText("Hábitos *");

        lblestado.setText("Estado *");

        jcombotipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tipo", "Cedula", "Tarjeta Identidad", "Cedula Extranjeria" }));
        jcombotipo.setEnabled(false);

        txtidentif.setEnabled(false);
        txtidentif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentifKeyTyped(evt);
            }
        });

        txtnombres.setEnabled(false);
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });

        jcomboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Activo", "Inactivo" }));
        jcomboestado.setEnabled(false);

        jcombhabit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Hábito", "Fumar", "Alcohol", "Drogas", "Ninguna" }));
        jcombhabit.setEnabled(false);

        lbldirecc.setText("Dirección");

        lblcorreo.setText("Correo Electrónico");

        lblgenero.setText("Genero *");

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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lbleliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblident)
                            .addComponent(lbltipodoc)
                            .addComponent(lblnombres)
                            .addComponent(lblapelli1)
                            .addComponent(lblapelli2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbldirecc)
                                    .addComponent(lbltel)
                                    .addComponent(lblgenero)
                                    .addComponent(lblcorreo)
                                    .addComponent(lblfechanac)
                                    .addComponent(lblfechultdon)
                                    .addComponent(lblenferme)
                                    .addComponent(lblhabitos)
                                    .addComponent(lblestado))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcombotipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtidentif, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtapellido2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdirecc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcombogene, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jchoserfechnac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jchoserfechultdon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcombenfer, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                            .addComponent(jcombhabit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcomboestado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnnuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnconsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncancelar)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbleliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltipodoc)
                    .addComponent(jcombotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblident)
                    .addComponent(txtidentif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblnombres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblapelli1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblapelli2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdirecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldirecc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcombogene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblgenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblcorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jchoserfechnac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblfechanac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jchoserfechultdon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfechultdon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcombenfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblenferme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcombhabit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblhabitos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnuevo)
                            .addComponent(btnmodificar)
                            .addComponent(btnconsultar))
                        .addComponent(btncancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnguardar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        jcombotipo.requestFocusInWindow();
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
        
        String email;
        Date fnaci = null;
        Date fdona = null;
        String iddonante = JOptionPane.showInputDialog(this,"Ingrese Identificación", "Buscar Donante",JOptionPane.INFORMATION_MESSAGE);
        
        if(iddonante == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese identificación para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(iddonante))
        {
            donante = new Donante();
            donanteControlador = new DonanteControlador();
            donante = donanteControlador.buscarDonante(iddonante);
         
            if (donante == null)
            {
                JOptionPane.showMessageDialog(this, "El donante no existe");
            }
            else 
            {                        
                if(donante.getEstado().equals("Inactivo"))
                {
                    JOptionPane.showMessageDialog(this, "El donante esta Inactivo y no se puede modificar");
                }
                else
                {
                    habiliarBotones();
                    habilitarCamposModificar();
                    fnaci = Formatos.formatoFechasDate(donante.getFechanacim());
                    
                    if(!donante.getFechaultimdon().equals(""))
                    {
                        fdona = Formatos.formatoFechasDate(donante.getFechaultimdon());
                    }
                    
                    jcombotipo.setSelectedItem(donante.getTipodoc().toString());
                    txtidentif.setText(donante.getIdentif());
                    txtnombres.setText(donante.getNombres());
                    txtapellido1.setText(donante.getApell1());
                    txtapellido2.setText(donante.getApell2());
                    txttel.setText(donante.getTelef());
                    txtdirecc.setText(donante.getDirecc());
                    jcombogene.setSelectedItem(donante.getGenero().toString());
                    txtcorreo.setText(donante.getCorreo());
                    jchoserfechnac.setDate(fnaci);
                    jchoserfechultdon.setDate(fdona);
                    jcombenfer.setSelectedItem(donante.getEnferm().toString());
                    jcombhabit.setSelectedItem(donante.getHabito().toString());
                    jcomboestado.setSelectedItem(donante.getEstado().toString());
                  
                    sw = 1;
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "La identificación deben ser numerica");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed

        String email;
        Date fnaci = null;
        Date fdona = null;
        String iddonante = JOptionPane.showInputDialog(this,"Ingrese Identificación", "Consultar Donante",JOptionPane.INFORMATION_MESSAGE);
        
        if(iddonante == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese identificación para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(iddonante))
        {
            donante = new Donante();
            donanteControlador = new DonanteControlador();
            donante = donanteControlador.buscarDonante(iddonante);
         
            if (donante == null)
            {
                JOptionPane.showMessageDialog(this, "El donante no existe");
            }
            else 
            {                        
                habiliarBotones();
                deshabilitarCampos();
                fnaci = Formatos.formatoFechasDate(donante.getFechanacim());
                
                if(!donante.getFechaultimdon().equals(""))
                {
                    fdona = Formatos.formatoFechasDate(donante.getFechaultimdon());
                }

                jcombotipo.setSelectedItem(donante.getTipodoc().toString());
                txtidentif.setText(donante.getIdentif());
                txtnombres.setText(donante.getNombres());
                txtapellido1.setText(donante.getApell1());
                txtapellido2.setText(donante.getApell2());
                txttel.setText(donante.getTelef());
                txtdirecc.setText(donante.getDirecc());
                jcombogene.setSelectedItem(donante.getGenero().toString());
                txtcorreo.setText(donante.getCorreo());
                jchoserfechnac.setDate(fnaci);
                jchoserfechultdon.setDate(fdona);
                jcombenfer.setSelectedItem(donante.getEnferm().toString());
                jcombhabit.setSelectedItem(donante.getHabito().toString());
                jcomboestado.setSelectedItem(donante.getEstado().toString());
                btnguardar.setEnabled(false);

                if (jcomboestado.getSelectedItem().toString().equals("Inactivo")) {
                    lbleliminados.setText("EL DONANTE ESTA INACTIVO");
                } 
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "La identificación deben ser numerica");
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if(sw == 0)
        {
            String tipodoc = jcombotipo.getSelectedItem().toString();
            String id = txtidentif.getText();
            String nombre = txtnombres.getText();
            String apellido1 = txtapellido1.getText();
            String apellido2 = txtapellido2.getText();
            String telef = txttel.getText();
            String direc = txtdirecc.getText();
            String genero = jcombogene.getSelectedItem().toString();
            String correo = txtcorreo.getText();
            Date fechanac = jchoserfechnac.getDate();
            Date fechadon = jchoserfechultdon.getDate();
            String enfermed = jcombenfer.getSelectedItem().toString();
            String habitos = jcombhabit.getSelectedItem().toString();
            String estado = jcomboestado.getSelectedItem().toString();
            
            boolean existe;
            boolean email;
            
            String fnac = "";//Formatos.formatoFechas(fechanac);
            String fdon = "";
            
            donanteControlador = new DonanteControlador();
            
            if (jcombotipo.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(this, "Seleccione tipo de documento", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombotipo.requestFocusInWindow();
                return;
            }
            
            if (id.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Identificación", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtidentif.requestFocusInWindow();
                return;
            }

            if (nombre.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nombre(s)", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtnombres.requestFocusInWindow();
                return;
            }

            if (apellido1.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Primer Apellido", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtapellido1.requestFocusInWindow();
                return;
            }

            if (jcombogene.getSelectedIndex() == 0) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione genero", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombogene.requestFocusInWindow();
                return;
            }
            
            if (fechanac == null) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione fecha de nacimiento", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfechnac.requestFocusInWindow();
                return;
            }
            
            if (jchoserfechnac.getDate().after(new Date())) 
            {
                JOptionPane.showMessageDialog(this, "La fecha de nacimiento no puede ser después de la actual", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfechnac.requestFocusInWindow();
                return;
            }
            
            fnac = Formatos.formatoFechas(fechanac);
            
            if(fechadon != null)
            {
                fdon = Formatos.formatoFechas(fechadon);
                
                if (jchoserfechultdon.getDate().after(new Date())) 
                {
                    JOptionPane.showMessageDialog(this, "La fecha de última donación no puede ser después de la actual", "Información", JOptionPane.INFORMATION_MESSAGE);
                    jchoserfechultdon.requestFocusInWindow();
                    return;
                }
            }

            if (jcombenfer.getSelectedIndex() == 0) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione enfermedad", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombenfer.requestFocusInWindow();
                return;
            }

            if (jcombhabit.getSelectedIndex() == 0) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione hábito", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombhabit.requestFocusInWindow();
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
            
            existe = donanteControlador.validarId(id);

            if (existe == true) 
            {
                JOptionPane.showMessageDialog(this, "El Id ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                txtidentif.requestFocusInWindow();
                return;
            }

            email = Email(correo);

            if (email == true || correo.equals("")) 
            {
                donante = new Donante(tipodoc, id, nombre, apellido1, apellido2, telef, direc, genero, correo, fnac, fdon, enfermed, habitos, estado);
                donanteControlador.crearDonante(donante);
                JOptionPane.showMessageDialog(this, "Donante registrado");
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
            String ident;
            String telefono;
            String direccion;
            String correo;
            String estado;
            
            boolean r;
            donanteControlador = new DonanteControlador();
        
            ident = txtidentif.getText();
            telefono = txttel.getText();
            direccion = txtdirecc.getText();
            correo = txtcorreo.getText();
            estado = jcomboestado.getSelectedItem().toString();
            
            donanteControlador.buscarModificarDonante(ident, telefono, direccion, correo, estado);
            
            r = Email(correo);
            
            if(r == true || correo.equals(""))
            {
                JOptionPane.showMessageDialog(this, "El donante fue modificado");
        
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
            String ident;
            String telefono;
            String direccion;
            String correo;
            String estado;
            int per;
            
            ident = txtidentif.getText();
            telefono = txtapellido1.getText();
            direccion = txtdirecc.getText();
            correo = txtcorreo.getText();
            estado = jcomboestado.getSelectedItem().toString();
            per = jcomboestado.getSelectedIndex();
            
            if(per == 0)
            {
                JOptionPane.showMessageDialog(this, "Se debe seleccionar otra opción");
                jcomboestado.requestFocusInWindow();
                return;
            }
            
            donanteControlador = new DonanteControlador();
            
            donanteControlador.eliminarDonante(ident, estado);
            donante = donanteControlador.buscarDonante(ident);
            
            if(donante.getEstado().equals("Activo"))
            {
                JOptionPane.showMessageDialog(this, "El Donante fue Activado");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El Donante fue Inactivado");
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
        
        String email;
        Date fnaci = null;
        Date fdona = null;
        String iddonante = JOptionPane.showInputDialog(this,"Ingrese Identificación", "Eliminar Donante",JOptionPane.INFORMATION_MESSAGE);
        
        if(iddonante == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese identificación para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(iddonante))
        {
            donante = new Donante();
            donanteControlador = new DonanteControlador();
            donante = donanteControlador.buscarDonante(iddonante);
         
            if (donante == null)
            {
                JOptionPane.showMessageDialog(this, "El donante no existe");
            }
            else 
            {                        
                habiliarBotones();
                deshabilitarCampos();
                fnaci = Formatos.formatoFechasDate(donante.getFechanacim());
                
                if(!donante.getFechaultimdon().equals(""))
                {
                    fdona = Formatos.formatoFechasDate(donante.getFechaultimdon());
                }

                jcombotipo.setSelectedItem(donante.getTipodoc().toString());
                txtidentif.setText(donante.getIdentif());
                txtnombres.setText(donante.getNombres());
                txtapellido1.setText(donante.getApell1());
                txtapellido2.setText(donante.getApell2());
                txttel.setText(donante.getTelef());
                txtdirecc.setText(donante.getDirecc());
                jcombogene.setSelectedItem(donante.getGenero().toString());
                txtcorreo.setText(donante.getCorreo());
                jchoserfechnac.setDate(fnaci);
                jchoserfechultdon.setDate(fdona);
                jcombenfer.setSelectedItem(donante.getEnferm().toString());
                jcombhabit.setSelectedItem(donante.getHabito().toString());
                jcomboestado.setSelectedItem(donante.getEstado().toString());
                jcomboestado.setEnabled(true);

                sw = 2;   
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "La identificación deben ser numerica");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtidentifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentifKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtidentifKeyTyped

    private void txttelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txttelKeyTyped

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnombresKeyTyped

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser jchoserfechnac;
    private com.toedter.calendar.JDateChooser jchoserfechultdon;
    private javax.swing.JComboBox jcombenfer;
    private javax.swing.JComboBox jcombhabit;
    private javax.swing.JComboBox jcomboestado;
    private javax.swing.JComboBox jcombogene;
    private javax.swing.JComboBox jcombotipo;
    private javax.swing.JMenuBar jmenbarusuarios;
    private javax.swing.JMenu jmenuayuda;
    private javax.swing.JMenu jmenusalir;
    private javax.swing.JLabel lblapelli1;
    private javax.swing.JLabel lblapelli2;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldirecc;
    private javax.swing.JLabel lbleliminados;
    private javax.swing.JLabel lblenferme;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblfechanac;
    private javax.swing.JLabel lblfechultdon;
    private javax.swing.JLabel lblgenero;
    private javax.swing.JLabel lblhabitos;
    private javax.swing.JLabel lblident;
    private javax.swing.JLabel lblnombres;
    private javax.swing.JLabel lbltel;
    private javax.swing.JLabel lbltipodoc;
    private javax.swing.JTextField txtapellido1;
    private javax.swing.JTextField txtapellido2;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdirecc;
    private javax.swing.JTextField txtidentif;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttel;
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
        jcombotipo.setSelectedIndex(0);
        txtidentif.setText("");
        txtnombres.setText("");
        txtapellido1.setText("");
        txtapellido2.setText("");
        txttel.setText("");
        txtdirecc.setText("");
        jcombogene.setSelectedIndex(0);
        txtcorreo.setText("");
        jchoserfechnac.setCalendar(Calendar.getInstance());
        jchoserfechultdon.setCalendar(null);
        jcombenfer.setSelectedIndex(0);
        jcombhabit.setSelectedIndex(0);
        jcomboestado.setSelectedIndex(0);
    }

    public void habilitarCampos() {
        
        jcombotipo.setEnabled(true);
        txtidentif.setEnabled(true);
        txtnombres.setEnabled(true);
        txtapellido1.setEnabled(true);
        txtapellido2.setEnabled(true);
        txttel.setEnabled(true);
        txtdirecc.setEnabled(true);
        jcombogene.setEnabled(true);      
        txtcorreo.setEnabled(true);
        jchoserfechnac.setEnabled(true);
        jchoserfechultdon.setEnabled(true);
        jcombenfer.setEnabled(true);
        jcombhabit.setEnabled(true);
        jcomboestado.setEnabled(true);
    }

    public void deshabilitarCampos() {
        
        jcombotipo.setEnabled(false);
        txtidentif.setEnabled(false);
        txtnombres.setEnabled(false);
        txtapellido1.setEnabled(false);
        txtapellido2.setEnabled(false);
        txttel.setEnabled(false);
        txtdirecc.setEnabled(false);
        jcombogene.setEnabled(false);      
        txtcorreo.setEnabled(false);
        jchoserfechnac.setEnabled(false);
        jchoserfechultdon.setEnabled(false);
        jcombenfer.setEnabled(false);
        jcombhabit.setEnabled(false);
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
        txttel.setEnabled(true);
        txtdirecc.setEnabled(true);
        txtcorreo.setEnabled(true);
    }
}
