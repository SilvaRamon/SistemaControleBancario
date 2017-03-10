/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontrolebancario.Model.Bo;

import sistemacontrolebancario.Model.Dominio.Conta;
import sistemacontrolebancario.Model.Dominio.ContaCorrente;

/**
 *
 * @author Ranna Lys
 */
public class OperacoesBancarias {
    
    public OperacoesBancarias() {
    }
    
    public boolean sacar(Conta conta, double valorSaque){     
        double saldo = conta.getSaldo();
        double saqueMinimo = 20;
        
        if((saldo > 0) && (valorSaque >= saqueMinimo) && (saldo >= valorSaque)){
            double novoSaldo = saldo - valorSaque;
            conta.setSaldo(novoSaldo);
            return true;
        }
        
        return false;
    }
    
    public boolean sacarLimiteEspecial(ContaCorrente conta, double valorSaque){     
        double saldo = conta.getSaldo();
        double limite = conta.getLimite();
        double saqueMinimo = 20;
        
        if((saldo > 0) && (valorSaque >= saqueMinimo) && (saldo + limite >= valorSaque)){
            double novoSaldo = saldo - valorSaque;
            conta.setSaldo(novoSaldo);
            return true;
        }
        
        return false;
    }
    
    public boolean depositar(Conta conta, double valor){
        Double saldo = conta.getSaldo();
        
        saldo += valor;
        
        conta.setSaldo(saldo);
        
        return true;
    }
    
    public boolean transferir(Conta conta1, Conta conta2, double valorTransferencia){
        double saldoConta1 = conta1.getSaldo();
        double saldoConta2 = conta2.getSaldo();
        double saqueMinimo = 20;
        
        if((saldoConta1 > 0) && (valorTransferencia >= saqueMinimo) && (saldoConta1 >= valorTransferencia)){
            double taxa = (valorTransferencia * 0.03);
            double novoSaldoConta1 = saldoConta1 - valorTransferencia - taxa;
            double novoSaldoConta2 = saldoConta2 + valorTransferencia;
            
            conta1.setSaldo(novoSaldoConta1);
            conta2.setSaldo(novoSaldoConta2);
            return true;
        }
        return true;
    }
}
