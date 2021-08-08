
package gerenciadorcargos;

public class EditorVideo extends Funcionario {
	
	// metodo abstrato sendo implementado na classe filha editorVideo
	@Override
	public double getBonificacao() {
		System.out.println("Realiza calculo de bonificacao para editor de video");
		return 150;
	}
	
}
