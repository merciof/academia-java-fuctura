package entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PERGUNTA")
public class Pergunta {

	@Id
	@Column(name = "ID_PERGUNTA")
	@GeneratedValue(generator = "S_ID_PERGUNTA")
	@SequenceGenerator(name = "S_ID_PERGUNTA", sequenceName = "S_ID_PERGUNTA", allocationSize = 5)
	private int id;

	@Column(name = "TITULO")
	private String titulo;
	
	@Column(name = "DESCRICAO")
	private String descricao;

	@Column(name = "DATA_CRIACAO")
	private Date dataCriacao;

	@JoinColumn(name = "CPF_USUARIO", referencedColumnName = "CPF")
	@OneToOne
	private Usuario usuario;

	@Column(name = "ATIVO")
	private String ativo;

	@JoinColumn(name = "ID_PERGUNTA", referencedColumnName = "ID_PERGUNTA")
	@OneToMany
	private List<Resposta> respostas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public List<Resposta> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
		Pergunta other = (Pergunta) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Pergunta() {
	}

	public Pergunta(int id, String descricao, Date dataCriacao, Usuario usuario, String ativo,
			List<Resposta> respostas) {
		this.id = id;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.usuario = usuario;
		this.ativo = ativo;
		this.respostas = respostas;
	}

}
