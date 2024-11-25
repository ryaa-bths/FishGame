public class Card{

    String[] suitList = new String[] {"diamonds", "clubs", "hearts", "spades"};

    //suitList = ["diamonds", "clubs", "hearts", "spades"];
    private int suit;
    private int rank;


    public void card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;

    }

    public String setIndex(int i){
        return suitList[i]; //number inside is index of value
    }

    public String toString() {
        System.out.println(suit + rank);
        return "AHHHH";
    }


    //public

}