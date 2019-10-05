package controle;
import dao.PerguntaDAO;
import dao.PerguntaDAOImpl;
import dao.UsuarioDAO;
import dao.UsuarioDAOImpl;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import entidades.Pergunta;
import entidades.Resposta;
import entidades.Usuario;
import util.JpaUtil;

@ManagedBean(name="PerguntaBean")
@RequestScoped
public class PerguntaBean {
	
	Pergunta pergunta;
	List<Usuario> listUsuario;
	
	PerguntaDAO perguntaDAO;
	UsuarioDAO usuarioDAO;
	
	
	public PerguntaBean() {
		this.perguntaDAO = new PerguntaDAOImpl(JpaUtil.getEntityManager());
		this.usuarioDAO = new UsuarioDAOImpl(JpaUtil.getEntityManager());
		this.pergunta = new Pergunta();
		
		this.pergunta.setUsuario(new Usuario());
		
		this.listUsuario = this.usuarioDAO.listarTodos();
	}
	
	public void salvar() {
		
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public List<Usuario> getListUsuario() {
		return listUsuario;
	}

	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}
	
	
	
	
	
}
