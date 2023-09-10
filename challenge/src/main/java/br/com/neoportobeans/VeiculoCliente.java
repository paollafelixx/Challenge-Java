package br.com.neoportobeans;

// Informações sobre o veiculo do cliente da NeoPorto


public class VeiculoCliente extends TipoVeiculo{
	
	private String tipoVaiculo;
	private String chassi;
	
	public VeiculoCliente(int id, double cpf, int telefone, int id2, String nome, String placaVeiculo,
			String tipoVeiculo, float peso, float altura, float largura, String tipoVaiculo, String chassi) {
		super(id, cpf, telefone, id2, nome, placaVeiculo, tipoVeiculo, peso, altura, largura);
		this.tipoVaiculo = tipoVaiculo;
		this.chassi = chassi;
	}

	public String getTipoVaiculo() {
		return tipoVaiculo;
	}

	public void setTipoVaiculo(String tipoVaiculo) {
		this.tipoVaiculo = tipoVaiculo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlacaGuincho() {
		return null;
	}
	
	
	
	

}
