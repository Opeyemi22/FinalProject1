import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// The main game file that the game will use.
public class Game extends Application{
    private Deck deck;
    
    //Creating cards that will be used in hand
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    //I have been trying multiple ways to try and obtain rank value of cards, any ideas?
    int[] cardValues = {Integer.getInteger(card1.rank), Integer.getInteger(card2.rank), Integer.getInteger(card3.rank), Integer.getInteger(card4.rank)};
    
    //Sets up game, shuffles hand 
    public void startGame()
    {
        deck.shuffle(); //shuffle not yet implemented / similar method not on github
        deck.dealHand(); //dealHand not yet implemented / similar method not on github
        
    }
    
    //Getting values for the cards' rank and suits in hand
    public void getHand()
    {
    card1.getRank();
    card1.getSuit();
    card2.getRank();
    card2.getSuit();
    card3.getRank();
    card3.getSuit();
    card4.getRank();
    card4.getSuit();
    }
    
    public void solutionCheck()
    {
        //Unsure if this is correct function call, already created array for cardValues with rank of 4 cards in hand.
        SolutionFinder.permute(cardValues);
        //Set return value from SolutionFinder to text of solutionTF?
        
    }
    
    public void start(Stage stage)
    {
                Pane pane = new Pane();
        Scene scene = new Scene(pane, 400, 400);
        
        //Trying to figure out how to get randomly generated cards to link up to ImageView
        ImageView cardImage1 = new ImageView();
        ImageView cardImage2 = new ImageView();
        ImageView cardImage3 = new ImageView();
        ImageView cardImage4 = new ImageView();
        
        Button solutionButton = new Button("Find a Solution");
        Button verifyButton = new Button("Verify");
        Button refreshButton = new Button("Refresh");
        solutionButton.setTranslateX(25);
        solutionButton.setTranslateY(25);
        refreshButton.setTranslateX(325);
        refreshButton.setTranslateY(25);
        verifyButton.setTranslateX(325);
        verifyButton.setTranslateY(370);
        
        TextField solutionTF = new TextField();
        TextField verifyTF = new TextField();
        Label enterExpression = new Label("Enter an expression: ");
        solutionTF.setTranslateX(150);
        solutionTF.setTranslateY(25);
        verifyTF.setTranslateX(150);
        verifyTF.setTranslateY(370);
        enterExpression.setTranslateX(25);
        enterExpression.setTranslateY(375);
        
        pane.getChildren().addAll(solutionButton, verifyButton, refreshButton, solutionTF, verifyTF, enterExpression, cardImage1, cardImage2, cardImage3, cardImage4);        
        stage.setTitle("24 Card Game");
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}