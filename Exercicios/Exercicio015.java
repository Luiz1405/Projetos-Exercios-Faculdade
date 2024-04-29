import java.util.Scanner;
import java.util.Random;


public class Exercicio015{
public static void main (String[]args){
    int limite =100, advinha = 0;
    Scanner in = new Scanner(System.in);

    Random randomNumbers = new Random();
    int numeroAleatorio = randomNumbers.nextInt(limite);

    System.out.println("Tente advinhar o número aleatório: ");
            advinha = in.nextInt();

    while (true) {

        if(advinha > numeroAleatorio) {
            System.out.println("O numero é maior que o numero aleatorio");
            System.out.println("Tente advinhar o número aleatório novamente: ");
            advinha = in.nextInt();

        } else if(advinha < numeroAleatorio) {
           System.out.println("O numero é menor que o numero aleatorio");
            System.out.println("Tente advinhar o número aleatório novamente: ");
            advinha = in.nextInt();

        } else {
            System.out.println("Você advinhou o número!");
            break;
        }



    }



}

}
