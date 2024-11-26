public class Card{

    String[] suitList = new String[] {"diamonds", "clubs", "hearts", "spades"};

    //suitList = ["diamonds", "clubs", "hearts", "spades"];
    private int suit;
    private String wordSuit;
    private int rank;




    public Card(int suit, int rank){  //new constructor
        this.suit = suit;
        this.rank = rank;

    }

    //public void Card(String wordSuit, int rank){
    //    this.wordSuit = wordSuit;
    //    this.rank = rank;

    //}

    public String setSuitIndex(int index){
        return suitList[index]; //number inside is index of value
    }

    public int getRank(int value){
        return value;
    }

    public String toString() {
        System.out.println(suit + rank);
        return "AHHHH";
    }


    //public

}