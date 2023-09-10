package br.com.neoportobeans;

public class Solicitacao {
    private Cliente cliente;
    private Guincho guincho;
    private TipoVeiculo tipoVeiculo;
    private VeiculoCliente veiculoCliente;
    private Rastreio rastreio;

    public Solicitacao(Cliente cliente, Guincho guincho, TipoVeiculo tipoVeiculo, VeiculoCliente veiculoCliente,
            Rastreio rastreio) {
        super();
        this.cliente = cliente;
        this.guincho = guincho;
        this.tipoVeiculo = tipoVeiculo;
        this.veiculoCliente = veiculoCliente;
        this.rastreio = rastreio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Guincho getGuincho() {
        return guincho;
    }

    public void setGuincho(Guincho guincho) {
        this.guincho = guincho;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public VeiculoCliente getVeiculoCliente() {
        return veiculoCliente;
    }

    public void setVeiculoCliente(VeiculoCliente veiculoCliente) {
        this.veiculoCliente = veiculoCliente;
    }

    public Rastreio getRastreio() {
        return rastreio;
    }

    public void setRastreio(Rastreio rastreio) {
        this.rastreio = rastreio;
    }
}
