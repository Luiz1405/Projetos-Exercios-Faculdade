public class AppConta {
    private double saldoInicial, valor;
    private int numeroConta;

    public Conta criaConta(double saldoInicial, int numeroConta){
        return new Conta (saldoInicial, numeroConta);
    }

    public Conta sacarDinheiro(Conta conta, double valor ){
        if(valor > conta.getSaldo()) {
            System.out.println("Saldo insuficiente!");
        } else if (valor <= 0) {
            System.out.println("Valor invalido!");
        } else {
        conta.setSaldo(conta.getSaldo() - valor);
        }

        return conta;

    }

    public Conta depositarDinheiro(Conta conta, double valor){
        if(valor <= 0) {
            System.out.println("Valor invalido!");
        } else {
        conta.setSaldo(conta.getSaldo() + valor);
        }
        return conta;
    }
    
}
