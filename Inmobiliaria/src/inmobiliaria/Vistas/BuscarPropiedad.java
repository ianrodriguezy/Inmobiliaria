/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package inmobiliaria.Vistas;

import Inmobiliaria.AccesoDatos.InquilinoData;
import Inmobiliaria.AccesoDatos.PropiedadData;
import Inmobiliaria.AccesoDatos.PropietarioData;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.AccesoDatos.InspectorData;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import static inmobiliaria.Vistas.MenuPrincipal.escritorio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class BuscarPropiedad extends javax.swing.JInternalFrame {
    public int auxid;
    private List tipos=new ArrayList<>();
    private List propietarios=new ArrayList<>();
    public BuscarPropiedad() {
        super("",false,false,false,false);
        initComponents();
        tipos=PropiedadData.listarTipos();
        propietarios=PropietarioData.listarPropietario();
        cargarCombop();
        cargarComboTipo();
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
        modelo.addColumn("Estado");
        modelo.addColumn("Precio tasado");
        modelo.addColumn("Sup cubierta");
        modelo.addColumn("Sup total");
        modelo.addColumn("Propietario");
        modelo.addColumn("Inquilino");
        
        jtablaPropiedades.setModel(modelo);
        TableColumnModel columnModel = jtablaPropiedades.getColumnModel();
        int anchoColumna1 = 20;
        int anchoColumna2 = 180;
        int anchoColumna3 = 50;
        int anchoColumna4 = 50;
        int anchoColumna5 = 40;
        int anchoColumna6 = 40;
        int anchoColumna7 = 150;
        int anchoColumna8 = 150;
        
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

    public BuscarPropiedad( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        tipos=PropiedadData.listarTipos();
        propietarios=PropietarioData.listarPropietario();
        cargarCombop();
        cargarComboTipo();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }
    
    private void cargarComboTipo() {

       
        DefaultComboBoxModel<String> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement("Seleccione un tipo");
        for (Object tipo : tipos) {
            modeloCombo.addElement((String) tipo);
        }
        jcbTipo.setModel(modeloCombo);
    }
    
    private void cargarCombop() {

       
        DefaultComboBoxModel<Propietario> modeloCombo = new DefaultComboBoxModel<>();
        modeloCombo.addElement((Propietario) null);
        for (Object propietario : propietarios) {
            modeloCombo.addElement((Propietario) propietario);
        }
        jcbPropietarios.setModel(modeloCombo);
    }

    private void cargarTablaP(List<Propiedad> propiedades) {

        borrarFilasP();
        for (Propiedad p : propiedades) {
            modelo.addRow(new Object[]{
                p.getIdPropiedad(),
                p.getTitulo(),
                p.getEstadoPropiedad(),
                p.getPrecioTasado(),
                p.getSuperficieCub(),
                p.getSuperficieTotal(),
                PropietarioData.buscarPropietarioPorId(p.getDueño().getIdPropietario()),
                InquilinoData.buscarInquilinoPorId(p.getOcupante().getIdInquilino())

            });

        }

    }
    private void limpiarTodo(){
        borrarFilasP();
        jpCaracteristicas.setText("");
            jpDireccion.setText("");
            jpLocalidad.setText("");
            jpServicios.setText("");
            jpRevisor.setText("");
    }
    private void borrarFilasP() {
        int f;
        int filas = jtablaPropiedades.getRowCount() - 1;

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
        jbLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbPropietarios = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaPropiedades = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jpRevisor = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jpCaracteristicas = new javax.swing.JEditorPane();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jpServicios = new javax.swing.JEditorPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jpDireccion = new javax.swing.JEditorPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jpLocalidad = new javax.swing.JEditorPane();
        jLabel15 = new javax.swing.JLabel();
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

        jbLimpiar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 700, 120, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 76, 139));
        jLabel7.setText("Buscar por propietario :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 190, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 76, 139));
        jLabel9.setText("Direccion :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 90, -1));

        jcbPropietarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbPropietariosItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 190, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 76, 139));
        jLabel10.setText("Buscar por tipo :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 190, -1));

        jcbTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 190, -1));

        jtablaPropiedades.setModel(new javax.swing.table.DefaultTableModel(
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
        jtablaPropiedades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaPropiedadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaPropiedades);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1030, 210));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 76, 139));
        jLabel11.setText("Listado de propiedades");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 220, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 76, 139));
        jLabel12.setText("Características :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 220, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 76, 139));
        jLabel13.setText("Revisor :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 650, 110, 20));

        jpRevisor.setEditable(false);
        jpRevisor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jpRevisor);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 640, 420, 30));

        jpCaracteristicas.setEditable(false);
        jpCaracteristicas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(jpCaracteristicas);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 360, 220));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(35, 76, 139));
        jLabel14.setText("Localidad :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 110, 20));

        jpServicios.setEditable(false);
        jpServicios.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(jpServicios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 420, 100));

        jpDireccion.setEditable(false);
        jpDireccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(jpDireccion);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 420, 30));

        jpLocalidad.setEditable(false);
        jpLocalidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(jpLocalidad);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, 420, 30));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 76, 139));
        jLabel15.setText("Servicios  :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, 110, 20));

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
        ventanaPropiedades vp=new ventanaPropiedades();
        escritorio.removeAll();
        escritorio.repaint();
        vp.setVisible(true);
        escritorio.add(vp);
        escritorio.moveToFront(vp);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarTodo();
        jcbPropietarios.setSelectedIndex(-1);
        jcbTipo.setSelectedIndex(0);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jcbTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoItemStateChanged
        if(jcbTipo.getSelectedIndex()==0){
            limpiarTodo();
            jcbPropietarios.setSelectedIndex(-1);
        }else{
            String tipo=jcbTipo.getSelectedItem().toString();
            cargarTablaP(PropiedadData.buscarPropiedadPorTipo(tipo));
            jcbPropietarios.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jcbTipoItemStateChanged

    private void jcbPropietariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbPropietariosItemStateChanged
        if(jcbPropietarios.getSelectedIndex()==-1){
            limpiarTodo();
            //jcbTipo.setSelectedIndex(0);
        }else{
            limpiarTodo();
            Propietario p=(Propietario)jcbPropietarios.getSelectedItem();
            cargarTablaP(PropiedadData.buscarPropiedadPorPropietario(p.getIdPropietario()));
            jcbTipo.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jcbPropietariosItemStateChanged

    private void jtablaPropiedadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaPropiedadesMouseClicked
        if (jtablaPropiedades.getSelectedRow() == -1) {

        } else {
            Propiedad p = PropiedadData.buscarPropiedadPorId((int) jtablaPropiedades.getValueAt(jtablaPropiedades.getSelectedRow(), 0));
            jpCaracteristicas.setText(p.getCaracteristicas());
            jpDireccion.setText(p.getDireccion());
            jpLocalidad.setText(p.getLocalidad());
            jpServicios.setText(p.getServicios());
            jpRevisor.setText(InspectorData.buscarInspectorPorId(p.getRevisor().getIdInspector()).getApellido() + ", " + InspectorData.buscarInspectorPorId(p.getRevisor().getIdInspector()).getNombre());
        }
    }//GEN-LAST:event_jtablaPropiedadesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<Propietario> jcbPropietarios;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JEditorPane jpCaracteristicas;
    private javax.swing.JEditorPane jpDireccion;
    private javax.swing.JEditorPane jpLocalidad;
    private javax.swing.JEditorPane jpRevisor;
    private javax.swing.JEditorPane jpServicios;
    private javax.swing.JTable jtablaPropiedades;
    // End of variables declaration//GEN-END:variables
}
