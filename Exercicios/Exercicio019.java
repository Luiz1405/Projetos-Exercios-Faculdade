import java.util.Scanner;

public class Exercicio002{
    public static void main(String[] args) {
        double celsius,formula;

        Scanner in = new Scanner (System.in);
        do {
            System.out.println("Digite a temperatura em Celsius:(Digite 0 se quiser parar) ");
                celsius = in.nextDouble();
                formula = (celsius * 1.8 ) + 32;
            System.out.println("A temperatura convertida para Fahrenheit é : " + formula);
        } while(celsius > 0 );
    }
}
