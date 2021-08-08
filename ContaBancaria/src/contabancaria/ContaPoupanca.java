package contabancaria;

public class ContaPoupanca extends Conta implements DepositoInicial {
	
	private static int numeroTotalDeContasPoupanca;
	
	public ContaPoupanca(int numero, Cliente cliente) {
		super(numero, cliente);
		ContaPoupanca.numeroTotalDeContasPoupanca += 1;
	}
	
	public static int getTotalContasPoupanca() {
		return numeroTotalDeContasPoupanca;
	}
	
	@Override
	public boolean temDepositoInicial(String resposta) {
		if(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's') {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void depositoInicial(double valor) {
		if(valor >= 1000.00) {
			super.deposita(valor);
		}
	}
	
	public String accountInfo() {
		return "Conta Corrente" + "\n" + "Agencia: " + super.getAgencia() + "\n"
				+ "Numero da Conta: " + super.getNumeroDaConta() + "\n"
				+ "Nome: " + super.getCliente().getNome() + "\n"
				+ "Sobrenome: " + super.getCliente().getSobrenome() + "\n"
				+ "CPF: " + super.getCliente().getCpf() + "\n";
	}
	
}
