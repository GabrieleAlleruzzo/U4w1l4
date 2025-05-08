package Lezione;

// final permette di rendere la classe NON modificabile o NON ereditabile
public /*final*/ class lezClass1 {

    private String nome;
    private String congome;
    private int eta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCongome() {
        return congome;
    }

    public void setCongome(String congome) {
        this.congome = congome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    //tasto destro
    //generate
    // toString()
    //ottieni override
    @Override
    public String toString() {
        return "lezClass1{" +
                "nome='" + nome + "\'" +
                ", congome='" + congome + "\'" +
                ", eta=" + eta +
                '}';
    }
}
