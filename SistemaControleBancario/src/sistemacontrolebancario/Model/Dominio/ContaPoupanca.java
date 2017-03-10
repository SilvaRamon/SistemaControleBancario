/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontrolebancario.Model.Dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Ranna Lys
 */
@Entity
@Table(name="conta")
@DiscriminatorValue("CP")
public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
        super();
    }
}
