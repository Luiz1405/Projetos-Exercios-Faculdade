import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadastroClientes {
   

    public CadastroClientes(){
        clientes = new ArrayList<>();
    }

    List<Cliente> clientes;
    Scanner in = new Scanner(System.in);

    public void cadastrarCliente(){
        String nome;
        int idade;
        double salario;
        int mensalidade;
        int verifica;

    while(true){

    System.out.println("Preciso saber se vamos cadastrar uma pessoa fisica ou juridica, escolha a opção correta:");
    System.out.println("1- Pessoa Fisica.");
    System.out.println("2- Pessoa Juridica");
    verifica = Integer.parseInt(in.nextLine());
    
    switch (verifica) {
        case 1:
        System.out.println("Iniciando o cadastro do Cliente!");
        System.out.println("Digite o nome do cliente:");
        nome = in.nextLine();
        System.out.println("Digite a idade:");
        idade = Integer.parseInt(in.nextLine());
        System.out.println("Digite o seu salário");
        salario = Double.parseDouble(in.nextLine());
        ClienteFisico cliente = new ClienteFisico(nome, idade, salario);
        clientes.add(cliente);
        System.out.println("Cadastrando cliente...");
        System.out.println("Cliente cadastrado com sucesso.");
        break;
        
        case 2:
        System.out.println("Digite o nome da empresa: ");
        nome = in.nextLine();
        System.out.println("Quanto vai ser a mensalidade?");
        mensalidade = Integer.parseInt(in.nextLine());
        
            ClienteJuridico clienteJ = new ClienteJuridico(nome,mensalidade);
            clientes.add(clienteJ);
            System.out.println("Cadastrando cliente...");
            System.out.println("Cliente cadastrado com sucesso.");
            break;
    
        default:
        System.out.println("Opção Invalida!");
            break;
    }
    System.out.println("Gostaria de cadastrar outro cliente?");
    System.out.println("Digite 1 se quiser, e 2 caso contrario. ");
    verifica = Integer.parseInt(in.nextLine());

    if(verifica == 1){
        continue;
    } else {
        System.out.println("Encerrendo o programa...");
        break;
        }

    }  
  }

  public void exibirClientes(){
    System.out.println("Clientes cadastrados!");
    for(Cliente c : clientes){
        System.out.println(c);
    }
  }

}
