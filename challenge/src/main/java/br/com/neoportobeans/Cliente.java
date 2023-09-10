package br.com.neoportobeans;

// Cliente NeoPorto

public class Cliente extends Contato {
	
	private int id;
	private String nome;
	private String placaVeiculo;	
	
	
	public Cliente(int id, double cpf, int telefone, int id2, String nome, String placaVeiculo) {
		super(id, cpf, telefone);
		id = id2;
		this.nome = nome;
		this.placaVeiculo = placaVeiculo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	
	
	
	

}
