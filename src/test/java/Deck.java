import java.util.ArrayList;
import java.util.Random;

// This class is for the entire deck. It will need all 52 cards added to it.
public class Deck {
    public ArrayList<Card> list = new ArrayList<>();
    public int MaxCards = 52;
    public Random rand = new Random();
    public int one, two, three, four;

    public ArrayList<Card> CardDeck()
    {
        //Adding each card to the deck
        for (int i = 0; i < MaxCards; i++)
            list.add(new Card("/resources/PlayingCards/png/" + Card.rank + "of" + Card.suit + ".png"));

        //Assigns a random value to each card in hand. 13 per suit, 4 suits.
        one = rand.nextInt(MaxCards);
        two = rand.nextInt(MaxCards);
        three = rand.nextInt(MaxCards);
        four = rand.nextInt(MaxCards);
        
        return list;
    }


    //Checks for and replaces any duplicate cards.
    public void Duplicates()
    {
        one = rand.nextInt(MaxCards);
        two = rand.nextInt(MaxCards);
        three = rand.nextInt(MaxCards);
        four = rand.nextInt(MaxCards);


        if (one == two || two == three || two == four || two == three || two == four || three == four)
        {
            two = rand.nextInt(MaxCards);
            three = rand.nextInt(MaxCards);
            four = rand.nextInt(MaxCards);
        }

    }
    
    
}