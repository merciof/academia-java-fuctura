/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.loja;

import banco.Conta;
import banco.ContaFisica;
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
        
        Endereco enderecoJoao = new Endereco("Rua das pedras","123456","Cordeiro","Recife","PE");
        
        ContaFisica contaJoao = new ContaFisica("123","123",100.0,200.0);
        
        //clientes.add(new Cliente("joao","M","123456",enderecoJoao,contaJoao,"1500"));
        
        
    }
    
}
