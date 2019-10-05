package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import entidades.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	private EntityManager ent;

	public UsuarioDAOImpl(EntityManager ent) {
		this.ent = ent;
	}


	public boolean criarUsuario(Usuario usuario) {

		EntityTransaction tx = ent.getTransaction();
		tx.begin();

		ent.persist(usuario);
		tx.commit();

		return true;

	}


	public void alterar(Usuario usuario) {

		EntityTransaction tx = ent.getTransaction();
		tx.begin();

		ent.merge(usuario);
		tx.commit();

	}


	public void remover(Usuario usuario) {
		
	}


	public Usuario pesquisar(int id) {

		Usuario usuario = ent.find(Usuario.class, id);
		
		return usuario;
		
	}


	public List<Usuario> listarTodos() {

		Query query = ent.createQuery("from Usuario u");
		
		@SuppressWarnings("unchecked")
		List<Usuario> usuarios = query.getResultList();
	
		return usuarios;
		
	}

}
