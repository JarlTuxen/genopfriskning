package dk.kea;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static void main(String[] args) {
	    //Arraylist
        //testDoesArrayListContainString();

        //Bog
        //testBog();

        //Hvor tit skal græsset slås?
        //hvorTit();

        //Kvadrat
        //testKvadrat();

        //Proper Case
        //testProperCase();

        //sortering
        //sortering();

        //Søgning
        //testSearch();
    }

    public static void testDoesArrayListContainString(){
        System.out.println("--- ArrayList ---");
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Abe");
        myList.add("Nisse");
        myList.add("Hval");
        if (doesArraylistContainString(myList, "abe")) {
            System.out.println("abe findes");
        }
        else{
            System.out.println("abe tilføjet");
        }
        if (doesArraylistContainString(myList, "Abe")) {
            System.out.println("Abe findes");
        }
        else{
            System.out.println("Abe tilføjet");
        }
    }

    public static boolean doesArraylistContainString(ArrayList<String> liste, String text){
        int index = liste.indexOf(text);

        if (liste.contains(text)) {
            System.out.println("The String has been found");
            return true;
        }
        else{
            liste.add(text);
            return false;
        }
    }

    public static void testBog(){
        System.out.println("--- Bog ---");
        Bibliotek myLibrary = new Bibliotek();
        System.out.println("Bog 1: " + myLibrary.searchIsbn(new Bog("123", "Lucky", 2750)));
        System.out.println("Bog 2: " + myLibrary.searchIsbn(new Bog("321", "Mayday", 2650)));
    }

    public static double graesPlan(double height, double maxHeight){
        final double GROWTH = 0.8;
        //dage til græsslåning (maxHeight - height)/GROWTH
        //returner 0 dage hvis de skal slås idag
        if (height>maxHeight) return 0;
        return (maxHeight - height)/GROWTH;
    }

    public static void hvorTit(){
        System.out.println("--- Hvor tit skal græsset slås");
        Scanner console = new Scanner(System.in);
        System.out.print("Nuværende højde: ");
        double h = console.nextDouble();
        System.out.print("Maksimal højde: ");
        double mH = console.nextDouble();
        System.out.println("Dage til græsslåning: " + graesPlan(h, mH));
    }

    public static void kvadrat(int antal, String tegn){
        if (antal>0){
            //sæt første række
            printRow(antal, tegn);
            //sæt resten blank + række
            for(int i=0;i<antal-1;i++){
                System.out.println();
                printRow(antal, tegn);
            }
            System.out.println();
        }

    }

    public static void printRow(int n, String tegn){
        //sæt første tegn
        System.out.print(tegn);
        //iterer resten blank + tegn
        for (int j=0; j<n-1;j++){
            System.out.print(" " + tegn);
        }
    }

    public static void testKvadrat(){
        System.out.println("--- Kvadrat ---");
        kvadrat(6, "*");
        kvadrat(0, "+");
        kvadrat(1, "=");

    }

    public static void properCase(String text){
        Scanner words = new Scanner(text).useDelimiter(" ");
        while (words.hasNext()){
            String w = words.next();
            if (w.toUpperCase().equals(w)) {
                System.out.print(w);
            }
            else if (w.length()<=3){
                System.out.print(w.toLowerCase());
            }
            else{
                System.out.print(w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase());
            }
            System.out.print(" ");
        }
    }

    public static void testProperCase(){
        properCase("ABCDE aLFALINK AbD");

    }

    public static void sortering(){
        String[] words = new String[5];

        //indlæs 5 strenge
        Scanner text = new Scanner(System.in);
        for (int i=0; i<5;i++){
            words[i] = text.nextLine();
        }

        //sorter i faldende orden
        Arrays.sort(words);

        //udskriv i faldende orden
        for (int i=words.length-1;i>=0;i--){
            System.out.println(words[i]);
        }
    }

    public static int search(String[] words, String word){
        for (int i=0;i<words.length;i++){
            if (words[i].equals(word)) return i;
        }
        return -1;
    }

    public static void testSearch(){
        String[] myWords = {"Alfa", "Beta", "Delta", "Omikron"};
        System.out.println(Arrays.toString(myWords));
        System.out.println("Gamma: " + search(myWords, "Gamma"));
        System.out.println("Omikron: " + search(myWords, "Omikron"));
    }
}
