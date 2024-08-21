public class App {
    public static void main(String[] args) throws Exception {
        Lustre lustre1 = new Lustre(5);
        Lampada l1 = new Lampada();
        Lampada l2 = new Lampada();
        Lampada l3 = new Lampada();
        Lampada l4 = new Lampada();
        Lampada l5 = new Lampada();
        Lampada l6 = new Lampada();

        lustre1.adicionarLampada(l1);
        lustre1.adicionarLampada(l2);
        lustre1.adicionarLampada(l3);
        lustre1.adicionarLampada(l4);
        lustre1.adicionarLampada(l5);
        lustre1.adicionarLampada(l6);

        lustre1.ligarLustre();
        lustre1.posicaoLampadaQueimada();
        lustre1.verficaEstado();
    }
}
