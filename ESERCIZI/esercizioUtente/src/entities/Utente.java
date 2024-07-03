package entities;

public class Utente {
    // PROPRIETA'
    public String username;
    public String password;

    // METODI ()
    public String dammiUtente() {
        String risposta = "Username: " + username + ", Password: " + password;
        return risposta;
    }

    // implementiamo alcuni metodi che facciano le funzioni di controllo dell'utente
    // impostiamo come tipo di ritorno un booleano
    public boolean controllaUser(String inputUsername) {
        boolean risposta = inputUsername.equals(username);
        return risposta;
    }

}
