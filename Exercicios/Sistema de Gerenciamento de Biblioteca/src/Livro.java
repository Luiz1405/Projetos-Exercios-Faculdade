public class Livro {

    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel;


    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String novoTitulo){
        this.titulo = novoTitulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }
    
    public int getAnopublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao(int novoAnoPublicacao){
        this.anoPublicacao = novoAnoPublicacao;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean novoDisponivel){
        this.disponivel = novoDisponivel;
    }

    public void exibirDetalhes(Livro livro){
        System.out.println(livro.toString());
    }

    @Override
    public String toString(){
        return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno que foi publicado: " + anoPublicacao + "\nDisponivel: " + disponivel;
    }
}
