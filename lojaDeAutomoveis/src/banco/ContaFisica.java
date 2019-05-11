/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author JAVA
 */
public class ContaFisica extends Conta{
    private String cpf;

    public ContaFisica(String cpf, String numero, String saldo, String limite) {
        super(numero, saldo, limite);
        this.cpf = cpf;
    }

    public ContaFisica() {
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
