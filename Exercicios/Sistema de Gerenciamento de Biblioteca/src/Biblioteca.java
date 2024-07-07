import java.util.ArrayList;

public class Biblioteca {
    String nome;
    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public Biblioteca(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void adicionaLivro(Livro livro){
        livros.add(livro);
    }

    public void removeLivro(Livro livro){
        livros.remove(livro);
    }

    public void adicionaUsuario(Usuario usuario){
        usuarios.add(usuario);

    }

    public void removeUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

    public void exibirLivrosDisponiveis(){
        for(Livro livro : livros){
            if(livro.getDisponivel() == true) {
                System.out.println(livro.getTitulo());
            }
        }
    }

}
