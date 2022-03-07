package model;



public class Pagamento {
	
	private String nomeroDoCartao;
	private String  nomeImpresso;
	private String dataDevalidacao;
	private int codigoDeSeguranca;
	private double dinheiro;
	
	public Pagamento() {}
	public Pagamento(String nomeroDoCartao,String  nomeImpresso,String dataDevalidacao,int codigoDeSeguranca,double dinheiro) {
		this.nomeroDoCartao = nomeroDoCartao;
		this.nomeImpresso = nomeImpresso;
		this.dataDevalidacao = dataDevalidacao;
		this.codigoDeSeguranca = codigoDeSeguranca;
		this.dinheiro = dinheiro;
		
	}
	
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
	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
	
	

	
	public String toString() {
		return getNomeroDoCartao()+","+getNomeImpresso()+","+getDataDevalidacao()+","+getCodigoDeSeguranca()+","+getDinheiro();
		
	}
	
	
	
	

}
