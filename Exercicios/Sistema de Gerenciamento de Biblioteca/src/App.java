public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Municipal");

        Usuario usuario1 = new Usuario("Luiz", 1405);
        biblioteca1.adicionaUsuario(usuario1);

        Usuario usuario2 = new Usuario("Maria Eduarda", 1504);
        biblioteca1.adicionaUsuario(usuario2);

        Livro livro1 = new Livro("Senhor do Aneis", "J.R.R Tolkien", 1954, true);

        Livro livro2 = new Livro("Silmarilion", "J.R.R Tolkien", 1977, true);
        biblioteca1.adicionaLivro(livro1);
        biblioteca1.adicionaLivro(livro2);

        usuario1.emprestarLivros(livro1);
        usuario2.emprestarLivros(livro1);

        /*  livro1.exibirDetalhes(livro1);
        livro2.exibirDetalhes(livro2);

        usuario1.devolverLivro(livro1);
        usuario2.emprestarLivros(livro1);*/

        biblioteca1.exibirLivrosDisponiveis();
        usuario1.exibirLivrosEmprestados();
    }
}
