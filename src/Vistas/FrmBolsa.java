package Vistas;

import Vistas.*;
import Entidades.Bolsa;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.*;
import Controlador.BolsaControlador;
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
public class FrmBolsa extends javax.swing.JFrame {

    Bolsa bolsa;
    BolsaControlador bolsaControlador;
    int sw =0;

    /**
     * Este es el constructor del formulario, es donde se inicializan todos los
     * atributos que posee el formulario.
     */
    public FrmBolsa() {

        initComponents();

        setLocationRelativeTo(null);
        setSize(550, 550);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
  
        jchoserfechrecol.setCalendar(Calendar.getInstance());
        jchoserfechvenc.setCalendar(Calendar.getInstance());
        
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
        jScrollPane2 = new javax.swing.JScrollPane();
        areaobser = new javax.swing.JTextArea();
        jchoserfechrecol = new com.toedter.calendar.JDateChooser();
        lblrh = new javax.swing.JLabel();
        jcomborh = new javax.swing.JComboBox();
        lblgrupo = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        jchoserfechvenc = new com.toedter.calendar.JDateChooser();
        lblobserva = new javax.swing.JLabel();
        lblcantbols = new javax.swing.JLabel();
        jcombogrupo = new javax.swing.JComboBox();
        lblfechavenc = new javax.swing.JLabel();
        lblfecreco = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        lblcodigo = new javax.swing.JLabel();
        jcomboestado = new javax.swing.JComboBox();
        jmenbarusuarios = new javax.swing.JMenuBar();
        jmenuayuda = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionar Bolsas");
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

        areaobser.setColumns(20);
        areaobser.setRows(5);
        areaobser.setEnabled(false);
        jScrollPane2.setViewportView(areaobser);

        jchoserfechrecol.setEnabled(false);

        lblrh.setText("RH *");

        jcomborh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RH", "+", "-" }));
        jcomborh.setEnabled(false);

        lblgrupo.setText("Grupo Sanguíneo *");

        lblestado.setText("Estado *");

        jchoserfechvenc.setEnabled(false);

        lblobserva.setText("Observaciones");

        lblcantbols.setText("Cantidad (cm3)*");

        jcombogrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grupo", "A", "B", "AB", "O" }));
        jcombogrupo.setEnabled(false);

        lblfechavenc.setText("Fecha Vencimiento *");

        lblfecreco.setText("Fecha Recolección *");

        txtcantidad.setEnabled(false);
        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });

        txtcodigo.setEnabled(false);
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        lblcodigo.setText("Código *");

        jcomboestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Estado", "Activo", "Inactivo" }));
        jcomboestado.setEnabled(false);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblgrupo)
                            .addComponent(lblcodigo)
                            .addComponent(lblfecreco)
                            .addComponent(lblfechavenc)
                            .addComponent(lblcantbols)
                            .addComponent(lblestado)
                            .addComponent(lblobserva))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcomboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcantidad)
                            .addComponent(txtcodigo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jcombogrupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblrh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcomborh, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jchoserfechrecol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jchoserfechvenc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lbleliminados, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
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
                    .addComponent(jchoserfechrecol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfecreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblfechavenc)
                    .addComponent(jchoserfechvenc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcantbols))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcomboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblobserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
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
                .addContainerGap(25, Short.MAX_VALUE))
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
        
        Date frecol = null;
        Date fvenc = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese código de bolsa", "Modificar Bolsa",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            bolsa = new Bolsa();
            bolsaControlador = new BolsaControlador();
            bolsa = bolsaControlador.buscarBolsa(codigo);
         
            if (bolsa == null)
            {
                JOptionPane.showMessageDialog(this, "La bolsa no existe");
            }
            else 
            {                        
                if(bolsa.getEstado().equals("Inactivo"))
                {
                    JOptionPane.showMessageDialog(this, "La bolsa esta Inactiva y no se puede modificar");
                }
                else
                {
                    habiliarBotones();
                    habilitarCamposModificar();
                    frecol = Formatos.formatoFechasDate(bolsa.getFechrecol());
                    fvenc = Formatos.formatoFechasDate(bolsa.getFechvenc());
                     
                    txtcodigo.setText(bolsa.getCodigo());
                    jcombogrupo.setSelectedItem(bolsa.getGrupo().toString());
                    jcomborh.setSelectedItem(bolsa.getRh().toString());
                    jchoserfechrecol.setDate(frecol);
                    jchoserfechvenc.setDate(fvenc);
                    txtcantidad.setText(String.valueOf(bolsa.getCant()));
                    areaobser.setText(bolsa.getObser());
                    jcomboestado.setSelectedItem(bolsa.getEstado().toString());
                  
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

        Date frecol = null;
        Date fvenc = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese código de bolsa", "Consultar Bolsa",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código de bolsa para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            bolsa = new Bolsa();
            bolsaControlador = new BolsaControlador();
            bolsa = bolsaControlador.buscarBolsa(codigo);
         
            if (bolsa == null)
            {
                JOptionPane.showMessageDialog(this, "La bolsa no existe");
            }
            else 
            {                        
                habiliarBotones();
                deshabilitarCampos();
                frecol = Formatos.formatoFechasDate(bolsa.getFechrecol());
                fvenc = Formatos.formatoFechasDate(bolsa.getFechvenc());

                txtcodigo.setText(bolsa.getCodigo());
                jcombogrupo.setSelectedItem(bolsa.getGrupo().toString());
                jcomborh.setSelectedItem(bolsa.getRh().toString());
                jchoserfechrecol.setDate(frecol);
                jchoserfechvenc.setDate(fvenc);
                txtcantidad.setText(String.valueOf(bolsa.getCant()));
                areaobser.setText(bolsa.getObser());
                jcomboestado.setSelectedItem(bolsa.getEstado().toString());
                btnguardar.setEnabled(false);

                if (jcomboestado.getSelectedItem().toString().equals("Inactivo")) {
                    lbleliminados.setText("LA BOLSA ESTA INACTIVA");
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
            Date fechrecol = jchoserfechrecol.getDate();
            Date fechvenc = jchoserfechvenc.getDate();
            String cant = txtcantidad.getText();
            String obser = areaobser.getText();
            String estado = jcomboestado.getSelectedItem().toString();
            
            boolean existe;
            
            String frecol = "";
            String fvenc = "";
            
            bolsaControlador = new BolsaControlador();
            
            if(codigo.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Ingrese código de bolsa", "Información", JOptionPane.INFORMATION_MESSAGE);
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
            
            if(fechrecol == null)
            {
                JOptionPane.showMessageDialog(this, "Seleccione fecha de recolección", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfechrecol.requestFocusInWindow();
                return;
            }
            
            if (jchoserfechrecol.getDate().after(new Date())) 
            {
                JOptionPane.showMessageDialog(this, "La fecha de recolección no puede ser después de la actual", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfechrecol.requestFocusInWindow();
                return;
            }
            
            frecol = Formatos.formatoFechas(fechrecol);
            
            if(fechvenc == null)
            {
                JOptionPane.showMessageDialog(this, "Seleccione fecha de vencimiento", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfechvenc.requestFocusInWindow();
                return;
            }
            
            if (jchoserfechvenc.getDate().before(new Date())) 
            {
                JOptionPane.showMessageDialog(this, "La fecha de vencimiento no puede ser menor ó igual a la fecha de recolección", "Información", JOptionPane.INFORMATION_MESSAGE);
                jchoserfechvenc.requestFocusInWindow();
                return;
            }
            
            fvenc = Formatos.formatoFechas(fechvenc);

            if (cant.equals("")) 
            {
                JOptionPane.showMessageDialog(this, "Ingrese cantidad de sangre", "Información", JOptionPane.INFORMATION_MESSAGE);
                txtcantidad.requestFocusInWindow();
                return;
            }

            if (jcomboestado.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione estado de la bolsa", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboestado.requestFocusInWindow();
                return;
            }

            if (!estado.equals("Activo")) {
                JOptionPane.showMessageDialog(this, "El Estado debe estar Activo", "Información", JOptionPane.INFORMATION_MESSAGE);
                jcomboestado.requestFocusInWindow();
                return;
            }
            
            existe = bolsaControlador.validarCodigo(codigo);

            if (existe == true) 
            {
                JOptionPane.showMessageDialog(this, "El código ya se encuentra registrado", "Error", JOptionPane.ERROR_MESSAGE);
                txtcodigo.requestFocusInWindow();
                return;
            }
            else
            {
                bolsa = new Bolsa(codigo, grupo, rh, frecol, fvenc, Long.parseLong(cant), obser, estado);
                bolsaControlador.crearBolsa(bolsa);
                JOptionPane.showMessageDialog(this, "Bolsa registrada");
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
            bolsaControlador = new BolsaControlador();
        
            cod = txtcodigo.getText();
            obser = areaobser.getText();
            estado = jcomboestado.getSelectedItem().toString();
            
            r = bolsaControlador.buscarModificarBolsa(cod, obser, estado);
            
            
            if(r == true)
            {
                JOptionPane.showMessageDialog(this, "La bolsa fue modificada");
        
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
            
            bolsaControlador = new BolsaControlador();
            
            bolsaControlador.eliminarBolsa(cod, estado);
            bolsa = bolsaControlador.buscarBolsa(cod);
            
            if(bolsa.getEstado().equals("Activo"))
            {
                JOptionPane.showMessageDialog(this, "La Bolsa fue Activada");
                LimpiarRegistro();
                deshabilitarCampos();
                deshabilitarBotones();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "La Bolsa fue Inactivado");
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
        
        Date frecol = null;
        Date fvenc = null;
        String codigo = JOptionPane.showInputDialog(this,"Ingrese código de la bolsa", "Eliminar Bolsa",JOptionPane.INFORMATION_MESSAGE);
        
        if(codigo == null)
        {
            JOptionPane.showMessageDialog(this, "Ingrese código para realizar la búsqueda");
            return;
        }
        
        if(Formatos.datosNumericos(codigo))
        {
            bolsa = new Bolsa();
            bolsaControlador = new BolsaControlador();
            bolsa = bolsaControlador.buscarBolsa(codigo);
         
            if (bolsa == null)
            {
                JOptionPane.showMessageDialog(this, "La Bolsa no existe");
            }
            else 
            {                        
                habiliarBotones();
                deshabilitarCampos();
                frecol = Formatos.formatoFechasDate(bolsa.getFechrecol());
                fvenc = Formatos.formatoFechasDate(bolsa.getFechvenc());

                txtcodigo.setText(bolsa.getCodigo());
                jcombogrupo.setSelectedItem(bolsa.getGrupo().toString());
                jcomborh.setSelectedItem(bolsa.getRh().toString());
                jchoserfechrecol.setDate(frecol);
                jchoserfechvenc.setDate(fvenc);
                txtcantidad.setText(String.valueOf(bolsa.getCant()));
                areaobser.setText(bolsa.getObser());
                jcomboestado.setSelectedItem(bolsa.getEstado().toString());
                jcomboestado.setEnabled(true);

                sw = 2;   
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "El código debe ser numerico");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        
         char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        
         char c = evt.getKeyChar();

        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtcantidadKeyTyped

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
    private javax.swing.JTextArea areaobser;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jchoserfechrecol;
    private com.toedter.calendar.JDateChooser jchoserfechvenc;
    private javax.swing.JComboBox jcomboestado;
    private javax.swing.JComboBox jcombogrupo;
    private javax.swing.JComboBox jcomborh;
    private javax.swing.JMenuBar jmenbarusuarios;
    private javax.swing.JMenu jmenuayuda;
    private javax.swing.JMenu jmenusalir;
    private javax.swing.JLabel lblcantbols;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lbleliminados;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblfechavenc;
    private javax.swing.JLabel lblfecreco;
    private javax.swing.JLabel lblgrupo;
    private javax.swing.JLabel lblobserva;
    private javax.swing.JLabel lblrh;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcodigo;
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
        jchoserfechrecol.setCalendar(Calendar.getInstance());
        jchoserfechvenc.setCalendar(Calendar.getInstance());
        txtcantidad.setText("");
        areaobser.setText("");
        jcomboestado.setSelectedIndex(0);
    }

    public void habilitarCampos() {
        
        txtcodigo.setEnabled(true);
        jcombogrupo.setEnabled(true);
        jcomborh.setEnabled(true);
        jchoserfechrecol.setEnabled(true);
        jchoserfechvenc.setEnabled(true);
        txtcantidad.setEnabled(true);
        areaobser.setEnabled(true);      
        jcomboestado.setEnabled(true);
    }

    public void deshabilitarCampos() {
        
        txtcodigo.setEnabled(false);
        jcombogrupo.setEnabled(false);
        jcomborh.setEnabled(false);
        jchoserfechrecol.setEnabled(false);
        jchoserfechvenc.setEnabled(false);
        txtcantidad.setEnabled(false);
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
