import java.util.Scanner;

public class Exercicio002{
    public static void main(String[]args){
        String codigo;
        int quantidade;
        double precototal = 0.00;

        Scanner in = new Scanner(System.in);

        System.out.println("Segue abaixo a tabela de produtos e seus repectivos preços: \n" );
        System.out.println("'XYPK' R$ 6,00");
        System.out.println("'KLMP' R$ 3,20");
        System.out.println("'QRST' R$ 2,50");
        System.out.println("'ABCD' R$ 5,30");

        System.out.println("Qual produto você quer comprar? ");
        codigo = in.nextLine().toUpperCase();
        System.out.println("Qual a quantidade?");
        quantidade = in.nextInt();

        switch (codigo) {
            case "XYPK":
                precototal = quantidade * 6.00;
                break;

            case "KLMP":
                precototal = quantidade * 3.20;

            case "QRST":
                precototal = quantidade * 2.50;

            case "ABCD":
                precototal = quantidade * 5.30;

            default:
                System.out.println("Código invalido!");
                return;
        }

        System.out.println("O valor total da compra ficou: R$" + precototal);



    }
}