import java.util.Scanner;

public class Exercicio001{
    public static void main(String[]args){
        double media;

        Scanner in = new Scanner(System.in);

        System.out.println("Quantos numero você gostaria de digitar?");
        int tamanho = in.nextInt();

        int[] numeros = new int[tamanho];

        for(int i = 0 ; i < numeros.length ; i++) {
            System.out.println("Digite um número!");
            numeros[i] = in.nextInt();

        }

        int soma = 0;
        for(int numero : numeros){
            soma += numero;
        }

        media = (double )soma / numeros.length;

        System.out.println("Estes foram os valores digitados: ");
        for(int numero : numeros) {
            System.out.println(numero + " ");
        }
        System.out.println();

        System.out.println("Essa é a media do valores digitador: " + media);

    }

}