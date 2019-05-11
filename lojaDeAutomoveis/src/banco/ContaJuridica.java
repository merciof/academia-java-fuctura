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
public class ContaJuridica extends Conta{
    private String cnpj;

    public ContaJuridica(String cnpj, String numero, double saldo, double limite) {
        super(numero, saldo, limite);
        this.cnpj = cnpj;
    }

    public ContaJuridica() {
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    } 
}
