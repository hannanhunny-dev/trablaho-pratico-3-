package model;

import java.util.Date;

public class Emprestimo {
	
	private Date date;
	private  Endereco endereco;
	private double alguel;
	
	public Emprestimo() {}
	public Emprestimo(Date date,Endereco endereco, double alguel) {
		this.date = date;
		this.endereco = endereco;
		this.alguel = alguel;
		
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public double getAlguel() {
		return alguel;
	}
	public void setAlguel(double alguel) {
		this.alguel = alguel;
	}
	
	
	public void localdeDevolver() {
		
	}
	
	public void localderetirada() {
		
	}

}
