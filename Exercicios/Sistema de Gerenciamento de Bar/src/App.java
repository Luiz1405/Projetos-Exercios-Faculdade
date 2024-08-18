public class App {
    public static void main(String[] args) throws Exception {
        Bar bar = new Bar("Van gogh");
        bar.entradaBar("03796879098", 23, "Masculino");
        bar.verificarClienteCpf("03796879098");
        bar.entradaBar("12345677", 23, "Feminino");
        bar.verificarClienteCpf("12345677");
        bar.verificaQuantidadeCliente();
        }
}
