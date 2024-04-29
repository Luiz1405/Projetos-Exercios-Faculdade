import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        double valor = 0, saldo = 300, valor2;
        int escolha;

        Scanner in = new Scanner(System.in);

        System.out.println("Escolha a opção desejada: ");
        System.out.println("1-Saque");

        System.out.println("2-Ver saldo");
        escolha = in.nextInt();

        System.out.println("Qual o valor do saque?");
        valor = in.nextDouble();

        if (escolha == 1 && saldo >= 1 && valor <= saldo) {

            saldo = saldo - valor;
            System.out.println("Saldo restante: " + saldo);
            System.out.println("Saque realizado com sucesso!");

        } else if(valor > saldo){
            System.out.println("Saldo insuficiente!");
        }    

         else if (saldo == 0 ) {
            System.out.println("Você não tem saldo.");
        }

         else if (escolha == 2) {
            System.out.println("Saldo atual: " + saldo);
        }


    }
}

 