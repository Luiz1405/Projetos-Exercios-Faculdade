
import java.util.ArrayList;
import java.util.List;

public class Lustre{
    private int numerolampadas;
    private List<Lampada> lampadas;
    private String estado;

    public Lustre(int numerolampadas){
        this.numerolampadas = numerolampadas;
        this.lampadas = new ArrayList<>(numerolampadas);
        this.estado = "Desligado";
    }

    public void ligarLustre(){
        if(lampadas.isEmpty()){
            System.out.println("O lustre não tem nenhuma lampada para ligar!");
        }

        for(Lampada l : lampadas){
            l.ligarLampada();
        }
            estado = "Desligado";
            System.out.println("Lustre ligado.");
    }

    public void desligarLustre(){
        for(Lampada l : lampadas) {
            l.desligarLampada(l);
        }
        if(estado.equalsIgnoreCase("Desligado")){
            System.out.println("O lustre já está desligado.");
        } else {
            estado.equalsIgnoreCase("Desligado");
        }
    }

    public void adicionarLampada(Lampada lampada){
        if(lampadas.size() >= 6) {
            System.out.println("Número de lampadas excedido.");
        } else {
        lampadas.add(lampada);
        }
    }

    public boolean verficaEstado(){
        if(lampadas.isEmpty()){
            System.out.println("O lustre não tem nenhuma lampada para ser verificada.");
        }

        for(Lampada l : lampadas ) {
            if(l.getEstado().equalsIgnoreCase("Queimada")) {
                return true;
            } 
                 
        }
                return false; 
    }

    public List<Lampada> posicaoLampadaQueimada(){
        ArrayList<Lampada> indiceLampadasQueimadas = new ArrayList<>();
        for(Lampada l : lampadas){
           if(l.getEstado().equalsIgnoreCase("Queimada")){
            indiceLampadasQueimadas.add(l);
           }
        }
        return indiceLampadasQueimadas;
    }



    
    

    
}
