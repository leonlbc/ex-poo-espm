
public class Funcionario {

	String nome;
	String cpf;
	double salario;
	static double valeRef = 550.00;
	
	public String retornarDados() {
		return "{Nome do funcionario: " + nome + " | CPF: " + cpf + " | Salario: " + salario +  " | Vale Refeição: " + valeRef + "}"; 
		
	}
	
	public void aumentarSalario(double porcentagemSalario) {
		
		porcentagemSalario = 1 + (porcentagemSalario/100);
		salario = salario * porcentagemSalario; 
		
		
	}
	
	public static void ajustarValeRefeicao(double porcentagemValeRef) {
		 
		porcentagemValeRef = 1 + (porcentagemValeRef/100);
		valeRef = valeRef * porcentagemValeRef; 
		
		
	}
	
	
}
