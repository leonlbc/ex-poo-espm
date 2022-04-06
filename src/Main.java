//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Joao","234.234.323-5");
		Cliente cliente2 = new Cliente("Leo","264.224.423-5");
		Funcionario funcionario = new Funcionario("Ana", "434.343.343-3");

		//Cliente 1
		cliente1.getCartaoDeCredito().setNumero("2433-2342-4324-2432");
		cliente1.getConta().setDados(1, 2000);
		cliente1.getConta().depositar(450);
		cliente1.getConta().sacar(400);
		
		//Cliente 2
		cliente2.getCartaoDeCredito().setNumero("6666-2222-1111-3333");
		cliente2.getConta().setDados(2, 2000);
		cliente2.getConta().depositar(600);
		cliente2.getConta().sacar(200);

		//Transferencia
		cliente1.getConta().transferir(cliente2.getConta(), 250);

		//Funcionario;
		funcionario.setSalario(1200);
		funcionario.aumentarSalario(13);
		Funcionario.ajustarValeRefeicao(5);
		
		//Dados e Extrato
		System.out.println(cliente1.retornarDados());
		System.out.println(cliente2.retornarDados());
		System.out.println(funcionario.retornarDados());
		System.out.println(cliente1.getConta().gerarExtrato());
		System.out.println(cliente1.getConta().gerarExtrato(3));
	}

}
