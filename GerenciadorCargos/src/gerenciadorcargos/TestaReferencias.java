
package gerenciadorcargos;

public class TestaReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marcos");
		g1.setSalario(2000);
		
		/* por conta da classe ser abstrata ela nao pode ser inicializada assim
		 so e possivel inicializar as classe mais especificas
		 
		Funcionario f1 = new Funcionario();
		f1.setNome("Pedro");
		f1.setSalario(1000);*/
		
		EditorVideo e1 = new EditorVideo();
		
		e1.setNome("Fabio");
		e1.setSalario(1500);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1); // Registra um funcionario gerente
		controle.registra(e1); // Registra um funcionario editor de video
		
		System.out.println(controle.getSoma()); // Retorna a soma da bonificacao de todos os funcionarios registrados
		
	}
}
