import java.util.ArrayList;

public class Usuario{
    String nome;
    int id;
    ArrayList<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public int getId(){
        return id;
    }

    public void setId(int novoId){
        this.id = novoId;
    }

    public void emprestarLivros(Livro livro){
        if(livro.getDisponivel() == true){
            livrosEmprestados.add(livro);
            livro.setDisponivel(false);
            System.out.println("Livro Emprestado!");
        }
        else{
            System.out.println("Livro indisponivel");
        }
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
        livro.setDisponivel(true);
    }

    public void exibirLivrosEmprestados(){
        for(Livro livros : livrosEmprestados) {
            System.out.println(livros.getTitulo());
        }
    }
}