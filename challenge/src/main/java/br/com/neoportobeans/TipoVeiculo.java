package br.com.neoportobeans;

public class TipoVeiculo extends Cliente{
	
	private String tipoVeiculo;
	private float peso;
	private float altura;
	private float largura;
	
	
	public TipoVeiculo(int id, double cpf, int telefone, int id2, String nome, String placaVeiculo, String tipoVeiculo,
			float peso, float altura, float largura) {
		super(id, cpf, telefone, id2, nome, placaVeiculo);
		this.tipoVeiculo = tipoVeiculo;
		this.peso = peso;
		this.altura = altura;
		this.largura = largura;
	}


	public String getTipoVeiculo() {
		return tipoVeiculo;
	}


	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	public float getLargura() {
		return largura;
	}


	public void setLargura(float largura) {
		this.largura = largura;
	}
	
	
	
	
	

}
