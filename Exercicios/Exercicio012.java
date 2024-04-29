import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[]args) {
        int cont = 0;

        for (int i = 1000 ; i < 100000 ; i++) {

            if(i%11 == 5) {
            cont ++;
        }

            if(cont == 5);
            System.out.println("o Quinto número é: " + i);
            break;

        }
    }
}