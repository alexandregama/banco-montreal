package br.com.bancomontreal.usuario;

public class Usuario {

	private Long id;

	private String nome;

	private String login;

	private String password;
	
	public Usuario() {
	}
	
	public Usuario(Long id, String nome, String login, String password) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", login=" + login + ", password=" + password + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
