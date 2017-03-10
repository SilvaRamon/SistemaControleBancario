/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontrolebancario.Model.Dominio;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Ranna Lys
 */
@Entity
@Table(name="conta")
@DiscriminatorValue("CC")
public class ContaCorrente extends Conta{
    @Column(name="limite")
    private double limite;

    public ContaCorrente() {
        super();
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
