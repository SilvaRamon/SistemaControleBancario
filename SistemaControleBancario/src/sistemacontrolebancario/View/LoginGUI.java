/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontrolebancario.View;

import javax.swing.JOptionPane;
import sistemacontrolebancario.Model.Dao.ContaCorrenteDao;
import sistemacontrolebancario.Model.Dao.ContaPoupancaDao;
import sistemacontrolebancario.Model.Dominio.ContaCorrente;
import sistemacontrolebancario.Model.Dominio.ContaPoupanca;

/**
 *
 * @author Ranna Lys
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
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

        labelLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelAgencia = new javax.swing.JLabel();
        labelNumeroConta = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        buttonLogar = new javax.swing.JButton();
        textFieldNumeroAgencia = new javax.swing.JFormattedTextField();
        textFieldNumeroConta = new javax.swing.JFormattedTextField();
        buttonLimpar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        labelTipoConta = new javax.swing.JLabel();
        comboBoxTipoConta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        labelLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelLogin.setText("Login");

        labelAgencia.setText("Número da Agência:");

        labelNumeroConta.setText("Número da Conta:");

        buttonLogar.setText("Logar");
        buttonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogarActionPerformed(evt);
            }
        });

        try {
            textFieldNumeroAgencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldNumeroAgencia.setToolTipText("Este campo deve conter exatamente 5 dígitos.");
        textFieldNumeroAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroAgenciaActionPerformed(evt);
            }
        });

        try {
            textFieldNumeroConta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textFieldNumeroConta.setToolTipText("Este campo deve conter exatamente 5 dígitos.");
        textFieldNumeroConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroContaActionPerformed(evt);
            }
        });

        buttonLimpar.setText("Limpar");
        buttonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparActionPerformed(evt);
            }
        });

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        labelTipoConta.setText("Tipo de Conta:");

        comboBoxTipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conta Corrente", "Conta Poupança" }));
        comboBoxTipoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldNumeroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboBoxTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLogin)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAgencia)
                    .addComponent(textFieldNumeroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumeroConta)
                    .addComponent(textFieldNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTipoConta)
                    .addComponent(comboBoxTipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLimpar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonLogar)
                        .addComponent(buttonVoltar)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogarActionPerformed
        // TODO add your handling code here:
        String numeroConta = textFieldNumeroConta.getText();
        String numeroAgencia = textFieldNumeroAgencia.getText();
        ContaCorrente contaCorrente;
        ContaPoupanca contaPoupanca;
        
        if(!"".equals(numeroConta) && !"".equals(numeroAgencia)){
            if(comboBoxTipoConta.getSelectedItem().equals("Conta Corrente")){
                ContaCorrenteDao dao = new ContaCorrenteDao();
                contaCorrente = (ContaCorrente) dao.findConta(numeroConta, numeroAgencia);
                
                if(contaCorrente != null){
                    OperacoesBancariasGUI opGui = new OperacoesBancariasGUI(contaCorrente);
                    opGui.show();
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Conta não existe.");
                    limparCampos();
                }
            }else{
                ContaPoupancaDao dao = new ContaPoupancaDao();
                contaPoupanca = (ContaPoupanca) dao.findConta(numeroConta, numeroAgencia);
                
                if(contaPoupanca != null){
                    OperacoesBancariasGUI opGui = new OperacoesBancariasGUI(contaPoupanca);
                    opGui.show();
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Conta não cadastrada.");
                    limparCampos();
                }
            }
        }else{
            JOptionPane.showMessageDialog(
                null, "Todos os campos devem ser preenchidos."
            );
        }
    }//GEN-LAST:event_buttonLogarActionPerformed

    private void textFieldNumeroContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroContaActionPerformed

    private void buttonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLimparActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        TelaInicialGUI telaInicial = new TelaInicialGUI();
        telaInicial.show();
        
        dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void comboBoxTipoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxTipoContaActionPerformed

    private void textFieldNumeroAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroAgenciaActionPerformed

    public void limparCampos(){
        textFieldNumeroAgencia.setText("");
        textFieldNumeroConta.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLimpar;
    private javax.swing.JButton buttonLogar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JComboBox<String> comboBoxTipoConta;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAgencia;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNumeroConta;
    private javax.swing.JLabel labelTipoConta;
    private javax.swing.JFormattedTextField textFieldNumeroAgencia;
    private javax.swing.JFormattedTextField textFieldNumeroConta;
    // End of variables declaration//GEN-END:variables
}