/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.entidades;

import java.util.List;

/**
 *
 * @author JAVA
 */
public class Loja {
    
    private int id_loja;
    private List<Veiculo> veiculos;
    private String nome;
    private Conta conta;

    public Loja() {
    }

    public Loja(int id_loja, List<Veiculo> veiculos, String nome, Conta conta) {
        this.id_loja = id_loja;
        this.veiculos = veiculos;
        this.nome = nome;
        this.conta = conta;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public int getId_loja() {
        return id_loja;
    }

    public void setId_loja(int id_loja) {
        this.id_loja = id_loja;
    }

}
