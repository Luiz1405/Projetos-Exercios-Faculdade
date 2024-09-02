

public class Supermercado {
    private int [] nroCaixas;
    private double totalFaturamento;
    private double totalPerdas;
    private int totalClientesAtendidos;
    private int totalClientesNaoAtendidos;
    private double valorMenorCompra;
    private double valorMaiorCompra;

    public Supermercado(int nroCaixas){
        if(nroCaixas < 1) {
            nroCaixas = 1;
        }
        this.totalFaturamento = 0.0;
        this.totalPerdas = 0.0;
        this.totalClientesAtendidos = 0;
        this.totalClientesNaoAtendidos = 0;
        this.valorMenorCompra = VALOR_COMPRA_MIN;
        this.valorMaiorCompra = VALOR_COMPRA_MAX;

        for(int i = 0 ; i < nroCaixas ; i++ )
        new Caixa[i];
    }

    public int getNroTotalCaixas(){

    }

    public int getNroCaixasPorStatus(StatusCaixa ){

    }

    public void simularNovoCliente(){

    }

    private Caixa localizarMelhorCaixa(){

    }

    public double getTotalFaturamento(){

    }

    public double getTotalPerdas(){

    }

    public int getNroClientesAtendidos(){

    }

    public int getNroClientesNaoAtendidos(){

    }

    public double getValorMenorCompra(){

    }

    public double getValorMaiorCompra(){

    }

    public void avancarTempo(){

    }

}
