public class Deck{

    Card[] deck = new Card[52];
    public Deck(){
        //deck
    }

    public void buildDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card s = new card(i, j);
                deck[i + j] = s;
            }
        }
    }


    public static void Main(String[] args){

        System.out.println("test");
    }
}