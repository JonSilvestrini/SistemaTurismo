/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.classes;

import javax.swing.JOptionPane;
import persistencia.Clientes;

/**
 *
 * @author JONATASWILLIAMSILVES
 */
public class FrmCadCli extends javax.swing.JFrame {

    /**
     * Creates new form FrmCadCli
     */
    public FrmCadCli() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCad = new javax.swing.JButton();
        btnCanc = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtFone = new javax.swing.JTextField();
        txtDN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jLabel1.setText("Nome");

        jLabel2.setText("Fone");

        jLabel3.setText("Data de Nascimento");

        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        btnCanc.setText("Cancelar");
        btnCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome)
                            .addComponent(txtFone)
                            .addComponent(txtDN, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCad)
                        .addGap(142, 142, 142)
                        .addComponent(btnCanc)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCad)
                    .addComponent(btnCanc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente cancelar o cadastro?","Cancelar",JOptionPane.YES_NO_OPTION)==0)
            this.dispose();
    }//GEN-LAST:event_btnCancActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        // TODO add your handling code here:
        String nome, fone, datanasc;
        nome = txtNome.getText();
        fone = txtFone.getText();
        datanasc = txtDN.getText();
        
        if (nome=="" || fone=="" || datanasc=="") {
            JOptionPane.showMessageDialog(rootPane, "Algum campo está em branco");
        } else{
            Clientes cliente = new Clientes();
            
        }

    }//GEN-LAST:event_btnCadActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnCanc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDN;
    private javax.swing.JTextField txtFone;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}