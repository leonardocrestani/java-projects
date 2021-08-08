
package gerenciadorcargos;

public class ControleBonificacao {
	
	private double soma;
	
	// Metodo generico que calcula a bonificacao dos funcionarios
	// Ele recebe um funcionario
	public void registra(Funcionario f) {
		double boni = f.getBonificacao(); // Calcula utilizando o metodo especifico do tipo de funcionario passado
		this.soma = soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
