/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojaDeAutomoveis;

/**
 *
 * @author JAVA
 */
public class Loja {

    private String listaAutomoveis;
    private String endereco;
    private String contaJuridica;
    private String listaClientes;
    private String listaDeVendas;

    public Loja() {
    }
    
    public Loja(String listaAutomoveis, String endereco, String contaJuridica, String listaClientes, String listaDeVendas) {
        this.listaAutomoveis = listaAutomoveis;
        this.endereco = endereco;
        this.contaJuridica = contaJuridica;
        this.listaClientes = listaClientes;
        this.listaDeVendas = listaDeVendas;
    }

    public String getListaAutomoveis() {
        return listaAutomoveis;
    }

    public void setListaAutomoveis(String listaAutomoveis) {
        this.listaAutomoveis = listaAutomoveis;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContaJuridica() {
        return contaJuridica;
    }

    public void setContaJuridica(String contaJuridica) {
        this.contaJuridica = contaJuridica;
    }

    public String getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(String listaClientes) {
        this.listaClientes = listaClientes;
    }

    public String getListaDeVendas() {
        return listaDeVendas;
    }

    public void setListaDeVendas(String listaDeVendas) {
        this.listaDeVendas = listaDeVendas;
    }
   
    
    
}
