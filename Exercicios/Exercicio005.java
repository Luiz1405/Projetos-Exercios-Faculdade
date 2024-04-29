import java.util.Scanner;

public class Exercicio005{
    public static void main(String[]args){
        int idade;

        Scanner in = new Scanner(System.in);
        System.out.println("Categorias: ");
        System.out.println("-Infantil A 5 a 7 anos. ");
        System.out.println("-Infantil B 8 a 10 anos. ");
        System.out.println("-Juvenil  A 11 a 13 anos. ");
        System.out.println("-Juvenil  B 14 a 17 anos. ");
        System.out.println("-Adulto   Maiores de 18. ");

        System.out.println("Qual a idade do nadaddor?");
        idade = in.nextInt();

        if(idade >= 5 && idade <= 7) {
            System.out.println("Categoria Infantil A");

        } else if(idade >= 8 && idade <= 10) {
            System.out.println("Categoria infantil B");

        } else if(idade >= 11 && idade <= 13) {
            System.out.println("Categoria juvenil A");

        } else if(idade >= 14 && idade <= 17) {
            System.out.println("Categoria juvenil b");


        } else   {
            System.out.println("Adulto");
        }


    }
}