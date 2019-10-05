package dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import entidades.Pergunta;

public class PerguntaDAOImpl implements PerguntaDAO {

	private EntityManager ent;

	public PerguntaDAOImpl(EntityManager ent) {
		this.ent = ent;
	}

	public boolean inserirPergunta(Pergunta pergunta) {

		EntityTransaction tx = ent.getTransaction();
		tx.begin();

//		ent.persist(pergunta);
		ent.merge(pergunta);
		tx.commit();

		return true;

	}

	public void alterar(Pergunta pergunta) {

		EntityTransaction tx = ent.getTransaction();
		tx.begin();

		ent.merge(pergunta);
		tx.commit();

	}

	public void remover(Pergunta pergunta) {

		EntityTransaction tx = ent.getTransaction();
		tx.begin();

		pergunta.setAtivo("N");

		ent.merge(pergunta);
		tx.commit();

	}

	public Pergunta pesquisar(int id) {

		Pergunta pergunta = ent.find(Pergunta.class, id);

		return pergunta;

	}

	public List<Pergunta> listarTodos() {

		Query query = ent.createQuery("from Pergunta p");

		@SuppressWarnings("unchecked")
		List<Pergunta> perguntas = query.getResultList();

		return perguntas;

	}

	public List<Pergunta> pesquisar(Pergunta pergunta, Date inicial, Date fim) {

		Query query = ent.createQuery("from Pergunta p where 1=1 " + montarWherePesquisa(pergunta, inicial, fim));
		List<Pergunta> perguntas = query.getResultList();
		return perguntas;
	}

	public String montarWherePesquisa(Pergunta pergunta, 
			Date inicial, Date fim) {

		String where = "";
		
		SimpleDateFormat dataSimples = new SimpleDateFormat("dd/MM/yyyy");

		if (inicial != null && fim != null) {
			where += " and p.dataCriacao between TO_DATE('"	+ dataSimples.format(inicial) + "', 'dd/mm/yyyy') " + 
				                           " and TO_DATE('" + dataSimples.format(fim) + "', 'dd/mm/yyyy') ";
		}
		
		if (pergunta.getTitulo() != null && !pergunta.getTitulo().isEmpty()) {
			where += " and UPPER(p.titulo) like UPPER('%" + pergunta.getTitulo() + "%') ";
		}

		if (pergunta.getUsuario() != null && pergunta.getUsuario().getCpf() != null
				&& !pergunta.getUsuario().getCpf().isEmpty()) {

			where += " and p.usuario.cpf = '" + pergunta.getUsuario().getCpf() + "'";
		}
		
		if (pergunta.getAtivo() != null && !pergunta.getAtivo().isEmpty()) {
			where += " and p.ativo = '" + pergunta.getAtivo() + "'";
		}

		return where;

	}
}
