package DataBaseObject;

public class Corridas{ //Representação da tabela Corridas

    private Integer iDCorridas;
    private String tempoTotal;
    private int carroVencedorID;

    public Corridas() {
    }

    public Corridas(Integer iDCorridas) {
        this.iDCorridas = iDCorridas;
    }

    public int getIDCorridas() {
        return iDCorridas;
    }

    public void setIDCorridas(int iDCorridas) {
        this.iDCorridas = iDCorridas;
    }

    public String getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(String tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public int getCarroVencedorID() {
        return carroVencedorID;
    }

    public void setCarroVencedorID(int carroVencedorID) {
        this.carroVencedorID = carroVencedorID;
    }
}