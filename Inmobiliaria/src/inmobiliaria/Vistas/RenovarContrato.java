
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
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class RenovarContrato extends javax.swing.JInternalFrame {

    List vendedores=new ArrayList<>();
    Contrato c;

    public RenovarContrato() {
    }
    
    public RenovarContrato(int cod) {
        super("",false,false,false,false);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        c= ContratoData.buscarContratoporCod(cod);
        LocalDate inicio= c.getFechaFin().plus(1,ChronoUnit.DAYS);                
        jdInicio.setDate(Date.from(inicio.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        vendedores=VendedorData.listarVendedor();
        jtInquilino.setText(c.geteLinquilino().toString());
        jtPropiedad.setText(c.getPropiedad().toString());
        jtPropietario.setText(c.geteLpropietario().toString());
        jtPrecio.setText(c.getPropiedad().getPrecioTasado()+"");
        jtDniGar.setText(c.geteLinquilino().getDniGarante()+"");
        jtNombreGar.setText(c.geteLinquilino().getNombreGarante());
        cargarCombov();
        
    }


    public RenovarContrato( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        
        
        vendedores=VendedorData.listarVendedor();
       
        
        
        cargarCombov();
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
        jtInquilino.setText("");
        jtPropietario.setText("");
        jcbVendedores.setSelectedIndex(0);
        jtPropiedad.setText("");
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
        jcbVendedores = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jdInicio = new com.toedter.calendar.JDateChooser();
        jdFin = new com.toedter.calendar.JDateChooser();
        jcbFirmas = new javax.swing.JComboBox<>();
        jtPropietario = new javax.swing.JTextField();
        jtInquilino = new javax.swing.JTextField();
        jtPropiedad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtDniGar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtNombreGar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1030, 790));
        setPreferredSize(new java.awt.Dimension(1030, 795));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 76, 139));
        jLabel3.setText("Renovar Contrato");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 240, -1));

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
        jbAgregar.setText("Renovar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(jbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 120, 40));

        jPanel1.add(jcbVendedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 410, -1));

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

        jdInicio.setEnabled(false);
        jPanel1.add(jdInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, -1));
        jPanel1.add(jdFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 180, -1));

        jcbFirmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un estado de firmas", "Firmado", "Faltan Firmas" }));
        jPanel1.add(jcbFirmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 220, -1));

        jtPropietario.setEditable(false);
        jtPropietario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 410, 30));

        jtInquilino.setEditable(false);
        jtInquilino.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtInquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 410, 30));

        jtPropiedad.setEditable(false);
        jtPropiedad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 410, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 76, 139));
        jLabel14.setText("Precio                         :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 190, -1));

        jtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 220, 30));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 76, 139));
        jLabel8.setText("Dni Garante           :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 150, -1));

        jtDniGar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtDniGar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniGarKeyTyped(evt);
            }
        });
        jPanel1.add(jtDniGar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 230, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 76, 139));
        jLabel9.setText("Nombre Garante :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 180, -1));

        jtNombreGar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtNombreGar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreGarKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombreGar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 390, 30));

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

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
         if ( jcbVendedores.getSelectedIndex() == -1 || jcbFirmas.getSelectedIndex() == 0 ||  jdFin.getDate() == null||jtPrecio.getText().isEmpty()) {
            mostrarMensaje("Todos o alguno de los campos se encuentran vacios.", "Error al crear Contrato", "error");
        } else if(jdFin.getDate().before(jdInicio.getDate())){
            
            mostrarMensaje("La fecha de fin es anterior a la de inicio", "Error al renovar Contrato", "error");
        } else {
            c.setFechaRealizacion(LocalDate.now());
            c.setFechaInicio(jdInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            c.setFechaFin(jdFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            c.setFirmas(jcbFirmas.getSelectedItem().toString());
            Vendedor vendedor = new Vendedor();
            vendedor = (Vendedor) vendedores.get(jcbVendedores.getSelectedIndex() - 1);
            c.setVendedor(vendedor);
            c.getPropiedad().setPrecioTasado(Float.parseFloat(jtPrecio.getText()));
            PropiedadData.ActualizarPrecio(c.getPropiedad());
            c.geteLinquilino().setDniGarante(Integer.parseInt(jtDniGar.getText()));
            c.geteLinquilino().setNombreGarante(jtNombreGar.getText());
            InquilinoData.modificarInquilino(c.geteLinquilino());
            int auxEstado;
            if(jcbFirmas.getSelectedIndex()==1){
                auxEstado=1;
            }else{
                auxEstado=0;
            }
            c.setEstado(auxEstado);
            ContratoData.agregarContrato(c,1);
            limpiar();
            BuscarContrato bc=new BuscarContrato();
            escritorio.removeAll();
            escritorio.repaint();
            bc.setVisible(true);
            escritorio.add(bc);
            escritorio.moveToFront(bc);
        }

        
       
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57|| key==46;
        if(!num ){
            evt.consume();
        }
        
        if(jtPrecio.getText().length()>=11){
           evt.consume();
       }
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtDniGarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniGarKeyTyped
       int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num ){
            evt.consume();
        }
        
        if(jtPrecio.getText().length()>=8){
           evt.consume();
       }
    }//GEN-LAST:event_jtDniGarKeyTyped

    private void jtNombreGarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreGarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreGarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbFirmas;
    private javax.swing.JComboBox<Vendedor> jcbVendedores;
    private com.toedter.calendar.JDateChooser jdFin;
    private com.toedter.calendar.JDateChooser jdInicio;
    private javax.swing.JTextField jtDniGar;
    private javax.swing.JTextField jtInquilino;
    private javax.swing.JTextField jtNombreGar;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtPropiedad;
    private javax.swing.JTextField jtPropietario;
    // End of variables declaration//GEN-END:variables
}
