package br.com.mapstruct.entities;

public class Categoria {
	
	private Long id;
	private String nome;
	private String produto;
	private double custo;
	
	public Categoria() {
		
	}
	

	public Categoria(Long id, String nome, String produto, double custo) {
		this.id = id;
		this.nome = nome;
		this.produto = produto;
		this.custo = custo;
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
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	
}
