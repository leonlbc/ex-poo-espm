
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private static double valeRef = 550.00;
	
	public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

	public String retornarDados() {
		return "Funcionario {Nome : " + getNome()
		+ ", CPF: " + getCpf() + ", Salario: "
		+ getSalario() +  ", Vale Refeicao: " + valeRef + "}"; 
	}
	
    public void aumentarSalario(double porcentagemSalario) {
		porcentagemSalario = 1 + (porcentagemSalario/100);
		setSalario(getSalario() * porcentagemSalario); 
	}
	
	public static void ajustarValeRefeicao(double porcentagemValeRef) {
		porcentagemValeRef = 1 + (porcentagemValeRef/100);
		valeRef = valeRef * porcentagemValeRef;
	}
	
}
