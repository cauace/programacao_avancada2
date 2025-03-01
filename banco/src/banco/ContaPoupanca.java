package banco;

public class ContaPoupanca extends Contabancaria {

	public ContaPoupanca(int i, String titular, double saldo, double valor) {
		super(i, titular, saldo, valor);
		if(saldo>0) {
			System.out.println("SAQUE CONCLUIDO");
		            }else {
			System.out.println("saldo insuficiente");
		                  }
		
	                                               }



		


	

}
