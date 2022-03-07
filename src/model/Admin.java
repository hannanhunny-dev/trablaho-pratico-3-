package model;

public class Admin extends Pessoa {
	
	public Admin(String nome, String data, String cpf, String email, String senha) {
        super(nome, data, cpf, email, senha);
    }
	
	public Admin(String nome, String senha) {
        super(nome, senha);
    }
	
	public Admin() {}
	
	

}
