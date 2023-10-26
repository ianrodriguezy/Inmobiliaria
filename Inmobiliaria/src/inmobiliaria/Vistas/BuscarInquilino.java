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
import inmobiliaria.Contrato;
import inmobiliaria.Inquilino;
import inmobiliaria.Propiedad;
import inmobiliaria.Propietario;
import static inmobiliaria.Vistas.MenuPrincipal.escritorio;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class BuscarInquilino extends javax.swing.JInternalFrame {
    public int auxid;
   
    public BuscarInquilino() {
        super("",false,false,false,false);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
        cargarModeloP();
        cargarModeloC();
    }


    public BuscarInquilino( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    private void limpiar(){
        jtApellido.setText("");
        jtNombre.setText("");
        jtDni.setText("");
        jtTelefono.setText("");
        jtLugarTrabajo.setText("");
        jtTipo.setText(""); 
        jtCuit.setText("");
        jtDniGar.setText("");
        jtNombreGar.setText("");
        jtPrecio.setText("");
        jtSupMin.setText("");
    }
    
    private DefaultTableModel modeloP = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    
    private void cargarModeloP (){
        modeloP.addColumn("ID");
        modeloP.addColumn("Titulo");
        modeloP.addColumn("Propietario");
        modeloP.addColumn("Precio");
        jtPropiedades.setModel(modeloP);
        jtPropiedades.getColumnModel().getColumn(0).setPreferredWidth(5);
        jtPropiedades.getColumnModel().getColumn(1).setPreferredWidth(110);
        jtPropiedades.getColumnModel().getColumn(2).setPreferredWidth(100);
        jtPropiedades.getColumnModel().getColumn(3).setPreferredWidth(8);
    }
    
    private DefaultTableModel modeloC = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    
    private void cargarTablaP(int id){
        
        
            borrarFilasP();
            for (Propiedad p : PropiedadData.buscarPropiedadPorOcupante(id)){
                
                modeloP.addRow(new Object []{
                    p.getIdPropiedad(),
                    p.getTitulo(),
                    p.getDueño().getApellidoPropietario()+", "+p.getDueño().getNombrePropietario(),
                    p.getPrecioTasado()
                    
                });
            }}
    
    private void cargarModeloC() {
        modeloC.addColumn("ID");
        modeloC.addColumn("Titulo");
        modeloC.addColumn("Fecha");
        modeloC.addColumn("Propietario");
        modeloC.addColumn("Vig");
        modeloC.addColumn("Est");
        jtContratos.setModel(modeloC);
        jtContratos.getColumnModel().getColumn(0).setPreferredWidth(7);
        jtContratos.getColumnModel().getColumn(1).setPreferredWidth(110);
        jtContratos.getColumnModel().getColumn(2).setPreferredWidth(35);
        jtContratos.getColumnModel().getColumn(3).setPreferredWidth(100);
        jtContratos.getColumnModel().getColumn(4).setPreferredWidth(7);
        jtContratos.getColumnModel().getColumn(5).setPreferredWidth(7);
    }
    private void cargarTablaC(int id){
        
        
            borrarFilasC();
            for (Contrato c : ContratoData.listarContratosPorInquilino(id)){
                
                modeloC.addRow(new Object []{
                    c.getCodContrato(),
                    c.getPropiedad().getTitulo(),
                    c.getFechaRealizacion(),
                    c.geteLpropietario().getApellidoPropietario()+", "+c.geteLpropietario().getNombrePropietario(),
                    c.getVigente(),
                    c.getEstado(),
                });
            }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtLugarTrabajo = new javax.swing.JTextField();
        jbVolver = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtContratos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtPropiedades = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtCuit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtDniGar = new javax.swing.JTextField();
        jtNombreGar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtSupMin = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1030, 790));
        setPreferredSize(new java.awt.Dimension(1030, 795));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 76, 139));
        jLabel2.setText("Listado de contratos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 220, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 76, 139));
        jLabel3.setText("Apellido     :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 100, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 76, 139));
        jLabel4.setText("Nombre     :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 100, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 76, 139));
        jLabel5.setText("Ingrese un dni para buscar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 240, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 76, 139));
        jLabel6.setText("Lugar de trabajo  :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 160, -1));

        jtTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtTelefono.setEnabled(false);
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 300, 30));

        jtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtApellido.setEnabled(false);
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 300, 30));

        jtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtNombre.setEnabled(false);
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 300, 30));

        jtDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 300, 30));

        jtLugarTrabajo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtLugarTrabajo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtLugarTrabajo.setEnabled(false);
        jPanel1.add(jtLugarTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 300, 30));

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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 100, -1));

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 50, 50));

        jtContratos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtContratos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 490, 300));

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

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 490, 300));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 76, 139));
        jLabel8.setText("Telefono                 :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 150, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(35, 76, 139));
        jLabel9.setText("Listado de propiedades ocupadas");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 280, -1));

        jtCuit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtCuit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtCuit.setEnabled(false);
        jtCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCuitKeyTyped(evt);
            }
        });
        jPanel1.add(jtCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 300, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(35, 76, 139));
        jLabel10.setText("Cuit             :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(35, 76, 139));
        jLabel11.setText("Tipo            :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 100, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(35, 76, 139));
        jLabel12.setText("Dni Garante           :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 160, -1));

        jtDniGar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDniGar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtDniGar.setEnabled(false);
        jtDniGar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniGarKeyTyped(evt);
            }
        });
        jPanel1.add(jtDniGar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 300, 30));

        jtNombreGar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtNombreGar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtNombreGar.setEnabled(false);
        jtNombreGar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreGarKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombreGar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 300, 30));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(35, 76, 139));
        jLabel13.setText("Nombre Garante  :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 160, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(35, 76, 139));
        jLabel15.setText("Sup Miníma           :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 160, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(35, 76, 139));
        jLabel16.setText("Precio aprox          :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 160, -1));

        jtSupMin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtSupMin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtSupMin.setEnabled(false);
        jtSupMin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtSupMinKeyTyped(evt);
            }
        });
        jPanel1.add(jtSupMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 140, 30));

        jtPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtPrecio.setEnabled(false);
        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(jtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 140, 30));

        jtTipo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTipo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtTipo.setEnabled(false);
        jtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTipoKeyTyped(evt);
            }
        });
        jPanel1.add(jtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 300, 30));

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
        ventanaInquilinos vi=new ventanaInquilinos();
        escritorio.removeAll();
        escritorio.repaint();
        vi.setVisible(true);
        escritorio.add(vi);
        escritorio.moveToFront(vi);
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
    private void borrarFilasC() {
        int f;
        int filas = jtContratos.getRowCount() - 1;

        for (f = filas; f >= 0; f--) {
            modeloC.removeRow(f);
        }
    }

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        Inquilino i = new Inquilino();

        if (jtDni.getText().isEmpty()) {
            mostrarMensaje("Ingrese un dni para buscar al Inquilino.", "Error al buscar", "error");
        } else {

            if (InquilinoData.buscarInquilinoPorDni(Integer.parseInt(jtDni.getText()), 0, 0) != null) {
                i = InquilinoData.buscarInquilinoPorDni(Integer.parseInt(jtDni.getText()), 0, 0);
                jtApellido.setText(i.getApellido());
                jtNombre.setText(i.getNombre());
                jtDni.setText(i.getDni()+"");
                jtTelefono.setText(i.getTelefono()+"");
                jtLugarTrabajo.setText(i.getLugarTrabajo());
                jtTipo.setText(i.getTipo());
                jtCuit.setText(i.getCuit()+"");
                jtDniGar.setText(i.getDniGarante()+"");
                jtNombreGar.setText(i.getNombreGarante());
                jtPrecio.setText(i.getPrecioAprox()+"");
                jtSupMin.setText(i.getSupMin()+"");
                auxid=i.getIdInquilino();
                cargarTablaP(i.getIdInquilino());
                cargarTablaC(i.getIdInquilino());
            }else{
                limpiar();
                borrarFilasP();
                borrarFilasC();
            }
            
            
        }
        

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCuitKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCuitKeyTyped

    private void jtDniGarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniGarKeyTyped
         int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtDni.getText().length()>=8){
           evt.consume();
       }
    }//GEN-LAST:event_jtDniGarKeyTyped

    private void jtSupMinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSupMinKeyTyped
         int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtDni.getText().length()>=8){
           evt.consume();
       }
    }//GEN-LAST:event_jtSupMinKeyTyped

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
         int key=evt.getKeyChar();
        boolean num= key>=48 && key<=57;
        if(!num){
            evt.consume();
        }
        
        if(jtDni.getText().length()>=8){
           evt.consume();
       }
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtNombreGarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreGarKeyTyped
       char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key)|| Character.isWhitespace(key);
        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreGarKeyTyped

    private void jtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTipoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTipoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTable jtContratos;
    private javax.swing.JTextField jtCuit;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDniGar;
    private javax.swing.JTextField jtLugarTrabajo;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtNombreGar;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTable jtPropiedades;
    private javax.swing.JTextField jtSupMin;
    private javax.swing.JTextField jtTelefono;
    private javax.swing.JTextField jtTipo;
    // End of variables declaration//GEN-END:variables
}
