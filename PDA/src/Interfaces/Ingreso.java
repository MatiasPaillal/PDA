/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;

/**
 *
 * @author matias
 */
public class Ingreso extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso
     */
    public Ingreso() {
        initComponents();
        ingresarAdmin.setBackground(Color.white);
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
        iconoAdmin = new javax.swing.JLabel();
        ingresarAdmin = new javax.swing.JButton();
        textoBienvenida1 = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        textoBienvenida2 = new javax.swing.JLabel();
        ingresarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(iconoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 60, 60));

        ingresarAdmin.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        ingresarAdmin.setText("               Ingresar como administrador");
        ingresarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarAdminActionPerformed(evt);
            }
        });
        jPanel1.add(ingresarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 270, 60));

        textoBienvenida1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textoBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        textoBienvenida1.setText("Para armar su carrito");
        jPanel1.add(textoBienvenida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 170, 50));

        bienvenido.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setText("Bienvenido(a)");
        jPanel1.add(bienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 320, 100));

        textoBienvenida2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        textoBienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        textoBienvenida2.setText("Presione para continuar");
        jPanel1.add(textoBienvenida2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        ingresarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ingresarCliente.setPreferredSize(new java.awt.Dimension(1000, 600));
        ingresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(ingresarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1050, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarClienteActionPerformed

    private void ingresarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarAdminActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel iconoAdmin;
    private javax.swing.JButton ingresarAdmin;
    private javax.swing.JButton ingresarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoBienvenida1;
    private javax.swing.JLabel textoBienvenida2;
    // End of variables declaration//GEN-END:variables
}
