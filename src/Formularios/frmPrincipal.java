/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JOptionPane;

/**
 *
 * @author Angeluz
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mPersona = new javax.swing.JMenu();
        IngresarPersona = new javax.swing.JMenuItem();
        ModificarPersona = new javax.swing.JMenuItem();
        mSensor = new javax.swing.JMenu();
        ingresarSensor = new javax.swing.JMenuItem();
        ModificarSensor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmIntegrantes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Inicio");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jmiSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Organizacional");

        mPersona.setText("Personas");

        IngresarPersona.setText("Ingresar");
        IngresarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarPersonaActionPerformed(evt);
            }
        });
        mPersona.add(IngresarPersona);

        ModificarPersona.setText("Personas");
        ModificarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPersonaActionPerformed(evt);
            }
        });
        mPersona.add(ModificarPersona);

        jMenu2.add(mPersona);

        mSensor.setText("Sensores");

        ingresarSensor.setText("Ingresar ");
        ingresarSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarSensorActionPerformed(evt);
            }
        });
        mSensor.add(ingresarSensor);

        ModificarSensor.setText("Sensores");
        ModificarSensor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarSensorActionPerformed(evt);
            }
        });
        mSensor.add(ModificarSensor);

        jMenu2.add(mSensor);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jmIntegrantes.setText("Integrantes");
        jmIntegrantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIntegrantesActionPerformed(evt);
            }
        });
        jMenu3.add(jmIntegrantes);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarSensorActionPerformed
        // TODO add your handling code here:
        frmIngresarSensor form = new frmIngresarSensor();
        form.setVisible(true);
    }//GEN-LAST:event_ingresarSensorActionPerformed

    private void ModificarSensorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarSensorActionPerformed
        // TODO add your handling code here:
        frmSensor form = new frmSensor();
        form.setVisible(true);
    }//GEN-LAST:event_ModificarSensorActionPerformed

    private void ModificarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPersonaActionPerformed
        // TODO add your handling code here:
        frmPersona form = new frmPersona();
        form.setVisible(true);
    }//GEN-LAST:event_ModificarPersonaActionPerformed

    private void IngresarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarPersonaActionPerformed
        // TODO add your handling code here:
        frmIngresarPersona form = new frmIngresarPersona();
        form.setVisible(true);
    }//GEN-LAST:event_IngresarPersonaActionPerformed

    private void jmIntegrantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIntegrantesActionPerformed
        // TODO add your handling code here:
        frmIntegrantes form = new frmIntegrantes();
        form.setVisible(true);
    }//GEN-LAST:event_jmIntegrantesActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        // TODO add your handling code here:
         if(JOptionPane.showConfirmDialog(this, "¿Está seguro de finalizar la aplicación?","Salir",JOptionPane.YES_NO_OPTION)==0)
            System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem IngresarPersona;
    private javax.swing.JMenuItem ModificarPersona;
    private javax.swing.JMenuItem ModificarSensor;
    private javax.swing.JMenuItem ingresarSensor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmIntegrantes;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenu mPersona;
    private javax.swing.JMenu mSensor;
    // End of variables declaration//GEN-END:variables
}
