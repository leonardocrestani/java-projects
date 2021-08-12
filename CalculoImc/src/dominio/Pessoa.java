package dominio;


public class Pessoa {
    private String nome;
    private String sobrenome;
    private Imc imc;
    
    public Pessoa(String nomePessoa, String sobrenomePessoa) {
        this.nome = nomePessoa;
        this.sobrenome = sobrenomePessoa;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setImc(Imc imc) {
        this.imc = imc;
    }
    
    public String getPessoaInfo() {
            return "Nome: " + this.nome + "\n" + "Sobrenome: " + this.sobrenome + "\n" + "Peso: " + this.imc.getPeso() +
                    "\n" + "Altura: " + this.imc.getAltura() + "\n" + "IMC: " + this.imc.getImc() + "\n" + "Indice: " + this.imc.getClassificacaoImc();
    }
}
