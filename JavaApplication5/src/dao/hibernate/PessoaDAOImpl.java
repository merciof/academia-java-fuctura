/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.hibernate;

import entidades.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author JAVA
 */
public class PessoaDAOImpl implements dao.interfaces.PessoaDAO {

    private EntityManager em;
    private EntityTransaction et;
    
    @Override
    public void inserir(Pessoa pessoa) {
        try {
            et = em.getTransaction();
            et.begin();
            em.persist(pessoa);
            et.commit();
        } catch (Exception e) {
            System.out.println("Erro ao tentar inserir endereco: " + e.getMessage());
        }
    }

    @Override
    public void deletar(Pessoa pessoa) {
        try {
            et.begin();
            em.remove(pessoa);
            et.commit();
        } catch (Exception e) {
            System.out.println("Erro transação: " + e.getMessage());
        } finally {
            em.close();
        }
    }

    @Override
    public void atualizar(Pessoa pessoa) {
            et = em.getTransaction();
            et.begin();
            em.merge(pessoa);
            et.commit();
    }

    @Override
    public Pessoa selecionar(String cpf) {
         Pessoa pessoa = new Pessoa();
        try {
            pessoa = em.find(Pessoa.class, cpf);
        } catch (Exception e) {
            
        }
            return pessoa;
    }

    @Override
    public List<Pessoa> listarPessoa() {
         Query query = em.createQuery("FROM PESSOA P");
          List<Pessoa> listar = query.getResultList();
          em.close();
          return listar;
    }
    
}
