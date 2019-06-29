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
    public void deletar(int idPessoa);
    public void atualizar(String sql);
    public Pessoa selecionar(int idPessoa);
    public List<Pessoa> listarEndereco();
}
