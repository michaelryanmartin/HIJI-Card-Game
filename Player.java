public class Player extends PlayerCard {
    private final String name;
    private Boolean isHiji = false;
    private Boolean isChoosingCard = false;

    CardDeck deck = new CardDeck();

    // Atribut class player
    public Player(String name) {
        super();
        this.name = name;
    }

    // Method menapatkan nama
    public String getName() {
        return this.name;
    }

    // Method mengucapkan Hiji
    public void declareHiji() {
        if (getCardLeft() != 1) {
            System.out.println("Kamu tidak bisa declare Hiji sekarang!");
            System.out.println("Kamu mendapatkan penalti 2 kartu dari deck!");
            addCard(deck.getCard());
            addCard(deck.getCard());
        } else {
            System.out.println("Declare Hiji Berhasil");
            this.isHiji = true;
        }
    }

    public void restartHiji() {
        isHiji = false;
    }

    public Boolean getHiji() {
        return isHiji;
    }

    public void chooseCard() {
        isChoosingCard = !isChoosingCard;
    }

    public Boolean getChooseCardStatus() {
        return isChoosingCard;
    } 
}