
package inmobiliaria.Vistas;

import Inmobiliaria.AccesoDatos.ContratoData;
import Inmobiliaria.AccesoDatos.InquilinoData;
import Inmobiliaria.AccesoDatos.PropiedadData;
import Inmobiliaria.AccesoDatos.PropietarioData;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.AccesoDatos.InspectorData;
import inmobiliaria.AccesoDatos.VendedorData;
import inmobiliaria.Contrato;
import inmobiliaria.Inquilino;
import inmobiliaria.Inspector;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import inmobiliaria.Vendedor;
import static inmobiliaria.Vistas.MenuPrincipal.escritorio;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class AgregarContrato extends javax.swing.JInternalFrame {

    List propietarios=new ArrayList<>();
    List inquilinos=new ArrayList<>();
    List vendedores=new ArrayList<>();
    List propiedades=new ArrayList<>();
    
    public AgregarContrato() {
        super("",false,false,false,false);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        propietarios=PropietarioData.listarPropietario();
        inquilinos=InquilinoData.listarInquilinos();
        vendedores=VendedorData.listarVendedor();
        propiedades=PropiedadData.listarPropiedadesDisponiblesReservadas();
        
        cargarComboi();
        cargarCombov();
        cargarComboProp();
    }


    public AgregarContrato( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        propietarios=PropietarioData.listarPropietario();
        inquilinos=InquilinoData.listarInquilinos();
        vendedores=VendedorData.listarVendedor();
        propiedades=PropiedadData.listarPropiedadesDisponiblesReservadas();
        
        cargarComboi();
        cargarCombov();
        cargarComboProp();
    }
  
    
    private void cargarComboProp() {

       
        DefaultComboBoxModel<Propiedad> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Propiedad) null);
        for (Object propiedad : propiedades) {
            modeloCombo.addElement((Propiedad) propiedad);
        }
        jcbPropiedades.setModel(modeloCombo);
    }
    
    
    private void cargarComboi() {

       
        DefaultComboBoxModel<Inquilino> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Inquilino) null);
        for (Object inquilino : inquilinos) {
            modeloCombo.addElement((Inquilino) inquilino);
        }
        jcbInquilinos.setModel(modeloCombo);
    }
    private void cargarCombov() {

       
        DefaultComboBoxModel<Vendedor> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Vendedor) null);
        for (Object vendedor : vendedores) {
            modeloCombo.addElement((Vendedor) vendedor);
        }
        jcbVendedores.setModel(modeloCombo);
    }
    
    private void limpiar(){
        jdInicio.setDate(null);
        jdFin.setDate(null);
        jcbInquilinos.setSelectedIndex(0);
        jtPropietario.setText("");
        jcbVendedores.setSelectedIndex(0);
        jcbPropiedades.setSelectedIndex(0);
        jcbFirmas.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jbVolver = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jcbVendedores = new javax.swing.JComboBox<>();
        jcbInquilinos = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jdInicio = new com.toedter.calendar.JDateChooser();
        jdFin = new com.toedter.calendar.JDateChooser();
        jcbFirmas = new javax.swing.JComboBox<>();
        jcbPropiedades = new javax.swing.JComboBox<>();
        jtPropietario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1030, 790));
        setPreferredSize(new java.awt.Dimension(1030, 795));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 76, 139));
        jLabel3.setText("Agregar Contrato");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 250, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 76, 139));
        jLabel4.setText("Firmas                          :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 76, 139));
        jLabel5.setText("Vendedor                    :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 76, 139));
        jLabel6.setText("Inquilino                      :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 170, -1));

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

        jPanel1.add(jcbVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 410, -1));

        jPanel1.add(jcbInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 410, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 76, 139));
        jLabel7.setText("Propiedad                   :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 180, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 76, 139));
        jLabel13.setText("Propietario                :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 190, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 76, 139));
        jLabel15.setText("Fecha Fin                     :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 76, 139));
        jLabel16.setText("Fecha de Inicio          :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, -1));
        jPanel1.add(jdInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, -1));
        jPanel1.add(jdFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, -1));

        jcbFirmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un estado de firmas", "Firmado", "Faltan Firmas" }));
        jPanel1.add(jcbFirmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 220, -1));

        jcbPropiedades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPropiedadesItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 410, -1));

        jtPropietario.setEditable(false);
        jtPropietario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 504, 410, 30));

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

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
         if (jcbPropiedades.getSelectedIndex() == -1 || jcbInquilinos.getSelectedIndex() == -1 || jcbVendedores.getSelectedIndex() == -1 || jcbFirmas.getSelectedIndex() == 0 || jdInicio.getDate() == null || jdFin.getDate() == null) {
            mostrarMensaje("Todos o alguno de los campos se encuentran vacios.", "Error al crear Contrato", "error");
        } else {
            Inquilino inquilino = new Inquilino();
            if (jcbInquilinos.getSelectedIndex() != -1) {
                inquilino = (Inquilino) inquilinos.get(jcbInquilinos.getSelectedIndex() - 1);
            } else {
                inquilino.setIdInquilino(1);
            }
            Propiedad propiedad = new Propiedad();
            propiedad = (Propiedad) propiedades.get(jcbPropiedades.getSelectedIndex() - 1);
            Propietario propietario = new Propietario();
            propietario = (Propietario) propiedad.getDueño();
            Vendedor vendedor = new Vendedor();
            vendedor = (Vendedor) vendedores.get(jcbVendedores.getSelectedIndex() - 1);
            int auxEstado;
            if(jcbFirmas.getSelectedIndex()==1){
                auxEstado=1;
            }else{
                auxEstado=0;
            }
            LocalDate fechaInicio = jdInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFin = jdFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaRealizacion= LocalDate.now();
            String auxFirmas=(String)jcbFirmas.getSelectedItem();
            Contrato c= new Contrato(inquilino, propietario, auxEstado, fechaInicio, fechaRealizacion, fechaFin, auxFirmas, propiedad, vendedor);
//            ContratoData.agregarContrato(c);
//            limpiar();
             System.out.println(c.getFirmas());
        }

        
       
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jcbPropiedadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPropiedadesItemStateChanged
        if (jcbPropiedades.getSelectedIndex() != -1) {
            Propiedad p = (Propiedad) jcbPropiedades.getSelectedItem();
            jtPropietario.setText(PropietarioData.buscarPropietarioPorId(p.getDueño().getIdPropietario()).toString());
        }else{
            jtPropietario.setText("");
        }
    }//GEN-LAST:event_jcbPropiedadesItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbFirmas;
    private javax.swing.JComboBox<Inquilino> jcbInquilinos;
    private javax.swing.JComboBox<Propiedad> jcbPropiedades;
    private javax.swing.JComboBox<Vendedor> jcbVendedores;
    private com.toedter.calendar.JDateChooser jdFin;
    private com.toedter.calendar.JDateChooser jdInicio;
    private javax.swing.JTextField jtPropietario;
    // End of variables declaration//GEN-END:variables
}
