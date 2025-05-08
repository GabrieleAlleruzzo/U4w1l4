package Lezione;

public class Libri {
    private String titolo;
    private double costo;
    private int anno;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "titolo='" + titolo + '\'' +
                ", costo=" + costo +
                ", anno=" + anno +
                '}';
    }

    public boolean stessoCosto(Libri l) {
        if (l.getCosto()==costo) {return true;} else {return false;}
    }
}
