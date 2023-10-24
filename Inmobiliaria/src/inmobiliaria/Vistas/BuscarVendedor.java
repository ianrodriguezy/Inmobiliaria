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
import inmobiliaria.AccesoDatos.VendedorData;
import inmobiliaria.Inspector;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import inmobiliaria.Vendedor;
import static inmobiliaria.Vistas.MenuPrincipal.escritorio;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class BuscarVendedor extends javax.swing.JInternalFrame {
    public int auxid;
   
    public BuscarVendedor() {
        super("",false,false,false,false);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        cargarModeloP();
    }


    public BuscarVendedor( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    private void limpiar(){
        jtApellido.setText("");
        jtNombre.setText("");
        jtDni.setText("");
        jtTelefono.setText("");
        
    }
    
    private DefaultTableModel modeloP = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    
    private void cargarModeloP (){
        modeloP.addColumn("ID");
        modeloP.addColumn("Titulo");
        modeloP.addColumn("Estado");
        modeloP.addColumn("Inquilino");
        jtPropiedades.setModel(modeloP);
        jtPropiedades.getColumnModel().getColumn(0).setPreferredWidth(5);
        jtPropiedades.getColumnModel().getColumn(2).setPreferredWidth(5);
    }
    private DefaultTableModel modeloC = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    private void cargarTablaP(Propietario propietario){
        
        if(propietario==null){
           borrarFilasP();
        }else{
            borrarFilasP();
            for (Propiedad p : PropiedadData.buscarPropiedadPorPropietario(propietario.getIdPropietario())){
                
                modeloP.addRow(new Object []{
                    p.getIdPropiedad(),
                    p.getTitulo(),
                    p.getEstadoPropiedad(),
                    InquilinoData.buscarInquilinoPorId(p.getOcupante().getIdInquilino()).getApellido()+", "+InquilinoData.buscarInquilinoPorId(p.getOcupante().getIdInquilino()).getNombre() 
                });
            }}
    }
//    private void cargarModeloC (){
//        modelo.addColumn("ID");
//        modelo.addColumn("Nombre");
//        modelo.addColumn("Año");
//        jtablaMaterias.setModel(modelo);
//        
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jbVolver = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPropiedades = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1030, 790));
        setPreferredSize(new java.awt.Dimension(1030, 795));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 76, 139));
        jLabel3.setText("Apellido     :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 100, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 76, 139));
        jLabel4.setText("Nombre     :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 100, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 76, 139));
        jLabel5.setText("Ingrese un dni para buscar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 240, -1));

        jtTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtTelefono.setEnabled(false);
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 300, 30));

        jtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtApellido.setEnabled(false);
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 300, 30));

        jtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtNombre.setEnabled(false);
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 300, 30));

        jtDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 300, 30));

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
        jLabel7.setText("DNI              :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 100, -1));

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 50, 50));

        jtPropiedades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtPropiedades);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 870, 300));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 76, 139));
        jLabel8.setText("Telefono   :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 100, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 76, 139));
        jLabel9.setText("Listado de propiedades");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 220, -1));

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
        ventanaVendedores vv = new ventanaVendedores("",false,false,false,false);
        vv.setVisible(true);
        escritorio.add(vv);
        escritorio.moveToFront(vv);
    }//GEN-LAST:event_jbVolverActionPerformed

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
         int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtDni.getText().length()>=8){
           evt.consume();
       }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
        int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtDni.getText().length()>=11){
           evt.consume();
       }
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
        borrarFilasP();
    }//GEN-LAST:event_jbLimpiarActionPerformed
    private void borrarFilasP() {
        int f;
        int filas = jtPropiedades.getRowCount() - 1;

        for (f = filas; f >= 0; f--) {
            modeloP.removeRow(f);
        }
    }

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        Vendedor v = new Vendedor();
        
        if (jtDni.getText().isEmpty()) {
            mostrarMensaje("Ingrese un dni para buscar al Vendedor.", "Error al buscar", "error");
        } else {
            
            if(VendedorData.buscarVendedorDni(Integer.parseInt(jtDni.getText()),0).getApellido()!=null){
                v=VendedorData.buscarVendedorDni(Integer.parseInt(jtDni.getText()),0);
               
            jtDni.setText(v.getDni() + "");
            jtApellido.setText(v.getApellido());
            jtNombre.setText(v.getNombre());
            jtTelefono.setText(v.getTelefono()+"");
            
            cargarTablaP(i);
            if(!v.getApellido().isEmpty()){
                this.auxid=v.getIdVendedor();
            }
            }else{
                
                limpiar();
                borrarFilasP();
            }
            
            
        }
    }
        private void cargarTablaP(Inspector i){
        
        if(i==null){
           borrarFilasP();
        }else{
            borrarFilasP();
            for (Propiedad p : PropiedadData.buscarPropiedadPorRevisor(i.getIdInspector())){
                
                modeloP.addRow(new Object []{
                    p.getIdPropiedad(),
                    p.getTitulo(),
                    p.getEstadoPropiedad(),
                    InquilinoData.buscarInquilinoPorId(p.getOcupante().getIdInquilino()).getApellido()+", "+InquilinoData.buscarInquilinoPorId(p.getOcupante().getIdInquilino()).getNombre() 
                });
            }}
    

    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtPropiedades;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
