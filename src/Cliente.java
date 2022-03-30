public class Cliente {

	String nome;
	String cpf; 
	Conta conta = new Conta(); 
	CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();	
	
	public String retornarDados() {
		return "{Nome:" + nome + ", CPF: " + cpf +  
	               ", Conta: " + conta.retornarDados() +  
	               ", Numero do Cartao: " +  cartaoDeCredito.getNumero() + "}"; 
	}
	
}
