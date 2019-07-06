/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import entidades.Pessoa;
import java.util.List;

/**
 *
 * @author JAVA
 */
public interface PessoaDAO {
    public void inserir(Pessoa pessoa);
    public void deletar(Pessoa pessoa);
    public void atualizar(Pessoa pessoa);
    public Pessoa selecionar(String cpf);
    public List<Pessoa> listarPessoa();
}
