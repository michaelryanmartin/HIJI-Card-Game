public class CardReverse extends Card {

    // Konstruktor
    public CardReverse() {
        super();
        setColor(AttributeColor.values() [(int) ((Math.random() * 1) + 1)]);
        setType(AttributeType.REVERSE);
        setValue(0);
    }

    public CardReverse(AttributeColor color) {
        super();
        setColor(color);
        setType(AttributeType.REVERSE);
        setValue(0);
    }

    @Override
    public Integer usePower(Integer i) {
        return i * -1;
    }
}

