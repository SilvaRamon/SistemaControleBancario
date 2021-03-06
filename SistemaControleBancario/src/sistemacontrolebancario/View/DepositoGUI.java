/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontrolebancario.View;

import javax.swing.JOptionPane;
import sistemacontrolebancario.Model.Bo.OperacoesBancarias;
import sistemacontrolebancario.Model.Dao.ContaDao;
import sistemacontrolebancario.Model.Dominio.ContaCorrente;
import sistemacontrolebancario.Model.Dominio.ContaPoupanca;

/**
 *
 * @author Ranna Lys
 */
public class DepositoGUI extends javax.swing.JFrame {
    private String tipoConta;
    private ContaCorrente contaCorrente;
    private  ContaPoupanca contaPoupanca;
    /**
     * Creates new form DepositoGUI
     */
    public DepositoGUI(ContaCorrente conta) {
        initComponents();
        this.tipoConta = "CC";
        this.contaCorrente = conta;
    }
    
    public DepositoGUI(ContaPoupanca conta) {
        initComponents();
        this.tipoConta = "CP";
        this.contaPoupanca = conta;
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        spinnerValor = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        buttonDepositar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Operação de Depósito");

        jLabel2.setText("Valor:");

        spinnerValor.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 10000.0d, 10.0d));
        spinnerValor.setToolTipText("Limite máximo de depósito: R$ 10.000,00");

        buttonDepositar.setText("Depositar");
        buttonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDepositarActionPerformed(evt);
            }
        });

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        OperacoesBancariasGUI operacoes;
        if(getTipoConta().equals("CC")){
            operacoes = new OperacoesBancariasGUI(contaCorrente);
            operacoes.show();
        }else{
            operacoes = new OperacoesBancariasGUI(contaPoupanca);
            operacoes.show();
        }
       
        dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDepositarActionPerformed
        OperacoesBancarias operacoes = new OperacoesBancarias();
        OperacoesBancariasGUI operacoesGui;

        Double valorDeposito = (Double) spinnerValor.getValue();
        
        if(getTipoConta().equals("CC")){
            if(operacoes.depositar(contaCorrente, valorDeposito)){
                ContaDao dao = new ContaDao();
                dao.update(contaCorrente);

                operacoesGui = new OperacoesBancariasGUI(contaCorrente);
                operacoesGui.show();

                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao sacar.");
            }
        }else{
            if(operacoes.depositar(contaPoupanca, valorDeposito)){
                ContaDao dao = new ContaDao();
                dao.update(contaPoupanca);

                operacoesGui = new OperacoesBancariasGUI(contaPoupanca);
                operacoesGui.show();

                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao sacar.");
            }
        }
    }//GEN-LAST:event_buttonDepositarActionPerformed

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDepositar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner spinnerValor;
    // End of variables declaration//GEN-END:variables
}
