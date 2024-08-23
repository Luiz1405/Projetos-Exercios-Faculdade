package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

public class Pedido {
    private static SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    private StatusPedido status;
    private Cliente cliente;
    private List<PedidoItem> itens = new ArrayList<PedidoItem>();

    public Pedido(){
        
    }

    public Pedido(Date momento, StatusPedido status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
        
    }
    public Date getMomento() {
        return momento;
    }
    public void setMomento(Date momento) {
        this.momento = momento;
    }
    public StatusPedido getStatus() {
        return status;
    }
    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    
    public void adicionaItem(PedidoItem item){
        itens.add(item);
    }

    public void removerItem(PedidoItem item) {
        itens.remove(item);
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double total(){
        double soma = 0.0;
        for(PedidoItem i : itens){
           soma += i.subTotal();
        }
        return soma;
    }

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(dataformatada.format(momento) + "\n");
		sb.append("Status do pedido ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Items Pedidos:\n");
		for (PedidoItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Preço total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
    

    

    
}
