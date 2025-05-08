package Lezione;

public class lezStudente extends lezClass1 {

    private String matricola;

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }


    /*@Override
    public String toString() {
        return "lezStudente{" +
                "matricola='" + matricola + '\'' +
                '}';
    }*/


    @Override
    public String toString() { // metodo per mostrare una rappresentazione dell'oggetto in stringa
        return super.toString() + //super chiama un metodo della superclasse a cui è stato fatto un overloading
                ", matricola='" + matricola + '\'' +
                '}';
    }
}
