/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisloj.views;

import br.senai.sc.sisloj.dao.ClienteDao;
import br.senai.sc.sisloj.modelo.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CadastroCliente extends javax.swing.JPanel {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        lTitulo = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        lEndereco = new javax.swing.JLabel();
        lBairro = new javax.swing.JLabel();
        lComplemento = new javax.swing.JLabel();
        lCEP = new javax.swing.JLabel();
        lCelular = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        cpEndereco = new javax.swing.JTextField();
        cpBairro = new javax.swing.JTextField();
        cpComplemento = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        cpCelular = new javax.swing.JFormattedTextField();
        cpCep = new javax.swing.JFormattedTextField();

        lTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lTitulo.setText("Cadastro Cliente");

        lNome.setText("Nome:");

        lEndereco.setText("Endereço:");

        lBairro.setText("Bairro:");

        lComplemento.setText("Complemento:");

        lCEP.setText("CEP:");

        lCelular.setText("Celular:");

        cpNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomeActionPerformed(evt);
            }
        });

        cpBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpBairroActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        try {
            cpCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(lTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNome)
                                .addGap(18, 18, 18)
                                .addComponent(cpNome))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lBairro)
                                    .addComponent(lCEP))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpCep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpBairro))))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpComplemento))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lCelular)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEnviar)
                        .addGap(54, 54, 54)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEndereco)
                    .addComponent(cpEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBairro)
                    .addComponent(cpBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lComplemento)
                    .addComponent(cpComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCEP)
                    .addComponent(lCelular)
                    .addComponent(cpCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpNomeActionPerformed

    private void cpBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpBairroActionPerformed
        
    }//GEN-LAST:event_cpBairroActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        Cliente cli = new Cliente();
        cli.setNomcli(cpNome.getText());
        cli.setEndcli(cpEndereco.getText());
        cli.setBaicli(cpBairro.getText());
        cli.setComcli(cpComplemento.getText());
        
        String cep = cpCep.getText(); 
        cep = cep.replaceAll("[^0-9]","");
        
        String celular = cpCelular.getText();
        celular = celular.replaceAll("[^0-9]","");
        
        cli.setCepcli(Long.parseLong(cep));
        cli.setCelcli(Long.parseLong(celular));
        
        ClienteDao cliDao = new ClienteDao();
        try {
            cliDao.inserir(cli);
            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir cliente!");
            Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JTextField cpBairro;
    private javax.swing.JFormattedTextField cpCelular;
    private javax.swing.JFormattedTextField cpCep;
    private javax.swing.JTextField cpComplemento;
    private javax.swing.JTextField cpEndereco;
    private javax.swing.JTextField cpNome;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lCEP;
    private javax.swing.JLabel lCelular;
    private javax.swing.JLabel lComplemento;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
