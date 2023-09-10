package br.com.neoportobeans;

public class Rastreio {
    private int ordemServico;
    private int idOperador;
    private String placaGuincho;
    private double dataSaida;
    private int horaSaida;
    private String localSaida;

    public Rastreio(int ordemServico, int idOperador, String placaGuincho, double dataSaida, int horaSaida, String localSaida) {
        this.ordemServico = ordemServico;
        this.idOperador = idOperador;
        this.placaGuincho = placaGuincho;
        this.dataSaida = dataSaida;
        this.horaSaida = horaSaida;
        this.localSaida = localSaida;
    }

    public int getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(int ordemServico) {
        this.ordemServico = ordemServico;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }

    public String getPlacaGuincho() {
        return placaGuincho;
    }

    public void setPlacaGuincho(String placaGuincho) {
        this.placaGuincho = placaGuincho;
    }

    public double getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(double dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getLocalSaida() {
        return localSaida;
    }

    public void setLocalSaida(String localSaida) {
        this.localSaida = localSaida;
    }
}
