import java.util.Scanner;

public class Exercicio004{
    public static void main(String[]args){
        boolean verifica = true;
        int numero = 0;
        String resposta;

        Scanner in = new Scanner(System.in);

        while (verifica  == true) {
            System.out.println("Digite um número inteiro: ");
            numero = in.nextInt();

            if (numero < 0) {
            System.out.println("Digite um número válido.");
                break;
            }   

            if(numero % 2 == 0){
                System.out.println("O número é par");

            } else {
                System.out.println("O número é impar");
            }

            System.out.println("Você gostaria de digitar outro número?(sim ou não.) ");
            in.nextLine();
            resposta = in.nextLine().toUpperCase();

            if(resposta.equals("NAO")) {
                verifica = false;
                break;

            }
        }


    }
}
