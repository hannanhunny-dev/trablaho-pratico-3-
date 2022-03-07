package model;

public abstract class Pessoa {

	private String nome;
	private String dataDeNascimento;
	private String cpf;
	private String email;
	private String senha;

	protected Pessoa(String nome, String dataDeNascimento, String cpf, String email, String senha) {
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}

	protected Pessoa(String nome, String senha) { // vai devolver nome e senha do usaurio
		this.nome = nome;
		this.senha = senha;
	}

	protected Pessoa() {

	}

	// setter and getter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	// setter and getter end

	// methods
	public void cadastrar(Pessoa p) {
		// Null
	}

	public void buscar(String name) {
		// Null
	}

	public void editar() {
		// Null
	}

	public void deletar(Pessoa p) {
		// Null
	}

}
