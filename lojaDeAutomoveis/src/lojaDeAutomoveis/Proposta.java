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
public class Proposta {
    private String automovel;
    private String valor;
    private String desconto;

    public Proposta(String automovel, String valor, String desconto) {
        this.automovel = automovel;
        this.valor = valor;
        this.desconto = desconto;
    }

    public Proposta() {
    }
    

    public String getAutomovel() {
        return automovel;
    }

    public void setAutomovel(String automovel) {
        this.automovel = automovel;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }
    
}
