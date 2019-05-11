/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.loja;

import br.com.fuctura.banco.ContaJuridica;
import java.util.ArrayList;

/**
 *
 * @author JAVA
 */
public class Loja {

    private ArrayList<Automovel> listaAutomoveis;
    private Endereco endereco;
    private ContaJuridica contaJuridica;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Venda> listaDeVendas;

    public Loja() {
    }
    
    public Loja(ArrayList<Automovel> listaAutomoveis, Endereco endereco, ContaJuridica contaJuridica, ArrayList<Cliente> listaClientes, ArrayList<Venda> listaDeVendas) {
        this.listaAutomoveis = listaAutomoveis;
        this.endereco = endereco;
        this.contaJuridica = contaJuridica;
        this.listaClientes = listaClientes;
        this.listaDeVendas = listaDeVendas;
    }

    public ArrayList<Automovel> getListaAutomoveis() {
        return listaAutomoveis;
    }

    public void setListaAutomoveis(ArrayList<Automovel> listaAutomoveis) {
        this.listaAutomoveis = listaAutomoveis;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ContaJuridica getContaJuridica() {
        return contaJuridica;
    }

    public void setContaJuridica(ContaJuridica contaJuridica) {
        this.contaJuridica = contaJuridica;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Venda> getListaDeVendas() {
        return listaDeVendas;
    }

    public void setListaDeVendas(ArrayList<Venda> listaDeVendas) {
        this.listaDeVendas = listaDeVendas;
    }
   
    
    
}
