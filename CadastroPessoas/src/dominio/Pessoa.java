package dominio;


public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    
    public Pessoa(String nomePessoa, String sobrenomePessoa, int idadePessoa) {
        this.nome = nomePessoa;
        this.sobrenome = sobrenomePessoa;
        this.idade = idadePessoa;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public String getPessoaInfo() {
        return "Nome: " + this.nome + "\n" + "Sobrenome: " + this.sobrenome + "\n" + "Idade: " + this.idade + "\n";
    }
    
}
