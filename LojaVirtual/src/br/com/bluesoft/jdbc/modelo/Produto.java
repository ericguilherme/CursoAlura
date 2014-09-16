package br.com.bluesoft.jdbc.modelo;

public class Produto {
	
	public void setId(Integer id) {
		this.id = id;
	}

	private Integer id;
	public Integer getId() {
		return id;
	}

	private String nome;
	private String descricao;
	
	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
	@Override
	public String toString() {
	
		return String.format("[produto: %d %s %s]", id, nome, descricao);
	}
}
