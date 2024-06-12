import java.util.Scanner;

public class Exercicio031{
    public static void main(String []args){
        int tam = 5;
        int[] vetor1 = new int[tam];
        int[] vetor2 = new int[tam];
        int[] vetSoma = new int[tam];
        int[] vetProd = new int[tam];
        int negativos = 0;
        
    
        
        Scanner in = new Scanner(System.in);

        System.out.println("-------------------------------");
        for(int i = 0 ; i < tam; i++) {
        System.out.println("Digite um valor: ");
        vetor1[i] = in.nextInt();
        
        if(vetor1[i] < 0 )
         negativos++;

        }
        System.out.println("----------------------------");
        for(int i = 0 ; i < tam ; i++) {
        System.out.println("Digite um valor: ");
        vetor2[i] = in.nextInt();
        
        if( vetor2[i] < 0 )
        negativos++;
        vetProd[0] = 1;
        vetSoma[i] = vetor1[i] + vetor2[i];
        vetProd[i] = vetor1[i] * vetor2[i];

        }
        System.out.println("---------------------------");
        for(int i = 0 ; i < vetSoma.length ; i++) {
            System.out.println("Soma da posição:  " + i + " é: " + vetSoma[i] + " ");
        }
        System.out.println("-----------------------------");
        for(int i = 0 ; i < vetProd.length ; i++) {
            System.out.println("produto da posição " + i + " é: " + vetProd[i] + " ");
        }
        System.out.println("----------------------");
        System.out.println("Vetor 1 completo: ");
        for(int i = 0 ; i < vetor1.length ; i++) {
            System.out.println(vetor1[i] + " ");
        }
        System.out.println("--------------------------");
        System.out.println("Vetor 2 completo: ");
        for(int i = 0 ; i < vetor2.length ; i++) {
            System.out.println(vetor2[i] + " ");
        }

        System.out.println("Total de números negativos: " + negativos);
        in.close();



    }
}