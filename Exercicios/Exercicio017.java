import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }
            n--;
        } while (trocou);
    }

    public static void main(String[] args) {
        int tamanho;

        Scanner in = new Scanner(System.in);

        System.out.println("Quantos números você quer ordenar? ");
        tamanho = in.nextInt();
        int[] numeros = new int[tamanho];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite vários números aleatórios para serem ordenados: ");
            numeros[i] = in.nextInt();
        }
        BubbleSort.bubbleSort(numeros);

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
