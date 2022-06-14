import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

class SetupGame extends CardDeck {
    Player[] player;
    int jumlahPemain;

    // method untuk melakukan pengacakan kartu di cardDeck
    public void shuffleDeck() {
        Collections.shuffle(cardDeck);
        System.out.println("Deck kartu sudah diacak!");
        System.out.println("");
    }

    // method untuk mendapatkan jumlah pemain
    // dan menerima nama pemain.
    public void getPlayer(Scanner sc) {

        System.out.print("Ada berapa pemain? ");

        // exception buat input.
        try {
            jumlahPemain = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Harap masukkan bilangan integer!");
            System.out.println("Ulangi permainan.");
            System.exit(0);
        }

        while (jumlahPemain <= 1 || jumlahPemain >= 7) {
            System.out.println("Maaf, hanya jumlah pemain diantara 2-6 yang diperbolehkan.");
            System.out.println("Silahkan masukkan jumlah pemain.");
            try {
                jumlahPemain = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Harap masukkan bilangan integer!");
                sc.next();
            }
        }

        player = new Player[jumlahPemain];

        System.out.println("");

        for (int i = 0; i < jumlahPemain; i++) {
            System.out.print("Masukkan nama pemain " + (i + 1) + " : ");
            String namaPemain = sc.next();

            player[i] = new Player(namaPemain);
        }
        System.out.println("Berikut daftar pemain.");

        for (int i = 0; i < player.length; i++) {
            System.out.println((i + 1) + ". " + player[i].getName());
        }
        System.out.println("Selamat bermain!");
    }

    // method untuk mendapatkan kartu di meja dari cardDeck
    public Card getTableCard() {
        int i = 0;
        Card c = cardDeck.get(i);
        while (c.getType() != AttributeType.NUMBER) {
            i++;
            c = cardDeck.get(i);
        }
        return c;
    }

    // method untuk melakukan pembagian kartu ketiap player
    public void distributeCard() {

        for (Player p : player) {
            int i = 0;
            while (i < 7) {
                p.addCard(cardDeck.get(0));
                cardDeck.remove(0);
                i++;
            }
        }
    }

    // untuk dapetin pemain yang main pertama kali secara acak.
    Player getFirstPlayer() {
        Collections.shuffle(Arrays.asList(player));
        return player[0];

    }
}
