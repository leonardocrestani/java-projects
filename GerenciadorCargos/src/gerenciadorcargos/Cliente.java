
package gerenciadorcargos;

public class Cliente implements Autenticavel {
	
	private AutenticadorUtil auth;
	
	public Cliente() {
		this.auth = new AutenticadorUtil();
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
