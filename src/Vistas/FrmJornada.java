package Vistas;

import Vistas.*;
import Entidades.Jornada;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.*;
import Controlador.JornadaControlador;
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
 * información necesaria para crear una jornada, la cual luego de ser registrada
 * podrá ingresar al sistema.
 *
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 */
public class FrmJornada extends javax.swing.JFrame {

    Jornada jornada;
    JornadaControlador jornadaControlador;
    int sw =0;

    /**
     * Este es el constructor del formulario, es donde se inicializan todos los
     * atributos que posee el formulario.
     */
    
    public FrmJornada() {

        initComponents();

        setLocationRelativeTo(null);
        setSize(550, 700);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        jchoserfechprog.setCalendar(Calendar.getInstance());
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
        txtcodigo = new javax.swing.JTextField();
        jcombhora = new javax.swing.JComboBox();
        jchoserfechprog = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        lblapos = new javax.swing.JLabel();
        txtapos = new javax.swing.JTextField();
        lblaneg = new javax.swing.JLabel();
        lblbpos = new javax.swing.JLabel();
        lblbneg = new javax.swing.JLabel();
        lblopos = new javax.swing.JLabel();
        lbloneg = new javax.swing.JLabel();
        lblabpos = new javax.swing.JLabel();
        lblabneg = new javax.swing.JLabel();
        txtaneg = new javax.swing.JTextField();
        txtbpos = new javax.swing.JTextField();
        txtbneg = new javax.swing.JTextField();
        txtopos = new javax.swing.JTextField();
        txtoneg = new javax.swing.JTextField();
        txtabneg = new javax.swing.JTextField();
        txtabpos = new javax.swing.JTextField();
        jcombminu = new javax.swing.JComboBox();
        lbldirecc = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        lblfechpro = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaobser = new javax.swing.JTextArea();
        jcomboestado = new javax.swing.JComboBox();
        txtdirec = new javax.swing.JTextField();
        lblobserva = new javax.swing.JLabel();
        txtcantdona = new javax.swing.JTextField();
        lblcantdonan = new javax.swing.JLabel();
        jmenbarusuarios = new javax.swing.JMenuBar();
        jmenuayuda = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Jornadas");
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

        txtcodigo.setEnabled(false);
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        jcombhora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horas", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "00" }));
        jcombhora.setEnabled(false);

        jchoserfechprog.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad de Sangre Donada cm3", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        lblapos.setText("A+ *");

        txtapos.setAutoscrolls(false);
        txtapos.setEnabled(false);
        txtapos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaposKeyTyped(evt);
            }
        });

        lblaneg.setText("A- *");

        lblbpos.setText("B+ *");

        lblbneg.setText("B- *");

        lblopos.setText("O+ *");

        lbloneg.setText("O- *");

        lblabpos.setText("AB+ *");

        lblabneg.setText("AB- *");

        txtaneg.setEnabled(false);
        txtaneg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtanegKeyTyped(evt);
            }
        });

        txtbpos.setEnabled(false);
        txtbpos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbposKeyTyped(evt);
            }
        });

        txtbneg.setEnabled(false);
        txtbneg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbnegKeyTyped(evt);
            }
        });

        txtopos.setEnabled(false);
        txtopos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtoposKeyTyped(evt);
            }
        });

        txtoneg.setEnabled(false);
        txtoneg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtonegKeyTyped(evt);
            }
        });

        txtabneg.setEnabled(false);
        txtabneg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtabnegKeyTyped(evt);
            }
        });

        txtabpos.setEnabled(false);
        txtabpos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtabposKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblopos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtopos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblapos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblaneg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtaneg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbloneg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtoneg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblbpos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbpos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblabpos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtabpos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblbneg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbneg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblabneg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtabneg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblapos)
                    .addComponent(txtapos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbneg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblaneg)
                    .addComponent(txtaneg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbpos)
                    .addComponent(txtbpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbneg))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblopos)
                    .addComponent(txtopos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbloneg)
                    .addComponent(txtoneg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblabpos)
                    .addComponent(txtabpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblabneg)
                    .addComponent(txtabneg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jcombminu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Minutos", "00", "10", "20", "30", "40", "50" }));
        jcombminu.setEnabled(false);

        lbldirecc.setText("Dirección");

        lblestado.setText("Estado *");

        lblfechpro.setText("Fecha Programada *");

        lblhora.setText("Hora *");

        lblcodigo.setText("Código *");

        areaobser.setColumns(20);
        areaobser.setRows(5);
        areaobser.setEnabled(false);
        jScrollPane1.setViewportView(areaobser);

        jcomboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Activo", "Inactivo" }));
        jcomboestado.setEnabled(false);

        txtdirec.setEnabled(false);

        lblobserva.setText("Observaciones");

        txtcantdona.setEnabled(false);
        txtcantdona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantdonaKeyTyped(evt);
            }
        });

        lblcantdonan.setText("Cantidad Donantes *");

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
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbleliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblfechpro)
                    .addComponent(lblcodigo)
                    .addComponent(lblhora)
                    .addComponent(lbldirecc)
                    .addComponent(lblcantdonan)
                    .addComponent(lblestado))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtdirec)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jchoserfechprog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jcombhora, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jcombminu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtcantdona, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(111, 111, 111))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblobserva)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btncancelar)
                .addGap(31, 31, 31))
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
                    .addComponent(lblcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblfechpro)
                    .addComponent(jchoserfechprog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhora)
                    .addComponent(jcombhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcombminu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldirecc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantdona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcantdonan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblestado)
                    .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblobserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnmodificar)
                                .addComponent(btnconsultar)))
                        .addComponent(btncancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnguardar)))
                .addGap(35, 35, 35))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cantidad de Sangre Donada cm3 *");

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
        txtcodigo.requestFocusInWindow();
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
        
        String cantdonan;
        Date fechprog = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese Código de jornada", "Buscar Jornada",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            jornada = new Jornada();
            jornadaControlador = new JornadaControlador();
            jornada = jornadaControlador.buscarJornada(codigo);
         
            if (jornada == null)
            {
                JOptionPane.showMessageDialog(this, "La Jornada no existe");
            }
            else 
            {                        
                if(jornada.getEstado().equals("Inactivo"))
                {
                    JOptionPane.showMessageDialog(this, "La jornada esta Inactiva y no se puede modificar");
                }
                else
                {
                    habiliarBotones();
                    habilitarCamposModificar();
                    fechprog = Formatos.formatoFechasDate(jornada.getFechaprogra());
                    cantdonan = String.valueOf(jornada.getCantdonan());
                                     
                    txtcodigo.setText(jornada.getCodigo());
                    jchoserfechprog.setDate(fechprog);
                    jcombhora.setSelectedItem(jornada.getHoras().toString());
                    jcombminu.setSelectedItem(jornada.getMinutos().toString());
                    txtdirec.setText(jornada.getDirecc());
                    txtcantdona.setText(cantdonan);
                    txtapos.setText(String.valueOf(jornada.getCantapos()));
                    txtaneg.setText(String.valueOf(jornada.getCantaneg()));
                    txtbpos.setText(String.valueOf(jornada.getCantbpos()));
                    txtbneg.setText(String.valueOf(jornada.getCantbneg()));
                    txtopos.setText(String.valueOf(jornada.getCantopos()));
                    txtoneg.setText(String.valueOf(jornada.getCantoneg()));
                    txtabpos.setText(String.valueOf(jornada.getCantabpos()));
                    txtabneg.setText(String.valueOf(jornada.getCantabneg()));
                    areaobser.setText(jornada.getObserv());
                    jcomboestado.setSelectedItem(jornada.getEstado().toString());
                  
                    sw = 1;
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "El código debe ser numerico");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        
        String cantdonan;
        Date fechprog = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese Código de jornada", "Consultar Jornada",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            jornada = new Jornada();
            jornadaControlador = new JornadaControlador();
            jornada = jornadaControlador.buscarJornada(codigo);
         
            if (jornada == null)
            {
                JOptionPane.showMessageDialog(this, "La Jornada no existe");
            }
            else 
            {                        
                habiliarBotones();
                deshabilitarCampos();
                fechprog = Formatos.formatoFechasDate(jornada.getFechaprogra());
                cantdonan = String.valueOf(jornada.getCantdonan());

                txtcodigo.setText(jornada.getCodigo());
                jchoserfechprog.setDate(fechprog);
                jcombhora.setSelectedItem(jornada.getHoras().toString());
                jcombminu.setSelectedItem(jornada.getMinutos().toString());
                txtdirec.setText(jornada.getDirecc());
                txtcantdona.setText(cantdonan);
                txtapos.setText(String.valueOf(jornada.getCantapos()));
                txtaneg.setText(String.valueOf(jornada.getCantaneg()));
                txtbpos.setText(String.valueOf(jornada.getCantbpos()));
                txtbneg.setText(String.valueOf(jornada.getCantbneg()));
                txtopos.setText(String.valueOf(jornada.getCantopos()));
                txtoneg.setText(String.valueOf(jornada.getCantoneg()));
                txtabpos.setText(String.valueOf(jornada.getCantabpos()));
                txtabneg.setText(String.valueOf(jornada.getCantabneg()));
                areaobser.setText(jornada.getObserv());
                jcomboestado.setSelectedItem(jornada.getEstado().toString());
                btnguardar.setEnabled(false);

                if (jcomboestado.getSelectedItem().toString().equals("Inactivo")) {
                    lbleliminados.setText("LA JORNADA ESTA INACTIVA");
                }
                
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "El código debe ser numerico");
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if(sw == 0)
        {
            String codigo = txtcodigo.getText();
            Date fecha = jchoserfechprog.getDate();
            String hora = jcombhora.getSelectedItem().toString();
            String minutos = jcombminu.getSelectedItem().toString();
            String direcc = txtdirec.getText();
            String cant = txtcantdona.getText();
            String estado = jcomboestado.getSelectedItem().toString();
            String apos =txtapos.getText();
            String aneg = txtaneg.getText();
            String bpos = txtbpos.getText();
            String bneg = txtbneg.getText();
            String opos = txtopos.getText();
            String oneg = txtoneg.getText();
            String abpos = txtabpos.getText();
            String abneg = txtabneg.getText();
            String obser = areaobser.getText();
                    
            boolean existe;
                                 
            jornadaControlador = new JornadaControlador();
                        
            if (codigo.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Código", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtcodigo.requestFocusInWindow();
                return;
            }

            if (fecha == null) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione fecha de jornada", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfechprog.requestFocusInWindow();
                return;
            }
            
            String fecform = Formatos.formatoFechas(fecha);
            
            if (jchoserfechprog.getDate().after(new Date()))
            {
                JOptionPane.showMessageDialog(this, "La fecha programada de la jornada no puede ser después de la actual", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfechprog.requestFocusInWindow();
                return;
            }

            if (jcombhora.getSelectedIndex() == 0) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione hora", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombhora.requestFocusInWindow();
                return;
            }
            
            if (jcombminu.getSelectedIndex() == 0) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione minutos", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombminu.requestFocusInWindow();
                return;
            }

            if (cant.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad de donantes", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtcantdona.requestFocusInWindow();
                return;
            }

            if (apos.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad a positivo", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtapos.requestFocusInWindow();
                return;
            }
            
            if (aneg.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad a negativo", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtaneg.requestFocusInWindow();
                return;
            }
            
            if (bpos.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad b positivo", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtbpos.requestFocusInWindow();
                return;
            }
            
            if (bneg.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad b negativo", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtbneg.requestFocusInWindow();
                return;
            }
            
            if (opos.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad o positivo", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtopos.requestFocusInWindow();
                return;
            }
            
            if (oneg.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad o negativo", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtoneg.requestFocusInWindow();
                return;
            }
            
            if (abpos.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad ab positivo", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtabpos.requestFocusInWindow();
                return;
            }
            
            if (abneg.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad ab negativo", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtabneg.requestFocusInWindow();
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
         
            existe = jornadaControlador.validarCodigo(codigo);

            if (existe == true) 
            {
                JOptionPane.showMessageDialog(this, "El Código ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                txtcodigo.requestFocusInWindow();
                return;
            }
            else
            {
                jornada = new Jornada(codigo, fecform, hora, minutos, direcc, Long.parseLong(cant), Long.parseLong(apos),
                        Long.parseLong(aneg), Long.parseLong(bpos), Long.parseLong(bneg), Long.parseLong(opos), 
                        Long.parseLong(oneg), Long.parseLong(abpos), Long.parseLong(abneg), obser, estado);
                jornadaControlador.crearJornada(jornada);
                JOptionPane.showMessageDialog(this, "Jornada registrada");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
                
            }   
        }
        
        if(sw == 1)
        {
            String cod;
            String direccion;
            String obser;
            String estado;
            boolean r;
            
            jornadaControlador = new JornadaControlador();
        
            cod = txtcodigo.getText();
            direccion = txtdirec.getText();
            obser = areaobser.getText();
            estado = jcomboestado.getSelectedItem().toString();
            
            r = jornadaControlador.buscarModificarJornada(cod, direccion, obser, estado);
            
            
            if(r == true)
            {
                JOptionPane.showMessageDialog(this, "La Jornada fue modificada");
        
                LimpiarRegistro();
                deshabilitarBotones();
                deshabilitarCampos();
            }
                
            sw = 0;    
        }
        
        if(sw == 2)
        {
            String cod;
            String direccion;
            String obser;
            String estado;
            int per;
            
            cod = txtcodigo.getText();
            direccion = txtdirec.getText();
            obser = areaobser.getText();
            estado = jcomboestado.getSelectedItem().toString();
            per = jcomboestado.getSelectedIndex();
            
            if(per == 0)
            {
                JOptionPane.showMessageDialog(this, "Se debe seleccionar otra opción");
                jcomboestado.requestFocusInWindow();
                return;
            }
            
            jornadaControlador = new JornadaControlador();
            
            jornadaControlador.eliminarJlornada(cod, estado);
            jornada = jornadaControlador.buscarJornada(cod);
            
            if(jornada.getEstado().equals("Activo"))
            {
                JOptionPane.showMessageDialog(this, "La Jornada fue Activada");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "La Jornada fue Inactivada");
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
        
        Date fechprog = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese Código jornada", "Eliminar Jornada",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            jornada = new Jornada();
            jornadaControlador = new JornadaControlador();
            jornada = jornadaControlador.buscarJornada(codigo);
         
            if (jornada == null)
            {
                JOptionPane.showMessageDialog(this, "La Jornada no existe");
            }
            else 
            {                        
                habiliarBotones();
                deshabilitarCampos();
                
                fechprog = Formatos.formatoFechasDate(jornada.getFechaprogra());

                txtcodigo.setText(jornada.getCodigo());
                jchoserfechprog.setDate(fechprog);
                jcombhora.setSelectedItem(jornada.getHoras().toString());
                jcombminu.setSelectedItem(jornada.getMinutos().toString());
                txtdirec.setText(jornada.getDirecc());
                txtcantdona.setText(String.valueOf(jornada.getCantdonan()));
                txtapos.setText(String.valueOf(jornada.getCantapos()));
                txtaneg.setText(String.valueOf(jornada.getCantaneg()));
                txtbpos.setText(String.valueOf(jornada.getCantbpos()));
                txtbneg.setText(String.valueOf(jornada.getCantbneg()));
                txtopos.setText(String.valueOf(jornada.getCantopos()));
                txtoneg.setText(String.valueOf(jornada.getCantoneg()));
                txtabpos.setText(String.valueOf(jornada.getCantabpos()));
                txtabneg.setText(String.valueOf(jornada.getCantabneg()));
                areaobser.setText(jornada.getObserv());
                jcomboestado.setSelectedItem(jornada.getEstado().toString());
                jcomboestado.setEnabled(true);

                sw = 2;   
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "El Código debe ser numerico");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtcantdonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantdonaKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtcantdonaKeyTyped

    private void txtaposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaposKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtaposKeyTyped

    private void txtanegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtanegKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtanegKeyTyped

    private void txtbposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbposKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
        
    }//GEN-LAST:event_txtbposKeyTyped

    private void txtbnegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbnegKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtbnegKeyTyped

    private void txtoposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoposKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtoposKeyTyped

    private void txtonegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtonegKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtonegKeyTyped

    private void txtabposKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtabposKeyTyped
       
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtabposKeyTyped

    private void txtabnegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtabnegKeyTyped
        
        char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtabnegKeyTyped

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
    private javax.swing.JTextArea areaobser;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jchoserfechprog;
    private javax.swing.JComboBox jcombhora;
    private javax.swing.JComboBox jcombminu;
    private javax.swing.JComboBox jcomboestado;
    private javax.swing.JMenuBar jmenbarusuarios;
    private javax.swing.JMenu jmenuayuda;
    private javax.swing.JMenu jmenusalir;
    private javax.swing.JLabel lblabneg;
    private javax.swing.JLabel lblabpos;
    private javax.swing.JLabel lblaneg;
    private javax.swing.JLabel lblapos;
    private javax.swing.JLabel lblbneg;
    private javax.swing.JLabel lblbpos;
    private javax.swing.JLabel lblcantdonan;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lbldirecc;
    private javax.swing.JLabel lbleliminados;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblfechpro;
    private javax.swing.JLabel lblhora;
    private javax.swing.JLabel lblobserva;
    private javax.swing.JLabel lbloneg;
    private javax.swing.JLabel lblopos;
    private javax.swing.JTextField txtabneg;
    private javax.swing.JTextField txtabpos;
    private javax.swing.JTextField txtaneg;
    private javax.swing.JTextField txtapos;
    private javax.swing.JTextField txtbneg;
    private javax.swing.JTextField txtbpos;
    private javax.swing.JTextField txtcantdona;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdirec;
    private javax.swing.JTextField txtoneg;
    private javax.swing.JTextField txtopos;
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
        txtcodigo.setText("");
        jchoserfechprog.setCalendar(Calendar.getInstance());
        jcombhora.setSelectedIndex(0);
        jcombminu.setSelectedIndex(0);
        txtdirec.setText("");
        txtcantdona.setText("");
        jcomboestado.setSelectedIndex(0);
        txtapos.setText("");
        txtaneg.setText("");
        txtbpos.setText("");
        txtbneg.setText("");
        txtopos.setText("");
        txtoneg.setText("");
        txtabpos.setText("");
        txtabneg.setText("");
        areaobser.setText("");
    }

    public void habilitarCampos() {
        
        txtcodigo.setEnabled(true);
        jchoserfechprog.setEnabled(true);
        jcombhora.setEnabled(true);
        jcombminu.setEnabled(true);
        txtdirec.setEnabled(true);
        txtcantdona.setEnabled(true);
        jcomboestado.setEnabled(true);
        txtapos.setEnabled(true);
        txtaneg.setEnabled(true);
        txtbpos.setEnabled(true);
        txtbneg.setEnabled(true);
        txtopos.setEnabled(true);
        txtoneg.setEnabled(true);
        txtabpos.setEnabled(true);
        txtabneg.setEnabled(true);
        areaobser.setEnabled(true);
    }

    public void deshabilitarCampos() {
        
        txtcodigo.setEnabled(false);
        jchoserfechprog.setEnabled(false);
        jcombhora.setEnabled(false);
        jcombminu.setEnabled(false);
        txtdirec.setEnabled(false);
        txtcantdona.setEnabled(false);
        jcomboestado.setEnabled(false);
        txtapos.setEnabled(false);
        txtaneg.setEnabled(false);
        txtbpos.setEnabled(false);
        txtbneg.setEnabled(false);
        txtopos.setEnabled(false);
        txtoneg.setEnabled(false);
        txtabpos.setEnabled(false);
        txtabneg.setEnabled(false);
        areaobser.setEnabled(false);
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
        txtdirec.setEnabled(true);
        areaobser.setEnabled(true);
    }
}
