import java.util.Scanner;

public class Exercicio003{
    public static void main(String[] args) {
        double sexo,altura, imcH, imcM;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o seu sexo? ");
        System.out.println("1 - Homem");
        System.out.println("2 - Mulher");
        sexo = in.nextInt();

        System.out.println("Agora a sua altura: ");
        altura = in.nextDouble();

        //Homem.
        imcH = (72.2 * altura - 58);

        //Mulher
        imcM = (62.1 * altura - 44);

        if (sexo == 1 && imcH >=25 && imcH <= 40){
            System.out.println("Acima do peso.");

        } else if(sexo == 1 && imcH >= 18.5 && imcH <= 24.29) {
            System.out.println("Peso normal.");

        } else {
            System.out.println("Abaixo do peso.");
        }

        if (sexo == 2 && imcM >=25 && imcM <= 40){
            System.out.println("Acima do peso.");

        } else if(sexo == 2 && imcM >= 18.5 && imcM <= 24.29) {
            System.out.println("Peso normal.");

        } else {
            System.out.println("Abaixo do peso.");
        }



    }
}