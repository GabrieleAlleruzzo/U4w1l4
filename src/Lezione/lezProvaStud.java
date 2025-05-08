package Lezione;

public class lezProvaStud {
    public static void main(String[] args) {
        lezStudente s = new lezStudente();

        s.setNome("Alfio");
        s.setCongome("meff");
        s.setEta(30);
        s.setMatricola("AMeff1230");

        // toString rappresenta oggetti in forma di stringa
        // si può applicare a qualsiasi oggetto
        // funziona solo con variabili d'istanza
        System.out.println(s.toString());

    }
}
