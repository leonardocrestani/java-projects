package dominio;


public class Pessoa {
    private String nome;
    private String sobrenome;
    private double altura;
    private double peso;
    private Imc imc;
    
    public Pessoa(String nomePessoa, String sobrenomePessoa, double alturaPessoa, double pesoPessoa) {
        this.nome = nomePessoa;
        this.sobrenome = sobrenomePessoa;
        this.altura = alturaPessoa;
        this.peso = pesoPessoa;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public void setImc(Imc imc) {
        this.imc = imc;
    }
    
    public String getPessoaInfo() {
            return "Nome: " + this.nome + "\n" + "Sobrenome: " + this.sobrenome + "\n" + "Peso: " + this.getPeso() +
                    "\n" + "Altura: " + this.getAltura() + "\n" + "IMC: " + this.imc.getImc() + "\n" + "Indice: " + this.imc.getClassificacaoImc();
    }
}