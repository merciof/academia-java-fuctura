/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author JAVA
 */
public class Endereco {
    
    private int id_endereco;
    private String logradouro;
    private String cidade;
    private Integer numero;
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
