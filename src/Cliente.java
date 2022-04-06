public class Cliente {

	private String nome;
	private String cpf; 
	private Conta conta; 
	private CartaoDeCredito cartaoDeCredito;	
	
	public Cliente(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
		this.conta = new Conta(this);
		this.cartaoDeCredito = new CartaoDeCredito();
	}

	public CartaoDeCredito getCartaoDeCredito(){
		return this.cartaoDeCredito;
	}

	public Conta getConta() {
		return this.conta;
	}

	public String retornarDados() {
		return "Cliente {Nome : " + nome + ", CPF: " + cpf +  
	               ", Conta: " + conta.retornarDados() +  
	               ", Numero do Cartao: " +  cartaoDeCredito.getNumero() + "}"; 
	}
	
}
