import java.util.Scanner;

public class Exercicio001{
    public static void main(String[]args){
        int condicao = 1, contaImpar = 0 , contaPar = 0, somaImpar = 0, somaPar = 0, numero = 0, contaNumeros = 0, somaNumeros = 0;
        double mediaPar = 0.00;
        Scanner in = new Scanner(System.in);

        while(condicao == 1){

            System.out.println("Digite um número: (Digite 0 se quiser parar.)");
            numero = in.nextInt();


            if (numero == 0) {
            condicao = 0;

            } else {
                contaNumeros++;
            somaNumeros += numero;
            }

            if(numero % 2 == 0 || numero != 0){
                contaPar++;
                somaPar += numero;

            } else {
                contaImpar++;
                somaImpar +=numero;
            }
        }

            if (contaPar > 0) {
            mediaPar = somaPar / (double) contaPar;

            }

            double mediaNumeros = somaNumeros / (double)contaNumeros;

            System.out.println("Quantidade de números pares: " + contaPar + " Quantidade de números ímpares: " + contaImpar);
            System.out.println("Essa é media dos valores pares: " + mediaPar);
            System.out.println("Essa é média dos valores digitados: " + mediaNumeros);



    }
}