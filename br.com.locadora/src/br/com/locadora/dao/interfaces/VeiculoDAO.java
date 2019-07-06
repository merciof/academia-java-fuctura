/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dao.interfaces;

import br.com.locadora.entidades.Veiculo;
import java.util.List;

/**
 *
 * @author JAVA
 */
public interface VeiculoDAO {
    public void inserir(Veiculo veiculo);
    public void deletar(Veiculo veiculo);
    public void atualizar(Veiculo veiculo);
    public Veiculo selecionar(int  idVeiculo);
    public List<Veiculo> listarVeiculo(); 
}
