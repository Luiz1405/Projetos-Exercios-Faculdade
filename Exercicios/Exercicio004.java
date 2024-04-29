import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        int n1, n2, n3, maior = 0, menor = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = in.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = in.nextInt();

        System.out.print("Digite o segundo número: ");
        n3 = in.nextInt();

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if ((n1 < n2 ) && (n1 < n3)) {
            menor = n1;

        } else if ((n2 > n1) && (n2 > n3)) {
            maior = n2;

        } else if ((n2 < n1) && (n2 < n3)) {
            menor = n2;

        } else if ((n3 > n1) && (n3 > n2)) {
            maior = n3;
        } else if ((n3 < n1) && (n3 < n2)) {
            menor = n3;
        }

        System.out.println("Maior: " + maior + " , Menor: " + menor);
    }
}
