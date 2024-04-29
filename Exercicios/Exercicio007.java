import java.util.Scanner;

public class Exercicio002{
    public static void main(String[] args) {
        double raior, altura, volume;

        double pi = 3.14;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os valores para calcularmos o volume de uma garrafa cilindrica");

        System.out.println("Digite o valor do raio: ");
        raior = in.nextDouble();

        System.out.println("Digite a altura: ");
        altura = in.nextDouble();

        System.out.println("Vamos usar esta forumala para calcular: V = PI * r**2 * h ");

        volume = (pi * Math.pow(raior, 2) * altura);

        System.err.println("O volume é : " + volume);


    }
}