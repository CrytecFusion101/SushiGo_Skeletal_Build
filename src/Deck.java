public class Deck {
    private Card[] master_Deck;   // An array of 108 Cards, representing the deck.
    private int cards_Used;       // Number of cards that have been dealt from the deck.
    private Card[] play_Deck;

    public Deck() {
        // Create an unshuffled deck of cards.
        master_Deck = new Card[108];
        int cardCt = 0; //Number of cards created so far
        for (int type = 0; type <= 2; type++) {
            for (int value = 1; value <= 14; value ++) {                //Generating 14 Cards each for Card type 0,1,2 meaning TEMPURA, SASHIMI, DUMPLING respectively
                master_Deck[cardCt] = new Card(1,type);        //adding a new Card to the master deck with value 1 and type 0,1,2
                cardCt++;
            }
        }
        for (int value = 1; value <= 8; value ++) {                     //Generating 8 Cards for Card type 3 meaning MAKIROLLS_3
            master_Deck[cardCt] = new Card(3,3);      //adding a new Card to the master deck with value 3 and type 3
            cardCt++;
        }
        for (int value = 1; value <= 12; value ++) {                    //Generating 12 Cards for Card type 4 meaning MAKIROLLS_2
            master_Deck[cardCt] = new Card(2,4);      //adding a new Card to the master deck with value 2 and type 4
            cardCt++;
        }
        for (int value = 1; value <= 6; value ++) {                     //Generating 6 Cards for Card type 5 meaning MAKIROLLS_1
            master_Deck[cardCt] = new Card(1,5);      //adding a new card to the master deck with value 1 and type 5
            cardCt++;
        }
        for (int value = 1; value <= 10; value ++) {                    //Generating 10 Cards for Card type 6 meaning SALMONNIGIRI
            master_Deck[cardCt] = new Card(1,6);      //adding a new card to the master deck with value 1 and type 6
            cardCt++;
        }
        for (int type = 7; type <= 8; type++) {
            for (int value = 1; value <= 5; value ++) {                 //Generating 5 Cards each for Card type 7,8 meaning SQUIDNIGIRI,EGGNIGIRI respectively
                master_Deck[cardCt] = new Card(1,type);        //adding a new card to the master deck with value 1 and type 7,8
                cardCt++;
            }
        }
        for (int value = 1; value <= 10; value ++) {                    //Generating 10 Cards for Card type 9 meaning PUDDING
            master_Deck[cardCt] = new Card(1,9);      //adding a new card to the master deck with value 1 and type 9
            cardCt++;
        }
        for (int value = 1; value <= 6; value ++) {                     //Generating 6 Cards for Card type 10 meaning WASABI
            master_Deck[cardCt] = new Card(1,10);     //adding a new card to the master deck with value 1 and type 10
            cardCt++;
        }
        for (int value = 1; value <= 4; value ++) {                     //Generating 4 Cards for Card type 11 meaning CHOPSTICKS
            master_Deck[cardCt] = new Card(1,11);     //adding a new card to the master deck with value 1 and type 11
            cardCt++;
        }
        cards_Used = 0;
    }

    void shuffle() {
        // Put all the used cards back into the deck, and shuffle it into
        // a random order.
        for ( int i = 107; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = master_Deck[i];
            master_Deck[i] = master_Deck[rand];
            master_Deck[rand] = temp;
        }
        cards_Used = 0;
    }

    public Card[] playDeck() {
        // creates a play deck of 20 cards.
       play_Deck = new Card[20];
       for (int i = 0 ; i<=19 ; i++) {
           play_Deck[i] = dealCard();
       }
        cards_Used = 20;
       return play_Deck;
    }

    public Card dealCard() {
        // Deals one card from the master deck and returns it.
        cards_Used++;
        return master_Deck[cards_Used - 1];
    }

}
