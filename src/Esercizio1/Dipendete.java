package Esercizio1;

public class Dipendete {

    //private per manipolare variabile solo in questa classe
    private final String matricola; //non modificabile
    private final double stipendio; //non modificabile
    private Dipartimento dipartimento ; //questo è collagato a un enum

    public Dipendete(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola=matricola;
        this.stipendio=stipendio;
        this.dipartimento=dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento  getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        String stipendio= Double.toString(this.getStipendio()); //converte in stringa un double, è valido per tutti  primitivi
        return "Dipendete{" +
                "matricola='" + this.getMatricola() + '\'' +
                ", stipendio=" + stipendio +
                ", dipartimento='" + this.getDipartimento().toString() + '\'' +
                '}';
    }
}

