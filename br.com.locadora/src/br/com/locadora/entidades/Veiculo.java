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
public class Veiculo {
    private String id_veiculo;
    private String marca;
    private String placa;
    private double valor;
    
    public Veiculo() {
        
    }

    public Veiculo(String id_veiculo, String marca, String placa, double valor) {
        this.id_veiculo = id_veiculo;
        this.marca = marca;
        this.placa = placa;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(String id_veiculo) {
        this.id_veiculo = id_veiculo;
    }
  
}
