package dao;

import java.util.Date;
import java.util.List;

import entidades.Pergunta;

public interface PerguntaDAO {

	public boolean inserirPergunta(Pergunta pergunta);

	public void alterar(Pergunta pergunta);

	public void remover(Pergunta pergunta);

	public Pergunta pesquisar(int id);

	public List<Pergunta> listarTodos();

	public List<Pergunta> pesquisar(Pergunta pergunta, Date inicial, Date fim);
}
