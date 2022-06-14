public class CardDraw extends Card {

    // Konstruktor
    public CardDraw() {
        super();
        setType(AttributeType.DRAW);
        int value = (int) (Math.random() * 2);
        if (value == 1) {
            setValue(2);
        } else {
            setValue(4);
        }
        if (getValue() == 4) {
            setColor(AttributeColor.BLACK);
        } else {
            setColor(AttributeColor.values() [(int) ((Math.random() * 4) + 1)]);
        }
    }

    public CardDraw(int value, AttributeColor color) {
        super();
        setColor(color);
        setType(AttributeType.DRAW);
        setValue(value);
    }

    @Override
    public Integer usePower(Integer draw) {
        return draw + getValue();
    }
}
