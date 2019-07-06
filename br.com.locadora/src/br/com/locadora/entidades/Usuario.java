/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.entidades;

/**
 *
 * @author JAVA
 */
public class Usuario {
    
    private int id_usuario;
    private Conta conta;
    private Veiculo veiculo;

    public Usuario() {
    }
    

    public Usuario(int idUsuario, Conta conta, Veiculo veiculo) {
        this.id_usuario = idUsuario;
        this.conta = conta;
        this.veiculo = veiculo;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
 
    
}
