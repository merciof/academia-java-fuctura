/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.jdbc;

import dao.interfaces.EnderecoDAO;
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
public class EnderecoDAOImpl implements EnderecoDAO{
    
    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();
    
    public void inserir(Endereco endereco) {
        String sql = "INSERT INTO ENDERECO (RUA,NUMERO,COMPLEMENTO) VALUES(?,?,?)";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, endereco.getLogradouro());
            ps.setInt(2, endereco.getNumero());
            ps.setString(3, endereco.getCidade());
            ps.execute();
            System.out.println("Inserido com sucesso");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }  finally {
            conexao.closeConnection(connection);
        } 
    }
    
    public void deletar(Endereco endereco) {
        
        String sql = "DELETE FROM ENDERECO WHERE ID_ENDERECO = ?";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, endereco.getId_endereco());
            ps.execute();
            System.out.println("Endereco deletado com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao tentar deletar endereco: " + e.getMessage());
            
        } finally {
            conexao.closeConnection(connection);
        }
    }
    
    public void atualizar(Endereco endereco) {
        
        String sql = "UPDATE CONTA SET ID_ENDERECO = ?, LOGRADOURO = ?, CIDADE = ?, NUMERO = ?, ESTADO = ? ";    
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, endereco.getId_endereco());
            ps.setString(2, endereco.getLogradouro());
            ps.setString(3, endereco.getCidade());
            ps.setInt(4, endereco.getNumero());
            ps.setString(3, endereco.getEstado());
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
            ResultSet rs = ps.executeQuery();
            
            endereco.setCidade(rs.getString("COMPLEMENTO"));
            endereco.setLogradouro(rs.getString("ID_ENDERECO"));
            endereco.setNumero(rs.getInt("NUMERO"));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
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
                endereco.setCidade(rs.getString("COMPLEMENTO"));
                endereco.setLogradouro(rs.getString("ID_ENDERECO"));
                endereco.setNumero(rs.getInt("NUMERO"));
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
