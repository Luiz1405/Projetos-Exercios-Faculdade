public class Main {
    public static void main(String[] args) {

        try{
        Professor professor = new Professor("Roberto", 1232, 45, 20);
        professor.calculaSalario(professor);
        System.out.println(professor);
        }
        catch(CargaHorariaException | ValorHoraException e){
            System.out.println("Carga horário ou valor da hora invalidos!\n");
        }

        try{
        Professor professor2 = new Professor("Carlos", 12312, 44, 30);
        professor2.calculaSalario(professor2);
        System.out.println(professor2);
        }
        catch(CargaHorariaException | ValorHoraException e) {
            System.out.println("Carga horário ou valor da hora invalidos!\n");
        }
    }
}
