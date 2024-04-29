import java.util.Scanner;

public class Exercicio006{
    public static void main(String[]args){
        int a = 0, b = 0, somaPar = 0, contaPar = 0;
        Scanner in = new Scanner(System.in);
        while(true){

        System.out.println("Digite um valor: ");
        a = in.nextInt();
        System.out.println("Digite um valor: ");
        b = in.nextInt();

        if(a < 0 || b < 0 ){
            System.out.println("Número invalido!");
            continue;

        } else {
            break;
        }

        }
        if(a > b){
            while(b <= a){
                b++;
                if(b % 2 == 0){
                contaPar = b;
                somaPar += contaPar;
                }
            } 
            System.out.println("A soma dos pares entre os numeros digitado é: " + somaPar);  

        } else if(b > a){
            while(a <= b){
                a++;
                if(a % 2 == 0){
                contaPar = a;
                somaPar += contaPar;

                }
            } 
            System.out.println("A soma dos pares entre os numeros digitado é: " + somaPar); 
        }



    }
}