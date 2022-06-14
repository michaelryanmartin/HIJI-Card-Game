public class Card implements AttributePower<Integer>{
    private int value;
    private AttributeColor color;
    private AttributeType type;

    // Konstruktor
    public Card() {}

    // Setter
    public void setValue(int value) {
        this.value = value;
    }
    public void setColor(AttributeColor color) {
        this.color = color;
    }
    public void setType(AttributeType type) {
        this.type = type;
    }

    // Getter
    public int getValue(){
        return value;
    }
    public AttributeColor getColor() {
        return color;
    }
    public AttributeType getType() {
        return type;
    }

    @Override
    public Integer usePower(Integer i) {
        return 0;
    }

    public String printCard() {
        if (getType() == AttributeType.NUMBER || getType() == AttributeType.DRAW) {
            return (getType() + " " + getColor() + " " + getValue());
        } else {
            return (getType() + " " + getColor());
            
        }
    }
}
