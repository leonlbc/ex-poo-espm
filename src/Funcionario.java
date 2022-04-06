
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	private static double valeRef = 550.00;

	public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

	public String retornarDados() {
		return "Funcionario {Nome : " + this.nome
		+ ", CPF: " + this.cpf + ", Salario: "
		+ this.salario +  ", Vale Refeicao: " + valeRef + "}"; 
	}
	
    public void aumentarSalario(double porcentagemSalario) {
		porcentagemSalario = 1 + (porcentagemSalario/100);
        this.salario = this.salario * porcentagemSalario;
	}
	
	public static void ajustarValeRefeicao(double porcentagemValeRef) {
		porcentagemValeRef = 1 + (porcentagemValeRef/100);
		valeRef = valeRef * porcentagemValeRef;
	}
	
}
