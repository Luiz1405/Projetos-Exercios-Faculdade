public class SacoDeRacao{
    private double quantidadeKg;//Quantos kg o saco de ração tem.
    
    public SacoDeRacao(double quantidadeKg)  throws IniciarCom0Exception {
        if(quantidadeKg <= 0 ) {
            throw new IniciarCom0Exception();
        }
        this.quantidadeKg = quantidadeKg;
        
    }

    public double getQuantidadeKg(){
        return quantidadeKg;
    }

    public void setQuantidadeKg(double novaQuantidadeKG){
        this.quantidadeKg = novaQuantidadeKG;
    }

    public void alimentarCao(double quantidadeCaes, double quantidadeRefeicao, double quantidadeRacaoDia){
        quantidadeKg = quantidadeKg * 1000;
        double quantidadeTotalRacao = quantidadeCaes * quantidadeRefeicao * quantidadeRacaoDia;
        double quantidadeRestante = quantidadeKg /quantidadeTotalRacao;

        System.out.println("O saco de ração irá durar " + (int)quantidadeRestante + " dias.");
    }

}