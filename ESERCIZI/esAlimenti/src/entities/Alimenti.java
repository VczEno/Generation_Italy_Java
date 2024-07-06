package entities;

public class Alimenti {

    private String nome;
    private double prezzo;

    public Alimenti(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "nome: " + this.nome + ", prezzo: " + getPrezzo();
    }

    public double PrezzoScontato(double sconto) {
        return prezzo - prezzo * sconto / 100;
    }

    

}
