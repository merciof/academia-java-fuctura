package dao;

import java.util.List;

import entidades.Usuario;

public interface UsuarioDAO {
	
	public boolean criarUsuario(Usuario usuario);
	
	public void alterar(Usuario usuario);

	public void remover(Usuario usuario);

	public Usuario pesquisar(int id);

	public List<Usuario> listarTodos();

}
