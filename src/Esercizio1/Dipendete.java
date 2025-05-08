package Esercizio1;

public class Dipendete {

    //private per manipolare variabile solo in questa classe
    private final String matricola; //non modificabile
    private final double stipendio; //non modificabile
    private Dipartimento dipartimento ; //questo è collagato a un enum

    public Dipendete(String matricola, double stipendio, String dipartimento) {
        this.matricola=matricola;
        this.stipendio=stipendio;
        this.dipartimento=dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        this.dipartimento = dipartimento;
    }


    @Override
    public String toString() {
        return "Dipendete{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento='" + dipartimento + '\'' +
                '}';
    }
}

