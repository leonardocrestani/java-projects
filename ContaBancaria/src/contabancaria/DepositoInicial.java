package contabancaria;

public abstract interface DepositoInicial {
	
	public abstract boolean temDepositoInicial(String resposta);
	
	public abstract void depositoInicial(double valor);
}
