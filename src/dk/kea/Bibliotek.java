package dk.kea;

import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Bog> samling = new ArrayList<>();

    public Bibliotek() {
        samling.add(new Bog("123", "Count", 2002));
        samling.add(new Bog("456", "Count On", 20017));
        samling.add(new Bog("789", "Stop Counting", 2022));
    }

    public void addBook(Bog bog){
        samling.add(bog);
    }

    public boolean searchIsbn(Bog bog){
        String isbn = bog.getIsbn();
        for (Bog b: samling){
            if (b.getIsbn().equals(isbn)) return true;
        }
        return false;
    }
}
