package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "VOTACAO")
public class Votacao {

	@Id
	@Column(name = "ID_VOTACAO")
	@GeneratedValue(generator = "S_ID_VOTACAO")
	@SequenceGenerator(name = "S_ID_VOTACAO", sequenceName = "S_ID_VOTACAO", allocationSize = 5)
	private int id;
	
	@JoinColumn ( name = "ID_PERGUNTA", referencedColumnName = "ID_PERGUNTA" )
	@OneToOne
	private Pergunta pergunta;

	@Column(name = "DATA_INICIO")
	private Date dataInicio;
	
	@Column(name = "DATA_FIM")
	private Date dataFinal;

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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
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
		Votacao other = (Votacao) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Votacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Votacao(int id, Pergunta pergunta, Date dataInicio, Date dataFinal) {
		super();
		this.id = id;
		this.pergunta = pergunta;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
	}

}
