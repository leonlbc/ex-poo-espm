
public class Conta {

	int numero;
	double saldo;
	double limite;
	String extrato;
	
	public String retornarDados() {
		return  "{Numero conta: " + numero + " | Limite: " + limite + " | Saldo: " + saldo + "}"; 
		
	}
	
	
	public void sacar(double valor) {
		 
	if(valor < limite) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			extrato += "Saque de " + valor;
			
		}else {
			System.out.println("Saldo indisponível");
		}
		
	}else {
		System.out.println("Limite Excedido");
	}
}
	
	public void depositar(double valor) {
		 
		saldo = saldo + valor;
		extrato += "Depósito de " + valor;
	}
	
	public double consultarSaldoDisponivel() {
		return saldo;

	}
	
	public String gerarExtrato() {	
		return extrato;	 
	}
	
	
	public void transferir(Conta destino, double valor) {
		saldo = saldo - valor;
        destino.saldo = destino.saldo + valor;
	}
	
}



