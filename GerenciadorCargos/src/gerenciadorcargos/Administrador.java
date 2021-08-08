
package gerenciadorcargos;

public class Administrador extends Funcionario implements Autenticavel {
	
	// Criando um atributo do tipo AutenticadorUtil
	private AutenticadorUtil auth;
	
	// No construtor da nossa classe instanciamos a nova classe
	// de auxilio para autenticar
	public Administrador() {
		this.auth = new AutenticadorUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
	
	// Utilizamos chamadas para metodos da outra classe realizar
	// a autenticacao
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
