import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card {

    private Rank rank;
    private Suit suit;
    private Image img;
    
    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
    
    public Card(Rank rank, Suit suit) throws URISyntaxException, FileNotFoundException {
        String rankName = rank.getName();
        String suitName = suit.getSuit();
        this.rank = rank;
        this.suit = suit;
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
//        InputStream is = classloader.getResourceAsStream("test.csv");
        
        String fileName = (Paths.get(classloader.getResource("").toURI()) + "/resources/PlayingCards/png/" + rankName + "_of_" + suitName + ".png");
        InputStream i = new FileInputStream(fileName);
        img = new Image(i);
        
    }
}
