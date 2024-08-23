package Entities;
public class PedidoItem {
    private Integer quantidade;
    private double preco;

    public PedidoItem(Integer quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    private Produto produto;


    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double subTotal(){
        return preco * quantidade;
    }

    @Override
    public String toString(){
        return getProduto().getNome() 
               + ", R$"
               + String.format("%.2f", preco)
               + ", Quantidade: " 
               + quantidade
               + ", SubTotal: "
               + String.format("%.2f", subTotal()); 
    }

    
    
}
