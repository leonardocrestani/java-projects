package dominio;


public class Carro {
    
    private final String placa;
    private Boolean ligado;
    private int rpm;
    private char marcha;
    
    public Carro(String valorPlaca) {
        this.placa = valorPlaca;
        this.ligado = false;
        this.rpm = 0;
        this.marcha = 'P';
    }
    
    public void power() throws Exception {
        if(!ligado) {
            ligado = true;
            rpm = 1000;
            marcha = 'P';
        }
        else if(ligado && rpm == 1000) {
            ligado = false;
            rpm = 0;
            marcha = 'P';
        }
        else {
            throw new Exception("O carro so pode ser desligado se estiver com 1000RPM");
        }
        
    }
    
    public void acelerar() throws Exception {
        if(!ligado) {
            throw new Exception("O carro deve estar ligado");
        }
        else if(ligado && rpm < 8000) {
            rpm += 1000;
            if(marcha == 'P') {
                marcha = '1';
            }
            if(rpm > 4000) {
                switch(marcha) {
                    case 'P' -> {
                        marcha = '1';
                        rpm = 2000;
                    }
                    case '1' ->  {
                        marcha = '2';
                        rpm = 2000;
                    }
                    case '2' ->  {
                        marcha = '3';
                        rpm = 2000;
                    }
                    case '3' ->  {
                        marcha = '4';
                        rpm = 2000;
                    }
                    case '4' ->  {
                        marcha = '5';
                        rpm = 2000;
                    }
                    case '5' ->  {
                        marcha = '6';
                        rpm = 2000;
                    }
                }
            }
        }
        else {
            throw new Exception("O carro chegou ao maximo de RPM");
        }
    }
    
    public void desacelerar() throws Exception {
        if(ligado && marcha != 'P' && marcha != '1') {
            rpm -= 1000;
            if(rpm == 2000) {
                switch(marcha) {
                    case '6' ->  {
                        marcha = '5';
                        rpm = 4000;
                    }
                    case '5' ->  {
                        marcha = '4';
                        rpm = 4000;
                    }
                    case '4' ->  {
                        marcha = '3';
                        rpm = 4000;
                    }
                    case '3' ->  {
                        marcha = '2';
                        rpm = 4000;
                    }
                    case '2' ->  {
                        marcha = '1';
                        rpm = 4000;
                    }
                }
            }    
        }
        else if(ligado && marcha == '1') {
            rpm -= 1000;
            if(rpm == 1000) {
                marcha = 'P';
            }
        }
        else if(!ligado) {
            throw new Exception("O carro deve estar ligado para desacelerar");
        }
        else {
            throw new Exception("O carro deve estar em movimento para desacelerar");
        }
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public boolean getLigado() {
        return ligado;
    }
    
    public int getRpm() {
        return rpm;
    }
    
    public char getMarcha() {
        return marcha;
    }
    
    @Override
    public String toString() {
        return "Placa: " + placa + "\n" +
                "Ligado: " + ligado + "\n" +
                "RPM: " + rpm + "\n" +
                "Marcha: " + marcha + "\n";
    }
    
}
