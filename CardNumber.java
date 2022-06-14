public class CardNumber extends Card {

    // Konstruktor
    public CardNumber() {
        super();
        setColor(AttributeColor.values() [(int) ((Math.random() * 4) + 1)]);
        setType(AttributeType.NUMBER);
        setValue((int) ((Math.random() * 9) +1));
    }

    public CardNumber(int value, AttributeColor color) {
        super();
        setColor(color);
        setType(AttributeType.NUMBER);
        setValue(value);
    }
}
