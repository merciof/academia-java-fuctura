/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.hibernate;

import dao.interfaces.ContaDAO;
import entidades.Conta;
import entidades.Endereco;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
    public void atualizar(Conta conta) {
            et = em.getTransaction();
            et.begin();
            em.merge(conta);
            et.commit();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conta selecionar(int idConta) {
        Endereco endereco = new Endereco();
        try {
            endereco = em.find(Endereco.class, idConta);
        } catch (Exception e) {
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Conta> listarEndereco() {
        Query query = em.createQuery("from Conta c");
        List<Conta> listar = query.getResultList();
        em.close();
        return listar;
        
    }
        
}
