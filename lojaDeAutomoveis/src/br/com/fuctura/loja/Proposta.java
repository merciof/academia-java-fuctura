/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.loja;

/**
 *
 * @author JAVA
 */
public class Proposta {
    private Automovel automovel;
    private double valor;
    private double desconto;

    public Proposta(Automovel automovel, double valor, double desconto) {
        this.automovel = automovel;
        this.valor = valor;
        this.desconto = desconto;
    }

    public Proposta() {
    }
    

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
}
