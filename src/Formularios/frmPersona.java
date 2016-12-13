/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.Persona;
import archivo.ArchivoP;
import general.ValidacionP;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Angeluz
 */
public class frmPersona extends javax.swing.JFrame {

    /**
     * Creates new form frmPersona
     */
    public frmPersona() {
        initComponents();
        if(String.valueOf(cbTipo.getSelectedItem()).equals("Todos"))
            txtDescription.setEditable(false);
        else
            txtDescription.setEditable(true);   
        txtDescription.setText("");        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearch = new javax.swing.JButton();
        btnAcept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridResultados = new javax.swing.JTable();
        txtDescription = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda de Persona");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAcept.setText("Editar");
        btnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptActionPerformed(evt);
            }
        });

        gridResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombres", "Apellidos", "Nacionalidad", "Genero", "Fecha Nacimiento", "Direccion", "Estado Civil", "Profesion", "Trabaja?", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(gridResultados);

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Cedula", "Nombres", "Apellidos", "Nacionalidad", "Estado Civil", "Profesion", "Trabaja" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addContainerGap(490, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAcept)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcept)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Mantenimiento Persona");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        consultarRegistros();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void suca()
    {
        if(!String.valueOf(cbTipo.getSelectedItem()).equals("TODOS")){
            txtDescription.setEditable(true);
        }else if(String.valueOf(cbTipo.getSelectedItem()).equals("TODOS")){
            txtDescription.setEditable(false);
        }
                
        txtDescription.setText("");
    }
    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:        
        if(String.valueOf(cbTipo.getSelectedItem()).equals("Todos"))
            txtDescription.setEditable(false);
        else
            txtDescription.setEditable(true);   
        txtDescription.setText("");
    }//GEN-LAST:event_cbTipoActionPerformed

    private void btnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptActionPerformed
        // TODO add your handling code here:
        if(seleccionEdicionValida()){
            String cedula = String.valueOf(gridResultados.getValueAt(gridResultados.getSelectedRow(),0));
            boolean encontrado = false;
            Persona pEncontrado = null;
            try{
                ArrayList<Persona> personas = ArchivoP.obtener_registros();
                for (Persona p:personas) {
                    if(p.getId().equalsIgnoreCase(cedula)){
                        encontrado = true;
                        pEncontrado = p;
                        break;
                    }                    
                }
                if(encontrado){
                    frmEditarPersona frm = new frmEditarPersona(pEncontrado,this);
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
    }//GEN-LAST:event_btnAceptActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(seleccionEliminacionValida()){
            ArrayList<Persona> eliminados= new ArrayList<Persona>(); 
            for (int i = 0; i < gridResultados.getSelectedRows().length; i++) {
                Persona p = new Persona();
                p.setId(String.valueOf(gridResultados.getValueAt(gridResultados.getSelectedRows()[i],0)));
                eliminados.add(p);
            }
            try{
                ArrayList<Persona> registros = ArchivoP.obtener_registros();
                for (int i = 0; i < eliminados.size(); i++) 
                    registros.remove(ValidacionP.existePersona(registros, eliminados.get(i)));
                        
                if(ArchivoP.actualizar_registros(registros)){
                    JOptionPane.showMessageDialog(this,
                    "Se realizó la eliminación correctamente",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
                    consultarRegistros();
                }else {
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    public boolean seleccionEdicionValida(){
        
        if(gridResultados.getSelectedRowCount()!=1){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar un registro a editar",
                    "Edición",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;    
    }
    
    public boolean seleccionEliminacionValida(){
        if(gridResultados.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this,
                    "Debe seleccionar mínimo un registro a eliminar",
                    "Eliminación",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return JOptionPane.showConfirmDialog(null, "Desea Eliminar el Registro?", "Eliminar", JOptionPane.YES_NO_OPTION) 
                == JOptionPane.YES_OPTION; 
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPersona().setVisible(true);
        });        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcept;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JTable gridResultados;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDescription;
    // End of variables declaration//GEN-END:variables

    private void consultarRegistros() {
        if (formularioValido()) {
            try {
                ArrayList<Persona> personas = ArchivoP.obtener_registros();
                ArrayList<Persona> resultado = new ArrayList<>();
                String tipo = String.valueOf(cbTipo.getSelectedItem());
                String descripcion = txtDescription.getText();
                
                if(tipo.equals("Todos")){
                    resultado = personas;                
                }else{
                    for (Persona p:personas) {
                        if(tipo.equals("Cedula") && 
                                p.getId().toLowerCase().contains(descripcion.toLowerCase())){
                            resultado.add(p);
                        }else if(tipo.equals("Nombres") && 
                                p.getNombres().toLowerCase().contains(descripcion.toLowerCase())){
                            resultado.add(p);
                        }else if (tipo.equals("Apellidos") && 
                                p.getApellidos().toLowerCase().contains(descripcion.toLowerCase())) {
                            resultado.add(p);
                        }else if (tipo.equals("Nacionalidad") && 
                                p.getNacionalidad().toLowerCase().contains(descripcion.toLowerCase())) {
                            resultado.add(p);
                        }else if (tipo.equals("Estado Civil") && 
                                p.getEstadoCivil().toLowerCase().contains(descripcion.toLowerCase())) {
                            resultado.add(p);
                        }else if (tipo.equals("Profesion") && 
                                p.getProfesion().toLowerCase().contains(descripcion.toLowerCase())) {
                            resultado.add(p);
                        }else if (tipo.equals("Trabaja") && 
                                p.getTrabaja().toLowerCase().contains(descripcion.toLowerCase())) {
                            resultado.add(p);
                        }
                    }                
                }
                
                DefaultTableModel dtm = (DefaultTableModel) gridResultados.getModel();
                dtm.setRowCount(0);
                for (Persona p:resultado) {
                    Vector fila = new Vector();
                    fila.add(p.getId());
                    fila.add(p.getNombres());
                    fila.add(p.getApellidos());
                    fila.add(p.getNacionalidad());
                    fila.add(p.getGenero());
                    fila.add(p.getfNacimiento());
                    fila.add(p.getDireccion());
                    fila.add(p.getEstadoCivil());
                    fila.add(p.getProfesion());
                    fila.add(p.getTrabaja());
                    fila.add(p.getSueldo());
                    dtm.addRow(fila);
                }
            } catch (Exception e) {
            }
        }
    }

    private boolean formularioValido() {
        String tipo = String.valueOf(cbTipo.getSelectedItem());
        String descripcion = txtDescription.getText();
        if(!tipo.equalsIgnoreCase("TODOS") && descripcion.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this,
                    "Debe ingresar una descripción",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(tipo.equals("EDAD")){
            
            try{
                Integer.parseInt(descripcion);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,
                    "Para la edad debe ingresar un número",
                    "Consulta",
                    JOptionPane.ERROR_MESSAGE);
                return false;
            }    
        }        
        return true;
    }
}