package model;



public class Pagamento {    //cartao de credito pra pagamento
	
	private String nomeroDoCartao;       //numero do cartao
	private String  nomeImpresso;           //nome impresso
	private String dataDevalidacao;         //data de validacao
	private int codigoDeSeguranca;            //codigodeseguranca

	
	public Pagamento() {}
	public Pagamento(String nomeroDoCartao,String  nomeImpresso,String dataDevalidacao,int codigoDeSeguranca) {       //constructor
		this.nomeroDoCartao = nomeroDoCartao;
		this.nomeImpresso = nomeImpresso;
		this.dataDevalidacao = dataDevalidacao;
		this.codigoDeSeguranca = codigoDeSeguranca;
		
		
	}
	//setter and getter
	
	public String getNomeroDoCartao() {
		return nomeroDoCartao;
	}
	public void setNomeroDoCartao(String nomeroDoCartao) {
		this.nomeroDoCartao = nomeroDoCartao;
	}
	public String getNomeImpresso() {
		return nomeImpresso;
	}
	public void setNomeImpresso(String nomeImpresso) {
		this.nomeImpresso = nomeImpresso;
	}
	public String getDataDevalidacao() {
		return dataDevalidacao;
	}
	public void setDataDevalidacao(String dataDevalidacao) {
		this.dataDevalidacao = dataDevalidacao;
	}
	public int getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}
	public void setCodigoDeSeguranca(int codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}
	
	
	
	
	

	
	public String toString() {
		return getNomeroDoCartao()+","+getNomeImpresso()+","+getDataDevalidacao()+","+getCodigoDeSeguranca();
		
	}
	
	
	
	

}
