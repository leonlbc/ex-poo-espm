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
		System.out.println("Digite o n�mero do Cart�o de Cr�dito --> ");
		cliente.cartaoDeCredito.num_cartao = teclado.nextLine();
		
		System.out.println("Qual o n�mero da conta -->");
		cliente.conta.numero = teclado.nextInt();
				
		System.out.println("Qual o saldo da conta -->");
		cliente.conta.saldo = teclado.nextDouble();
		
		System.out.println("Qual o limite da conta -->");
		cliente.conta.limite = teclado.nextDouble();
		
		Funcionario funcionario = new Funcionario();
		
		teclado.nextLine();
		
		System.out.println("Qual o nome do funcion�rio --> ");
		funcionario.nome = teclado.nextLine();
		
		System.out.println("Qual o cpf do funcion�rio --> ");
		funcionario.cpf = teclado.nextLine();
		
		System.out.println("Qual o sal�rio do funcion�rio --> ");
		funcionario.salario = teclado.nextDouble();
		
		System.out.println("Qual a porcentagem de aumento do sal�rio --> ");
		porcentagemSalario = teclado.nextDouble();
		funcionario.aumentarSalario(porcentagemSalario);
		
		System.out.println("Qual a porcentagem de aumento do Vale Refei��o --> ");
		porcentagemValeRef = teclado.nextDouble();
		Funcionario.ajustarValeRefeicao(porcentagemValeRef);
		
	
		
		System.out.println(cliente.retornarDados());
		System.out.println(funcionario.retornarDados());
	}

}
