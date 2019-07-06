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
import entidades.Pessoa;

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
    
    public void deletar(Conta conta) {
        
        String sql = "DELETE FROM CONTA WHERE ID_CONTA = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, conta.getId_conta());
            ps.execute();
            System.out.println("Conta deletada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao tentar deletar conta: " + e.getMessage());
            
        } finally {
            conexao.closeConnection(connection);
        }
    }
    
    public void atualizar(Conta conta) {
        
//        UPDATE table_name
//        SET column1 = value1, column2 = value2, ...
//        WHERE condition;

        String sql = "UPDATE CONTA SET ID_Conta = ?, NUMERO = ?, SALDO = ?, LIMITE = ? ";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, conta.getId_conta());
            ps.setInt(2, conta.getNumero());
            ps.setDouble(3, conta.getSaldo());
            ps.setDouble(3, conta.getLimite());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro ao tentar atualizar conta: " + e.getMessage());
        } finally {
            conexao.closeConnection(connection);
        }  
    }
    
    public Conta selecionar(int idConta) {
        String sql = "SELECT * FROM CONTA WHERE ID_ENDERECO = ?";
        Conta conta = new Conta();
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idConta);
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
    
    public List<Conta> listarConta() {
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
