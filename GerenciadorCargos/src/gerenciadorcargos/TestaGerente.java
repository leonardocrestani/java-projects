
package gerenciadorcargos;

public class TestaGerente {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente(); // Instacia a classe gerente
		
		// Aqui estou colocando valor nas propriedades da classe funcionario na classe gerente
		// Apos o uso do extends as propriedades ficam disponiveis para o gerente tambem
		g1.setNome("Marco");
		g1.setCpf("3123123423");
		g1.setSalario(3000.00);
		
		System.out.println(g1.getNome()); // Retorna Marco
		System.out.println(g1.getCpf()); // Retorna 3123123423
		System.out.println(g1.getSalario()); // Retorna 3000.00
		
		// Aqui estou colocando valor em uma propriedade nativa da classe gerente
		// tambem esta acessivel
		g1.setSenha(0505);
		
		boolean autenticou = g1.autentica(0505);
		System.out.println(autenticou);
		
		
	}
}
