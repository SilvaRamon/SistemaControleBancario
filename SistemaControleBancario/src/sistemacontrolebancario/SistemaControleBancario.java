/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontrolebancario;

import java.util.Date;
import sistemacontrolebancario.Model.Dao.ContaPoupancaDao;
import sistemacontrolebancario.Model.Dominio.Conta;
import sistemacontrolebancario.Model.Dominio.ContaPoupanca;
import sistemacontrolebancario.View.TelaInicialGUI;

/**
 *
 * @author Ranna Lys
 */
public class SistemaControleBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        OperacoesBancarias b = new OperacoesBancarias();
//        
//        ContaCorrente cc = new ContaCorrente();
//        ContaPoupanca cp = new ContaPoupanca();
//        ContaPoupanca cpp = new ContaPoupanca();
//        
//        cc.setLimiteEspecial(200);
//        
//        b.depositar(cc, 1000);
//        b.depositar(cpp, 200);
//        
//        System.out.println(cpp.getSaldo() + ", " + cp.getSaldo());
//        
//        b.transferir(cpp, cp, 100);
//        
//        System.out.println(cpp.getSaldo() + ", " + cp.getSaldo());
//        System.out.println();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialGUI().setVisible(true);
            }
        });
    }
}