import java.util.ArrayList;
import java.util.List;

public class Bar{
    private String nome;
    private List<Cliente> clientes;

    public Bar(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void entradaBar(String cpf, int idade, String genero){
        clientes.add(new Cliente(cpf, idade, genero));
        System.out.println("Registo de cliente realizado com sucesso!");

    }

    public void saidaBar(Cliente cliente){
        if(clientes.isEmpty()){
            throw new RuntimeException("Bar está vazio!");
        } else {
            clientes.remove(cliente);
        }
    }

    public void verificarClienteCpf(String cpf){
        if(clientes.isEmpty()){
            throw new RuntimeException("Bar está vazio!");
        }

        for(Cliente c : clientes) {
            if(c.getCpf().equalsIgnoreCase(cpf)){
                System.out.println("Cliente está no bar");

            } else {
                System.out.println("Cliente não encontrado.");
            }
            
        }

    }

    public void verificaQuantidadeCliente(){
         int masc = 0, fem = 0;
         if(clientes.isEmpty()){
            throw new RuntimeException("Bar está vazio!");
        }

        for(Cliente c : clientes){
            if(c.getGenero().equalsIgnoreCase("Masculino")) {
                masc++;

            } else if(c.getGenero().equalsIgnoreCase("Feminino")){
                fem++;
            }

        }

        double totalMasc = ((double) masc / clientes.size()) * 100;
        double totalFem = ((double) fem / clientes.size()) * 100;

        System.out.println("O total de pessoas presentes no bar é : " + clientes.size() + ", O percentual do sexo masculino é : " + totalMasc + "%, e o total do sexo feminino é : " + totalFem + "%.");
    }

}