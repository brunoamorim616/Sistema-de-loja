/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.sisloj;

import br.senai.sc.sisloj.views.CadastroCliente;
import br.senai.sc.sisloj.views.Index;
import br.senai.sc.sisloj.views.PainelAmarelo;
import br.senai.sc.sisloj.views.PainelRosa;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class SisLojFrame extends javax.swing.JFrame {

    /**
     * Creates new form SisLojFrame
     */
    public SisLojFrame() {
        initComponents();
        
        Index ind = new Index();
        painelPrincipal.add(ind, "painelInicial");
        
        PainelRosa pRosa = new PainelRosa();
        PainelAmarelo pAmarelo = new PainelAmarelo();
        
        painelPrincipal.add(pRosa, "painelRosa");
        painelPrincipal.add(pAmarelo, "painelAmarelo");
        
        CadastroCliente cCliente = new CadastroCliente();
        painelPrincipal.add(cCliente, "painelCadastroCliente");
        
        
        
        
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        barraDeMenu = new javax.swing.JMenuBar();
        menCliente = new javax.swing.JMenu();
        menCadastrarCliente = new javax.swing.JMenuItem();
        menListarCliente = new javax.swing.JMenuItem();
        menProduto = new javax.swing.JMenu();
        menCadastrarProduto = new javax.swing.JMenuItem();
        menListarProdutos = new javax.swing.JMenuItem();
        menProdutosEmFalta = new javax.swing.JMenuItem();
        menPaineisColoridos = new javax.swing.JMenu();
        painelAmarelo = new javax.swing.JMenuItem();
        painelRosa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        painelPrincipal.setLayout(new java.awt.CardLayout());

        menCliente.setText("Cliente");

        menCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menCadastrarCliente.setText("Cadastrar Cliente");
        menCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCadastrarClienteActionPerformed(evt);
            }
        });
        menCliente.add(menCadastrarCliente);

        menListarCliente.setText("Listar Clientes");
        menCliente.add(menListarCliente);

        barraDeMenu.add(menCliente);

        menProduto.setText("Produto");

        menCadastrarProduto.setText("CadastrarProduto");
        menProduto.add(menCadastrarProduto);

        menListarProdutos.setText("Listar Produtos");
        menProduto.add(menListarProdutos);

        menProdutosEmFalta.setText("Produtos em Falta");
        menProduto.add(menProdutosEmFalta);

        barraDeMenu.add(menProduto);

        menPaineisColoridos.setText("Paineis Coloridos");

        painelAmarelo.setText("Painel Amarelo");
        painelAmarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelAmareloActionPerformed(evt);
            }
        });
        menPaineisColoridos.add(painelAmarelo);

        painelRosa.setText("Painel Rosa");
        painelRosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                painelRosaActionPerformed(evt);
            }
        });
        menPaineisColoridos.add(painelRosa);

        barraDeMenu.add(menPaineisColoridos);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCadastrarClienteActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelCadastroCliente");
    }//GEN-LAST:event_menCadastrarClienteActionPerformed

    private void painelAmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelAmareloActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelAmarelo");
        
    }//GEN-LAST:event_painelAmareloActionPerformed

    private void painelRosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_painelRosaActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "painelRosa");
    }//GEN-LAST:event_painelRosaActionPerformed

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
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SisLojFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SisLojFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JMenuItem menCadastrarCliente;
    private javax.swing.JMenuItem menCadastrarProduto;
    private javax.swing.JMenu menCliente;
    private javax.swing.JMenuItem menListarCliente;
    private javax.swing.JMenuItem menListarProdutos;
    private javax.swing.JMenu menPaineisColoridos;
    private javax.swing.JMenu menProduto;
    private javax.swing.JMenuItem menProdutosEmFalta;
    private javax.swing.JMenuItem painelAmarelo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JMenuItem painelRosa;
    // End of variables declaration//GEN-END:variables
}
