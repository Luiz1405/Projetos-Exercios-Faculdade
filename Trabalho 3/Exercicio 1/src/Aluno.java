public class Aluno {
    private String nome;
    private int matricula;
    private double frequencia,p1,p2,p3, mediaExercicio;
    private double media;

    public Aluno(String nome, int matricula, double frequencia, double p1, double p2, double p3, double mediaExercicio) throws NotaInvalidaException{
        if(p1 < 0 || p2 < 0 || p3 < 0) {
            throw new NotaInvalidaException();
        }
        this.nome = nome;
        this.matricula = matricula;
        this.frequencia = frequencia;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.mediaExercicio = mediaExercicio;
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

    public double getFrequencia(){
        return frequencia;
    }

    public void setFrquencia(double novaFrequencia){
        this.frequencia = novaFrequencia;
    }

    public double getP1(){
        return p1;
    }

    public void setP1(double novoP1){
        this.p1 = novoP1;
    }

    public double getP2(){
        return p2;
    }

    public void setP2(double novoP2){
        this.p2 = novoP2;
    }

    public double getP3(){
        return p3;
    }

    public void setP3(double novoP3){
        this.p3 = novoP3;
    }

    public double getMediaExercicio(){
        return mediaExercicio;
    }

    public void setMediaExercicio(double novaMediaExercicio){
        this.mediaExercicio = novaMediaExercicio;
    }

    /*Método que calcula a media g1 do aluno, recebendo um objeto aluno da classe aluno como parametro, realizei a verificação das notas com if e criei
        uma exceção para nota invalida, verificando se a nota digitada é negativa.
    */
    public void CalculaG1(){
        
        media = (p1+p2+p3+mediaExercicio) / 4;

        if(media >=7 && frequencia >= 75){
            System.out.println("O Aluno "+ nome + ", matricula " + matricula + " foi aprovado em G1!!");

        } else if (media <7 && media >=4 && frequencia >= 75) {
            System.out.println("O Aluno "+ nome + ", matricula " + matricula + " está de G2!!");

        } else {
            System.out.println("O Aluno "+ nome + ", matricula " + matricula + " foi reprovado!!");
        }
    }

    @Override
    public String toString(){
        return "\nNome do aluno: " + getNome() + "\nMatricula: " + matricula + "\nFrequencia: " + frequencia + "\nNota P1: " + p1 + "\nNota P2: " + p2 + "\nNota P3: " + p3 + "\nMedia de exercicios: " + mediaExercicio + "\nMédia G1: " + media + "\n";

    }
 }
