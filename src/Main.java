import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Teste dos metodos das classes
		Scanner teclado = new Scanner(System.in);
		
		double porcentagemSalario; 
		double porcentagemValeRef;
		
		Cliente cliente = new Cliente();
		Funcionario funcionario = new Funcionario();

		//Cliente
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

		//Funcionario
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

		System.out.println(cliente.retornarDados());
		System.out.println(funcionario.retornarDados());
	}

}
