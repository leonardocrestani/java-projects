
package gerenciadorcargos;

// interface(contrato) Autentica
	// quem utilizar essa interface(contrato), precisa implementar por conta
	// como e um metodo abstrato sempre alguem precisa dar vida/implementar
		// metodo setSenha
		// metodo autentica

public abstract interface Autenticavel {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	

}
