public class Card {

    public final static int         //Assigning numbers to Types for easy reference for processing
            TEMPURA = 0,
            SASHIMI = 1,
            DUMPLING = 2,
            MAKIROLLS_3 = 3,
            MAKIROLLS_2 = 4,
            MAKIROLLS_1 = 5,
            SALMONNIGIRI = 6,
            SQUIDNIGIRI = 7,
            EGGNIGIRI = 8,
            PUDDING = 9,
            WASABI = 10,
            CHOPSTICKS = 11;


    private final int type;

    private final int value;

    public Card(int theValue, int theType) {
        //Declaring what properties the Card takes
        value = theValue;
        type = theType;
    }

    public int getType() {
        //Returns the type of card
        return type;
    }

    public int getValue() {
        //Returns the type of card
        return value;
    }

    public String getValueAsString() {
        //Gives the Value of Card as String
        // If the card's value is invalid, "??" is returned.
        switch (value) {
            case 1:  return "One";
            case 2:  return "Two";
            case 3:  return "Three";
            default: return "??";
        }
    }

    public String getTypeAsString() {
        //Gives the Type of Card as String
        // If the card's value is invalid, "??" is returned.
        switch (type) {
            case TEMPURA:      return "Tempura";
            case SASHIMI:      return "Sashimi";
            case DUMPLING:     return "Dumpling";
            case MAKIROLLS_3:  return "Maki Rolls";
            case MAKIROLLS_2:  return "Maki Rolls";
            case MAKIROLLS_1:  return "Maki Rolls";
            case SALMONNIGIRI: return "Salmon Nigiri";
            case SQUIDNIGIRI:  return "Squid Nigiri";
            case EGGNIGIRI:    return "Egg Nigiri";
            case PUDDING:      return "Pudding";
            case WASABI:       return "Wasabi";
            case CHOPSTICKS:   return "Chopsticks";
            default:           return "??";

        }
    }

    public String toString() {
        // Returns the language interpretation of the card held.
        return getValueAsString() + " of " + getTypeAsString();
    }
}
