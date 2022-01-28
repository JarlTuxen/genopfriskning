package dk.kea;

public class Bog {
    private String isbn;
    private String titel;
    private int udgivelsesaar;

    public Bog(String isbn, String titel, int udgivelsesaar) {
        this.isbn = isbn;
        this.titel = titel;
        this.udgivelsesaar = udgivelsesaar;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesaar() {
        return udgivelsesaar;
    }

    public void setUdgivelsesaar(int udgivelsesaar) {
        this.udgivelsesaar = udgivelsesaar;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "isbn='" + isbn + '\'' +
                ", titel='" + titel + '\'' +
                ", udgivelsesaar=" + udgivelsesaar +
                '}';
    }
}
