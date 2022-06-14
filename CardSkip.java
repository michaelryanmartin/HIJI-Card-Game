public class CardSkip extends Card {

    // Konstruktor
    public CardSkip() {
        super();

        setColor(AttributeColor.values() [(int) ((Math.random() * 1) + 1)]);
        setType(AttributeType.SKIP);
        setValue(0);
    }
    public CardSkip(AttributeColor color) {
        super();
        setColor(color);
        setType(AttributeType.SKIP);
        setValue(0);
    }

    @Override
    public Integer usePower(Integer i) {
        return i + 1;
    }
}

