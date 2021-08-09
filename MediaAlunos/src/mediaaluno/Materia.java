package mediaaluno;


public class Materia {
    private String nomeMateria;
    private Aluno alunoDaMateria;
    private double mediaAluno;
    
    public Materia(String nome, Aluno aluno) {
        this.nomeMateria = nome;
        this.alunoDaMateria = aluno;
    }
    
    public String getNomeMateria() {
        return this.nomeMateria;
    }
    
    public Aluno getAlunoDaMateria() {
        return this.alunoDaMateria;
    }
    
    public void setMediaAluno(double media) {
        this.mediaAluno = media;
    }
    
    public double getMediaAluno() {
        return this.mediaAluno;
    }
    
    public String getInfoMedia() {
        return "Nome: " + alunoDaMateria.getNome() + "\n" +
                "Materia: " + nomeMateria + "\n" +
                "Media final: " + mediaAluno;
    }
    
}
