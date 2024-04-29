import java.util.Scanner;

public class Exercicio024{
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro e positivo: ");
        int valor = in.nextInt();

        for(int i = 0; i <= valor; i++){
            double raiz = Math.sqrt(i);
            if(raiz == (int) raiz) {
                System.out.println(i);
            }
        }
        }
}