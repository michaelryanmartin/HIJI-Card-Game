public class CardWild extends Card{
    public CardWild() {
        super();
        setColor(AttributeColor.BLACK);
        setType(AttributeType.WILDCARD);
        setValue(0);
    }


    @Override
    public Integer usePower(Integer i) {
        return i;
    }
}
