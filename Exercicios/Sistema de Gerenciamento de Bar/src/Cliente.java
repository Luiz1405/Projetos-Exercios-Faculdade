import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cpf;
    private int idade;
    private String genero;
    public Cliente(String cpf, int idade, String genero) {
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString(){
        return "\nCpf: " + cpf + "\nIdade: " + idade + "\nGenero: " + genero;
    }

    
}
