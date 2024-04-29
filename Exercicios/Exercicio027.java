import java.util.Scanner;

public class Exercicio005{
    public static void main(String[]args){
        int valor = 0, cont = 0, somaValores = 0, maior = 0, menor = 0, cont2 = 0;
        double media = 0.00;
        Scanner in = new Scanner(System.in);

        while(cont <= 50) {
            System.out.println("Digite um valor ou digite 0 se quiser parar. ");
            valor = in.nextInt();
            cont++;
            somaValores += valor;

            if(valor < 0 || valor != (int) valor){
                System.out.println("Numéro invalido!");
                continue;
            } else if (valor == 0) {
                break;
            }

            if(valor > maior)
            maior = valor;

            if(cont == 1)
            menor = valor;

            if(valor < menor)
            menor = valor;

            if(valor < 10)
            cont2++;

        }
        media = somaValores / (cont - 1);
        System.out.println("A média entre os números digitados é: " + media);
        System.out.println("Maior número " + maior + " menor número " + menor);

    }
}