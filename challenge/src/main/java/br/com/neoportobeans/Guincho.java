package br.com.neoportobeans;

public class Guincho {
	
	private String tipoGuincho;
	private String placaGuincho;
	private double comprimentoGuincho;
	private double pesoGuincho;
	private double pesoMaxSuportado;
	private int quantEixoCompativel;
	
	public Guincho(String tipoGuincho, String placaGuincho, double comprimentoGuincho, double pesoGuincho,
			double pesoMaxSuportado, int quantEixoCompativel) {
		super();
		this.tipoGuincho = tipoGuincho;
		this.placaGuincho = placaGuincho;
		this.comprimentoGuincho = comprimentoGuincho;
		this.pesoGuincho = pesoGuincho;
		this.pesoMaxSuportado = pesoMaxSuportado;
		this.quantEixoCompativel = quantEixoCompativel;
	}

	public String getTipoGuincho() {
		return tipoGuincho;
	}

	public void setTipoGuincho(String tipoGuincho) {
		this.tipoGuincho = tipoGuincho;
	}

	public String getPlacaGuincho() {
		return placaGuincho;
	}

	public void setPlacaGuincho(String placaGuincho) {
		this.placaGuincho = placaGuincho;
	}

	public double getComprimentoGuincho() {
		return comprimentoGuincho;
	}

	public void setComprimentoGuincho(double comprimentoGuincho) {
		this.comprimentoGuincho = comprimentoGuincho;
	}

	public double getPesoGuincho() {
		return pesoGuincho;
	}

	public void setPesoGuincho(double pesoGuincho) {
		this.pesoGuincho = pesoGuincho;
	}

	public double getPesoMaxSuportado() {
		return pesoMaxSuportado;
	}

	public void setPesoMaxSuportado(double pesoMaxSuportado) {
		this.pesoMaxSuportado = pesoMaxSuportado;
	}

	public int getQuantEixoCompativel() {
		return quantEixoCompativel;
	}

	public void setQuantEixoCompativel(int quantEixoCompativel) {
		this.quantEixoCompativel = quantEixoCompativel;
	}
	
	
	
	
	
	

}
