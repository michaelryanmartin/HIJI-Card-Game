public class DeclareHiji extends Thread {
    int delay = 3000;

    Player currentPlayer;
    CardDeck deck = new CardDeck();

    public DeclareHiji(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println("\nDeclare HIJI terlambat!");
            System.out.println("Sudah lewat 3 detik!");
            System.out.println("Kamu mendapat dua buah kartu dari deck!");
            for (int i = 0; i <2; i++) {
                Card fromDeck = deck.getCard();
                currentPlayer.addCard(deck.getCard());
                System.out.println("Kartu yang kamu peroleh dari deck adalah " + fromDeck.printCard());
            }
            System.out.println(" ");
            if (currentPlayer.getChooseCardStatus()) {
                System.out.print("Kartu mana yang akan kamu keluarkan? ");
            } else {
                System.out.print("Command yang ingin kamu jalankan: ");
            }
        } catch(InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Selamat, berhasil declare HIJI sebelum 3 detik!");
        }
    }

    public Player afterDeclare() {
        return currentPlayer;
    }
}
