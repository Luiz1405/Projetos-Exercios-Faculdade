import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        double[] notas = new double[100];
        double media;
        int notas2 = 0;
        int indice = 0;
        Scanner in = new Scanner(System.in);
        while(true) {


            System.out.println("Digite a sua nota ou digite -1 para sair.");
            double nota = in.nextDouble();


            if (nota < 0 ) {
                break;
            }
            notas[indice] = nota;
            indice ++;
        }

        in.close();

        System.out.println("Notas digitadas:");
        for(int i = 0;i < indice; i++){
            System.out.println(notas[i]);
        }

        for(int i = 0; i < notas.length; i++){
            notas2 += notas[i];

        }

        media = notas2/ (double) indice;
        String resultado = String.format("%.2f", media);
        System.out.println("A sua média ficou: " + resultado);

    }
}