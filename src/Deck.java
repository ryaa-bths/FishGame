import java.util.LinkedList;

public class Deck{

    String[] suitList = new String[] {"diamonds", "clubs", "hearts", "spades"};

    LinkedList<Card> deck = new LinkedList<Card>(); //to append/remove
    public Deck(){
        //deck
    }

    public void buildDeck() {
        for (int i = 0; i < 4; i++) {  //rank
            for (int j = 1; j <= 13; j++) {   //suit
                Card n = new Card(j, i);
                deck.add(n);   //append card to deck
            }
        }
    }

    public void shuffle(){
        /*
        int x = (int)(Math.random() * 99);
        int s = (deck.size());
        int i = 0;
        while (s >=0) {
            //if  (x < 53){
                for (int j= 0; j < s; j++){ //if --> s-i
            //int s = (deck.size());  //either restrict shuffle range, or +shuffle twice
            //iterate and restrict range of shuffle, like appended parts unaffected
                    s = (int)(Math.random() * (s + 1));
                    deck.add(deck.remove(s));   //take& remove element at index, add to back
                    //s--;
                }
            }
            //else {
            //    x -= 45-i; //else ^i return 0 over 45
            //}
        }*/
        for (int i = 0; i < 4; i++){
            int s = (deck.size());  //either restrict shuffle range, or +shuffle twice
            while (s >=0) {//iterate and restrict range of shuffle, like appended parts unaffected
                s = (int)(Math.random() * (s + 1));
                deck.add(deck.remove(s));   //take& remove element at index, add to back
                s--;
            }
        }
    }

    //public void deal(){

    //}
//deal, take out of deck, put into hand
    //no need subclass, can be diff instance; draw deck, drawdeck player1 p2

    Card[][] deckMatrix = new Card[4][13];
    public String toString(){
           //need special method to count len deck aka not .length(), .length w/out ()
        System.out.println(deck);
/*
        for (int i = 0; i < 4; i++) {  //rank
            for (int j = 0; j < 13; j++) {   //suit
                //Card input = new Card(deck[i+j]);
                deckMatrix[i][j] = (deck.get(i+j) );  //convert value to input at index ??
//system print +" ,
            }
            "/n"
        }
        System.out.println(deckMatrix[][]);
*/
        return "string";
    }

    //2random: 1)pick suit 2)pick num    
    //matrix
    //4 arrays (suit types, random num select array,) array in array(card num, select random)
}
