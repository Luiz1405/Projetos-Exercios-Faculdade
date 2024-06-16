public class Main {
    public static void main(String[] args)  {
        try{
            SacoDeRacao saco1 = new SacoDeRacao(0);
            saco1.alimentarCao(3, 3, 200);
        }
        catch (IniciarCom0Exception e){
            System.out.println("Não é possível criar um saco com 0 Kg.");
        }

        try{
            SacoDeRacao saco2 = new SacoDeRacao(10);
            saco2.alimentarCao(10, 10, 200);
        }
        catch (IniciarCom0Exception e){
            System.out.println("Não é possível criar um saco com 0 Kg.");
        }

        try{
            SacoDeRacao saco3 = new SacoDeRacao(8);
            saco3.alimentarCao(10, 2, 100);
        }
        catch (IniciarCom0Exception e){
            System.out.println("Não é possível criar um saco com 0 Kg.");
            }
    }
}
