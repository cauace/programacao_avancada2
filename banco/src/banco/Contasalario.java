package banco;

public class Contasalario  extends ContaCorrente{
	   private static int saquesGratuitos;
	int saquesGratuitos1 = 1;

	    public Contasalario(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
	      super(saquesGratuitos, titular, saldo, limiteChequeEspecial);
	    }

	 

		
		



		@Override
	    public void sacar(double valor) {
	        if (saquesGratuitos > 0) {
	            saquesGratuitos--;
	            super.sacar(valor);
	        } else {
	            double limiteChequeEspecial = 0;
				if (saldo + limiteChequeEspecial >= valor + 5) {
	                saldo -= (valor + 5);
	            } else {
	                System.out.println("Saldo insuficiente.");
}
}
	    
	    }
}