import java.util.Scanner;

public class Exercicio007{
    public static void main(String []args){
        int n1, somatorio = 0;
        long fatorial = 1;

        Scanner in = new Scanner(System.in);

        while(true){
        System.out.println("Digite um número inteiro: ");
        n1 = in.nextInt();

        if(n1 < 0 ){
            System.out.println("Número inválido!");
            continue;

        } else {
            break;
            }
        }

        for(int i = 1; i <= n1; i++){
            fatorial *= i;
            somatorio += i;
            System.out.println(somatorio);
        }

        System.out.println("O somatório do número digitado é: " + somatorio + " e o fatorial é: " + fatorial);
    }
}
