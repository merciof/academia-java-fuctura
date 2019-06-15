/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.jdbc;

import entidades.Conta;
import entidades.Endereco;
import entidades.Pessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Conexao;

/**
 *
 * @author JAVA
 */
public class PessoaDAOImpl {
    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    
    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO PESSOA (ID_PESSOA,NOME,CPF,IDADE,SEXO,ENDERECO,CONTA) VALUES(?,?,?,?,?,?,?)";
        
        EnderecoDAOImpl endereco = new EnderecoDAOImpl();
        ContaDAOImpl conta = new ContaDAOImpl();
        
        endereco.inserir(pessoa.getEndereco());
        conta.inserir(pessoa.getConta());
     
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, pessoa.getId_pessoa());
            ps.setString(2, pessoa.getNome());
            ps.setString(3, pessoa.getCpf());
            ps.setString(4, pessoa.getIdade());
            ps.setString(5, pessoa.getSexo());
            ps.setInt(6, pessoa.getEndereco().getId_endereco());
            ps.setInt(6, pessoa.getConta().getId_conta());
            ps.execute();
            System.out.println("Pessoa inserido com sucesso");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  finally {
            conexao.closeConnection(connection);
        } 
    }
    
    public void deletar(int idPessoa) {
        
        String sql = "DELETE FROM PESSOA WHERE ID_ENDERECO = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idPessoa);
            ps.execute();
            System.out.println("Objeto do tipo Pessoa deletado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao tentar deletar objeto do tipo Pessoa: " + e.getMessage());
            
        } finally {
            conexao.closeConnection(connection);
        }
    }
    
    public void atualizar(String sql) {
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao tentar atualizar endereco: " + e.getMessage());
        } finally {
            conexao.closeConnection(connection);
        }  
    }
    
    public void selecionar(int idPessoa) {
        String sql = "SELECT * FROM PESSOA WHERE ID_ENDERECO = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idPessoa);
            ps.execute();
            System.out.println("Objeto selecionado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            
        } finally {
            conexao.closeConnection(connection);
        }
    }
    
    public List<Pessoa> listarEndereco() {
        String sql = "SELECT * FROM PESSOA";
        List<Pessoa> retorno = new ArrayList<Pessoa>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Pessoa pessoa = new Pessoa();
                Endereco endereco = new Endereco();
                Conta conta = new Conta();

               conta.setId_conta(rs.getInt("ID_CONTA"));
               conta.setNumero(rs.getInt("NUMERO"));
               conta.setSaldo(rs.getDouble("SALDO"));
               conta.setLimite(rs.getDouble("LIMITE"));
             
               endereco.setId_endereco(rs.getInt("ID_ENDERECO"));
               endereco.setLogradouro(rs.getString("LOGRADOURO"));
               endereco.setCidade(rs.getString("CIDADE"));
               endereco.setNumero(rs.getInt("NUMERO"));
               endereco.setEstado(rs.getString("ESTADO"));
               
                pessoa.setNome(rs.getString("NOME"));
                pessoa.setCpf(rs.getString("CPF"));
                pessoa.setIdade(rs.getString("IDADE"));
                pessoa.setSexo(rs.getString("SEXO"));
                pessoa.setEndereco(endereco);
                retorno.add(pessoa);    
    
            } 
            
        } catch (Exception e) {
            System.out.println("Erro ao tentar pesquisar enderecos: " + e.getMessage());
        } finally {
            conexao.closeConnection(connection);
        }
        
        return retorno;
    }
}
