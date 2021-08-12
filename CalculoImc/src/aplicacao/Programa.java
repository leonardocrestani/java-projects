package aplicacao;

import util.Console;
import dominio.Imc;
import dominio.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    static List<Pessoa> pessoas = new ArrayList();

    public static void main(String[] args) {
        
        while(true) {
            
            Console.mostraMensagem("-- Calculadora de IMC --", true);
            Console.mostraMensagem("A = Adicionar pessoa e calcular IMC" + "\n" + "L = Listar" + "\n" + "S - Sair", true);
            String opcao = Console.lerString("Selecione a opcao: ");
            String opcaoUpper = opcao.toUpperCase();
            
            switch(opcaoUpper) {
                case "A" : {
                    criaPessoa();
                    break;
                }
                case "L" : {
                    listarPessoas();
                    break;
                }
                case "S" : {
                    System.exit(0);
                    break;
                }
            }
            
        }
        
    }
    
    public static void criaPessoa() {
        String nome = Console.lerString("Nome: ");
        String sobrenome = Console.lerString("Sobrenome: ");
        double altura = Console.lerDoubleImc("Altura: ");
        double peso = Console.lerDoubleImc("Peso: ");
        Pessoa p = new Pessoa(nome, sobrenome, altura, peso);
        Imc imc = new Imc();
        imc.calculaImc(p.getPeso(), p.getAltura());
        imc.classificaImc();
        p.setImc(imc);
        pessoas.add(p);
    }
    
    public static void listarPessoas() {
        // pegar todas as pessoas armazenadas no ArrayList e mostrar os dados utilizando um forEach na mao
        System.out.println("\n" + "---- Lista das pessoas cadastradas e IMC ----");
        for(Pessoa p : pessoas) {
            Console.mostraMensagem(p.getPessoaInfo(), true);
            System.out.println();
        }
    }

}