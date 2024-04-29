import java.util.Scanner;

public class Exercicio025{  
    public static void main(String[]args){

        for(int i = 1000; i<= 1999; i++){
            if(i % 11 == 5){
                System.out.println(i);
            }
        }
    }
}