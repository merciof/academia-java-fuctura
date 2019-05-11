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
public class Pessoa {
    private String nome;
    private String sexo;
    private String cpf;
    private Endereco endereco;
    private ContaFisica contaFisica;

    public Pessoa(String nome, String cidade, String sexo, String cpf, Endereco endereco, ContaFisica contaFisica) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contaFisica = contaFisica;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ContaFisica getContaFisica() {
        return contaFisica;
    }

    public void setContaFisica(ContaFisica contaFisica) {
        this.contaFisica = contaFisica;
    }
}
