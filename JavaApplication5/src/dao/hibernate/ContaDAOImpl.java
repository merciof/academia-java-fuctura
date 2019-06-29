/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.hibernate;

import dao.interfaces.ContaDAO;
import entidades.Conta;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author JAVA
 */
public class ContaDAOImpl implements ContaDAO {

    private EntityManager em;
    private EntityTransaction et;
    
    public ContaDAOImpl(EntityManager em) {
        this.em = em;
    }
    
    @Override
    public void inserir(Conta conta) {
            
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(conta);
            et.commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir conta: " + e.getMessage());
        }
        
       
    }

    @Override
    public void deletar(int idConta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conta selecionar(int idConta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Conta> listarEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
