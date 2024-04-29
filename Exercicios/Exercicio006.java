import java.util.Scanner;

public class Exercicio001{
   
    public static void main(String[]args){
        int n1;

        Scanner in = new Scanner(System.in);


        while(true) {

        System.out.println("Digite um número inteiro de quatro digitos: ");
        n1 = in.nextInt();

        if (String.valueOf(n1).length() == 4) {
            break;

        } else {
            System.out.println("Digite um número valido!");

        }
    }

        String numero = String.valueOf(n1);
        StringBuilder reverso = new StringBuilder(numero).reverse();

        System.out.println("O numero inverdito é: " + reverso);
    }
}