package banco;

public class Contabancaria {
	int numeroConta;
	String titular;
	double saldo;
	double valor;
public Contabancaria(int numeroConta,String titular,double saldo,double valor) {
	this.numeroConta=numeroConta;
	this.saldo=saldo;
	this.titular=titular;
	this.valor=valor;
}



public int getNumeroConta() {
	return numeroConta;
}
public double getSaldo() {
	return saldo;
}
public String getTitular() {
	return titular;
}
public double getValor() {
	return valor;
}
public   double depositar(double valor,double saldo) {
return valor+saldo;
}
public void exibirInformacoes() {
 System.out.println("seu saldo e"+depositar(numeroConta, saldo));	
 
}
  public void sacar(double valor) {
}
}