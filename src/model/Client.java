package model;

import java.util.ArrayList;
import java.util.List;

public class Client extends Pessoa {
	private Pagamento pagamento;

	public Client(String nome, String data, String cpf, String email, String senha, Pagamento pagamento) {
		super(nome, data, cpf, email, senha);
		
		this.pagamento = pagamento;
	}
	
	public Client(String nome, String data, String cpf, String email, String senha) {
		super(nome, data, cpf, email, senha);
	}

	public Client(String nome, String senha) {
		super(nome, senha);
	}

	/**
	 * Construtor default
	 */
	public Client() {
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	
	}
	public void setPagamento(Pagamento pagamento) {
		 this.pagamento = pagamento;
	
	}
	
	
	
	// @Override
	    public void buscar(String name) {
	        // return arraylist of client
	    }

	  //  @Override
	    public void cadastrar(Pessoa p) {
	        // null
	    }

	    //@Override
	    public void deletar(Pessoa p) {
	        // null
	    }

	    //@Override
	    public void editar() {
	        // null
	    }
	    
	    public void IsPagamentoregister() {
	    //null
	    }
	    
	    
	    public String toString() {
	        return "Cliente: " 
	            + getNome() + "\n"
	            + "\n"
	            + "Data de nascimento: " 
	            + getDataDeNascimento() + "\n"
	            + "\n"
	            + "CPF: " 
	            + getCpf() + "\n"
	            + "\n" 
	            + "Email: " 
	            + getEmail() + "\n"
	            + "\n" 
	            + "Senha: " 
	            + getSenha() + "\n"
	            + "\n"
	            + getPagamento();
	            
	            	    }
	 

}
