/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import entidades.Conta;
import java.util.List;

/**
 *
 * @author JAVA
 */
public interface ContaDAO {
    public void inserir(Conta conta);
    public void deletar(int idConta);
    public void atualizar(Conta conta);
    public Conta selecionar(int idConta);
    public List<Conta> listarEndereco();   
}
