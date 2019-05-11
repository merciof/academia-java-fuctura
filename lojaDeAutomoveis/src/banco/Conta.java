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
public class Conta {
    private String numero;
    private String saldo;
    private String limite;

    public Conta(String numero, String saldo, String limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }
}
