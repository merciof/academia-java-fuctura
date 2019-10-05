package entidades;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class VotacaoUsuarioPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "ID_VOTACAO")
	private Votacao votacao;

	@ManyToOne
	@JoinColumn(name = "CPF_USUARIO")
	private Usuario usuario;

	public Votacao getVotacao() {
		return votacao;
	}

	public void setVotacao(Votacao votacao) {
		this.votacao = votacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result + ((votacao == null) ? 0 : votacao.hashCode());
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
		VotacaoUsuarioPK other = (VotacaoUsuarioPK) obj;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (votacao == null) {
			if (other.votacao != null)
				return false;
		} else if (!votacao.equals(other.votacao))
			return false;
		return true;
	}

	public VotacaoUsuarioPK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VotacaoUsuarioPK(Votacao votacao, Usuario usuario) {
		super();
		this.votacao = votacao;
		this.usuario = usuario;
	}

}
