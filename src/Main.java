//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();

		//Cliente
		cliente.nome = "Joao";
		cliente.cpf = "234.234.323-5";
		cliente.cartaoDeCredito.setNumero("2433-2342-4324-2432");
		cliente.conta.setLimite(2000);
		cliente.conta.setNumero(1);
		cliente.conta.setSaldo(1500);
		cliente.conta.sacar(400);
		cliente.conta.sacar(200);
		cliente.conta.depositar(400);

		//Funcionario
		funcionario.setNome("Ana");
		funcionario.setCpf("434.343.343-3");
		funcionario.setSalario(1200);
		funcionario.aumentarSalario(13);
		Funcionario.ajustarValeRefeicao(5);
		
		System.out.println(cliente.retornarDados());
		System.out.println(funcionario.retornarDados());
		System.out.println(cliente.conta.gerarExtrato());
		System.out.println(cliente.conta.gerarExtrato(3));

						//Cliente
		/*
		Scanner teclado = new Scanner(System.in);
		double porcentagemSalario; 
		double porcentagemValeRef;
		System.out.println("Informacoes do Cliente \n");
		System.out.println("Nome: ");
		cliente.nome = teclado.nextLine();
		System.out.println("CPF: ");
		cliente.cpf = teclado.nextLine();
		System.out.println("Numero do Cartao de Credito: ");
		cliente.cartaoDeCredito.setNumero(teclado.nextLine());
		System.out.println("Numero da Conta: ");
		cliente.conta.setNumero(teclado.nextInt());
		System.out.println("Saldo da Conta: ");
		cliente.conta.setSaldo(teclado.nextDouble());
		System.out.println("Limite da Conta: ");
		cliente.conta.setLimite(teclado.nextDouble());
		teclado.nextLine();
		*/
						//Funcionario
		/*
		System.out.println("Informacoes do Funcionario \n");
		System.out.println("Nome: ");
		funcionario.setNome(teclado.nextLine());
		System.out.println("CPF: ");
		funcionario.setCpf(teclado.nextLine());
		System.out.println("Salario: ");
		funcionario.setSalario(teclado.nextDouble());
		System.out.println("Aumento do Salario (%): ");
		porcentagemSalario = teclado.nextDouble();
		funcionario.aumentarSalario(porcentagemSalario);
		System.out.println("Aumento do Vale Refeicao (%): ");
		porcentagemValeRef = teclado.nextDouble();
		Funcionario.ajustarValeRefeicao(porcentagemValeRef);
		*/
	}

}
