package banco;

import java.util.Scanner;

public class teste_banco {
public static void main(String[] args) {
	System.out.println("1.Conta Corrente,2.Conta Poupança,	3.Conta Investimento,4.Conta Salário");
   Contabancaria c ;
        int tipoConta;
		ContaPoupanca conta;
		 Scanner scanner = new Scanner(System.in);
		 int tipoConta1 = scanner.nextInt();
		switch (tipoConta1) {
            case 1:
            	 c  = new ContaCorrente(222,"caique",40,22);
            	 
                break;
            case 2:
            	 c    = new ContaPoupanca(222, "lucas",50,30);
                break;
            case 3:
            	   c  = new ContaInvestimento(222,"ricardo",200,30);
                break;
            case 4:
            	c  = new Contasalario(222,"caua" , 22,22);
                break;
        
            default:
                System.out.println("Tipo de conta inválido.");
                return;
        }
			
        c.exibirInformacoes();
}
}

