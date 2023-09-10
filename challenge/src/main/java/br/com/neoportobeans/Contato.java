package br.com.neoportobeans;

public class Contato {
	
	private int id;
	private double cpf;
	private int telefone;
	
	public Contato(int id, double cpf, int telefone) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	

}
