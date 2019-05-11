/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.loja;

import banco.ContaFisica;

/**
 *
 * @author JAVA
 */
public class Vendedor extends Pessoa{
    
    private String matricula;

    public Vendedor(String matricula, String nome, String cidade, String sexo, String cpf, Endereco endereco, ContaFisica contaFisica) {
        super(nome, cidade, sexo, cpf, endereco, contaFisica);
        this.matricula = matricula;
    }

    public Vendedor() {
    }
    

    public String getCommisao() {
        return matricula;
    }

    public void setCommisao(String matricula) {
        this.matricula = matricula;
    }
    
}
