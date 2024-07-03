package entities;

// proprieta: String nome, String cognome, int eta, boolean primina, double votoIta, double votoInglese, double votoSpagnolo.
// metodi: String stampa(),double calcoloMedia(), boolean isMaggiorenne(), boolean isPromosso().
public class Studente {

    public String nome;
    public String cognome;
    public int eta;
    public boolean primina;
    public double votoIta, votoInglese, votoSpagnolo;

    public String stampa() { // lo richiamo com
        return nome + " " + cognome + " " + eta + "Primina: " + primina + "\nVoti: votoIta-" +
                votoIta + " votoInglese-" + votoInglese + " votoSpagnolo- " + votoSpagnolo;
    }

    public void stampaDiretta() {
        System.out.println(stampa());
    }

    public double calcoloMedia() {
        double sommaVoti = votoIta + votoInglese + votoSpagnolo;
        return sommaVoti / 3;
    }

    public boolean isMaggiorenne() {
        boolean maggiorenne;
        if (eta >= 18)
            maggiorenne = true;
        else
            maggiorenne = false;
        return maggiorenne;
    }

    public boolean isPromosso() {
        return (calcoloMedia() > 6);
    }

}
