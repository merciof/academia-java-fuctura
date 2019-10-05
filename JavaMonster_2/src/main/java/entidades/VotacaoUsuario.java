package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "VOTACAO_USUARIO")
public class VotacaoUsuario {

	@EmbeddedId
	private VotacaoUsuarioPK votacaoUsuarioPK;

	@Column(name = "DATA")
	private Date data;

	public VotacaoUsuarioPK getVotacaoUsuarioPK() {
		return votacaoUsuarioPK;
	}

	public void setVotacaoUsuarioPK(VotacaoUsuarioPK votacaoUsuarioPK) {
		this.votacaoUsuarioPK = votacaoUsuarioPK;
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
		result = prime * result + ((data == null) ? 0 : data.hashCode());
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
		VotacaoUsuario other = (VotacaoUsuario) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}

	public VotacaoUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VotacaoUsuario(VotacaoUsuarioPK votacaoUsuarioPK, Date data) {
		super();
		this.votacaoUsuarioPK = votacaoUsuarioPK;
		this.data = data;
	}

}
