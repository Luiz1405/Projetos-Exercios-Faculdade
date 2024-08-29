public class App {
    public static void main(String[] args) throws Exception {
        Cofrinho cofrinho = new Cofrinho(10,7 , NomeMoeda.UmReal);

        Moeda moeda1 = new Moeda(NomeMoeda.Cinquenta);
        System.out.println(cofrinho.insere(moeda1));
        System.out.println("Quantidade de moedas que foram inseridas no cofrinho : " + cofrinho.getQuantidadeMoedas());
        System.out.println("Estão armazenadas " + cofrinho.getQuantidadeMoedaSTipo(NomeMoeda.UmReal) + " moedas de um real");
        System.out.println("Estão armazenadas " + cofrinho.getQuantidadeMoedaSTipo(NomeMoeda.Cinquenta) + " de 50 centavos");
        System.out.println("O valor total de centavos no cofrinho é " + cofrinho.getValorTotalCentavos());
        System.out.println("O valor total de reais no cofrinho é " + cofrinho.getValorTotalReais());
        cofrinho.retira();
        cofrinho.retira();
        System.out.println("O valor total de centavos armazenados no cofrinho após a retirada das duas últimas moedas é " + cofrinho.getValorTotalCentavos());

    }
}
