import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        String palavra;
        String vogal;
        int posicao;

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva uma palavra: ");
        palavra = in.nextLine();

        while (true) {
        System.out.println("Escreva uma vogal: ");
        vogal = in.nextLine();

        if(vogal.contains("a") || vogal.contains("e") || vogal.contains("i") || vogal.contains("o") || vogal.contains("u")) {
            break;

        } else {
            System.out.println("Digite uma vogal válida!");

        }
        }

        while(true) {
        System.out.println("Informe a posição: ");
        posicao = in.nextInt();

        if(posicao > palavra.length()) {
            System.out.println("Digite uma posição válida!");

        } else {
            break;
        }
    }
        System.out.println("Palava: " + palavra + ", vogal: " + vogal + ", posiçao: " + posicao);


    }
}