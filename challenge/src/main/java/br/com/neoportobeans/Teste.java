package br.com.neoportobeans;

public class Teste {
	
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente(123456, 453124568, 953762153, 123456, "Rodolfo", "XDS-123");
        Guincho guincho = new Guincho( "Guincho de Arraste Torre 25T", "ABC-123", 1000, 50000, 5000, 800);
        TipoVeiculo tipoVeiculo = new TipoVeiculo(123456, 453124568, 953762153, 123456, "Rodolfo", "TED-123", "Onibus", 100, 80, 50);
        VeiculoCliente veiculoCliente = new VeiculoCliente(123456, 453124568, 953762153, 123456, "ABC-123", "Modelo XYZ", "Pesado", 100, 80, 50, "Onibus", "JBDFUVI4785FNHFDHY");
        Rastreio rastreio = new Rastreio(100125, 123789, "ABC-123", 123.45, 123, "Rua Gloria Maria, 420");

       
        Solicitacao solicitacao = new Solicitacao(cliente, guincho, tipoVeiculo, veiculoCliente, rastreio);

        
        System.out.println("Informa��es da Solicita��o:");
        System.out.println("Cliente: " + solicitacao.getCliente().getNome());
        System.out.println("Guincho: " + solicitacao.getGuincho().getPlacaGuincho());
        System.out.println("Tipo de Ve�culo: " + solicitacao.getTipoVeiculo().getNome());
        System.out.println("Ve�culo do Cliente: " + solicitacao.getVeiculoCliente().getPlacaGuincho());
        System.out.println("Rastreio - Ordem de Servi�o: " + solicitacao.getRastreio().getOrdemServico());
        System.out.println("Rastreio - Operador: " + solicitacao.getRastreio().getIdOperador());
        System.out.println("Rastreio - Placa do Guincho: " + solicitacao.getRastreio().getPlacaGuincho());
        System.out.println("Rastreio - Data de Sa�da: " + solicitacao.getRastreio().getDataSaida());
        System.out.println("Rastreio - Hora de Sa�da: " + solicitacao.getRastreio().getHoraSaida());
        System.out.println("Rastreio - Local de Sa�da: " + solicitacao.getRastreio().getLocalSaida());
    }
}

