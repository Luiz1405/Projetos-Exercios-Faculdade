import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private int tamanhocofrinho; 
    private List<Moeda> moedas;
    private int qtdmoedas;
    private NomeMoeda tipoMoeda;
    
    
    public Cofrinho(){

    }

    public Cofrinho(int tamanhocofrinho, int qtdmoedas, NomeMoeda tipoMoeda){
        moedas = new ArrayList<>(tamanhocofrinho);
        this.tamanhocofrinho = tamanhocofrinho;
        this.qtdmoedas = qtdmoedas;
        this.tipoMoeda = tipoMoeda;

        for(int m = 0 ; m < qtdmoedas && m < tamanhocofrinho ; m++){
            moedas.add(new Moeda(tipoMoeda));
        }
    }

    public boolean insere(Moeda moeda) {
        if(tamanhocofrinho - qtdmoedas == 0){
            return false;
        } else {
            moedas.add(moeda);
            return true;
        }     
    }

    public Moeda retira(){
        if(moedas.isEmpty()){
            System.out.println("O cofrinho está vazio!");
            return null;
        }
           return moedas.remove(moedas.size() - 1);
    }

    public int getQuantidadeMoedas(){
        if(moedas.isEmpty()){
            System.out.println("O cofrinho está vazio!");
        }

        return moedas.size();

    }

    public int getQuantidadeMoedaSTipo(NomeMoeda nomeMoeda) {
        int qtdMoedas = 0;
        if(moedas.isEmpty()){
            System.out.println("O cofrinho está vazio!");
        }

        for(Moeda m : moedas) {
            if(m.getNomeMoeda().equals(nomeMoeda)){
                qtdMoedas++;
            }
        }

        return qtdMoedas;
    }

    public int getValorTotalCentavos(){
        int valorTotalCentavos = 0;
        for(Moeda m : moedas) {
            valorTotalCentavos += m.getValorCentavos();
        }

        return valorTotalCentavos;
    }

    public double getValorTotalReais(){
        int valorTotalReais = 0;
        for(Moeda m : moedas) {
            valorTotalReais += m.getValorReais();
        }

        return valorTotalReais;
    }
    }
    

