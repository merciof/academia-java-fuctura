package entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@Column(name = "CPF")
	private String cpf;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "SEXO")
	private String sexo;

	@Column(name = "DATA_NASCIMENTO")
	private Date dataNascimento;

	@Column(name = "EMAIL")
	private String email;

	@JoinColumn ( name = "CODIGO_PERFIL", referencedColumnName = "CODIGO" )
	@OneToOne
	private Perfil perfil;

	@JoinColumn ( name = "CODIGO_CURSO", referencedColumnName = "CODIGO" )
	@OneToOne
	private Curso curso;

	@Column(name = "ATIVO")
	private String ativo;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Usuario other = (Usuario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String cpf, String nome, String sexo, Date dataNascimento, String email, Perfil perfil,
			Curso curso, String ativo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.perfil = perfil;
		this.curso = curso;
		this.ativo = ativo;
	}

}
