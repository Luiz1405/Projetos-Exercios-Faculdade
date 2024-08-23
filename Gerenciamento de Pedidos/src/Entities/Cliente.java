
package Entities;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private static SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy");
    private String nome;
    private Date Aniversario;
    private String email;


    public Cliente(String nome, Date Aniversario, String email) {
        this.nome = nome;
        this.Aniversario = Aniversario;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getData_nascimento() {
        return Aniversario;
    }
    public void setData_nascimento(Date Aniversario) {
        this.Aniversario = Aniversario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return nome + "(" + dataformatada.format(Aniversario) + ") - " + email;
                
               
    }

    
}