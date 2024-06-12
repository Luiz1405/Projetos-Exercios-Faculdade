
/*Faça um programa que apresenta as notas p1 de uma turma, aprensente estas notas em um formato de vetor considerando 5 alunos, para isso solicite ao usuario que digite a nota dos 5 alunos,aprensente estas notas na tela, a quantidade de notas a cima de 7 inclusive e a média das notas p1
*/
import java.util.Scanner;

public class Exercicio032{
    public static void main(String[]args){
        int tam = 5;
        String[] alunos = new String[tam];
        double[] notas = new double[tam];
        int notaMedia = 0;
        double mediaTurma;
        double totalNota = 0.00;

        Scanner in = new Scanner(System.in);
        
        
           for(int i = 0 ; i < tam ; i++) {
                System.out.println("Digite o nome do aluno: ");
                alunos[i] = in.nextLine();
            
                System.out.println("Digite a nota que esse aluno tirou na p1 : ");
                notas[i] = in.nextDouble();
                in.nextLine();
                

                if(notas[i] >= 7 )
                notaMedia++;

                totalNota += notas[i];
            
        }
        mediaTurma = totalNota/5;

        for(int i = 0; i< tam ; i++) {
            System.out.println("O aluno " + alunos[i] + " tirou " + notas[i] + " na p1.");
        }
        
        System.out.println("A turma teve um total de " + notaMedia + " notas a cima de 7 e a media da turma foi: " + mediaTurma);
         

    }
}