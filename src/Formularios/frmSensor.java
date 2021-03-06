/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Persona;
import Entidades.Sensor;
import archivo.ArchivoP;
import archivo.ArchivoS;
import general.ValidacionS;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angeluz
 */
public class frmSensor extends javax.swing.JFrame {

    /**
     * Creates new form frmSensor
     */
    public frmSensor() {
        initComponents();
        if(String.valueOf(cbTipo.getSelectedItem()).equals("TODOS"))
            tfDescripcion.setEditable(false);
        else 
            tfDescripcion.setEditable(true);
        tfDescripcion.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bEditar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tResultado = new javax.swing.JTable();
        cbTipo = new javax.swing.JComboBox<>();
        tfDescripcion = new javax.swing.JTextField();
        bConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bEditar.setText("EDITAR");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        bEliminar.setText("ELIMINAR");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        tResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "FABRICANTE", "MODELO", "UBICACION", "ESTADO", "TIPO", "DESCRIPCION", "VALOR ACTUAL", "VALOR ALARMA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tResultado);

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "NOMBRE", "FABRICANTE", "MODELO", "UBICACION", "ESTADO", "TIPO", "VALOR ACTUAL", "VALOR ALARMA" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        bConsultar.setText("CONSULTAR");
        bConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(648, Short.MAX_VALUE)
                .addComponent(bEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bEliminar)
                .addGap(5, 5, 5))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                            .addComponent(bConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEditar)
                    .addComponent(bEliminar))
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bConsultar))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addGap(77, 77, 77)))
        );

        getAccessibleContext().setAccessibleName("Mantenimiento Sensores");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        // TODO add your handling code here:
        if(seleccionEdicionValida()){
            boolean encontrado = false;
            Sensor pEncontrado = null;
            try{
                ArrayList<Sensor> sensores = ArchivoS.obtener_registros();
                for (Sensor s:sensores) {
                    if(s.getId().equals(String.valueOf(tResultado.getValueAt(tResultado.getSelectedRow(),0)))){
                        encontrado = true;
                        pEncontrado = s;
                        break;
                    }
                }
                if(encontrado){
                    frmEditarSensor frm = new frmEditarSensor(pEncontrado,this);
                    frm.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this,
                        "El registro a editar ya no existe",
                        "Edición",
                        JOptionPane.ERROR_MESSAGE);
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al consultar el archivo",
                    "Edición",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bEditarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        // TODO add your handling code here:
        if(seleccionEliminacionValida()){
            ArrayList<Sensor> eliminados= new ArrayList<Sensor>();            
            for (int i = 0; i < tResultado.getSelectedRows().length; i++) {
                Sensor s = new Sensor();
                s.setId(String.valueOf(tResultado.getValueAt(tResultado.getSelectedRows()[i],0)));
                eliminados.add(s);
            }
            try{
                ArrayList<Sensor> registros = ArchivoS.obtener_registros();
                for (int i = 0; i < eliminados.size(); i++)
                    registros.remove(ValidacionS.existeSensor(registros, eliminados.get(i)));

                if(ArchivoS.actualizar_registros(registros)){
                    JOptionPane.showMessageDialog(this,
                        "Se realizó la eliminación correctamente",
                        "Eliminación",
                        JOptionPane.ERROR_MESSAGE);
                    consultarRegistros();
                }else{
                    JOptionPane.showMessageDialog(this,
                        "Ocurrió un erro en la eliminación",
                        "Eliminación",
                        JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al consultar el archivo",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_bEliminarActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        
        if(String.valueOf(cbTipo.getSelectedItem()).equals("TODOS"))
            tfDescripcion.setEditable(false);
        else 
            tfDescripcion.setEditable(true);
        tfDescripcion.setText("");
    }//GEN-LAST:event_cbTipoActionPerformed

    public boolean seleccionEdicionValida(){
        
        if(tResultado.getSelectedRowCount()!=1){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un registro a editar",
                    "Edición",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        return true;    
    }
    
    public boolean seleccionEliminacionValida(){
        if(tResultado.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar mínimo un registro a eliminar",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return JOptionPane.showConfirmDialog(null, "Desea Eliminar el Registro?", "Eliminar", JOptionPane.YES_NO_OPTION) 
                == JOptionPane.YES_OPTION;  
    }
    
    private boolean formularioValido(){
        if(!cbTipo.getSelectedItem().toString().equalsIgnoreCase("TODOS") && tfDescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(this,
                    "Debe ingresar una descripción",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(cbTipo.getSelectedItem().toString().equalsIgnoreCase("Valor Alarma") ||
                cbTipo.getSelectedItem().toString().equalsIgnoreCase("Valor Actual")){
            try{
                Integer.parseInt(tfDescripcion.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Debe ingresar un número",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }        
        }
        if(cbTipo.getSelectedItem().toString().equalsIgnoreCase("Estado")){
            if (!(Integer.parseInt(tfDescripcion.getText()) ==0 || Integer.parseInt(tfDescripcion.getText())==1)) {
                    JOptionPane.showMessageDialog(null,
                 "Debe ingrese solo números binarios cuando se busca  un valor estado",
                 "Ingreso",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    
    public void consultarRegistros() throws Exception{
        if(formularioValido()){
            try{
                ArrayList<Sensor> sesnores = ArchivoS.obtener_registros();
            ArrayList<Sensor> resultado = new ArrayList<>();
            String tipo = cbTipo.getSelectedItem().toString();
            String descripcion = tfDescripcion.getText();
            
            if(tipo.equalsIgnoreCase("Todos")){
                    resultado = sesnores;                
            }else{
                for (Sensor p:sesnores) {
                    if(tipo.equalsIgnoreCase("Id") && 
                            p.getId().toLowerCase().contains(descripcion.toLowerCase())){
                        resultado.add(p);
                    }else if(tipo.equalsIgnoreCase("Nombre") && 
                            p.getNombre().toLowerCase().contains(descripcion.toLowerCase())){
                        resultado.add(p);
                    }else if (tipo.equalsIgnoreCase("Fabricante") && 
                            p.getFabricante().toLowerCase().contains(descripcion.toLowerCase())) {
                        resultado.add(p);
                    }else if (tipo.equalsIgnoreCase("Modelo") && 
                            p.getModelo().toLowerCase().contains(descripcion.toLowerCase())) {
                        resultado.add(p);
                    }else if (tipo.equalsIgnoreCase("Ubicacion") && 
                            p.getUbicacion().toLowerCase().contains(descripcion.toLowerCase())) {
                        resultado.add(p);
                    }else if (tipo.equalsIgnoreCase("Estado") && 
                            String.valueOf(p.getEstado()).toLowerCase().contains(descripcion.toLowerCase())) {
                        resultado.add(p);
                    }else if (tipo.equalsIgnoreCase("Tipo") && 
                            p.getTipo().toLowerCase().contains(descripcion.toLowerCase())) {
                        resultado.add(p);
                    }else if (tipo.equalsIgnoreCase("Valor Alarma") && 
                            String.valueOf(p.getValorAlarma()).toLowerCase().contains(descripcion.toLowerCase())) {
                        resultado.add(p);
                    }else if (tipo.equalsIgnoreCase("Valor Actual") && 
                            String.valueOf(p.getValorActual()).toLowerCase().contains(descripcion.toLowerCase())) {
                        resultado.add(p);
                    }
                }                
            }
                          
            DefaultTableModel dtm = (DefaultTableModel)tResultado.getModel();
            dtm.setRowCount(0);

            for(Sensor s:resultado){
                Vector fila = new Vector();
                fila.add(s.getId());
                fila.add(s.getNombre());
                fila.add(s.getFabricante());
                fila.add(s.getModelo());
                fila.add(s.getUbicacion());
                fila.add(s.getEstado());
                fila.add(s.getTipo());
                fila.add(s.getDescripcion());
                fila.add(s.getValorActual());
                fila.add(s.getValorAlarma());
                dtm.addRow(fila);                
            }
           }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Ocurrió un error al consultar los registros",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
            }            
        }
    }
    
    private void bConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultarActionPerformed
        try {
            // TODO add your handling code here:
            consultarRegistros();
        } catch (Exception ex) {
            Logger.getLogger(frmSensor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(frmSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSensor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmSensor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConsultar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tResultado;
    private javax.swing.JTextField tfDescripcion;
    // End of variables declaration//GEN-END:variables
}
