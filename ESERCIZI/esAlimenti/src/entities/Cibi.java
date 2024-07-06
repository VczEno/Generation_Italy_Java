package entities;

public class Cibi extends Alimenti {

    private double peso;
    private boolean isPiccante;

    public Cibi(String nome, double prezzo, double peso, boolean isPiccante) {
        super(nome, prezzo);
        this.peso = peso;
        this.isPiccante = isPiccante;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean getIsPiccante() {
        return isPiccante;
    }

    public void setIsPiccante(boolean isPiccante) {
        this.isPiccante = isPiccante;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + ", prezzo: " + getPrezzo() + ", peso: " + getPeso() + ", piccante: "
                + getIsPiccante();
    }

}
