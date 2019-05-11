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
public class Automovel {
    private String tipo;
    private String marca;
    private String anoFabricacao;
    private double preco;
    private String placa;

    public Automovel(String tipo, String marca, String anoFabricacao, double preco, String placa) {
        this.tipo = tipo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.placa = placa;
    }

    public Automovel() {
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
