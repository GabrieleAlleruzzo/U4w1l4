import Esercizio1.Dipartimento;
import Esercizio1.Dipendete;

public class Main {
    public static void main(String[] args) {
        Dipendete[] dipEndenti= new Dipendete[3];
        dipEndenti[0] = new Dipendete("D0001", 800, Dipartimento.AMMINISTRAZIONE);
        dipEndenti[1] = new Dipendete("D0002", 900, Dipartimento.VENDITE);
        dipEndenti[2] = new Dipendete("D0003", 100, Dipartimento.PRODUZIONE);

        for (int i = 0; i < dipEndenti.length; i++ ) {

           System.out.println(dipEndenti[i].toString());
        }
    }
}