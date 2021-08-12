package dominio;


public class Imc {
    private double altura;
    private double peso;
    private String classificacaoImc;
    private double imc;
    
    public Imc(double alturaPessoa, double pesoPessoa) {
        this.altura = alturaPessoa;
        this.peso = pesoPessoa;
    }
    
    public double getAltura() {
        return this.altura;
    }
    
    public double getPeso() {
        return this.peso;
    }
    
    public double getImc() {
        return this.imc;
    }
    
    public void calculaImc() {
        double imc = this.peso / (altura * altura);
        imc = Math.round(imc * 100);
        imc = imc/100;
        this.imc = imc;
    }
    
    public void classificaImc() {
        if(this.imc >= 39.9) {
            this.classificacaoImc = "Obesidade grave";
        }
        else if(this.imc >= 29.9) {
            this.classificacaoImc = "Obesidade";
        }
        else if(this.imc >= 24.9) {
            this.classificacaoImc = "Sobrepeso";
        }
        else if(this.imc >= 18.5) {
            this.classificacaoImc = "Normal";
        }
        else {
            this.classificacaoImc = "Magreza";
        }
    }
    
    public String getClassificacaoImc() {
        return this.classificacaoImc;
    }
    
}
