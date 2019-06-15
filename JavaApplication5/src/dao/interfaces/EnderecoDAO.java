/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

import entidades.Endereco;
import java.util.List;

/**
 *
 * @author JAVA
 */
public interface EnderecoDAO {
    public void inserir(Endereco endereco);
    public void deletar(int idEndereco);
    public void atualizar(String sql);
    public Endereco selecionar(int idEndereco);
    public List<Endereco> listarEndereco(); 
}
