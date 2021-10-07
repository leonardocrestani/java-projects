package br.upf.prova.domain;


public class Estacionamento {
    private int espera;
    private int andarUm;
    private int andarDois;
    private int andarTres;
    
    public Estacionamento() {
        this.espera = 0;
        this.andarUm = 0;
        this.andarDois = 0;
        this.andarTres = 0;
    }
    
    public void chegada() throws Exception {
        if(andarUm < 5) {
            andarUm++;
        }
        else if(andarUm == 5 && andarDois < 5) {
            andarDois++;
        }
        else if(andarDois == 5 && andarTres < 3) {
            andarTres++;
        }
        else if(andarTres == 3 && espera < 2) {
            espera++;
        }
        else {
            throw new Exception("Estacionamento e área de espera estão lotados");
        }
    }
    
    public void saidaVeiculo(int andar) throws Exception {
        if(andar == 1) {
            if(andarUm > 0) {
                andarUm--;
                if(espera > 0) {
                    espera--;
                    this.chegada();
                }
            }
            else {
                throw new Exception("Nenhum carro para sair do andar um");
            }
            
        }
        else if(andar == 2) {
            if(andarDois > 0) {
                andarDois--;
                if(espera > 0) {
                    espera--;
                    this.chegada();
                }
            }
            else {
                throw new Exception("Nenhum carro para sair do andar dois");
            }
            
        }
        else if(andar == 3) {
            if(andarTres > 0) {
                andarTres--;
                if(espera > 0) {
                    espera--;
                    this.chegada();
                }
            }
            else {
                throw new Exception("Nenhum carro para sair do andar tres");
            }
            
        }
        else if(andar != 1 && andar != 2 && andar != 3) {
            throw new Exception("Andar invalido");
        }
        
    }
    
    public int getVagasDisponiveis() {
        int totalDisponivel = (15 - (espera + andarUm + andarDois + andarTres));
        if(totalDisponivel < 0) {
            totalDisponivel = 0;
        }
        else {
            totalDisponivel = (15 - (espera + andarUm + andarDois + andarTres));
        }
        return totalDisponivel;
    }
    
    public int[] getVagasOcupadas() {
        int arrayVagas[] = {espera, andarUm, andarDois, andarTres};
        return arrayVagas;
    }
    
}
