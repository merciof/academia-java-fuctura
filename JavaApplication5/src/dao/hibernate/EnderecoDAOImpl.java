/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.hibernate;

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
public class EnderecoDAOImpl implements dao.interfaces.EnderecoDAO{

        private EntityManager em;
        private EntityTransaction et;
    
    @Override
    public void inserir(Endereco endereco) {
           try {
            et = em.getTransaction();
            et.begin();
            em.persist(endereco);
            et.commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir endereco: " + e.getMessage());
        }
    }

    @Override
    public void deletar(Endereco endereco) {
         try {
            et.begin();
            em.remove(endereco);
            et.commit();
        } catch (Exception e) {
            System.out.println("Erro transação: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizar(Endereco endereco) {
            et = em.getTransaction();
            et.begin();
            em.merge(endereco);
            et.commit();
    }

    @Override
    public Endereco selecionar(int idEndereco) {
       Endereco endereco = new Endereco();
        try {
            endereco = em.find(Endereco.class, idEndereco);
        } catch (Exception e) {
            
        }
            return endereco;
    }

    @Override
    public List<Endereco> listarEndereco() {
          Query query = em.createQuery("FROM ENDERECO e");
          List<Endereco> listar = query.getResultList();
          em.close();
          return listar;
    }
    
}
