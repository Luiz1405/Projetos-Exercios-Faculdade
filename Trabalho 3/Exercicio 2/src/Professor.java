public class Professor{
    private String nome;
    private int matricula, cargaHoraria;
    private double valorHora;
    private double mediaSalario;
    
    public Professor(String nome, int matricula, int cargaHoraria, double valorHora) throws ValorHoraException, CargaHorariaException{
        if(valorHora < 20 || valorHora < 0 ) {
            throw new ValorHoraException();
        }

        if(cargaHoraria > 44) {
            throw new CargaHorariaException();
        }  
        
        this.nome = nome;
        this.matricula = matricula;
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int novaMatricula){
        this.matricula = novaMatricula;
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCagaHoraria(int novaCargaHoraria){
        this.cargaHoraria = novaCargaHoraria;
    }

    public double getValorHora(){
        return valorHora;
    }

    public void setValorHora(int novaValorHora){
        this.valorHora = novaValorHora;
    }

    public void calculaSalario(Professor professor){

        mediaSalario = (valorHora * cargaHoraria) * 4.5;

        System.out.println("O salário base do professor " + nome + " é " + mediaSalario);
    }

    @Override
    public String toString(){
        return "\nNome do professor: " + nome + "\nMatricula: " + matricula + "\nCarga horária: " + cargaHoraria + "\nValor da hora: " + valorHora + "\nSalario base: " + mediaSalario + "\n";
    }

}