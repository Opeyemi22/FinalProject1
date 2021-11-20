
public enum Suit {
    SPADES("spades"),
    CLUBS("clubs"),
    HEARTS("hearts"),
    DIAMONDS("diamonds");

    private final String suit;
    
    private Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
    
}
