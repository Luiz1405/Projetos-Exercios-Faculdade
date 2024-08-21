
import java.util.Random;

public class Lampada {
    private String estado;

    public Lampada(){
        this.estado = "Desligada";
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String novoEstado){
        this.estado = novoEstado;
    }

    public void ligarLampada(){
        setEstado("Ligado");
        if(estado.equalsIgnoreCase("Queimada")) {
            System.out.println("A lampada está queimada e não pode ser ligada.");
        }
            
            Random resultado = new Random();
            int chance = resultado.nextInt(100);

            if(chance < 30 ) {
                System.out.println("A lampada queimou!");
                setEstado("Queimada");

            } else {
                System.out.println("Lampada ligada!");
                setEstado("Ligada");
            }

    }

    public void desligarLampada(Lampada lampada){
        if(lampada.getEstado().equalsIgnoreCase("Queimada")){
            System.out.println("A lampada está queimada!");

        } else {
            setEstado("Desligada.");
            System.out.println("Lampada desligada.");
        }
    }

    public void verificarEstado(Lampada lampada){
        System.out.println(lampada.getEstado());
    }
    
}
