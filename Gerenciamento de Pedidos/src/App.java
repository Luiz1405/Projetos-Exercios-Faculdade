import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Cliente;
import Entities.Pedido;
import Entities.PedidoItem;
import Entities.StatusPedido;
import Entities.Produto;


public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat dataformatada = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira os dados do cliente:");
		System.out.print("Nome: ");
		String nome = in.nextLine();
		System.out.print("Email: ");
		String email = in.next();
		System.out.print("Aniversario (DD/MM/YYYY): ");
		Date aniversario = dataformatada.parse(in.next());

        Cliente cliente = new Cliente(nome, aniversario, email);


        System.out.println("Insira os dados do pedido: ");
        System.out.println("Status: ");
        StatusPedido status = StatusPedido.valueOf(in.next());
        System.out.println();

        Pedido ordem = new Pedido(new Date(), status,cliente);


        System.out.println("Quantos items o pedido vai ter? ");
        int pedidos = in.nextInt();
        for(int i = 0; i < pedidos ; i++){
            System.out.println("Insira os dados do #" + (i+1) + " pedido.");
            System.out.println("Nome do produto: ");
            in.nextLine();
            String nomeProduto = in.nextLine();
            System.out.println("Preço do produto: ");
            double precoProduto = in.nextDouble();
            System.out.println("Quantidade");
            int quantidade = in.nextInt();

            Produto produto = new Produto(nomeProduto, precoProduto);

            PedidoItem it = new PedidoItem(quantidade, precoProduto, produto);

            ordem.adicionaItem(it);


        }
        System.out.println();
        System.out.println(ordem);

        cliente.getNome();


        in.close();
    }
}
