import java.util.Scanner;

public class Exercicio023{
    public static void main(String[]args){
        int impar = 0;
        Scanner in = new Scanner(System.in);

        for(int i = 0; i <= 100; i++){
            double raiz = Math.sqrt(i);
            if(raiz == (int) raiz){
                System.out.println(i);
            }
            }
        }

    }