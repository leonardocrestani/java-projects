package contabancaria;

public class ContaCorrente extends Conta implements DepositoInicial {
	private static int numeroTotalDeContasCorrente;

	public ContaCorrente(int numero, Cliente cliente) {
		super(numero, cliente);
		ContaCorrente.numeroTotalDeContasCorrente += 1;
	}
	
	public static int getTotalContasCorrente() {
		return numeroTotalDeContasCorrente;
	}
	
	@Override
	public void depositoInicial(double valor) {
		if(valor >= 100.00) {
			super.deposita(valor);
		}
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
	
	public String accountInfo() {
		return "Conta Corrente" + "\n" + "Agencia: " + super.getAgencia() + "\n"
				+ "Numero da Conta: " + super.getNumeroDaConta() + "\n"
				+ "Nome: " + super.getCliente().getNome() + "\n"
				+ "Sobrenome: " + super.getCliente().getSobrenome() + "\n"
				+ "CPF: " + super.getCliente().getCpf() + "\n";
	}
	
}
