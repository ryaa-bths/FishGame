import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Scanner user = new Scanner("");
        System.out.println("Hello world!");

        Deck testDeck = new Deck();
        testDeck.buildDeck();

        //testDeck.toString();

        testDeck.shuffle();
        testDeck.toString();


    }
}