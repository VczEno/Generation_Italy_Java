
public class SubstringEsempio {
    public static void main(String[] args) {
        // esempio substring()
        String saluto = "ciaone";
        System.out.println("\nStringa originale: " + saluto);
        // substring prevede l'inserimento tra le tonde di 'argomenti' (o 'parametri')
        // che influiranno
        // sul valore restituito dopo l'operazione di ritaglio

        // 1) possiamo inserire un solo valore tra le tonde
        String salutoTagliato = saluto.substring(2);
        System.out.println("\nStringa ritagliata con un solo argomento 'saluto.substring(2)': "
                + salutoTagliato);
        // notiamo che la nuova stringa sara' composta dagli stessi caratteri della
        // stringa di partenza,
        // ad eccezione di quelli che hanno indice < del numero intero inserito come
        // 'argomento' nel substring

        // se volessimo descrivere quali operazioni esegue internamente il compilatore
        // quando incontra un substring(x):
        // saluto = "ciaone"
        String[] salutoSplittato = saluto.split(""); // {'c','i','a','o','n','e'}
        String salutoTagliatoArtigianale = "";
        for (int i = 0; i < salutoSplittato.length; i++) {
            if (i >= 2)
                salutoTagliatoArtigianale += salutoSplittato[i]; // salutoTagliatoArtigianale= aone
        }
        System.out.println("\nSalutoTagliatoArtigianale: " + salutoTagliatoArtigianale);

        // 2) possiamo inserire due valori tra le tonde
        String salutoTagliatoDaDueLati = saluto.substring(1, 4);
        System.out.println("\nStringa ritagliata con due argomenti 'saluto.substring(1,4)': "
                + salutoTagliatoDaDueLati); // iao
        // notiamo che la nuova stringa sara' composta dagli stessi caratteri della
        // stringa di partenza,
        // ad eccezione di quelli che hanno indice < del primo numero intero inserito
        // e di quelli che hanno indice >= del secondo numero intero inserito

        // se volessimo descrivere quali operazioni esegue internamente il compilatore
        // quando incontra un substring(x,y):
        // saluto = "ciaone"
        // String[] salutoSplittato = saluto.split(""); // {'c','i','a','o','n','e'}
        String salutoTagliatoDaDueLatiArtigianale = "";
        for (int i = 0; i < salutoSplittato.length; i++) {
            if (i >= 1 && i < 4)
                salutoTagliatoDaDueLatiArtigianale += salutoSplittato[i]; // salutoTagliatoArtigianale= iao
        }
        System.out.println("\salutoTagliatoDaDueLatiArtigianale: " + salutoTagliatoDaDueLatiArtigianale);
    }

}
