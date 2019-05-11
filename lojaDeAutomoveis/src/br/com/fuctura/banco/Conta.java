/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.banco;

/**
 *
 * @author JAVA
 */
public class Conta {
    private String numero;
    private double saldo;
    private double limite;

    public Conta(String numero, double saldo, double limite) {
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    
    public void retirar(double valor) {
        this.saldo = this.saldo - valor;
    }
    
    
}
