public class ClienteFisico extends Cliente {

    private int idade;
    private double salario;

    public ClienteFisico(String nome, int idade, double salario){
        super(nome);
        this.idade = idade;
        this.salario = salario;
        
    }
    @Override
    public double getMensalidade(){
            double mensalidade = 0.0;
            if(idade < 60){
                mensalidade = salario * 0.1;
                return mensalidade;
            } else {
                mensalidade = salario * 0.15;
                return mensalidade;
            }
        }
    public int getIdade(){
        return idade;
    }

    public void setIdade(int novaIdade){
        this.idade = novaIdade;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMensalidade: " + getMensalidade();
    }

    

    
}
