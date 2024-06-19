import java.util.Scanner;

public class Exercicio2 {
    public static void main(String [] args){
        int a,b, contador = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        a = in.nextInt();

        System.out.println("Digite o valor B: ");
        b = in.nextInt();

        int tamanho = b - a;
        int[] c = new int[tamanho];
        for(int i = a ; i < b ; i++) {
            if(i % 2 == 0) {
                c[contador] = i;
                contador++;
            }
    }

        for(int i = a; i < c.length; i++) {
            System.out.println("Valores vetor c: " + c[i]);
        }

    }
}
