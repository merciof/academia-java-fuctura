/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fuctura.loja;

/**
 *
 * @author JAVA
 */
class Venda {
    private Cliente cliente;
    private Vendedor vendedor;
    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    

    public Venda(Cliente cliente, Vendedor vendedor, float comissao) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.comissao = comissao;
    }

    public Venda() {
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void executarVenda(Loja loja) {
        //depositar 90% do valor do automovel na contaJuridica da loja
        //depositar 10% do valod do automovel na contaFisica do vendedor
        //depositar a diferença, caso o vendedor consiga vender mais caro, na contaFisica do vendedor
        //remover o automovel da lista da loja
        
        double valorProposta;
        double precoProposta = 0;
        double desconto = 0;
        double precoAutomovel = 0;
        
        double dinheiroLoja;
        double dinheiroVendedor;
            
        
        valorProposta = this.cliente.getProposta().getValor();
        precoProposta = this.cliente.getProposta().getValor();
        desconto = this.cliente.getProposta().getDesconto();
        precoAutomovel = this.cliente.getProposta().getAutomovel().getPreco();
        
            
        dinheiroLoja = (precoAutomovel - desconto) * (1 - comissao); 
        
        dinheiroVendedor = (valorProposta - precoAutomovel - desconto) + comissao * precoAutomovel;
        
        this.cliente.getContaFisica().retirar(dinheiroLoja + dinheiroVendedor);
        
        this.vendedor.getContaFisica().depositar(dinheiroVendedor);
        
        loja.getContaJuridica().depositar(dinheiroVendedor);
        
        System.out.println("Venda executada.");
        
    }
}
   

