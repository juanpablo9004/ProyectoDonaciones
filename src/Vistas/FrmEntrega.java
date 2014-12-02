package Vistas;

import Vistas.*;
import Vistas.*;
import Entidades.Entrega;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.*;
import Controlador.EntregaControlador;
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
 * información necesaria para crear una bolsa de sangre.
 *
 * @author Lubian Cardona
 * @author Daniel Rúa Madrid
 * @author Juan Pablo Tabares Sánchez
 * @version 1.0
 */
public class FrmEntrega extends javax.swing.JFrame {

    Entrega entrega;
    EntregaControlador entregaControlador;
    int sw =0;

    /**
     * Este es el constructor del formulario, es donde se inicializan todos los
     * atributos que posee el formulario.
     */
    
    public FrmEntrega() {

        initComponents();

        setLocationRelativeTo(null);
        setSize(550, 600);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
  
        jchoserfecvenc.setCalendar(Calendar.getInstance());
        jchoserfecentre.setCalendar(Calendar.getInstance());
        
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
        lblnit = new javax.swing.JLabel();
        lblfechentr = new javax.swing.JLabel();
        txtnit = new javax.swing.JTextField();
        lblobserva = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtraz = new javax.swing.JTextField();
        txtcant = new javax.swing.JTextField();
        lblcant = new javax.swing.JLabel();
        jcomboestado = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaobser = new javax.swing.JTextArea();
        lblraz = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        jchoserfecentre = new com.toedter.calendar.JDateChooser();
        jchoserfecvenc = new com.toedter.calendar.JDateChooser();
        lblcodigo = new javax.swing.JLabel();
        jcomborh = new javax.swing.JComboBox();
        lblgrupo = new javax.swing.JLabel();
        jcombogrupo = new javax.swing.JComboBox();
        lblrh = new javax.swing.JLabel();
        lblfecven = new javax.swing.JLabel();
        jmenbarusuarios = new javax.swing.JMenuBar();
        jmenuayuda = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Entregas");
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

        lblnit.setText("Nit Hospital*");

        lblfechentr.setText("Fecha Entrega *");

        txtnit.setEnabled(false);

        lblobserva.setText("Observaciones");

        txtcodigo.setEnabled(false);

        txtraz.setEnabled(false);

        txtcant.setEnabled(false);

        lblcant.setText("Cantidad Entregada *");

        jcomboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Activo", "Inactivo" }));
        jcomboestado.setEnabled(false);

        areaobser.setColumns(20);
        areaobser.setRows(5);
        areaobser.setEnabled(false);
        jScrollPane1.setViewportView(areaobser);

        lblraz.setText("Razón Social *");

        lblestado.setText("Estado *");

        jchoserfecentre.setEnabled(false);

        jchoserfecvenc.setEnabled(false);

        lblcodigo.setText("Código *");

        jcomborh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rh", "+", "-" }));
        jcomborh.setEnabled(false);

        lblgrupo.setText("Grupo Sanguíneo *");

        jcombogrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grupo", "A", "B", "AB", "O" }));
        jcombogrupo.setEnabled(false);

        lblrh.setText("RH *");

        lblfecven.setText("Fecha Vencimiento *");

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
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblgrupo)
                                    .addComponent(lblcodigo)
                                    .addComponent(lblfecven)
                                    .addComponent(lblfechentr)
                                    .addComponent(lblnit)
                                    .addComponent(lblraz)
                                    .addComponent(lblestado)
                                    .addComponent(lblobserva)
                                    .addComponent(lblcant))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcomboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtnit)
                                    .addComponent(txtcodigo)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jcombogrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblrh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcomborh, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jchoserfecvenc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jchoserfecentre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtraz)
                                    .addComponent(txtcant)))))
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
                    .addComponent(lblcodigo)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblgrupo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcombogrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblrh)
                        .addComponent(jcomborh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jchoserfecvenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfecven))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblfechentr)
                    .addComponent(jchoserfecentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblraz)
                    .addComponent(txtraz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcant)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblobserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado))
                .addGap(38, 38, 38)
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
                .addContainerGap(59, Short.MAX_VALUE))
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
        
        Date fentre = null;
        Date fvenc = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese código de entrega", "Modificar Entrega",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            entrega = new Entrega();
            entregaControlador = new EntregaControlador();
            entrega = entregaControlador.buscarEntrega(codigo);
         
            if (entrega == null)
            {
                JOptionPane.showMessageDialog(this, "La entrega no existe");
            }
            else 
            {                        
                if(entrega.getEstado().equals("Inactivo"))
                {
                    JOptionPane.showMessageDialog(this, "La entrega esta Inactiva y no se puede modificar");
                }
                else
                {
                    habiliarBotones();
                    habilitarCamposModificar();
                    fvenc = Formatos.formatoFechasDate(entrega.getFechvenc());
                    fentre = Formatos.formatoFechasDate(entrega.getFechrecol());
                     
                    txtcodigo.setText(entrega.getCodigo());
                    jcombogrupo.setSelectedItem(entrega.getGrupo().toString());
                    jcomborh.setSelectedItem(entrega.getRh().toString());
                    jchoserfecvenc.setDate(fvenc);
                    jchoserfecentre.setDate(fentre);
                    txtnit.setText(entrega.getNit());
                    txtraz.setText(entrega.getRazon());
                    txtcant.setText(String.valueOf(entrega.getCantentre()));
                    areaobser.setText(entrega.getObserv());
                    jcomboestado.setSelectedItem(entrega.getEstado().toString());
                  
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

        Date fentre = null;
        Date fvenc = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese código de entrega", "Consultar Entrega",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código de entrega para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            entrega = new Entrega();
            entregaControlador = new EntregaControlador();
            entrega = entregaControlador.buscarEntrega(codigo);
         
            if (entrega == null)
            {
                JOptionPane.showMessageDialog(this, "La entrega no existe");
            }
            else 
            {                        
                habiliarBotones();
                deshabilitarCampos();
                fvenc = Formatos.formatoFechasDate(entrega.getFechvenc());
                fentre = Formatos.formatoFechasDate(entrega.getFechrecol());

                txtcodigo.setText(entrega.getCodigo());
                jcombogrupo.setSelectedItem(entrega.getGrupo().toString());
                jcomborh.setSelectedItem(entrega.getRh().toString());
                jchoserfecvenc.setDate(fvenc);
                jchoserfecentre.setDate(fentre);
                txtnit.setText(entrega.getNit());
                txtraz.setText(entrega.getRazon());
                txtcant.setText(String.valueOf(entrega.getCantentre()));
                areaobser.setText(entrega.getObserv());
                jcomboestado.setSelectedItem(entrega.getEstado().toString());
                btnguardar.setEnabled(false);

                if (jcomboestado.getSelectedItem().toString().equals("Inactivo")) {
                    lbleliminados.setText("LA ENTREGA ESTA INACTIVA");
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
            String grupo = jcombogrupo.getSelectedItem().toString();
            String rh = jcomborh.getSelectedItem().toString();
            Date fechvenc = jchoserfecvenc.getDate();
            Date fechentre = jchoserfecentre.getDate();
            String nit = txtnit.getText();
            String razon = txtraz.getText();
            String cant = txtcant.getText();
            String obser = areaobser.getText();
            String estado = jcomboestado.getSelectedItem().toString();
            
            boolean existe;
            
            String fvenc = "";
            String fentre = "";
            
            entregaControlador = new EntregaControlador();
            
            if(codigo.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Ingrese código de entrega", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtcodigo.requestFocusInWindow();
                return;
            }
            
            if (jcombogrupo.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(this, "Seleccione grupo sanguíneo", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcombogrupo.requestFocusInWindow();
                return;
            }
            
            if (jcomborh.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog(this, "Seleccione Rh", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomborh.requestFocusInWindow();
                return;
            }
            
            if (fechvenc == null) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione fecha de vencimiento", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfecvenc.requestFocusInWindow();
                return;
            }
            
            if (jchoserfecvenc.getDate().before(new Date()))
            {
                JOptionPane.showMessageDialog(this, "La fecha de vencimiento no puede ser antes de la actual", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfecvenc.requestFocusInWindow();
                return;
            }
            
            fvenc = Formatos.formatoFechas(fechvenc);
            
            if (fechentre == null) 
            {
                JOptionPane.showMessageDialog(this, "Seleccione fecha de entrega", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfecentre.requestFocusInWindow();
                return;
            }
            
            if (jchoserfecentre.getDate().before(new Date()))
            {
                JOptionPane.showMessageDialog(this, "La fecha de entrega no puede ser antes de la actual", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfecentre.requestFocusInWindow();
                return;
            }
            
            fentre = Formatos.formatoFechas(fechentre);
            
            if (nit.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese Nit del hospital", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtnit.requestFocusInWindow();
                return;
            }
            
            if (razon.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese razón social del hospital", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtraz.requestFocusInWindow();
                return;
            }

            if (cant.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad de sangre", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtcant.requestFocusInWindow();
                return;
            }

            if (jcomboestado.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione estado de la entrega", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboestado.requestFocusInWindow();
                return;
            }

            if (!estado.equals("Activo")) {
                JOptionPane.showMessageDialog(this, "El Estado debe estar Activo", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboestado.requestFocusInWindow();
                return;
            }
            
            existe = entregaControlador.validarCodigo(codigo);

            if (existe == true) 
            {
                JOptionPane.showMessageDialog(this, "El código ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                txtcodigo.requestFocusInWindow();
                return;
            }
            else
            {
                entrega = new Entrega(codigo, grupo, rh, fvenc, fentre, nit, razon, Long.parseLong(cant), obser, estado);
                entregaControlador.crearEntrega(entrega);
                JOptionPane.showMessageDialog(this, "Entrega registrada");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            }
        }
        
        if(sw == 1)
        {
            String cod;
            String obser;
            String estado;
            
            boolean r;
            entregaControlador = new EntregaControlador();
        
            cod = txtcodigo.getText();
            obser = areaobser.getText();
            estado = jcomboestado.getSelectedItem().toString();
            
            r = entregaControlador.buscarModificarEntrega(cod, obser, estado);
            
            
            if(r == true)
            {
                JOptionPane.showMessageDialog(this, "La entrega fue modificada");
        
                LimpiarRegistro();
                deshabilitarBotones();
                deshabilitarCampos();
            }
            
            sw = 0;
        }
        
        if(sw == 2)
        {
            String cod;
            String obser;
            String estado;
            int per;
            
            cod = txtcodigo.getText();
            obser = areaobser.getText();
            estado = jcomboestado.getSelectedItem().toString();
            per = jcomboestado.getSelectedIndex();
            
            if(per == 0)
            {
                JOptionPane.showMessageDialog(this, "Se debe seleccionar otra opción");
                jcomboestado.requestFocusInWindow();
                return;
            }
            
            entregaControlador = new EntregaControlador();
            
            entregaControlador.eliminarEntrega(cod, estado);
            entrega = entregaControlador.buscarEntrega(cod);
            
            if(entrega.getEstado().equals("Activo"))
            {
                JOptionPane.showMessageDialog(this, "La entrega fue Activada");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "La entrega fue Inactivado");
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
        
        Date fentre = null;
        Date fvenc = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese código de la entrega", "Eliminar Entrega",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            entrega = new Entrega();
            entregaControlador = new EntregaControlador();
            entrega = entregaControlador.buscarEntrega(codigo);
         
            if (entrega == null)
            {
                JOptionPane.showMessageDialog(this, "La Entrega no existe");
            }
            else 
            {                        
                habiliarBotones();
                deshabilitarCampos();
                fvenc = Formatos.formatoFechasDate(entrega.getFechvenc());
                fentre = Formatos.formatoFechasDate(entrega.getFechrecol());

                txtcodigo.setText(entrega.getCodigo());
                jcombogrupo.setSelectedItem(entrega.getGrupo().toString());
                jcomborh.setSelectedItem(entrega.getRh().toString());
                jchoserfecvenc.setDate(fvenc);
                jchoserfecentre.setDate(fentre);
                txtnit.setText(entrega.getNit());
                txtraz.setText(entrega.getRazon());
                txtcant.setText(String.valueOf(entrega.getCantentre()));
                areaobser.setText(entrega.getObserv());
                jcomboestado.setSelectedItem(entrega.getEstado().toString());
                jcomboestado.setEnabled(true);

                sw = 2;   
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "El código debe ser numerico");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jchoserfecentre;
    private com.toedter.calendar.JDateChooser jchoserfecvenc;
    private javax.swing.JComboBox jcomboestado;
    private javax.swing.JComboBox jcombogrupo;
    private javax.swing.JComboBox jcomborh;
    private javax.swing.JMenuBar jmenbarusuarios;
    private javax.swing.JMenu jmenuayuda;
    private javax.swing.JMenu jmenusalir;
    private javax.swing.JLabel lblcant;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lbleliminados;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblfechentr;
    private javax.swing.JLabel lblfecven;
    private javax.swing.JLabel lblgrupo;
    private javax.swing.JLabel lblnit;
    private javax.swing.JLabel lblobserva;
    private javax.swing.JLabel lblraz;
    private javax.swing.JLabel lblrh;
    private javax.swing.JTextField txtcant;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtnit;
    private javax.swing.JTextField txtraz;
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
        jcombogrupo.setSelectedIndex(0);
        jcomborh.setSelectedIndex(0);
        jchoserfecvenc.setCalendar(Calendar.getInstance());
        jchoserfecentre.setCalendar(Calendar.getInstance());
        txtnit.setText("");
        txtraz.setText("");
        txtcant.setText("");
        areaobser.setText("");
        jcomboestado.setSelectedIndex(0);
    }

    public void habilitarCampos() {
        
        txtcodigo.setEnabled(true);
        jcombogrupo.setEnabled(true);
        jcomborh.setEnabled(true);
        jchoserfecvenc.setEnabled(true);
        jchoserfecentre.setEnabled(true);
        txtnit.setEnabled(true);
        txtraz.setEnabled(true);
        txtcant.setEnabled(true);
        areaobser.setEnabled(true);      
        jcomboestado.setEnabled(true);
    }

    public void deshabilitarCampos() {
        
        txtcodigo.setEnabled(false);
        jcombogrupo.setEnabled(false);
        jcomborh.setEnabled(false);
        jchoserfecvenc.setEnabled(false);
        jchoserfecentre.setEnabled(false);
        txtnit.setEnabled(false);
        txtraz.setEnabled(false);
        txtcant.setEnabled(false);
        areaobser.setEnabled(false);      
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
        areaobser.setEnabled(true);
    }
}
