import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[] vetor = new int[20];

        incrimetaVetor(vetor,in);
        verificaSoma(vetor);
        verificaMaior(vetor);
        verificaPar(vetor);
    }

    public static void incrimetaVetor(int[] vetor, Scanner in){
    
        for(int i = 0 ; i < vetor.length ; i++){
        System.out.println("Escreva um valor: ");
        vetor[i] = in.nextInt();

        }
    }

    static void verificaSoma(int[] vetor){
        int soma = 0;
        for(int i = 0 ; i < vetor.length; i++){
            soma += vetor[i];      
    }
    System.out.println("A soma de todos os valores do vetor é: " + soma);
}
    static void verificaMaior(int[] vetor){
        int maior = 0;
        for(int i = 0 ; i < vetor.length ; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        System.out.println("O maior valor do vetor é: " + maior);

    }
    static void verificaPar(int[] vetor){
        int par = 0;
        for(int i = 0; i< vetor.length; i++){
            if(vetor[i] % 2 == 0){
                par++;
            } 
        }

        System.out.println("número de pares no vetor: " + par);
    }
}
