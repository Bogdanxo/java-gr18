package library;

public class Book {
    private String nume;
    private int numarpagini;

    public Book(String nume, int numarpagini) {
        this.nume = nume;
        this.numarpagini = numarpagini;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarpagini() {
        return numarpagini;
    }

    public void setNumarpagini(int numarpagini) {
        this.numarpagini = numarpagini;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nume='" + nume + '\'' +
                ", numarpagini=" + numarpagini +
                '}';
    }
}
