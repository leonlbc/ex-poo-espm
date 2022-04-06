import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Conta {

	private Cliente cliente;
	private int numero;
	private double saldo;
	private double limite;
	private List<Lancamento> extrato = new ArrayList<Lancamento>();
	
	public Conta(Cliente cliente){
		this.cliente = cliente;
	}

	public double getLimite() {
        return limite;
    }

    public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getCliente() {
        return cliente;
    }

	public void setDados(int numero, int limite) {
		this.limite = limite;
		this.numero = numero;
	}

	public String retornarDados() {
		return  "{Numero Da Conta: " + getNumero()
				+ ", Limite: " + getLimite() 
				+ ", Saldo: " + getSaldo() + "}"; 
	}

	public void sacar(double valor) { 
		if(valor < getLimite()) {
			if (valor <= getSaldo()) {
				this.saldo -= valor;
				extrato.add(new Lancamento(valor));
			}else {
				System.err.println("Saldo indisponivel");
			}
		}else {
			System.err.println("Limite Excedido");
		}
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		extrato.add(new Lancamento(valor));
	}
	
	public double consultarSaldoDisponivel() {
		return getSaldo();
	}
	
	public String gerarExtrato() {
		String extrato_resumo = "\n\n--Extrato-- \n\n";
		extrato_resumo += extrato.stream().map(Lancamento::toString).collect(Collectors.joining());
		extrato_resumo += "\n------------\n";
		return extrato_resumo;	 
	}

	public String gerarExtrato(int dias) {
		String extrato_dias = "\n\n--Extrato--" + " (Ultimos " + dias + " Dias)\n\n";
		extrato_dias += extrato.stream().filter((l) -> l.passouDias(dias))
							.map(Lancamento::toString).collect(Collectors.joining());
		extrato_dias += "\n------------\n";
		return extrato_dias;	 
	}
	
	public void transferir(Conta destino, double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
		}
	}
	
}



