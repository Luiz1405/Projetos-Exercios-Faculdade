public class Main {
    public static void main(String[] args) throws Exception {
        //Fiz a verificação com o try catch apenas no primeiro aluno apenas para testar o caso em que a nota seja negativa.
        try{
            Aluno aluno = new Aluno("Gilberto", 23232, 75, -5, 6, 9, 10);
            aluno.CalculaG1();
            System.out.println(aluno);

    }
        catch(NotaInvalidaException e){
            System.out.println("Nota negativa invalida!!\n");
    }
 
            Aluno aluno2 = new Aluno("Luiz", 23111379, 80, 2, 3, 7, 10);
            aluno2.CalculaG1();
            System.out.println(aluno2);
       

            Aluno aluno3 = new Aluno("Carlos", 123131, 80, 7, 8, 9, 10);
            aluno3.CalculaG1();
             System.out.println(aluno3);

            Aluno aluno4 = new Aluno("Jose", 89898, 65, 7, 2, 4, 5);
            aluno4.CalculaG1();
            System.out.println(aluno4);

       
        
    }
}
