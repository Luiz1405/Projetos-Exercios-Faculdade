import java.util.Scanner;

public class Exercicio032{
    public static void main(String[]args){
        double contaNUmeros = 0, media = 0;
        int numero = 0, somaNumeros = 0, menor = Integer.MIN_VALUE, maior = 0;
        boolean primeiroNumero = true;

        Scanner in = new Scanner(System.in);

        for(int i = 0 ; i <= 50 ; i++) {
            System.out.println("Digite um número inteiro positivo:(Digite 0 para parar)");
            numero = in.nextInt();
            somaNumeros += numero;
            contaNUmeros++;

            if(numero > maior) {
                maior = numero;
            }

            if(numero < 0){
                System.out.println("Digite um número válido!");
                continue;
            }

            if( numero == 0 ) {
                break;
            }

            if(primeiroNumero){
                menor = numero;
                primeiroNumero = false;
            }   else {
                if (numero < menor ) {
                    menor = numero;
                }
            }

        }


            media = somaNumeros /(contaNUmeros - 1);
            System.out.println("Média dos valores: " + media);
            System.out.println("Esses é o maior " + maior + " esse é o menor " + menor);



    }
}
