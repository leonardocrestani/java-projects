package aplicacao;

import dominio.Pessoa;
// Pacote adicionado para trabalhar com ArrayList
import java.util.ArrayList;
import java.util.List;
import util.Console;


public class Programa {
    // atributo para manter o array de pessoas - fica na memoria enquanto executando
    static List<Pessoa> pessoas = new ArrayList();
    
    public static void main(String[] args) {
        
        while(true) {
            
            Console.mostrarMensagem("N = Nova pessoa" + "\n" + "L = Listar" + "\n" + "R = Remover" + "\n" + "S = Sair", true);
            String opcao = Console.lerString("Sua opcao: ");
            String opcaoUpper = opcao.toUpperCase();
            
            switch(opcaoUpper) {
                case "N" : {
                    novaPessoa();
                    break;
                }
                case "L" : {
                    listarPessoas();
                    break;
                }
                case "R": {
                    removerPessoa();
                    break;
                }
                case "S" : {
                    System.exit(0);
                    break;
                }
            }
        }
        
    }
    
    public static void novaPessoa() {
        String nome = Console.lerString("Nome: ");
        String sobrenome = Console.lerString("Sobrenome: ");
        int idade = Console.lerNumero("Idade: ");
        // Inicializa o objeto pessoa com nome e idade
        Pessoa pessoa = new Pessoa(nome, sobrenome, idade);
        
        // vai armazenando todas as pessoas criadas no ArrayList
        pessoas.add(pessoa);
    }
    
    public static void removerPessoa() {
        String nomeRemover = Console.lerString("Nome da pessoa que deseja remover: ");
        // Percorre todo o array
        for(Pessoa p : pessoas) {
            // Verifica quando o nome de algum objeto do array for igual ao nome que deseja excluir
            if(p.getNome().equals(nomeRemover)) {
                // Remove o objeto do array
                pessoas.remove(p);
            }
        }
    }
    
    public static void listarPessoas() {
        // pegar todas as pessoas armazenadas no ArrayList e mostrar os dados utilizando um forEach na mao
        System.out.println("\n" + "---- Lista dos IMC`s calculados ----");
        for(Pessoa p : pessoas) {
            Console.mostrarMensagem(p.getPessoaInfo(), true);
        }
    }

}