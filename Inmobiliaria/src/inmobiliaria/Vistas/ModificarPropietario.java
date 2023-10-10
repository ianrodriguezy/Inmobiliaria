/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package inmobiliaria.Vistas;

import Inmobiliaria.AccesoDatos.PropietarioData;
import static Inmobiliaria.AccesoDatos.PropietarioData.mostrarMensaje;
import inmobiliaria.Propietario;
import static inmobiliaria.Vistas.MenuPrincipal.escritorio;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ModificarPropietario extends javax.swing.JInternalFrame {
    public int auxid;
   
    public ModificarPropietario() {
        super("",false,false,false,false);
        
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }


    public ModificarPropietario( String title, boolean resizable, boolean closable, boolean maximizable, boolean iconifiable) {
        super(title, resizable, closable, maximizable, iconifiable);
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI()).setNorthPane(null);
    }

    private void limpiar(){
        jtApellido.setText("");
        jtNombre.setText("");
        jtDni.setText("");
        jtTelefono.setText("");
        jtDomicilio.setText("");
        jcbEstado.setSelectedIndex(0);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtDomicilio = new javax.swing.JTextField();
        jbVolver = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setMinimumSize(new java.awt.Dimension(1030, 790));
        setPreferredSize(new java.awt.Dimension(1030, 795));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 76, 139));
        jLabel2.setText("Estado       :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 100, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 76, 139));
        jLabel3.setText("Apellido     :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 100, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(35, 76, 139));
        jLabel4.setText("Nombre     :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 100, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 76, 139));
        jLabel5.setText("Ingrese un dni para buscar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 240, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 76, 139));
        jLabel6.setText("Domicilio  :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 100, -1));

        jtTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtTelefono.setEnabled(false);
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(jtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 300, 30));

        jtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtApellido.setEnabled(false);
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 300, 30));

        jtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtNombre.setEnabled(false);
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 300, 30));

        jtDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });
        jPanel1.add(jtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 300, 30));

        jtDomicilio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDomicilio.setEnabled(false);
        jPanel1.add(jtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 300, 30));

        jbVolver.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbVolver.setText("Volver");
        jbVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVolverActionPerformed(evt);
            }
        });
        jPanel1.add(jbVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 120, 40));

        jbGuardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 120, 40));

        jbLimpiar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 120, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(35, 76, 139));
        jLabel7.setText("DNI              :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 100, -1));

        jbBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contenido/lupa.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 50, 50));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(35, 76, 139));
        jLabel8.setText("Telefono   :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 100, -1));

        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jcbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbEstadoItemStateChanged(evt);
            }
        });
        jPanel1.add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 80, -1));

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
        ventanaPropietarios vp=new ventanaPropietarios();
        escritorio.removeAll();
        escritorio.repaint();
        vp.setVisible(true);
        escritorio.add(vp);
        escritorio.moveToFront(vp);
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
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int aux;
        if (jtDni.getText().isEmpty() || jtApellido.getText().isEmpty() || jtNombre.getText().isEmpty() || jtDomicilio.getText().isEmpty() || jtTelefono.getText().isEmpty()) {
            mostrarMensaje("Todos o alguno de los campos se encuentran vacios, por favor rellene todos.", "Error al modificar Propietario", "error");
        }else{
            if(jcbEstado.getSelectedIndex()==0){
                aux=1;
            } else {
                aux=0;
            }
            Propietario p=new Propietario(auxid, jtApellido.getText(), jtNombre.getText(), jtDomicilio.getText(), Integer.parseInt(jtDni.getText()), Integer.parseInt(jtTelefono.getText()),aux);
            PropietarioData.modificarPropietario(p);
            jbGuardar.setEnabled(false);
            jtApellido.setEnabled(false);;
            jtNombre.setEnabled(false);;
            jtDomicilio.setEnabled(false);;
            jtTelefono.setEnabled(false);;
            limpiar();
            System.out.println(aux);
        }     
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        Propietario p = new Propietario();
        int auxEstado;
        if (jtDni.getText().isEmpty()) {
            mostrarMensaje("Ingrese un dni para buscar al Propietario.", "Error al buscar", "error");
        } else {

            boolean aux;
            if (PropietarioData.buscarPropietarioPorDni(Integer.parseInt(jtDni.getText()), 0, 1) != null) {
                p = PropietarioData.buscarPropietarioPorDni(Integer.parseInt(jtDni.getText()), 0, 1);

                jtDni.setText(p.getDni() + "");
                jtApellido.setText(p.getApellidoPropietario());
                jtNombre.setText(p.getNombrePropietario());
                jtDomicilio.setText(p.getDomicilio());
                jtTelefono.setText(p.getTelefono() + "");
                if (p.getEstado() == 1) {
                    jcbEstado.setSelectedIndex(0);
                } else {
                    jcbEstado.setSelectedIndex(1);
                }
                if (!p.getApellidoPropietario().isEmpty()) {
                    jbGuardar.setEnabled(true);
                    this.auxid = p.getIdPropietario();
                    jtApellido.setEnabled(true);;
                    jtNombre.setEnabled(true);;
                    jtDomicilio.setEnabled(true);;
                    jtTelefono.setEnabled(true);;
                    
                }
            }

        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbEstadoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEstadoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbVolver;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
