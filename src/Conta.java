
public class Conta {

	private int numero;
	private double saldo;
	private double limite;
	private String extrato;
	
	public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
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
			setSaldo(getSaldo() - valor);
			extrato += "Saque de " + valor;
			
		}else {
			System.out.println("Saldo indisponivel");
		}
		
	}
	else {
		System.out.println("Limite Excedido");
	}
	}
	
	public void depositar(double valor) {
		 
		setSaldo(getSaldo() + valor);
		extrato += "Deposito de " + valor;
	}
	
	public double consultarSaldoDisponivel() {
		return getSaldo();

	}
	
	public String gerarExtrato() {	
		return extrato;	 
	}
	
	public void transferir(Conta destino, double valor) {
		setSaldo(getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);
	}
	
}



