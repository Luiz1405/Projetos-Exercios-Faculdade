public class App {
    public static void main(String[] args) throws Exception {
        Lampada lampada1 = new Lampada();

        lampada1.ligarLampada();
        lampada1.verificarEstado(lampada1);
    }
}
