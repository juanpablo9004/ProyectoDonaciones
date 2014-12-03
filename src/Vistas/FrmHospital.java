package Vistas;

import Vistas.*;
import Entidades.Hospital;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.*;
import Controlador.HospitalControlador;
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
 * información necesaria para crear un hospital, el cual luego de ser registrado
 * podrá ingresar al sistema.
 *
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 */

public class FrmHospital extends javax.swing.JFrame {

    Hospital hospital;
    HospitalControlador hospitalControlador;
    int sw =0;

    /**
     * Este es el constructor del formulario, es donde se inicializan todos los
     * atributos que posee el formulario.
     */
    
    public FrmHospital() {

        initComponents();

        setLocationRelativeTo(null);
        setSize(550, 580);
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

        btnnuevo = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnconsultar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbleliminados = new javax.swing.JLabel();
        lblnivel = new javax.swing.JLabel();
        lblnit = new javax.swing.JLabel();
        txtnit = new javax.swing.JTextField();
        txtcorreorepre = new javax.swing.JTextField();
        lbltipohos = new javax.swing.JLabel();
        jcombotipo = new javax.swing.JComboBox();
        jcomboestado = new javax.swing.JComboBox();
        jcombnivel = new javax.swing.JComboBox();
        txtrazon = new javax.swing.JTextField();
        txttelef = new javax.swing.JTextField();
        txtdirecc = new javax.swing.JTextField();
        txttelrepre = new javax.swing.JTextField();
        txtrepre = new javax.swing.JTextField();
        lblrazon = new javax.swing.JLabel();
        lbldirecc = new javax.swing.JLabel();
        lbltelef = new javax.swing.JLabel();
        lblrepre = new javax.swing.JLabel();
        lbltelrepre = new javax.swing.JLabel();
        lblcorreorepre = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        jmenbarusuarios = new javax.swing.JMenuBar();
        jmenuayuda = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Hospitales");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
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

        lblnivel.setText("Nivel Hospital *");

        lblnit.setText("Nit Hospital *");

        txtnit.setEnabled(false);
        txtnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnitKeyTyped(evt);
            }
        });

        txtcorreorepre.setEnabled(false);

        lbltipohos.setText("Tipo Hospital *");

        jcombotipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Tipo", "Público", "Privado", "Clínica" }));
        jcombotipo.setEnabled(false);

        jcomboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Activo", "Inactivo" }));
        jcomboestado.setEnabled(false);

        jcombnivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Nivel", "Nivel I", "Nivel II", "Nivel III" }));
        jcombnivel.setEnabled(false);

        txtrazon.setEnabled(false);
        txtrazon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrazonKeyTyped(evt);
            }
        });

        txttelef.setEnabled(false);
        txttelef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefKeyTyped(evt);
            }
        });

        txtdirecc.setEnabled(false);

        txttelrepre.setEnabled(false);
        txttelrepre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelrepreKeyTyped(evt);
            }
        });

        txtrepre.setEnabled(false);
        txtrepre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtrepreKeyTyped(evt);
            }
        });

        lblrazon.setText("Razon Social *");

        lbldirecc.setText("Dirección");

        lbltelef.setText("Teléfono");

        lblrepre.setText("Representante Legal *");

        lbltelrepre.setText("Teléfono Representante");

        lblcorreorepre.setText("Correo Representante");

        lblestado.setText("Estado *");

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
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnit)
                            .addComponent(lbltipohos)
                            .addComponent(lblrazon)
                            .addComponent(lbldirecc)
                            .addComponent(lbltelef)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblestado))
                            .addComponent(lblrepre)
                            .addComponent(lbltelrepre)
                            .addComponent(lblcorreorepre)
                            .addComponent(lblnivel))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcombotipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrazon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdirecc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelef, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrepre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttelrepre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcorreorepre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcombnivel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(lbltipohos)
                    .addComponent(jcombotipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnit)
                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrazon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdirecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldirecc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrepre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblrepre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelrepre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelrepre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcorreorepre)
                    .addComponent(txtcorreorepre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcombnivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
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
                .addGap(46, 46, 46))
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
        
       String nit;
       String email;
       String datonit;
       String datorazon;
       
       Object[] opciones = { "Nit", "Razón Social" };
       Object seleccion = JOptionPane.showInputDialog(this,"Seleccione item de búsqueda",
              "Seleccionar Opción",JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        
        if(seleccion == null)
        {
            JOptionPane.showMessageDialog(this, "Seleccione item para realizar la búsqueda");
            return;
        }
        
        if(seleccion == opciones[0])
        {
            datonit = JOptionPane.showInputDialog(this, "Ingrese Nit del Hospital","Modificar Hospital",
                    JOptionPane.QUESTION_MESSAGE);
            
            if(datonit == null)
            {
                JOptionPane.showMessageDialog(this, "Ingrese nit si desea realizar la búsqueda");
            }
            
            else
            {
                if(Formatos.datosNumericos(datonit))
                {
                    hospital = new Hospital();
                    hospitalControlador = new HospitalControlador();
                    
                    hospital = hospitalControlador.buscarHospital(datonit);
                    
                    if (hospital == null)
                    {
                        JOptionPane.showMessageDialog(this, "El hospital no existe");
                    }
                    else 
                    {                        
                        if(hospital.getEstado().equals("Inactivo"))
                        {
                            JOptionPane.showMessageDialog(this, "El hospital esta Inactivo y no se puede modificar");
                        }
                        else
                        {
                            habiliarBotones();
                            habilitarCamposModificar();

                            jcombotipo.setSelectedItem(hospital.getTipohosp().toString());
                            txtnit.setText(hospital.getNit());
                            txtrazon.setText(hospital.getRazonsoc());
                            txtdirecc.setText(hospital.getDirecc());
                            txttelef.setText(hospital.getTelef());
                            txtrepre.setText(hospital.getRepresen());
                            txttelrepre.setText(hospital.getTelrepre());
                            txtcorreorepre.setText(hospital.getCorreorepre());
                            jcombnivel.setSelectedItem(hospital.getNivelhosp().toString());
                            jcomboestado.setSelectedItem(hospital.getEstado().toString());
                  
                            sw = 1;
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "El Nit debe ser numerico");
                }
            }
        }
        
        if(seleccion == opciones[1])
        {
            datorazon = JOptionPane.showInputDialog(this, "Ingrese Razón Social del hospital");

            if (datorazon == null) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Razón Social si desea realizar la búsqueda");
            } 
            else 
            {
                hospital = new Hospital();
                hospitalControlador = new HospitalControlador();
                
                hospital = hospitalControlador.BuscarHospitalNombre(datorazon);

                if (hospital == null) 
                {
                    JOptionPane.showMessageDialog(this, "El hospital no existe");
                }
                else 
                {
                    if(hospital.getEstado().equals("Inactivo"))
                    {
                        JOptionPane.showMessageDialog(this, "El hospital esta Inactivo y no se puede modificar");
                    }
                    else
                    {
                        habiliarBotones();
                        habilitarCamposModificar();

                        jcombotipo.setSelectedItem(hospital.getTipohosp().toString());
                        txtnit.setText(hospital.getNit());
                        txtrazon.setText(hospital.getRazonsoc());
                        txtdirecc.setText(hospital.getDirecc());
                        txttelef.setText(hospital.getTelef());
                        txtrepre.setText(hospital.getRepresen());
                        txttelrepre.setText(hospital.getTelrepre());
                        txtcorreorepre.setText(hospital.getCorreorepre());
                        jcombnivel.setSelectedItem(hospital.getNivelhosp().toString());
                        jcomboestado.setSelectedItem(hospital.getEstado().toString());

                        sw = 1;
                    }
                }  
            }
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed

        String nit;
        String datonit;
        String datorazon;
        Object[] opciones = { "Nit", "Razón Social" };
        Object seleccion = JOptionPane.showInputDialog(this,"Seleccione item de búsqueda",
                "Seleccionar Opción",JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == null) 
        {
            JOptionPane.showMessageDialog(this, "Seleccione item para realizar la búsqueda");
            return;
        }
        
        if(seleccion == opciones[0])
        {
            datonit = JOptionPane.showInputDialog(this, "Ingrese Nit del hospital","Buscar Hospital",
                    JOptionPane.QUESTION_MESSAGE);
            
            if(datonit == null)
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nit si desea realizar la búsqueda");
            }
            
            else
            {
                if(Formatos.datosNumericos(datonit))
                {
                    hospital = new Hospital();
                    hospitalControlador = new HospitalControlador();
                    
                    hospital = hospitalControlador.buscarHospital(datonit);
                    
                    if (hospital == null)
                    {
                        JOptionPane.showMessageDialog(this, "El hospital no existe");
                    }
                    else 
                    {
                        habiliarBotones();
                        deshabilitarCampos();
                        
                        jcombotipo.setSelectedItem(hospital.getTipohosp().toString());
                        txtnit.setText(hospital.getNit());
                        txtrazon.setText(hospital.getRazonsoc());
                        txtdirecc.setText(hospital.getDirecc());
                        txttelef.setText(hospital.getTelef());
                        txtrepre.setText(hospital.getRepresen());
                        txttelrepre.setText(hospital.getTelrepre());
                        txtcorreorepre.setText(hospital.getCorreorepre());
                        jcombnivel.setSelectedItem(hospital.getNivelhosp().toString());
                        jcomboestado.setSelectedItem(hospital.getEstado().toString());
                        btnguardar.setEnabled(false);
                        
                        if(jcomboestado.getSelectedItem().toString().equals("Inactivo"))
                        {
                            lbleliminados.setText("EL HOSPITAL ESTA INACTIVO");
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "El Nit debe ser numerico");
                }
            }
        }
        
        if(seleccion == opciones[1])
        {
            datorazon = JOptionPane.showInputDialog(this, "Ingrese Razón Social del hospital");

            if (datorazon == null) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Razón Social si desea realizar la búsqueda");
            } 
            else 
            {
                hospital = new Hospital();
                hospitalControlador = new HospitalControlador();
                
                hospital = hospitalControlador.BuscarHospitalNombre(datorazon);

                if (hospital == null) 
                {
                    JOptionPane.showMessageDialog(this, "El hospital no existe");
                }
                else 
                {
                    habiliarBotones();
                    deshabilitarCampos();

                    jcombotipo.setSelectedItem(hospital.getTipohosp().toString());
                    txtnit.setText(hospital.getNit());
                    txtrazon.setText(hospital.getRazonsoc());
                    txtdirecc.setText(hospital.getDirecc());
                    txttelef.setText(hospital.getTelef());
                    txtrepre.setText(hospital.getRepresen());
                    txttelrepre.setText(hospital.getTelrepre());
                    txtcorreorepre.setText(hospital.getCorreorepre());
                    jcombnivel.setSelectedItem(hospital.getNivelhosp().toString());
                    jcomboestado.setSelectedItem(hospital.getEstado().toString());
                    btnguardar.setEnabled(false);
                    
                    if(jcomboestado.getSelectedItem().toString().equals("Inactivo"))
                    {
                        lbleliminados.setText("EL HOSPITAL ESTA INACTIVO");
                    }
                }  
            }
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if(sw == 0)
        {
            String tipodoc = jcombotipo.getSelectedItem().toString();
            String nit = txtnit.getText();
            String razon = txtrazon.getText();
            String direcc = txtdirecc.getText();
            String telef = txttelef.getText();
            String repre = txtrepre.getText();
            String telrepre = txttelrepre.getText();
            String correorepre = txtcorreorepre.getText();
            String nivel = jcombnivel.getSelectedItem().toString();
            String estado = jcomboestado.getSelectedItem().toString();
            
            boolean existe;
            boolean email;
            
            hospitalControlador = new HospitalControlador();
            
            if (jcombotipo.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(this, "Seleccione tipo de hospital", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombotipo.requestFocusInWindow();
                return;
            }
            
            if (nit.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nit de hospital", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtnit.requestFocusInWindow();
                return;
            }

            if (razon.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Razón Social", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtrazon.requestFocusInWindow();
                return;
            }

            if (repre.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nombres Representante Legal", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtrepre.requestFocusInWindow();
                return;
            }

            if (jcombnivel.getSelectedIndex() == 0) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione nivel hospital", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombnivel.requestFocusInWindow();
                return;
            }

            if (jcomboestado.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione estado del hospital", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboestado.requestFocusInWindow();
                return;
            }

            if (!estado.equals("Activo")) {
                JOptionPane.showMessageDialog(this, "El Estado debe estar Activo", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboestado.requestFocusInWindow();
                return;
            }
            
            existe = hospitalControlador.validarNit(nit);

            if (existe == true) 
            {
                JOptionPane.showMessageDialog(this, "El Nit ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                txtnit.requestFocusInWindow();
                return;
            }

            email = Email(correorepre);

            if (email == true || correorepre.equals("")) 
            {
                hospital = new Hospital(tipodoc, nit, razon, direcc, telef, repre, telrepre, correorepre, nivel, estado);
                hospitalControlador.crearHospital(hospital);
                JOptionPane.showMessageDialog(this, "Hospital registrado");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            } else {
                JOptionPane.showMessageDialog(this, "El correo es incorrecto");
                txtcorreorepre.requestFocusInWindow();
                return;
            }
        }
        
        if(sw == 1)
        {
            String nit;
            String telef;
            String telrepre;
            String direccion;
            String correorepre;
            String estado;
            
            boolean r;
            hospitalControlador = new HospitalControlador();
        
            nit = txtnit.getText();
            telef = txttelef.getText();
            telrepre = txttelrepre.getText();
            direccion = txtdirecc.getText();
            correorepre = txtcorreorepre.getText();
            estado = jcomboestado.getSelectedItem().toString();
            
            hospitalControlador.buscarModificarHospital(nit, direccion, telef, telrepre, correorepre, estado);
            
            r = Email(correorepre);
            
            if(r == true || correorepre.equals(""))
            {
                JOptionPane.showMessageDialog(this, "El hospital fue modificado");
        
                LimpiarRegistro();
                deshabilitarBotones();
                deshabilitarCampos();
                
                sw = 0;
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El correo es incorrecto");
                txtcorreorepre.requestFocusInWindow();
                return;
            }
        }
        
        if(sw == 2)
        {
            String nit;
            String telef;
            String telrepre;
            String direccion;
            String correorepre;
            String estado;
            int per;
            
            nit = txtnit.getText();
            telef = txttelef.getText();
            telrepre = txttelrepre.getText();
            direccion = txtdirecc.getText();
            correorepre = txtcorreorepre.getText();
            estado = jcomboestado.getSelectedItem().toString();
            per = jcomboestado.getSelectedIndex();
            
            if(per == 0)
            {
                JOptionPane.showMessageDialog(this, "Se debe seleccionar otra opción");
                jcomboestado.requestFocusInWindow();
                return;
            }
            
            hospitalControlador = new HospitalControlador();
            
            hospitalControlador.eliminarHospital(nit, estado);
            hospital = hospitalControlador.buscarHospital(nit);
            
            if(hospital.getEstado().equals("Activo"))
            {
                JOptionPane.showMessageDialog(this, "El Hospital fue Activado");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El Hospital fue Inactivado");
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
        
        String nit;
        String datonit;
        String datorazon;
        Object[] opciones = { "Nit", "Razón Social" };
        Object seleccion = JOptionPane.showInputDialog(this,"Seleccione item de búsqueda",
                "Seleccionar Opción",JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == null) 
        {
            JOptionPane.showMessageDialog(this, "Seleccione item para realizar la búsqueda");
            return;
        }
        
        if(seleccion == opciones[0])
        {
            datonit = JOptionPane.showInputDialog(this, "Ingrese Nit","Buscar Hospital",
                    JOptionPane.QUESTION_MESSAGE);
            
            if(datonit == null)
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nit si desea realizar la búsqueda");
            }
            
            else
            {
                if(Formatos.datosNumericos(datonit))
                {
                    hospital = new Hospital();
                    hospitalControlador = new HospitalControlador();
                    
                    hospital = hospitalControlador.buscarHospital(datonit);
                    
                    if (hospital == null)
                    {
                        JOptionPane.showMessageDialog(this, "El hospital no existe");
                    }
                    else 
                    {
                        habiliarBotones();
                        deshabilitarCampos();
                        
                        jcombotipo.setSelectedItem(hospital.getTipohosp().toString());
                        txtnit.setText(hospital.getNit());
                        txtrazon.setText(hospital.getRazonsoc());
                        txtdirecc.setText(hospital.getDirecc());
                        txttelef.setText(hospital.getTelef());
                        txtrepre.setText(hospital.getRepresen());
                        txttelrepre.setText(hospital.getTelrepre());
                        txtcorreorepre.setText(hospital.getCorreorepre());
                        jcombnivel.setSelectedItem(hospital.getNivelhosp().toString());
                        jcomboestado.setSelectedItem(hospital.getEstado().toString());
                        jcomboestado.setEnabled(true);
                        
                        sw = 2;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "El Nit debe ser numerico");
                }
            }
        }
        
        if(seleccion == opciones[1])
        {
            datorazon = JOptionPane.showInputDialog(this, "Ingrese Razón Social del hospital");

            if (datorazon == null) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Razón Social si desea realizar la búsqueda");
            } 
            else 
            {
                hospital = new Hospital();
                hospitalControlador = new HospitalControlador();
                
                hospital = hospitalControlador.BuscarHospitalNombre(datorazon);

                if (hospital == null) 
                {
                    JOptionPane.showMessageDialog(this, "El hospital no existe");
                }
                else 
                {
                    habiliarBotones();
                    deshabilitarCampos();

                    jcombotipo.setSelectedItem(hospital.getTipohosp().toString());
                    txtnit.setText(hospital.getNit());
                    txtrazon.setText(hospital.getRazonsoc());
                    txtdirecc.setText(hospital.getDirecc());
                    txttelef.setText(hospital.getTelef());
                    txtrepre.setText(hospital.getRepresen());
                    txttelrepre.setText(hospital.getTelrepre());
                    txtcorreorepre.setText(hospital.getCorreorepre());
                    jcombnivel.setSelectedItem(hospital.getNivelhosp().toString());
                    jcomboestado.setSelectedItem(hospital.getEstado().toString());
                    jcomboestado.setEnabled(true);
                    
                    sw = 2;
                }  
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtnitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnitKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtnitKeyTyped

    private void txttelefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefKeyTyped

    private void txttelrepreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelrepreKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txttelrepreKeyTyped

    private void txtrazonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrazonKeyTyped
        
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtrazonKeyTyped

    private void txtrepreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtrepreKeyTyped
        
        char c = evt.getKeyChar();

        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtrepreKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        FrmMenu.control=false;
    }//GEN-LAST:event_formWindowClosing

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
    private javax.swing.JComboBox jcombnivel;
    private javax.swing.JComboBox jcomboestado;
    private javax.swing.JComboBox jcombotipo;
    private javax.swing.JMenuBar jmenbarusuarios;
    private javax.swing.JMenu jmenuayuda;
    private javax.swing.JMenu jmenusalir;
    private javax.swing.JLabel lblcorreorepre;
    private javax.swing.JLabel lbldirecc;
    private javax.swing.JLabel lbleliminados;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblnit;
    private javax.swing.JLabel lblnivel;
    private javax.swing.JLabel lblrazon;
    private javax.swing.JLabel lblrepre;
    private javax.swing.JLabel lbltelef;
    private javax.swing.JLabel lbltelrepre;
    private javax.swing.JLabel lbltipohos;
    private javax.swing.JTextField txtcorreorepre;
    private javax.swing.JTextField txtdirecc;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtrazon;
    private javax.swing.JTextField txtrepre;
    private javax.swing.JTextField txttelef;
    private javax.swing.JTextField txttelrepre;
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
        txtnit.setText("");
        txtrazon.setText("");
        txtdirecc.setText("");
        txttelef.setText("");
        txtrepre.setText("");
        txttelrepre.setText("");
        txtcorreorepre.setText("");
        jcombnivel.setSelectedIndex(0);
        jcomboestado.setSelectedIndex(0);
    }

    public void habilitarCampos() {
        
        jcombotipo.setEnabled(true);
        txtnit.setEnabled(true);
        txtrazon.setEnabled(true);
        txtdirecc.setEnabled(true);
        txttelef.setEnabled(true);
        txtrepre.setEnabled(true);
        txttelrepre.setEnabled(true);
        txtcorreorepre.setEnabled(true);      
        jcombnivel.setEnabled(true);
        jcomboestado.setEnabled(true);
    }

    public void deshabilitarCampos() {
        
        jcombotipo.setEnabled(false);
        txtnit.setEnabled(false);
        txtrazon.setEnabled(false);
        txtdirecc.setEnabled(false);
        txttelef.setEnabled(false);
        txtrepre.setEnabled(false);
        txttelrepre.setEnabled(false);
        txtcorreorepre.setEnabled(false);      
        jcombnivel.setEnabled(false);
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
        txtdirecc.setEnabled(true);
        txttelef.setEnabled(true);
        txttelrepre.setEnabled(true);
        txtcorreorepre.setEnabled(true);
    }
}
