/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
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
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import inmobiliaria.Vendedor;
import static inmobiliaria.Vistas.MenuPrincipal.escritorio;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class ModificarContrato extends javax.swing.JInternalFrame {
    public int auxid;
    private List propiedades=new ArrayList<>();
    private List propietarios=new ArrayList<>();
    private List contratos=new ArrayList<>();
    private List inquilinos=new ArrayList<>();
    private List vendedores=new ArrayList<>();
    
    public ModificarContrato() {
        super("",false,false,false,false);
        initComponents();
        propiedades=PropiedadData.listarPropiedadesConContrato(); 
        propietarios=PropietarioData.listarPropietarioConContrato();
        inquilinos=InquilinoData.listarInquilinosSinD();
        vendedores=VendedorData.listarVendedor();
        cargarCombop();
        cargarComboPropiedades();
        cargarComboInquilino();
        cargarComboVendedor();
        cargarModelo();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    
    
    

    public ModificarContrato( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        propiedades=PropiedadData.listarPropiedadesConContrato();
        propietarios=PropietarioData.listarPropietarioConContrato();
        inquilinos=InquilinoData.listarInquilinosSinD();
        vendedores=VendedorData.listarVendedor();
        cargarCombop();
        cargarComboPropiedades();
        cargarComboInquilino();
        cargarComboVendedor();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }
    
    private void cargarComboPropiedades() {

       
        DefaultComboBoxModel<Propiedad> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Propiedad) null);
        for (Object p : propiedades) {
            modeloCombo.addElement((Propiedad) p);
        }
        jcbPropiedades.setModel(modeloCombo);
    }
    
    private void cargarCombop() {

       
        DefaultComboBoxModel<Propietario> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Propietario) null);
        for (Object propietario : propietarios) {
            modeloCombo.addElement((Propietario) propietario);
        }
        jcbPropietarios.setModel(modeloCombo);
    }
    
    private void cargarComboVendedor() {

       
        DefaultComboBoxModel<Vendedor> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Vendedor) null);
        for (Object v : vendedores) {
            modeloCombo.addElement((Vendedor) v);
        }
        jcbVendedor.setModel(modeloCombo);
    }
    
    private void cargarComboInquilino() {

       
        DefaultComboBoxModel<Inquilino> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Inquilino) null);
        for (Object i : inquilinos) {
            modeloCombo.addElement((Inquilino) i);
        }
        jcbInquilinos.setModel(modeloCombo);
    }
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    private void cargarModelo (){
        
        modelo.addColumn("ID");
        modelo.addColumn("Título");
        modelo.addColumn("Realización");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        modelo.addColumn("Vigente");
        modelo.addColumn("Estado");
 
        
        jtablaContratos.setModel(modelo);
        TableColumnModel columnModel = jtablaContratos.getColumnModel();
        int anchoColumna1 = 20;
        int anchoColumna2 = 180;
        int anchoColumna3 = 50;
        int anchoColumna4 = 50;
        int anchoColumna5 = 50;
        int anchoColumna6 = 50;
        int anchoColumna7 = 50;
        
        
        TableColumn columna1 = columnModel.getColumn(0); // La primera columna
        TableColumn columna2 = columnModel.getColumn(1); // La segunda columna
        TableColumn columna3 = columnModel.getColumn(2); // La tercera columna
        TableColumn columna4 = columnModel.getColumn(3); // La primera columna
        TableColumn columna5 = columnModel.getColumn(4); // La segunda columna
        TableColumn columna6 = columnModel.getColumn(5); // La tercera columna
        TableColumn columna7 = columnModel.getColumn(6); // La primera columna
       
       
        columna1.setPreferredWidth(anchoColumna1);
        columna2.setPreferredWidth(anchoColumna2);
        columna3.setPreferredWidth(anchoColumna3);
        columna4.setPreferredWidth(anchoColumna4);
        columna5.setPreferredWidth(anchoColumna5);
        columna6.setPreferredWidth(anchoColumna6);
        columna7.setPreferredWidth(anchoColumna7);
        
    }
    private void cargarTablaC(List<Contrato> contratos) {

        borrarFilasC();
        for (Contrato c : contratos) {
            modelo.addRow(new Object[]{
                c.getCodContrato(),
                c.getPropiedad().getTitulo(),
                c.getFechaRealizacion(),
                c.getFechaInicio(),
                c.getFechaFin(),
                c.getVigente(),
                c.getEstado()
            });

        }

    }
   private void borrarFilasC() {
        int f;
        int filas = jtablaContratos.getRowCount() - 1;

        for (f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
   
   private void editar(boolean b){
            
            jtPrecio.setEnabled(b);
            jdcFechaR.setEnabled(b);
            jdcFechaI.setEnabled(b);
            jdcFechaF.setEnabled(b);
            jcbFirmas.setEnabled(b);
            jcbInquilinos.setEnabled(b);
            jcbVendedor.setEnabled(b);
            jcbEstado.setEnabled(b);
            jbGuardar.setEnabled(b);
            jbCancelar.setEnabled(b);
   }
   
    private void limpiarTodo(){
            jtCodigo.setText("");
            jtPrecio.setText("");
            jtVigente.setText("");
            jdcFechaR.setDate(null);
            jdcFechaI.setDate(null);
            jdcFechaF.setDate(null);
            jcbFirmas.setSelectedIndex(0);
            jcbInquilinos.setSelectedIndex(-1);
            jcbVendedor.setSelectedIndex(-1);
            jtVigente.setText("");
            jcbEstado.setSelectedIndex(0);
            borrarFilasC();
            
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbVolver = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbPropietarios = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcbPropiedades = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jbLimpiar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jdcFechaI = new com.toedter.calendar.JDateChooser();
        jdcFechaF = new com.toedter.calendar.JDateChooser();
        jdcFechaR = new com.toedter.calendar.JDateChooser();
        jcbEstado = new javax.swing.JComboBox<>();
        jcbInquilinos = new javax.swing.JComboBox<>();
        jcbVendedor = new javax.swing.JComboBox<>();
        jtCodigo = new javax.swing.JTextField();
        jcbFirmas = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jtVigente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaContratos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1030, 790));
        setPreferredSize(new java.awt.Dimension(1030, 795));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbVolver.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 700, 120, 40));

        jbCancelar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbCancelar.setText("Cancelar Contrato");
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, 200, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 76, 139));
        jLabel7.setText("Modificar Contrato");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 270, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 76, 139));
        jLabel9.setText("Código                        :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 190, -1));

        jcbPropietarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPropietariosItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 190, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 76, 139));
        jLabel10.setText("Buscar por propiedad :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, -1));

        jcbPropiedades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPropiedadesItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 190, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 76, 139));
        jLabel13.setText("Precio        :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 130, 20));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 76, 139));
        jLabel14.setText("Estado        :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, 110, 20));

        jbLimpiar1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbLimpiar1.setText("Limpiar");
        jbLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 700, 120, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 76, 139));
        jLabel8.setText("Buscar por propietario :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 190, -1));

        jbGuardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 120, 40));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 76, 139));
        jLabel12.setText("Fecha Inicio              :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 170, -1));

        jtPrecio.setEditable(false);
        jtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 160, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 76, 139));
        jLabel15.setText("Firmas                        :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 170, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 76, 139));
        jLabel16.setText("Fecha Fin                   :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 170, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(35, 76, 139));
        jLabel17.setText("Fecha Realización :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 170, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(35, 76, 139));
        jLabel18.setText("Inquilino                     :");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 170, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(35, 76, 139));
        jLabel19.setText("Vendedor                  :");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 170, 20));

        jdcFechaI.setEnabled(false);
        jPanel1.add(jdcFechaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 160, -1));

        jdcFechaF.setEnabled(false);
        jPanel1.add(jdcFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 160, -1));

        jdcFechaR.setEnabled(false);
        jPanel1.add(jdcFechaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 160, -1));

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "0 Inactivo", "1 Activo" }));
        jcbEstado.setEnabled(false);
        jPanel1.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 160, 30));

        jcbInquilinos.setEnabled(false);
        jcbInquilinos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbInquilinosItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 190, 30));

        jcbVendedor.setEnabled(false);
        jcbVendedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbVendedorItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 190, 30));

        jtCodigo.setEditable(false);
        jtCodigo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 160, 30));

        jcbFirmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Firmado", "Faltan Firmas" }));
        jcbFirmas.setEnabled(false);
        jPanel1.add(jcbFirmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 190, 30));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(35, 76, 139));
        jLabel20.setText("Vigente      :");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 130, 20));

        jtVigente.setEditable(false);
        jtVigente.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(jtVigente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 160, 30));

        jtablaContratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtablaContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaContratosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaContratos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 920, 90));

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
        ventanaContratos vc=new ventanaContratos();
        escritorio.removeAll();
        escritorio.repaint();
        vc.setVisible(true);
        escritorio.add(vc);
        escritorio.moveToFront(vc);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        Contrato c = ContratoData.buscarContratoporCod(Integer.parseInt(jtCodigo.getText()));
        
        if(c.getEstado()==1){
            c.setEstado(0);
            ContratoData.CancelarContrato(c);
        }else{
            mostrarMensaje("El contrato que desea cancelar ya esta inactivo, ","Error","error");
        }

    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jcbPropiedadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPropiedadesItemStateChanged
        if(jcbPropiedades.getSelectedIndex()==-1){
            limpiarTodo();
            jcbPropietarios.setSelectedIndex(-1);
            jbCancelar.setEnabled(false);
            editar(false);
        }else{
            limpiarTodo();
            Propiedad propiedad= (Propiedad)jcbPropiedades.getSelectedItem();
            contratos= ContratoData.listarContratosPorPropiedad(propiedad.getIdPropiedad());
            cargarTablaC(contratos);
            jcbPropietarios.setSelectedIndex(-1);
            
            editar(false);
        }
    }//GEN-LAST:event_jcbPropiedadesItemStateChanged

    private void jcbPropietariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPropietariosItemStateChanged
        if(jcbPropietarios.getSelectedIndex()==-1){
            limpiarTodo();
            editar(false);
            //jcbTipo.setSelectedIndex(0);
        }else{
            limpiarTodo();
            Propietario p=(Propietario)jcbPropietarios.getSelectedItem();
            cargarTablaC(ContratoData.listarContratosPorPropietario(p.getIdPropietario()));
            jcbPropiedades.setSelectedIndex(0);
            editar(false);
        }
    }//GEN-LAST:event_jcbPropietariosItemStateChanged

    private void jbLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar1ActionPerformed
        limpiarTodo();
        jcbPropietarios.setSelectedIndex(-1);
        jcbPropiedades.setSelectedIndex(-1);
        editar(false);
    }//GEN-LAST:event_jbLimpiar1ActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if(jtCodigo.getText().isEmpty()||jdcFechaR.getDate()==null||jdcFechaI.getDate()==null||jdcFechaF.getDate()==null||jcbFirmas.getSelectedIndex()==0||jcbInquilinos.getSelectedIndex()==-1||jcbVendedor.getSelectedIndex()==-1||jtPrecio.getText().isEmpty()||jcbEstado.getSelectedIndex()==0||jtVigente.getText().isEmpty()){
            mostrarMensaje("Rellene todos los campos para modificar", "Error al modificar contrato", "error");
        }else{
            Contrato c= new Contrato();
            c.setCodContrato(Integer.parseInt(jtCodigo.getText()));
            c.setFechaRealizacion(jdcFechaR.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            c.setFechaInicio(jdcFechaI.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            c.setFechaFin(jdcFechaF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            c.setFirmas(jcbFirmas.getSelectedItem().toString());
            c.seteLinquilino((Inquilino)jcbInquilinos.getSelectedItem());
            c.setVendedor((Vendedor)jcbVendedor.getSelectedItem());            
            c.setEstado(jcbEstado.getSelectedIndex()-1);
            c.setVigente(Integer.parseInt(jtVigente.getText()));
            
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jcbInquilinosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbInquilinosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbInquilinosItemStateChanged

    private void jcbVendedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbVendedorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVendedorItemStateChanged

    private void jtablaContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaContratosMouseClicked
        if (jtablaContratos.getSelectedRow() == -1) {
            editar(false);
        } else {
            Contrato c = ContratoData.buscarContratoporCod((int)jtablaContratos.getValueAt(jtablaContratos.getSelectedRow(), 0)); 
            Inquilino i= InquilinoData.buscarInquilinoPorId(c.geteLinquilino().getIdInquilino());
            Vendedor v= VendedorData.buscarVendedorPorId(c.getVendedor().getIdVendedor()); 
            Propiedad p= PropiedadData.buscarPropiedadPorId(c.getPropiedad().getIdPropiedad());
            jtCodigo.setText(c.getCodContrato()+"");
            java.sql.Date fR = java.sql.Date.valueOf(c.getFechaRealizacion());
            java.sql.Date fI = java.sql.Date.valueOf(c.getFechaInicio());
            java.sql.Date fF = java.sql.Date.valueOf(c.getFechaFin());
            jdcFechaR.setDate(fR);
            jdcFechaI.setDate(fI);
            jdcFechaF.setDate(fF);
            jcbFirmas.setSelectedItem(c.getFirmas());
            int auxInq=0;
                Inquilino inquilino=new Inquilino();
                for(Object inq:inquilinos){
                    inquilino= (Inquilino)inq;
                    auxInq++;
                    if(inquilino.getIdInquilino()==c.geteLinquilino().getIdInquilino()){
                        break;
                    }
                }
            jcbInquilinos.setSelectedIndex(auxInq);
            int auxVen=0;
                Vendedor vendedor=new Vendedor();
                for(Object ven:vendedores){
                    vendedor= (Vendedor)ven;
                    auxVen++;
                    if(vendedor.getIdVendedor()==c.getVendedor().getIdVendedor()){
                        break;
                    }
                }
            jcbVendedor.setSelectedIndex(auxVen);
            jtPrecio.setText(p.getPrecioTasado()+"");
            jcbEstado.setSelectedIndex(c.getEstado()+1);
            if(c.getVigente()==1){
            jtVigente.setText("Vigente");
            }else{
                jtVigente.setText("No vigente");
            }
            editar(true);
        }
    }//GEN-LAST:event_jtablaContratosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar1;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbFirmas;
    private javax.swing.JComboBox<Inquilino> jcbInquilinos;
    private javax.swing.JComboBox<Propiedad> jcbPropiedades;
    private javax.swing.JComboBox<Propietario> jcbPropietarios;
    private javax.swing.JComboBox<Vendedor> jcbVendedor;
    private com.toedter.calendar.JDateChooser jdcFechaF;
    private com.toedter.calendar.JDateChooser jdcFechaI;
    private com.toedter.calendar.JDateChooser jdcFechaR;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtVigente;
    private javax.swing.JTable jtablaContratos;
    // End of variables declaration//GEN-END:variables
}
