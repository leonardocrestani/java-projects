
package gerenciadorcargos;

// Gerente eh um funcionario, classe gerente herda atributos do funcionario (uma extensao)
// Gerente implementa a interface autenticavel assim tendo que implementar seus metodos
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticadorUtil auth;
	
	public Gerente() {
		this.auth = new AutenticadorUtil();
	}
	
	// Reescrita, temos este metodo na classe super e reescrevemos ele na classe filho
	@Override
	public double getBonificacao() {
		System.out.println("Realiza calculo de bonificacao para gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.auth.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.auth.autentica(senha);
		return autenticou;
	}
	
}
