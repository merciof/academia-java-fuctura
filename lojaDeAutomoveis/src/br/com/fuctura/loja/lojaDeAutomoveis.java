/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.loja;

import br.com.fuctura.banco.Conta;
import br.com.fuctura.banco.ContaFisica;
import br.com.fuctura.banco.ContaJuridica;
import java.util.ArrayList;

/**
 *
 * @author JAVA
 */
public class lojaDeAutomoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        ArrayList<Venda> vendas = new ArrayList<Venda>();
        
        ArrayList<Automovel> automoveis = new ArrayList<Automovel>();
        
        Endereco enderecoJoao = new Endereco("Rua das pedras","123456","Cordeiro","Recife","PE");
        
        Endereco enderecoMaria = new Endereco("Rua das pedras","123456","Cordeiro","Recife","PE");
        
        ContaFisica contaJoao = new ContaFisica("123","123",30000.0,200.0);
        
        ContaFisica contaMaria = new ContaFisica("321","321",0,0);
        
        Automovel automovel = new Automovel("carro","wolksvagen","2005",25000,"123456");
        Proposta proposta = new Proposta(automovel, 20000, 1000);
            
        Cliente cliente = new Cliente(proposta,"joao","M","123456",enderecoJoao,contaJoao);
        
        Vendedor vendedor = new Vendedor("joao","M","123456",enderecoJoao,contaJoao,"123");
        
        Venda venda = new Venda(cliente, vendedor, (float) 0.1);
        
        Loja loja = new Loja(automoveis,enderecoJoao,new ContaJuridica("123456","123",0,0),clientes, vendas);
        
        venda.executarVenda(loja);

        
        System.out.println("Olá, mundo!");
        
        
        
        
        
    }
    
}
