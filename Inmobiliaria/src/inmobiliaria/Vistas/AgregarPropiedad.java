
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
public class AgregarPropiedad extends javax.swing.JInternalFrame {

    List propietarios=new ArrayList<>();
    List inquilinos=new ArrayList<>();
    List revisores=new ArrayList<>();
    
    public AgregarPropiedad() {
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


    public AgregarPropiedad( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
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
    
    private void limpiar(){
        jtTitulo.setText("");
        jtAccesibilidad.setText("");
        jtDireccion.setText("");
        jtSupTotal.setText("");
        jtServicios.setText("");
        jcbTipo.setSelectedIndex(0);
        jtCaracteristicas.setText("");
        jcbEstado.setSelectedIndex(0);
        jtPrecio.setText("");
        jtSupCub.setText("");
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
        jtSupCub = new javax.swing.JTextField();
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
        jcbPropietarios1 = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1030, 790));
        setPreferredSize(new java.awt.Dimension(1030, 795));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 76, 139));
        jLabel2.setText("Revisor                        :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 170, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 76, 139));
        jLabel3.setText("Agregar Propiedad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 250, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 76, 139));
        jLabel4.setText("Caraterísticas            :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 76, 139));
        jLabel5.setText("Direccion                     :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 190, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 76, 139));
        jLabel6.setText("Estado                           :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, -1));

        jtServicios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtServicios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtServiciosKeyTyped(evt);
            }
        });
        jPanel1.add(jtServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 640, 30));

        jtAccesibilidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtAccesibilidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtAccesibilidadKeyTyped(evt);
            }
        });
        jPanel1.add(jtAccesibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 640, 30));

        jtDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDireccionKeyTyped(evt);
            }
        });
        jPanel1.add(jtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 640, 30));

        jtLocalidad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtLocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtLocalidadKeyTyped(evt);
            }
        });
        jPanel1.add(jtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 640, 30));

        jtSupTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtSupTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSupTotalKeyTyped(evt);
            }
        });
        jPanel1.add(jtSupTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 130, 30));

        jtPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 640, 30));

        jtSupCub.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtSupCub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSupCubKeyTyped(evt);
            }
        });
        jPanel1.add(jtSupCub, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 130, 30));

        jtCaracteristicas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtCaracteristicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCaracteristicasKeyTyped(evt);
            }
        });
        jPanel1.add(jtCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 640, 30));

        jbVolver.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 710, 120, 40));

        jbAgregar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 120, 40));

        jbLimpiar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 710, 120, 40));

        jPanel1.add(jcbRevisores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 410, -1));

        jPanel1.add(jcbPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 410, 30));

        jPanel1.add(jcbInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 410, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 76, 139));
        jLabel7.setText("Servicios                     :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 76, 139));
        jLabel8.setText("Precio tasado            :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 76, 139));
        jLabel9.setText("Superficie cubierta :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 170, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 76, 139));
        jLabel10.setText("Superficie total         :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 190, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 76, 139));
        jLabel11.setText("Tipo propiedad         :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 180, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 76, 139));
        jLabel12.setText("Localidad                    :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 170, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 76, 139));
        jLabel13.setText("Propietario                :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 190, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 76, 139));
        jLabel14.setText("Inquilino                      :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 170, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 76, 139));
        jLabel15.setText("Accesibilidad             :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 76, 139));
        jLabel16.setText("Título                             :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, -1));

        jtTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTituloKeyTyped(evt);
            }
        });
        jPanel1.add(jtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 640, 30));

        jPanel1.add(jcbPropietarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 530, 410, 30));

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un tipo", "Casa", "Departamento", "Local", "Chalet", "Galpon", "Quinta", "Lote" }));
        jPanel1.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 160, 30));

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un estado", "Disponible", "Reservada", "Alquilada", "No disponible" }));
        jPanel1.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 160, 30));

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
        char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtAccesibilidadKeyTyped

    private void jtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDireccionKeyTyped
        char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDireccionKeyTyped

    private void jtServiciosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtServiciosKeyTyped
        
    }//GEN-LAST:event_jtServiciosKeyTyped

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
          if(jtTitulo.getText().isEmpty()||jtAccesibilidad.getText().isEmpty()|| jtDireccion.getText().isEmpty()|| jtSupTotal.getText().isEmpty()|| jtServicios.getText().isEmpty()|| jcbTipo.getSelectedIndex()==0||
                jtCaracteristicas.getText().isEmpty()||jcbEstado.getSelectedIndex()==0||jtPrecio.getText().isEmpty()||jtSupCub.getText().isEmpty()||jtLocalidad.getText().isEmpty()|| jcbRevisores.getSelectedIndex()==0||jcbPropietarios.getSelectedIndex()==0){
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
                      String auxEstado=jcbEstado.getSelectedItem().toString();
                      Propiedad p=new Propiedad(jtTitulo.getText().toUpperCase(), jtAccesibilidad.getText(), jtCaracteristicas.getText(), jtDireccion.getText().toUpperCase(),jtServicios.getText(), jtLocalidad.getText(), propietario,auxEstado ,auxTipo , inquilino, Float.parseFloat(jtPrecio.getText()), revisor, Integer.parseInt(jtSupCub.getText()), Integer.parseInt(jtSupTotal.getText()));
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

    private void jtSupCubKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSupCubKeyTyped
        int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtSupCub.getText().length()>=4){
           evt.consume();
       }
    }//GEN-LAST:event_jtSupCubKeyTyped

    private void jtCaracteristicasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCaracteristicasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCaracteristicasKeyTyped

    private void jtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTituloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTituloKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<Inquilino> jcbInquilinos;
    private javax.swing.JComboBox<Propietario> jcbPropietarios;
    private javax.swing.JComboBox<Propietario> jcbPropietarios1;
    private javax.swing.JComboBox<Inspector> jcbRevisores;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JTextField jtAccesibilidad;
    private javax.swing.JTextField jtCaracteristicas;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtLocalidad;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtServicios;
    private javax.swing.JTextField jtSupCub;
    private javax.swing.JTextField jtSupTotal;
    private javax.swing.JTextField jtTitulo;
    // End of variables declaration//GEN-END:variables
}
