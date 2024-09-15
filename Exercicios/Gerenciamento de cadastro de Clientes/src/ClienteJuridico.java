public class ClienteJuridico extends Cliente {
    private int mensalidade;

    public ClienteJuridico(String nome, int mensalidade){
        super(nome);
        this.mensalidade = mensalidade;
    }

    public void setMensalidade(int novaMensalidade){
        this.mensalidade = novaMensalidade;
    }

    public double getMensalidade(){
        return (double)mensalidade;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMensalidade: " + this.mensalidade;
    }
}
