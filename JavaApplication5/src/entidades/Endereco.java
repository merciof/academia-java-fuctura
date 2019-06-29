/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author JAVA
 */
@Entity
@Table(name="endereco")
public class Endereco {
    
    @Id
    @Column(name="ID_ENDERECO")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENDERECO")
    @SequenceGenerator(sequenceName = "S_ID_ENDERECO", name = "ENDERECO")
    private int id_endereco;
    
    @Column(name="RUA")
    private String logradouro;
    
    @Column(name="CIDADE")
    private String cidade;
    
    @Column(name="NUMERO")
    private Integer numero;
    
    @Column(name="ESTADO")
    private String estado;

    public Endereco(String logradouro, String cidade, Integer numero, String estado) {
        //this.id_endereco = id_endereco;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.numero = numero;
        this.estado = estado;
    }

    public Endereco() {
    }

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }
    
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }   
}
