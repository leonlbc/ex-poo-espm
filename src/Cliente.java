public class Cliente {

	
	String nome;
	String cpf; 
	Conta conta = new Conta(); 
	CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
	
	
	public String retornarDados() {
		return "{Nome:" + nome + "| CPF: " + cpf +  
	               "\nConta=> " + conta.retornarDados() +  
	               "\nN�mero do Cart�o de cr�dito=> " +  cartaoDeCredito.num_cartao + "}"; 
		
	}
	
}
