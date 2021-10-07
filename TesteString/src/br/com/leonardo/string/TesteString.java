package br.com.leonardo.string;


public class TesteString {

    public static void main(String[] args) {
        
        String nome = "Alura";
        
        String minuscula = nome.toLowerCase(); // alura
        String maiuscula = nome.toUpperCase(); // ALURA
        String trocaNomeChar = nome.replace('A', 'a'); // alura
        String trocaComeco = nome.replace("Alu", "ALU"); //ALUra
        char primeiraLetra = nome.charAt(0); // Retorna A letra do indice 0
        int posicao = nome.indexOf("ur"); // Retorna o inteiro 2 lugar que começa a String passada
        String substringInicio = nome.substring(1); // lura
        String substringInicioFim = nome.substring(1, 3); // lu
        int tamanhoString = nome.length(); // 5
        boolean vazioEmpty = nome.isEmpty(); // false
        boolean vazioBlank = nome.isBlank(); // false
        String adaptada = nome.trim(); // Alura
        boolean contem = nome.contains("lu"); // true
        
        System.out.println(nome); // Alura
        
    }

}