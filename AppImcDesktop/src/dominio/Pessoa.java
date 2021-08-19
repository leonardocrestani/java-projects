package dominio;

import util.Imc;


public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private Imc imc;
    
    public Pessoa(String nomePessoa, int idadePessoa, double pesoPessoa, double alturaPessoa) {
        this.nome = nomePessoa;
        this.idade = idadePessoa;
        this.peso = pesoPessoa;
        this.altura = alturaPessoa/100;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public void setImc(Imc imcPessoa) {
        this.imc = imcPessoa;
    }
    
    public Imc getImc() {
        return this.imc;
    }
    
}
