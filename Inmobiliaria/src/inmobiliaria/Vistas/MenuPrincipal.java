/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inmobiliaria.Vistas;

import Inmobiliaria.AccesoDatos.ContratoData;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;


public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        ContratoData.ActualizarVigencia();
    }
    

    public void nuevaVentana(JInternalFrame v){
        
        escritorio.removeAll();
        escritorio.repaint();
        v.setVisible(true);
        escritorio.add(v);
        escritorio.moveToFront(v);
    }
    public static JInternalFrame vent(JInternalFrame v){
        
        return v;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jbVendedor = new javax.swing.JButton();
        jbPropiedades = new javax.swing.JButton();
        jbPropietarios = new javax.swing.JButton();
        jbInquilinos = new javax.swing.JButton();
        jbContratos = new javax.swing.JButton();
        jbRevisores = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("icono usuario");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 70));

        jbVendedor.setBackground(new java.awt.Color(35, 76, 139));
        jbVendedor.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbVendedor.setForeground(new java.awt.Color(204, 204, 204));
        jbVendedor.setText("Vendedor");
        jbVendedor.setBorder(null);
        jbVendedor.setBorderPainted(false);
        jbVendedor.setFocusable(false);
        jbVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(jbVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 210, 50));

        jbPropiedades.setBackground(new java.awt.Color(35, 76, 139));
        jbPropiedades.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbPropiedades.setForeground(new java.awt.Color(204, 204, 204));
        jbPropiedades.setText("Propiedades");
        jbPropiedades.setBorder(null);
        jbPropiedades.setBorderPainted(false);
        jbPropiedades.setFocusable(false);
        jbPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPropiedadesActionPerformed(evt);
            }
        });
        jPanel1.add(jbPropiedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 50));

        jbPropietarios.setBackground(new java.awt.Color(35, 76, 139));
        jbPropietarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbPropietarios.setForeground(new java.awt.Color(204, 204, 204));
        jbPropietarios.setText("Propietarios");
        jbPropietarios.setBorder(null);
        jbPropietarios.setBorderPainted(false);
        jbPropietarios.setFocusable(false);
        jbPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPropietariosActionPerformed(evt);
            }
        });
        jPanel1.add(jbPropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 50));

        jbInquilinos.setBackground(new java.awt.Color(35, 76, 139));
        jbInquilinos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbInquilinos.setForeground(new java.awt.Color(204, 204, 204));
        jbInquilinos.setText("Inquilinos");
        jbInquilinos.setBorder(null);
        jbInquilinos.setBorderPainted(false);
        jbInquilinos.setFocusable(false);
        jbInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInquilinosActionPerformed(evt);
            }
        });
        jPanel1.add(jbInquilinos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 210, 50));

        jbContratos.setBackground(new java.awt.Color(35, 76, 139));
        jbContratos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbContratos.setForeground(new java.awt.Color(204, 204, 204));
        jbContratos.setText("Contratos");
        jbContratos.setBorder(null);
        jbContratos.setBorderPainted(false);
        jbContratos.setFocusable(false);
        jbContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbContratosActionPerformed(evt);
            }
        });
        jPanel1.add(jbContratos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 210, 50));

        jbRevisores.setBackground(new java.awt.Color(35, 76, 139));
        jbRevisores.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbRevisores.setForeground(new java.awt.Color(204, 204, 204));
        jbRevisores.setText("Revisores");
        jbRevisores.setBorder(null);
        jbRevisores.setBorderPainted(false);
        jbRevisores.setFocusable(false);
        jbRevisores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRevisoresActionPerformed(evt);
            }
        });
        jPanel1.add(jbRevisores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 210, 50));

        jLabel3.setText("logo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 160, 130));

        jLabel6.setText("nombre inmo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, -1, -1));

        jLabel5.setText("nombre usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 100, 20));

        jLabel2.setBackground(new java.awt.Color(35, 76, 139));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 640));

        jLabel1.setBackground(new java.awt.Color(48, 53, 121));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 790));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );

        jPanel2.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 790));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1030, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPropiedadesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ventanaPropiedades vp = new ventanaPropiedades("",false,false,false,false);
        vp.setVisible(true);
        escritorio.add(vp);
        escritorio.moveToFront(vp);
    }//GEN-LAST:event_jbPropiedadesActionPerformed

    private void jbPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPropietariosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ventanaPropietarios vp = new ventanaPropietarios("",false,false,false,false);
        vp.setVisible(true);
        escritorio.add(vp);
        escritorio.moveToFront(vp);
        
        
    }//GEN-LAST:event_jbPropietariosActionPerformed

    private void jbInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInquilinosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ventanaInquilinos vi = new ventanaInquilinos("",false,false,false,false);
        vi.setVisible(true);
        escritorio.add(vi);
        escritorio.moveToFront(vi);
    }//GEN-LAST:event_jbInquilinosActionPerformed

    private void jbContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbContratosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ventanaContratos vc = new ventanaContratos("",false,false,false,false);
        vc.setVisible(true);
        escritorio.add(vc);
        escritorio.moveToFront(vc);
    }//GEN-LAST:event_jbContratosActionPerformed

    private void jbRevisoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRevisoresActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ventanaRevisores vr = new ventanaRevisores("",false,false,false,false);
        vr.setVisible(true);
        escritorio.add(vr);
        escritorio.moveToFront(vr);
    }//GEN-LAST:event_jbRevisoresActionPerformed

    private void jbVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVendedorActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ventanaVendedores vv = new ventanaVendedores("",false,false,false,false);
        vv.setVisible(true);
        escritorio.add(vv);
        escritorio.moveToFront(vv);
    }//GEN-LAST:event_jbVendedorActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbContratos;
    private javax.swing.JButton jbInquilinos;
    private javax.swing.JButton jbPropiedades;
    private javax.swing.JButton jbPropietarios;
    private javax.swing.JButton jbRevisores;
    private javax.swing.JButton jbVendedor;
    // End of variables declaration//GEN-END:variables
}
