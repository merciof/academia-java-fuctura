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
class Venda {
    private Cliente cliente;
    private Vendedor vendedor;

    public Venda(Cliente cliente, Vendedor vendedor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
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
   
}
