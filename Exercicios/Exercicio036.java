import java.util.Scanner;;

public class Exercicio1{
    public static void main(String [] args){
        int impar = 0;
        int[] valores = new int[10];
       Scanner in = new Scanner(System.in);

       for(int i = 0; i < valores.length; i++){
       System.out.println("Digite um valor inteiro: ");
       valores[i] = in.nextInt();

       }

       for(int i = 0 ; i < valores.length ; i++){
       if(valores[i] % 2 == 1) {
        impar = valores[i];
        System.out.println("Valores dos impares: " + impar);
       }
    }

       for(int i = 1; i < valores.length ; i+=2){
        System.out.println("Valores nos indices impares:  " + i + ":" + valores[i]);
       }

       for(int i = 0 ; i < valores.length; i+=2 ) {
        System.out.println("Valores nos indices pares: " + i + ":" + valores[i]);
       }

       for(int i = valores.length - 1; i >= 0; i--){
        System.out.println("Vetor ao contrario: " + valores[i]);
       }
      
       
    }
}