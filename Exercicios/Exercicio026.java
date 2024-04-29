import java.util.Scanner;

public class Exercicio004{
    public static void main(String[]args){
        int cont = 0, valor = 100;
        while(cont <=50){
            if(valor % 7 == 0){
                System.out.println(valor);
            }
            valor++;
                cont++;
        }

    }
}