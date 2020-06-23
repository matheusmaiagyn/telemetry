package DataBaseObject;

public class Voltas{ //Representação da tabela Voltas

    private Integer iDVoltas;
    private Integer numeroVolta;
    private String tempoVolta;
    private int carrosIDCarro;
    private int iDCorrida;

    public Voltas() {
    }

    public Voltas(Integer iDVoltas) {
        this.iDVoltas = iDVoltas;
    }

    public Integer getIDVoltas() {
        return iDVoltas;
    }

    public void setIDVoltas(Integer iDVoltas) {
        this.iDVoltas = iDVoltas;
    }

    public Integer getNumeroVolta() {
        return numeroVolta;
    }

    public void setNumeroVolta(Integer numeroVolta) {
        this.numeroVolta = numeroVolta;
    }

    public String getTempoVolta() {
        return tempoVolta;
    }

    public void setTempoVolta(String tempoVolta) {
        this.tempoVolta = tempoVolta;
    }

    public int getCarrosIDCarro() {
        return carrosIDCarro;
    }

    public void setCarrosIDCarro(int carrosIDCarro) {
        this.carrosIDCarro = carrosIDCarro;
    }

    public int getIDCorrida() {
        return iDCorrida;
    }

    public void setIDCorrida(int iDCorrida) {
        this.iDCorrida = iDCorrida;
    }
}