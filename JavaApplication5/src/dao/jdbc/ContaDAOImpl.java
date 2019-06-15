/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.jdbc;

import entidades.Conta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Conexao;
import dao.interfaces.ContaDAO;

/**
 *
 * @author JAVA
 */
public class ContaDAOImpl implements ContaDAO {
     Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    
    public void inserir(Conta conta) {
        String sql = "INSERT INTO CONTA (ID_CONTA,NUMERO,SALDO,LIMITE) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, conta.getId_conta());
            ps.setInt(2, conta.getNumero());
            ps.setDouble(3, conta.getSaldo());
            ps.setDouble(4, conta.getLimite()); 
            ps.execute();
            System.out.println("conta inserida com sucesso");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  finally {
            conexao.closeConnection(connection);
        } 
    }
    
    public void deletar(int idConta) {
        
        String sql = "DELETE FROM CONTO WHERE ID_CONTA = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idConta);
            ps.execute();
            System.out.println("Endereco deletado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao tentar deletar endereco: " + e.getMessage());
            
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
    
    public Conta selecionar(int idConta) {
        String sql = "SELECT * FROM CONTA WHERE ID_ENDERECO = ?";
        Conta conta = new Conta();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            conta.setId_conta(rs.getInt("ID_CONTA"));
            conta.setNumero(rs.getInt("NUMERO"));
            conta.setSaldo(rs.getDouble("SALDO"));
            conta.setLimite(rs.getDouble("LIMITE"));
            
        } catch (Exception e) {
            System.out.println("Erro ao tentar pesquisar enderecos: " + e.getMessage());
        } finally {
            conexao.closeConnection(connection);
        }
        
        return conta;
    }
    
    public List<Conta> listarEndereco() {
        String sql = "SELECT * FROM CONTA";
        List<Conta> retorno = new ArrayList<Conta>();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                Conta conta = new Conta();
                conta.setId_conta(rs.getInt("ID_CONTA"));
                conta.setNumero(rs.getInt("NUMERO"));
                conta.setSaldo(rs.getDouble("SALDO"));
                conta.setLimite(rs.getDouble("LIMITE"));
                retorno.add(conta);    
            } 
            
        } catch (Exception e) {
            System.out.println("Erro ao tentar pesquisar enderecos: " + e.getMessage());
        } finally {
            conexao.closeConnection(connection);
        }
        
        return retorno;
    }

}
