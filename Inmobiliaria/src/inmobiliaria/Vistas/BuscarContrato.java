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
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class BuscarContrato extends javax.swing.JInternalFrame {
    public int auxid;
    private List propiedades=new ArrayList<>();
    private List propietarios=new ArrayList<>();
    private List contratos=new ArrayList<>();
    
    public BuscarContrato() {
        super("",false,false,false,false);
        initComponents();
        propiedades=PropiedadData.listarPropiedadesConContrato(); 
        propietarios=PropietarioData.listarPropietarioConContrato();
        cargarCombop();
       
        cargarComboPropiedades();
        cargarModelo();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    private void cargarModelo (){
        
        modelo.addColumn("ID");
        modelo.addColumn("Título");
        modelo.addColumn("Fecha");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        modelo.addColumn("Firmas"); 
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
        int anchoColumna8 = 50;
        
        TableColumn columna1 = columnModel.getColumn(0); // La primera columna
        TableColumn columna2 = columnModel.getColumn(1); // La segunda columna
        TableColumn columna3 = columnModel.getColumn(2); // La tercera columna
        TableColumn columna4 = columnModel.getColumn(3); // La primera columna
        TableColumn columna5 = columnModel.getColumn(4); // La segunda columna
        TableColumn columna6 = columnModel.getColumn(5); // La tercera columna
        TableColumn columna7 = columnModel.getColumn(6); // La primera columna
        TableColumn columna8 = columnModel.getColumn(7); // La segunda columna
       
        columna1.setPreferredWidth(anchoColumna1);
        columna2.setPreferredWidth(anchoColumna2);
        columna3.setPreferredWidth(anchoColumna3);
        columna4.setPreferredWidth(anchoColumna4);
        columna5.setPreferredWidth(anchoColumna5);
        columna6.setPreferredWidth(anchoColumna6);
        columna7.setPreferredWidth(anchoColumna7);
        columna8.setPreferredWidth(anchoColumna8);


    }

    public BuscarContrato( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        propiedades=PropiedadData.listarPropiedadesConContrato();
        propietarios=PropietarioData.listarPropietarioConContrato();
        cargarCombop();
        cargarComboPropiedades();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }
    
    private void cargarComboPropiedades() {

       
        DefaultComboBoxModel<Propiedad> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Propiedad) null);
        for (Object p : propiedades) {
            modeloCombo.addElement((Propiedad) p);
        }
        jcbPropiedad.setModel(modeloCombo);
    }
    
    private void cargarCombop() {

       
        DefaultComboBoxModel<Propietario> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Propietario) null);
        for (Object propietario : propietarios) {
            modeloCombo.addElement((Propietario) propietario);
        }
        jcbPropietarios.setModel(modeloCombo);
    }

    private void cargarTablaP(List<Contrato> contratos) {

        borrarFilasP();
        for (Contrato c : contratos) {
            modelo.addRow(new Object[]{
                c.getCodContrato(),
                c.getPropiedad().getTitulo(),
                c.getFechaRealizacion(),
                c.getFechaInicio(),
                c.getFechaFin(),
                c.getFirmas(),
                c.getVigente(),
                c.getEstado()
            });

        }

    }
    private void limpiarTodo(){
            borrarFilasP();
            jpInquilino.setText("");
            jpVendedor.setText("");
            jpPrecio1.setText("");
            
    }
    private void borrarFilasP() {
        int f;
        int filas = jtablaContratos.getRowCount() - 1;

        for (f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
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
        jbEditar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbPropietarios = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcbPropiedad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaContratos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jpPrecio = new javax.swing.JScrollPane();
        jpPrecio1 = new javax.swing.JEditorPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jpInquilino = new javax.swing.JEditorPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jpVendedor = new javax.swing.JEditorPane();
        jbLimpiar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
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

        jbEditar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 120, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 76, 139));
        jLabel7.setText("Buscar Contrato");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 190, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 76, 139));
        jLabel9.setText("Inquilino   :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, -1));

        jcbPropietarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPropietariosItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 190, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 76, 139));
        jLabel10.setText("Buscar por propiedad :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, -1));

        jcbPropiedad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPropiedadItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbPropiedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 190, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1030, 260));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 76, 139));
        jLabel11.setText("Listado de propiedades");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 220, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 76, 139));
        jLabel13.setText("Precio       :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 110, 20));

        jpPrecio1.setEditable(false);
        jpPrecio1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jpPrecio.setViewportView(jpPrecio1);

        jPanel1.add(jpPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, 250, 30));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 76, 139));
        jLabel14.setText("Vendedor :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 110, 20));

        jpInquilino.setEditable(false);
        jpInquilino.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(jpInquilino);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 420, 30));

        jpVendedor.setEditable(false);
        jpVendedor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(jpVendedor);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 420, 30));

        jbLimpiar1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbLimpiar1.setText("Limpiar");
        jbLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 700, 120, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 76, 139));
        jLabel8.setText("Buscar por propietario :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 190, -1));

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

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        
//        ModificarPropiedad mp=new ModificarPropiedad((int)jtablaContratos.getValueAt(jtablaContratos.getSelectedRow(), 0));
//        escritorio.removeAll();
//        escritorio.repaint();
//        mp.setVisible(true);
//        escritorio.add(mp);
//        escritorio.moveToFront(mp);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jcbPropiedadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPropiedadItemStateChanged
        if(jcbPropiedad.getSelectedIndex()==-1){
            limpiarTodo();
            jcbPropietarios.setSelectedIndex(-1);
            jbEditar.setEnabled(false);
        }else{
            limpiarTodo();
            Propiedad propiedad= (Propiedad)jcbPropiedad.getSelectedItem();
            
            cargarTablaP(ContratoData.listarContratosPorPropiedad(propiedad.getIdPropiedad()));
            jcbPropietarios.setSelectedIndex(-1);
            jbEditar.setEnabled(false);
            
        }
    }//GEN-LAST:event_jcbPropiedadItemStateChanged

    private void jcbPropietariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPropietariosItemStateChanged
        if(jcbPropietarios.getSelectedIndex()==-1){
            limpiarTodo();
            jbEditar.setEnabled(false);
            //jcbTipo.setSelectedIndex(0);
        }else{
            limpiarTodo();
            Propietario p=(Propietario)jcbPropietarios.getSelectedItem();
            cargarTablaP(ContratoData.listarContratosPorPropietario(p.getIdPropietario()));
            jcbPropiedad.setSelectedIndex(0);
            jbEditar.setEnabled(false);
        }
    }//GEN-LAST:event_jcbPropietariosItemStateChanged

    private void jtablaContratosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaContratosMouseClicked
        if (jtablaContratos.getSelectedRow() == -1) {

        } else {
            Contrato c = ContratoData.buscarContratoporCod((int)jtablaContratos.getValueAt(jtablaContratos.getSelectedRow(), 0)); 
            Inquilino i= InquilinoData.buscarInquilinoPorId(c.geteLinquilino().getIdInquilino());
            Vendedor v= VendedorData.buscarVendedorPorId(c.getVendedor().getIdVendedor());
            jpInquilino.setText(i.getApellido()+", "+i.getNombre());
            jpVendedor.setText(v.getApellido()+", "+v.getNombre());
            Propiedad p= PropiedadData.buscarPropiedadPorId(c.getPropiedad().getIdPropiedad());
            jpPrecio1.setText(p.getPrecioTasado()+"");
            jbEditar.setEnabled(true);
        }
    }//GEN-LAST:event_jtablaContratosMouseClicked

    private void jbLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiar1ActionPerformed
        limpiarTodo();
        jcbPropietarios.setSelectedIndex(-1);
            jcbPropiedad.setSelectedIndex(-1);
    }//GEN-LAST:event_jbLimpiar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbLimpiar1;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<Propiedad> jcbPropiedad;
    private javax.swing.JComboBox<Propietario> jcbPropietarios;
    private javax.swing.JEditorPane jpInquilino;
    private javax.swing.JScrollPane jpPrecio;
    private javax.swing.JEditorPane jpPrecio1;
    private javax.swing.JEditorPane jpVendedor;
    private javax.swing.JTable jtablaContratos;
    // End of variables declaration//GEN-END:variables
}
