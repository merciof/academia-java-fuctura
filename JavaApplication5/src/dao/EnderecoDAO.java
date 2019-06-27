/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Endereco;
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
public class EnderecoDAO {
    
    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    
    public void inserir(Endereco endereco) {
        
        String sql = "INSERT INTO ENDERECO (RUA,NUMERO,CIDADE,ESTADO) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, endereco.getLogradouro());
            ps.setInt(2, endereco.getNumero());
            ps.setString(3, endereco.getCidade());
            ps.setString(4, endereco.getEstado());
            //ps.setInt(5, endereco.getId_endereco());
            ps.execute();
            System.out.println("Inserido com sucesso");
            
        } catch (Exception e) {
            System.out.println("Erro na inserção de endereço " + e.getMessage());
        }  finally {
            conexao.closeConnection(connection);
        } 
    }
    
    public void deletar(int idEndereco) {
        
        String sql = "DELETE FROM ENDERECO WHERE ID_ENDERECO = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idEndereco);
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
    
    public Endereco selecionar(int idEndereco) {
        
        String sql = "SELECT * FROM ENDERECO WHERE ID_ENDERECO = ?";
        
        Endereco endereco = new Endereco();
        
        try {
            
            PreparedStatement ps = connection.prepareStatement(sql);  
            ps.setInt(1, idEndereco);
            ResultSet rs = ps.executeQuery();
            rs.next();
            endereco.setCidade(rs.getString("CIDADE"));
            endereco.setLogradouro(rs.getString("RUA"));
            endereco.setNumero(rs.getInt("NUMERO"));
            endereco.setEstado(rs.getString("ESTADO"));
            endereco.setId_endereco(rs.getInt("ID_ENDERECO"));

        } catch (Exception e) {
            System.out.println("Erro ao selecionar endereco: " + e.getMessage());
        }
        
        return endereco;
    }
    
    public List<Endereco> listarEndereco() {       
        
        String sql = "SELECT * FROM ENDERECO";
        
        List<Endereco> retorno = new ArrayList<Endereco>();
        
        try {        
            PreparedStatement ps = connection.prepareStatement(sql);         
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {             
                Endereco endereco = new Endereco();
                endereco.setCidade(rs.getString("CIDADE"));
                endereco.setLogradouro(rs.getString("LOGRADOURO"));
                endereco.setNumero(rs.getInt("NUMERO"));
                endereco.setEstado(rs.getString("ESTADO"));
                endereco.setId_endereco(rs.getInt("ID"));
                retorno.add(endereco);    
            } 
            
        } catch (Exception e) {
            System.out.println("Erro ao tentar pesquisar enderecos: " + e.getMessage());
        } finally {
            conexao.closeConnection(connection);
        }
        
        return retorno;
    }
        
}
