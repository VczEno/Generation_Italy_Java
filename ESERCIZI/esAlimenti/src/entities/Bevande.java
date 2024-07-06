package entities;

public class Bevande extends Alimenti {

    private double volume;
    private boolean cannuccia;

    public Bevande(String nome, double prezzo, double volume, boolean cannuccia) {
        super(nome, prezzo);
        this.volume = volume;
        this.cannuccia = cannuccia;

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isCannuccia() {
        return cannuccia;
    }

    public void setCannuccia(boolean cannuccia) {
        this.cannuccia = cannuccia;
    }

}
