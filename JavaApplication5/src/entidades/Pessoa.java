/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author JAVA
 */
@Entity
@Table(name="PESSOA")
public class Pessoa {
    
//    @Id
//    @Column(name="ID_PESSOA")
//    private int id_pessoa;
    
    @Column(name="NOME")
    private String nome;
    
    @Id
    @Column(name="CPF")
    private String cpf;
    
    @Column(name="IDADE")
    private String idade;
    
    private String sexo;
    
    
    @JoinColumn(name="ID_ENDERECO", referencedColumnName = "ID_ENDERECO")
    @OneToMany(cascade = CascadeType.ALL)
    private Endereco endereco;
   
    @JoinColumn(name="NUMERO_CONTA", referencedColumnName = "NUMERO")
    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    public Pessoa(String nome, String cpf, String idade, String sexo, Endereco endereco, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.conta = conta;
    }

    public Pessoa() {
    }

//    public int getId_pessoa() {
//        return id_pessoa;
//    }
//
//    public void setId_pessoa(int id_pessoa) {
//        this.id_pessoa = id_pessoa;
//    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
}
