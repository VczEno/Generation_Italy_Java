package models;

public class Persona {

    // PROPRIETA
    private String nome;
    private int eta;

    // costruttore
    public Persona(String nome, int eta) {
        setNome(nome);      // this.nome = nome;
        setEta(eta);        // this.eta = eta;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // tostring
    @Override
    public String toString() {
        return "nome=" + nome + ", eta=" + eta;
    }
}
