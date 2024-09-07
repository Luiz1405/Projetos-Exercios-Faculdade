public class funcionarioPesquisador extends Funcionario {
    private int categoriaEspecializacao;

    public funcionarioPesquisador(String matricula, String nome, double salarioBruto, int categoriaEspecializacao){
        super(matricula, nome, salarioBruto);
        this.categoriaEspecializacao = categoriaEspecializacao;

    }

    
    public double getSalarioLiquido(int categoriaEspecializacao){
        if(categoriaEspecializacao == 1){
            double salarioAcrescimo = getSalarioLiquido() * 0.05;
        return (getSalarioBruto() - getINSS() - getImpRenda()) + salarioAcrescimo;

        } else if (categoriaEspecializacao == 2){
            double salarioAcrescimo2 = getSalarioLiquido() * 0.1;
            return (getSalarioBruto() - getINSS() - getImpRenda()) + salarioAcrescimo2 ;

        } else {
            double salarioAcrescimo3 = getSalarioLiquido() * 0.2;
            return (getSalarioBruto() - getINSS() - getImpRenda()) + salarioAcrescimo3;
        }
    }
}
