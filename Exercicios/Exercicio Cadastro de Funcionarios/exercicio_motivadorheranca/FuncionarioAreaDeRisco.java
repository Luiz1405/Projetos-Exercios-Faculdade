public class FuncionarioAreaDeRisco extends Funcionario {
    private String categoriaRisco;

    public FuncionarioAreaDeRisco(String matricula, String nome, double salarioBruto, String categoriaRisco){
        super(matricula, nome, salarioBruto);
        this.categoriaRisco = categoriaRisco;
    }

    @Override
    public double getImpRenda(){
        double adicional = (getSalarioBruto() - getINSS())* 0.25;
        double novoSB = getSalarioBruto() + adicional;
        if (getSalarioBruto() <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = novoSB - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }
    @Override
    public double getSalarioLiquido(){
        return getSalarioBruto() - getINSS() - this.getImpRenda();
    }
    
}
