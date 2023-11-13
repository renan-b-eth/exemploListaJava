package br.com.fiap.beans;

public class Produto {
	
	private int id, qtd;
	private String tipo, marca;
	private double valor;
	
	
	public Produto() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getQtd() {
		return qtd;
	}


	public void setQtd(int qtd) {
		this.qtd = qtd;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Produto(int id, int qtd, String tipo, String marca, double valor) {
		super();
		this.id = id;
		this.qtd = qtd;
		this.tipo = tipo;
		this.marca = marca;
		this.valor = valor;
	}
	
}
