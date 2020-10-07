import java.util.Vector;


public class Hand {
    int chopsticksCount;
    private Vector hand;

    public  Hand() {
        //Create new Hand object that is empty
         hand = new Vector();
    }

    public void clear() {
        //removes all cards from the HAND
        hand.removeAllElements();
    }

    public void addCard(Card c) {
        // Add the card c to the hand.  c should be non-null.  (If c is
        // null, nothing is added to the hand.)
        if (c != null)
            hand.addElement(c);
    }

    public void removeCardType(int type) {
        // If the specified card type is in the hand, it is removed ONLY once.
        for (int i = 0; i<hand.size(); i++){
            if(this.getCard(i).getType() == type){
                hand.remove(i);
                break;
            }
            else if(this.getCard(i).getType() != type) {
                continue;
            }
        }
    }

    public int cardCounter(Card c) {
        int cardCount = 0;
        for (int i= 0; i<hand.size(); i++){
            if (this.getCard(i).getType() == c.getType() && this.getCard(i).getValue() == c.getValue()){
                cardCount++;
            }
        }
        return cardCount;
    }

    public int cardCounter(int value, int type) {
        int cardCount = 0;
        for (int i= 0; i<hand.size(); i++){
            if (this.getCard(i).getType() == type && this.getCard(i).getValue() == value){
                cardCount++;
            }
        }
        return cardCount;
    }

    public void removeCard(int position) {
        // If the specified position is a valid position in the hand,
        // then the card in that position is removed.
        if (position >= 0 && position < hand.size())
            hand.removeElementAt(position);
    }

    public int getCardCount() {
        // Return the number of cards in the hand.
        return hand.size();
    }

    public Card getCard(int position) {
        // Get the card from the hand in given position, where positions
        // are numbered starting from 0.  If the specified position is
        // not the position number of a card in the hand, then null
        // is returned.
        if (position >= 0 && position < hand.size())
            return (Card)hand.elementAt(position);
        else
            return null;
    }

    public boolean containsCardType(int type){
        for (int i = 0; i < hand.size(); i++){
            if (this.getCard(i).getType() == type){
                chopsticksCount++;
                return true;
            }
            else if (this.getCard(i).getType() != type){
                continue;

            }
        }
        return false;
    }

    public int size(){
        return hand.size();
    }

    public boolean roundone(){
        if (this.size() == 0)
            return true;
        else
            return false;
    }

}
