public class Cliente {

	
	String nome;
	String cpf; 
	Conta conta = new Conta(); 
	CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
	
	
	public String retornarDados() {
		return "{Nome:" + nome + "| CPF: " + cpf +  
	               "\nConta=> " + conta.retornarDados() +  
	               "\nNúmero do Cartão de crédito=> " +  cartaoDeCredito.num_cartao + "}"; 
		
	}
	
}
