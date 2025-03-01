package banco;

public class ContaInvestimento extends Contabancaria{

	public ContaInvestimento(int numeroConta, String titular, double saldo, double valor) {
		super(numeroConta, titular, saldo, valor);
	}
	    @Override
	    public void sacar(double valor) {
	        double taxa = valor * 0.02;
	        if (saldo >= valor + taxa) {
	            saldo -= (valor + taxa);
	        } else {
	            System.out.println("Saldo insuficiente.");
	        }
		
	}
	
}
