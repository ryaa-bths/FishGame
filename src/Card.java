public class Card{

    String[] suitList = new String[] {"diamonds", "clubs", "hearts", "spades"};

    //suitList = ["diamonds", "clubs", "hearts", "spades"];
    private int suit;
    private String wordSuit;
    private int rank;




    //public Card(int rank, int suit){  //new constructor
    //    this.rank = rank;
    //    this.suit = suit;
    //}

    public Card(int rank, String wordSuit){  //new constructor
        this.rank = rank;
        this.wordSuit = wordSuit;
    }

    public Card(int rank, int suit){
        this.rank = rank;
        this.wordSuit = setSuitIndex(suit);
    }

    //public void Card(String wordSuit, int rank){
    //    this.wordSuit = wordSuit;
    //    this.rank = rank;

    //}

    public String setSuitIndex(int index){
        wordSuit = suitList[index];
        return wordSuit; //number inside is index of value
    }

    public int getRank(int value){
        return value;
    }

    public String toString() {
        System.out.println(rank +" " + wordSuit);
        return "AHHHH";
    }


    //public

}