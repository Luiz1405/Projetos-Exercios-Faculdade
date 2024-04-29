import java.util.Scanner;

public class Exercicio001{
    public static void main(String[]args){

        double lado1, lado2, lado3;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triangulo: ");
        lado1 = in.nextDouble();

        System.out.println("Digite o segundo lado do triangulo: ");
        lado2 = in.nextDouble();

        System.out.println("Digite o terceiro lado do triangulo: ");
        lado3 = in.nextDouble();

        if(lado1 == lado2 && lado1 == lado3) {
            System.out.println("Este é um triangulo equilatero!");

        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Este é um triangulo isóceles!");

        } else {
            System.out.println("Triangulo escaleno!");
        }

    }
}