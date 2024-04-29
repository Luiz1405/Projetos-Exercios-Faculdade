import java.util.Scanner;

public class Exercicio001{
    public static void main(String[]args) {
        int numero, soma = 0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Digite um número inteiro positivo: (Se quiser parar de digitar, digite '0'.)");
             numero = in.nextInt();
             soma += numero;

                } while (numero > 0);
                    System.out.println("A soma dos números é: " + soma);
    }
}