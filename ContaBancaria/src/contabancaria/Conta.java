package contabancaria;

public abstract class Conta {
	private int agencia;
	private int numeroDaConta;
	private Cliente cliente;
	private double saldo;
	
	public Conta(int numero, Cliente cliente) {
		this.agencia = 1;
		this.numeroDaConta = numero;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valor) {
		if(valor > 0) {
			this.saldo = valor;
		}
	}
	
	public void saca(double valor) {
		if(valor > 0 && saldo > 0) {
			this.saldo -= valor;
		}
	}
	
	public void transfere(double valor, ContaCorrente conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
}
