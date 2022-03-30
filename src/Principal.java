import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double porcentagemSalario; 
		double porcentagemValeRef;
		
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o seu nome --> ");
		cliente.nome = teclado.nextLine();
		System.out.println("Digite o seu cpf --> ");
		cliente.cpf = teclado.nextLine();
		System.out.println("Digite o número do Cartão de Crédito --> ");
		cliente.cartaoDeCredito.num_cartao = teclado.nextLine();
		
		System.out.println("Qual o número da conta -->");
		cliente.conta.numero = teclado.nextInt();
				
		System.out.println("Qual o saldo da conta -->");
		cliente.conta.saldo = teclado.nextDouble();
		
		System.out.println("Qual o limite da conta -->");
		cliente.conta.limite = teclado.nextDouble();
		
		Funcionario funcionario = new Funcionario();
		
		teclado.nextLine();
		
		System.out.println("Qual o nome do funcionário --> ");
		funcionario.nome = teclado.nextLine();
		
		System.out.println("Qual o cpf do funcionário --> ");
		funcionario.cpf = teclado.nextLine();
		
		System.out.println("Qual o salário do funcionário --> ");
		funcionario.salario = teclado.nextDouble();
		
		System.out.println("Qual a porcentagem de aumento do salário --> ");
		porcentagemSalario = teclado.nextDouble();
		funcionario.aumentarSalario(porcentagemSalario);
		
		System.out.println("Qual a porcentagem de aumento do Vale Refeição --> ");
		porcentagemValeRef = teclado.nextDouble();
		Funcionario.ajustarValeRefeicao(porcentagemValeRef);
		
	
		
		System.out.println(cliente.retornarDados());
		System.out.println(funcionario.retornarDados());
	}

}
