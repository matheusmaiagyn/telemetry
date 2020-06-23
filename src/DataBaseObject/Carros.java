package DataBaseObject;

public class Carros{ //Representação da tabela Carros

    private Integer iDCarro;
    private String nomeCarro;
    private String corCarro;

    public Carros() {
    }

    public Carros(Integer iDCarro) {
        this.iDCarro = iDCarro;
    }

    public Integer getIDCarro() {
        return iDCarro;
    }

    public void setIDCarro(Integer iDCarro) {
        this.iDCarro = iDCarro;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }
}