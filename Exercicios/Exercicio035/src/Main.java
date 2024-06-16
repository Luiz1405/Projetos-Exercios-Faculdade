public class Main {
    public static void main(String[] args)  {
        AppConta app = new AppConta();

       Conta conta = app.criaConta(500, 22323);
       System.out.println(conta);

       app.depositarDinheiro(conta, 500);
       System.out.println(conta);

       app.sacarDinheiro(conta, 250);
       System.out.println(conta);
    }
}
