import java.util.ArrayList;
import java.util.Random;

public class CardDeck {
    ArrayList<Card> cardDeck = new ArrayList<>();

    public CardDeck() {
        // Create Deck --> Insert CardNumber
        for (int c = 0; c < 4; c++) {
            for (int i = 1; i < 10; i++) {
                CardNumber newCard = new CardNumber(i, AttributeColor.values()[c]);
                cardDeck.add(newCard);
            }
        }
        // Create Deck --> Insert DrawCard
        for (int c = 0; c < 4; c++) {
            for (int i = 1; i < 3; i++) {
                CardDraw newDrawCard = new CardDraw(2, AttributeColor.values()[c]);
                cardDeck.add(newDrawCard);
                CardSkip newSkipCard = new CardSkip(AttributeColor.values()[c]);
                cardDeck.add(newSkipCard);
                CardReverse newReverseCard = new CardReverse(AttributeColor.values()[c]);
                cardDeck.add(newReverseCard);
            }
        }
        // Create Deck --> Insert Wild & Draw 4
        for (int c = 0; c < 4; c++) {
            CardDraw newDrawCard = new CardDraw(4, AttributeColor.BLACK);
            cardDeck.add(newDrawCard);
            CardWild newWildCard = new CardWild();
            cardDeck.add(newWildCard);
        }
    }

    public Card getCard() {
        int random = new Random().nextInt(cardDeck.size());
        return cardDeck.get(random);
    }

    public ArrayList<Card> getCardDeck() {
        return cardDeck;
    }

}