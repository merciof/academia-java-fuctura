/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.loja;

import br.com.fuctura.banco.ContaFisica;

/**
 *
 * @author JAVA
 */
public class Cliente extends Pessoa{
    private Proposta proposta;

    public Cliente(Proposta proposta, String nome, String sexo, String cpf, Endereco endereco, ContaFisica contaFisica) {
        super(nome, sexo, cpf, endereco, contaFisica);
        this.proposta = proposta;
    }

    public Cliente() {
  
    }
    
   
    public Proposta getProposta() {
        return proposta;
    }

    public void setProposta(Proposta proposta) {
        this.proposta = proposta;
    }
    
}
