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
public class Vendedor extends Pessoa{
    
    private String commisao;

    public Vendedor(String commisao, String nome, String cidade, String sexo, String cpf, Endereco endereco, String contaFisica) {
        super(nome, cidade, sexo, cpf, endereco, contaFisica);
        this.commisao = commisao;
    }

    public Vendedor() {
    }
    

    public String getCommisao() {
        return commisao;
    }

    public void setCommisao(String commisao) {
        this.commisao = commisao;
    }
    
}
