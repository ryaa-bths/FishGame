public class Deck{



    Card[] deck = new Card[52];
    public Deck(){
        //deck
    }

    public void buildDeck() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card n = new Card(i, j);
                deck[i + j] = n;   //append card to deck
            }
        }
    }

    public void shuffle(){

    }

    public String toString(){
        for (int s = 0; s< deck.length();s++){   //need special method to count len deck
            System.out.print(deck[s] + ", ");
        }
        return "string";
    }
//deal, take out of deck, put into hand
    //no need subclass, can be diff instance; draw deck, drawdeck player1 p2

}