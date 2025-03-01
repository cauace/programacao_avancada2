package banco;



public class ContaCorrente extends Contabancaria {
	
	


	public ContaCorrente(int saquesGratuitos, String titular, double saldo,double valor) {
		super(saquesGratuitos,titular,saldo,valor);
	
		
		
		
	
	if (saldo>valor) {
		System.out.println("OPERACAO CONCLUIDA");
	
	}else {
		System.out.println("saldo insuficiente deseja usar o cheque especial?");
	}
		
	}
		

		
	

		
		
			
		

}
