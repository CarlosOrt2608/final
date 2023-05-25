package models;

public class Clases {
    private int cantHojas;
    private   int tempoPicado;
    private   int aroma;
    private int azucar;
    private int nicotina;

    public Clases() {
    }

    public Clases(int cantHojas, int tempoPicado, int aroma, int azucar, int nicotina) {
        this.cantHojas = cantHojas;
        this.tempoPicado = tempoPicado;
        this.aroma = aroma;
        this.azucar = azucar;
        this.nicotina = nicotina;
    }

    public int getCantHojas() {
        return cantHojas;
    }

    public int getTempoPicado() {
        return tempoPicado;
    }

    public int getAroma() {
        return aroma;
    }

    public int getAzucar() {
        return azucar;
    }

    public int getNicotina() {
        return nicotina;
    }

    public void setCantHojas(int cantHojas) {
        this.cantHojas = cantHojas;
    }

    public void setTempoPicado(int tempoPicado) {
        this.tempoPicado = tempoPicado;
    }

    public void setAroma(int aroma) {
        this.aroma = aroma;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public void setNicotina(int nicotina) {
        this.nicotina = nicotina;
    }

    @Override
    public String toString() {
        return "principal{" +
                "cantHojas=" + cantHojas +
                ", tempoPicado=" + tempoPicado +
                ", aroma=" + aroma +
                ", azucar=" + azucar +
                ", nicotina=" + nicotina +
                '}';
    }
}
