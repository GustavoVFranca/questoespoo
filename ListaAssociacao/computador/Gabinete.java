package computador;
public class Gabinete {
    private String modelo;
    private String tipo;
    private int baias;
    private PlacaMae placamae;

    public Gabinete(String modelo, String tipo, int baias, PlacaMae placamae) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.baias = baias;
        this.placamae = placamae;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBaias() {
        return baias;
    }

    public void setBaias(int baias) {
        this.baias = baias;
    }

    public PlacaMae getPlacamae() {
        return placamae;
    }

    public void setPlacamae(PlacaMae placamae) {
        this.placamae = placamae;
    }

    @Override
    public String toString() {
        return "Gabinete [modelo=" + modelo + ", tipo=" + tipo + ", baias=" + baias + ", placamae=" + placamae + "]";
    }
}
