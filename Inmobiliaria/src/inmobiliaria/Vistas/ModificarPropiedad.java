
package inmobiliaria.Vistas;

import Inmobiliaria.AccesoDatos.InquilinoData;
import Inmobiliaria.AccesoDatos.PropiedadData;
import Inmobiliaria.AccesoDatos.PropietarioData;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.AccesoDatos.InspectorData;
import inmobiliaria.Inquilino;
import inmobiliaria.Inspector;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import static inmobiliaria.Vistas.MenuPrincipal.escritorio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ian
 */
public class ModificarPropiedad extends javax.swing.JInternalFrame {

    List propietarios=new ArrayList<>();
    List inquilinos=new ArrayList<>();
    List revisores=new ArrayList<>();
    
    public ModificarPropiedad() {
        super("",false,false,false,false);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        propietarios=PropietarioData.listarPropietario();
        inquilinos=InquilinoData.listarInquilinos();
        revisores=InspectorData.listarInspector();
        cargarCombop();
        cargarComboi();
        cargarCombor();
        
    }
    public ModificarPropiedad(int id) {  //esta es para iniciar desde un boton de buscar propiedad donde envio el id de la prop que seleccione en la otra ventana.
        super("",false,false,false,false);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        propietarios=PropietarioData.listarPropietario();
        inquilinos=InquilinoData.listarInquilinos();
        revisores=InspectorData.listarInspector();
        cargarCombop();
        cargarComboi();
        cargarCombor();
        jtId.setText(id+"");
    }


    public ModificarPropiedad( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        propietarios=PropietarioData.listarPropietario();
        inquilinos=InquilinoData.listarInquilinos();
        revisores=InspectorData.listarInspector();
        cargarCombop();
        cargarComboi();
        cargarCombor();
    }
    private void cargarCombop() {

       
        DefaultComboBoxModel<Propietario> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Propietario) null);
        for (Object propietario : propietarios) {
            modeloCombo.addElement((Propietario) propietario);
        }
        jcbPropietarios.setModel(modeloCombo);
    }
    
    private void cargarComboi() {

       
        DefaultComboBoxModel<Inquilino> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Inquilino) null);
        for (Object inquilino : inquilinos) {
            modeloCombo.addElement((Inquilino) inquilino);
        }
        jcbInquilinos.setModel(modeloCombo);
    }
    private void cargarCombor() {

       
        DefaultComboBoxModel<Inspector> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Inspector) null);
        for (Object revisor : revisores) {
            modeloCombo.addElement((Inspector) revisor);
        }
        jcbRevisores.setModel(modeloCombo);
    }
    private void editar(boolean v){
        jtTitulo.setEnabled(v);
        jtAccesibilidad.setEnabled(v);
        jtDireccion.setEnabled(v);
        jtSupTotal.setEnabled(v);
        jtSupCubierta.setEnabled(v);
        jtServicios.setEnabled(v);
        jcbTipo.setEnabled(v);
        jtCaracteristicas.setEnabled(v);
        jtEstado.setEnabled(v);
        jtPrecio.setEnabled(v);
        jtId.setEnabled(v);
        jtLocalidad.setEnabled(v);
        jcbInquilinos.setEnabled(v);
        jcbPropietarios.setEnabled(v);
        jcbRevisores.setEnabled(v);
    }
    private void limpiar(){
        jtId.setText("");
        jtTitulo.setText("");
        jtAccesibilidad.setText("");
        jtDireccion.setText("");
        jtSupCubierta.setText("");
        jtSupTotal.setText("");
        jtServicios.setText("");
        jcbTipo.setSelectedIndex(0);
        jtCaracteristicas.setText("");
        jtEstado.setText("");
        jtPrecio.setText("");
        jtLocalidad.setText("");
        jcbInquilinos.setSelectedIndex(0);
        jcbPropietarios.setSelectedIndex(0);
        jcbRevisores.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtServicios = new javax.swing.JTextField();
        jtAccesibilidad = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jtLocalidad = new javax.swing.JTextField();
        jtSupTotal = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtId = new javax.swing.JTextField();
        jtEstado = new javax.swing.JTextField();
        jtCaracteristicas = new javax.swing.JTextField();
        jbVolver = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jcbRevisores = new javax.swing.JComboBox<>();
        jcbPropietarios = new javax.swing.JComboBox<>();
        jcbInquilinos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtTitulo = new javax.swing.JTextField();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jtSupCubierta = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1030, 790));
        setPreferredSize(new java.awt.Dimension(1030, 795));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 76, 139));
        jLabel2.setText("Revisor                        :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, 170, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 76, 139));
        jLabel3.setText("Modificar Propiedad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 250, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 76, 139));
        jLabel4.setText("Caraterísticas            :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 76, 139));
        jLabel5.setText("Direccion                     :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 76, 139));
        jLabel6.setText("Estado                           :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, -1));

        jtServicios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtServicios.setEnabled(false);
        jtServicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtServiciosKeyTyped(evt);
            }
        });
        jPanel1.add(jtServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 640, 30));

        jtAccesibilidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtAccesibilidad.setEnabled(false);
        jtAccesibilidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAccesibilidadKeyTyped(evt);
            }
        });
        jPanel1.add(jtAccesibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 640, 30));

        jtDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDireccion.setEnabled(false);
        jtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(jtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 640, 30));

        jtLocalidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtLocalidad.setEnabled(false);
        jtLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtLocalidadKeyTyped(evt);
            }
        });
        jPanel1.add(jtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 640, 30));

        jtSupTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtSupTotal.setEnabled(false);
        jtSupTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSupTotalKeyTyped(evt);
            }
        });
        jPanel1.add(jtSupTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 130, 30));

        jtPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtPrecio.setEnabled(false);
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 640, 30));

        jtId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtIdKeyTyped(evt);
            }
        });
        jPanel1.add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 130, 30));

        jtEstado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtEstado.setEnabled(false);
        jtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEstadoKeyTyped(evt);
            }
        });
        jPanel1.add(jtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 130, 30));

        jtCaracteristicas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtCaracteristicas.setEnabled(false);
        jtCaracteristicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCaracteristicasKeyTyped(evt);
            }
        });
        jPanel1.add(jtCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 640, 30));

        jbVolver.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, 120, 40));

        jbAgregar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbAgregar.setText("Guardar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 730, 120, 40));

        jbLimpiar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 730, 120, 40));

        jcbRevisores.setEnabled(false);
        jPanel1.add(jcbRevisores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, 410, -1));

        jcbPropietarios.setEnabled(false);
        jPanel1.add(jcbPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 410, 30));

        jcbInquilinos.setEnabled(false);
        jPanel1.add(jcbInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 410, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 76, 139));
        jLabel7.setText("Servicios                     :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 180, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 76, 139));
        jLabel8.setText("Precio tasado            :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 180, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 76, 139));
        jLabel9.setText("Id Propiedad               :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 76, 139));
        jLabel10.setText("Superficie total         :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 190, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 76, 139));
        jLabel11.setText("Tipo propiedad         :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 180, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 76, 139));
        jLabel12.setText("Localidad                    :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 170, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 76, 139));
        jLabel13.setText("Propietario                :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 190, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 76, 139));
        jLabel14.setText("Inquilino                      :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 170, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 76, 139));
        jLabel15.setText("Accesibilidad             :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 76, 139));
        jLabel16.setText("Título                             :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 170, -1));

        jtTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTitulo.setEnabled(false);
        jtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTituloKeyTyped(evt);
            }
        });
        jPanel1.add(jtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 640, 30));

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo", "Casa", "Departamento", "Local", "Chalet", "Galpon", "Quinta", "Lote" }));
        jcbTipo.setEnabled(false);
        jPanel1.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 160, 30));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(35, 76, 139));
        jLabel17.setText("Superficie cubierta :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 170, -1));

        jtSupCubierta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtSupCubierta.setEnabled(false);
        jtSupCubierta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSupCubiertaKeyTyped(evt);
            }
        });
        jPanel1.add(jtSupCubierta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 130, 30));

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 50, 50));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVolverActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ventanaPropiedades vp = new ventanaPropiedades("",false,false,false,false);
        vp.setVisible(true);
        escritorio.add(vp);
        escritorio.moveToFront(vp);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtSupTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSupTotalKeyTyped
         int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtSupTotal.getText().length()>=4){
           evt.consume();
       }
    }//GEN-LAST:event_jtSupTotalKeyTyped

    private void jtAccesibilidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtAccesibilidadKeyTyped
//        char key = evt.getKeyChar();
//        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
//        if (!letra) {
//            evt.consume();
//        }
    }//GEN-LAST:event_jtAccesibilidadKeyTyped

    private void jtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDireccionKeyTyped
//        char key = evt.getKeyChar();
//        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
//        if (!letra) {
//            evt.consume();
//        }
    }//GEN-LAST:event_jtDireccionKeyTyped

    private void jtServiciosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtServiciosKeyTyped
        
    }//GEN-LAST:event_jtServiciosKeyTyped

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
        editar(false);
        jtId.setEnabled(true);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
          if(jtTitulo.getText().isEmpty()||jtAccesibilidad.getText().isEmpty()|| jtDireccion.getText().isEmpty()|| jtSupTotal.getText().isEmpty()|| jtServicios.getText().isEmpty()|| jcbTipo.getSelectedIndex()==0||
                jtCaracteristicas.getText().isEmpty()||jtEstado.getText().isEmpty()||jtPrecio.getText().isEmpty()||jtId.getText().isEmpty()||jtLocalidad.getText().isEmpty()|| jcbRevisores.getSelectedIndex()==0||jcbPropietarios.getSelectedIndex()==0){
               mostrarMensaje("Todos o alguno de los campos se encuentran vacios.", "Error al crear Propiedad", "error");
          }else{
              if(PropiedadData.buscarPropiedadPorDireccion(jtDireccion.getText().toUpperCase()).getTitulo()!=null){
                  mostrarMensaje("La Propiedad que desea agregar ya existe, o esta utilizando la misma dirección.", "Error al crear Propiedad", "error");
              }else{
                  Inquilino inquilino=new Inquilino();  
                  if(jcbInquilinos.getSelectedIndex()!=-1){
                      inquilino=(Inquilino) inquilinos.get(jcbInquilinos.getSelectedIndex()-1);
                  }else{
                      inquilino.setIdInquilino(1);
                  }
                  Propietario propietario = new Propietario();
                  propietario=(Propietario) propietarios.get(jcbPropietarios.getSelectedIndex()-1);
                  Inspector revisor=new Inspector();
                  revisor=(Inspector)revisores.get(jcbRevisores.getSelectedIndex()-1);
                  if(jcbTipo.getSelectedIndex()==0){
                      mostrarMensaje("Debe seleccionar un tipo de propiedad", "Error al crear Propiedad", "error");
                  }else{
                      String auxTipo= jcbTipo.getSelectedItem().toString();
                      Propiedad p=new Propiedad(jtTitulo.getText().toUpperCase(), jtAccesibilidad.getText(), jtCaracteristicas.getText(), jtDireccion.getText().toUpperCase(),jtServicios.getText(), jtLocalidad.getText(), propietario,jtEstado.getText() ,auxTipo , inquilino, Float.parseFloat(jtPrecio.getText()), revisor, Integer.parseInt(jtId.getText()), Integer.parseInt(jtSupTotal.getText()));
                      PropiedadData.agregarPropiedad(p);
                      limpiar();
                  }
                  
                  
              }
          }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jtLocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLocalidadKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtLocalidadKeyTyped

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57|| key==46;
        if(!num ){
            evt.consume();
        }
        
//        if(jtPrecio.getText().length()>=11){
//           evt.consume();
//       }
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtIdKeyTyped
        int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtId.getText().length()>=4){
           evt.consume();
       }
    }//GEN-LAST:event_jtIdKeyTyped

    private void jtCaracteristicasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCaracteristicasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCaracteristicasKeyTyped

    private void jtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEstadoKeyTyped

        if(jtEstado.getText().length()>=10){
           evt.consume();
       }
    }//GEN-LAST:event_jtEstadoKeyTyped

    private void jtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTituloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTituloKeyTyped

    private void jtSupCubiertaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSupCubiertaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSupCubiertaKeyTyped

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if(jtId.getText().isEmpty()){
            mostrarMensaje("Debe ingresar un id para buscar", "Error al buscar Propiedad", "error");
        }else{
            Propiedad p=PropiedadData.buscarPropiedadPorId(Integer.parseInt(jtId.getText()));
            if(p!=null){
                editar(true);
                jtId.setEnabled(false);
                jtTitulo.setText(p.getTitulo());
                jtAccesibilidad.setText(p.getAccesibilidad());
                jtCaracteristicas.setText(p.getCaracteristicas());
                jtDireccion.setText(p.getDireccion());
                jtSupTotal.setText(p.getSuperficieTotal()+"");
                jtSupCubierta.setText(p.getSuperficieCub()+"");
                jtServicios.setText(p.getServicios());
                jcbTipo.setSelectedItem(p.getTipoPropiedad());
                jtEstado.setText(p.getEstadoPropiedad());
                jtPrecio.setText(p.getPrecioTasado()+"");
                jtLocalidad.setText(p.getLocalidad());
                int auxInq=0;
                Inquilino inquilino=new Inquilino();
                for(Object inq:inquilinos){
                    inquilino= (Inquilino)inq;
                    auxInq++;
                    if(inquilino.getIdInquilino()==p.getOcupante().getIdInquilino()){
                        break;
                    }
                }
                jcbInquilinos.setSelectedIndex(auxInq);
                //jcbInquilinos.setSelectedIndex(0);
                int auxProp=0;
                Propietario propietario=new Propietario();
                for(Object prop:propietarios){
                    propietario= (Propietario)prop;
                    auxProp++;
                    if(propietario.getIdPropietario()==p.getDueño().getIdPropietario()){
                        break;
                    }
                }
                jcbPropietarios.setSelectedIndex(auxProp);
                //jcbPropietarios.setSelectedIndex(0);
                int auxRevi=0;
                Inspector revisor=new Inspector();
                for(Object revi:revisores){
                    revisor= (Inspector)revi;
                    auxRevi++;
                    if(revisor.getIdInspector()==p.getRevisor().getIdInspector()){
                        break;
                    }
                }
                jcbRevisores.setSelectedIndex(auxRevi);
            }else{
                mostrarMensaje("No existe la propiedad", "Busqueda de Propiedad", "info");
            }
            
        }
    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<Inquilino> jcbInquilinos;
    private javax.swing.JComboBox<Propietario> jcbPropietarios;
    private javax.swing.JComboBox<Inspector> jcbRevisores;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JTextField jtAccesibilidad;
    private javax.swing.JTextField jtCaracteristicas;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtLocalidad;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtServicios;
    private javax.swing.JTextField jtSupCubierta;
    private javax.swing.JTextField jtSupTotal;
    private javax.swing.JTextField jtTitulo;
    // End of variables declaration//GEN-END:variables
}
