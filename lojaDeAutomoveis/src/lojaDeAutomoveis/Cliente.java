/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaDeAutomoveis;

import banco.ContaFisica;

/**
 *
 * @author JAVA
 */
public class Cliente extends Pessoa{
    private String proposta;

    public Cliente(String proposta, String nome, String cidade, String sexo, String cpf, Endereco endereco, ContaFisica contaFisica) {
        super(nome, cidade, sexo, cpf, endereco, contaFisica);
        this.proposta = proposta;
    }

    public Cliente(String proposta) {
        this.proposta = proposta;
    }
    
   
    public String getProposta() {
        return proposta;
    }

    public void setProposta(String proposta) {
        this.proposta = proposta;
    }
    
}