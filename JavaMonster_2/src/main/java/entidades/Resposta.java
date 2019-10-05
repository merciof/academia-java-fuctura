package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESPOSTA")
public class Resposta {

	@Id
	@Column(name = "ID_RESPOSTA")
	private int id;
	
	@JoinColumn ( name = "ID_PERGUNTA", referencedColumnName = "ID_PERGUNTA" )
	@OneToOne
	private Pergunta pergunta;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@JoinColumn ( name = "CPF_USUARIO", referencedColumnName = "CPF" )
	@OneToOne
	private Usuario usuario;

	@Column(name = "DATA")
	private Date data;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resposta other = (Resposta) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Resposta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Resposta(int id, Pergunta pergunta, String descricao, Usuario usuario, Date data) {
		super();
		this.id = id;
		this.pergunta = pergunta;
		this.descricao = descricao;
		this.usuario = usuario;
		this.data = data;
	}

}
