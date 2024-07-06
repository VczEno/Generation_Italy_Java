package entities;

public class PiattiFreddi extends Cibi {

    private boolean isDolce;

    public PiattiFreddi(String nome, double prezzo, double peso, boolean isPiccante, boolean isDolce) {
        super(nome, prezzo, peso, isPiccante);
        this.isDolce = isDolce;
    }

    public boolean getIsDolce() {
        return isDolce;
    }

    public void setDolce(boolean isDolce) {
        this.isDolce = isDolce;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + ", prezzo: " + getPrezzo() + ", peso: " + getPeso() + ", piccante: "
                + getIsPiccante() + ", dolce: " + getIsDolce();
    }

}
