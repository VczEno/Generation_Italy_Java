package entities;

public class PiattiCaldi extends Cibi {

    private int temperaturaCottura;

    public PiattiCaldi(String nome, double prezzo, double peso, boolean isPiccante, int temperaturaCottura) {
        super(nome, prezzo, peso, isPiccante);
        this.temperaturaCottura = temperaturaCottura;
    }

    public int getTemperaturaCottura() {
        return temperaturaCottura;
    }

    public void setTemperaturaCottura(int temperaturaCottura) {
        this.temperaturaCottura = temperaturaCottura;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + ", prezzo: " + getPrezzo() + ", peso: " + getPeso() + ", piccante: "
                + getIsPiccante() + ", temperatura cottura: " + getTemperaturaCottura();
    }

}
