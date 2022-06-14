import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Game {
    public void start(Scanner sc) {
        System.out.println("");
        System.out.println(".----------------.  .----------------.  .----------------.  .----------------. ");
        System.out.println("| .--------------. || .--------------. || .--------------. || .--------------. |");
        System.out.println("| |  ____  ____  | || |     _____    | || |     _____    | || |     _____    | |");
        System.out.println("| | |_   ||   _| | || |    |_   _|   | || |    |_   _|   | || |    |_   _|   | |");
        System.out.println("| |   | |__| |   | || |      | |     | || |      | |     | || |      | |     | |");
        System.out.println("| |   |  __  |   | || |      | |     | || |   _  | |     | || |      | |     | |");
        System.out.println("| |  _| |  | |_  | || |     _| |_    | || |  | |_' |     | || |     _| |_    | |");
        System.out.println("| | |____||____| | || |    |_____|   | || |  `.___.'     | || |    |_____|   | |");
        System.out.println("| |              | || |              | || |              | || |              | |");
        System.out.println("| '--------------' || '--------------' || '--------------' || '--------------' |");
        System.out.println(" '----------------'  '----------------'  '----------------'  '----------------' ");
        System.out.println("      Kelompok 21 | IF2212 Pemrograman Berorientasi Objek | OperaVanJava");
        System.out.println("                            Ketik 1 untuk memulai");
        System.out.println("");
        
        String start = sc.next();
        while (!start.equals("1")) {
            System.out.println("Ketik 1 untuk memulai!");
            start = sc.next();
        }
        System.out.println("");
    }

    public void listCommand() {
        System.out.println("Command yang dapat kamu jalankan:");
        System.out.println("[1] Lihat list kartu");
        System.out.println("[2] Pilih Kartu");
        System.out.println("[3] List Pemain");
        System.out.println("[4] Urutan Pemain");
        System.out.println("[5] Ambil Kartu Dari Deck");
        System.out.println("[6] Declare Hiji");
        System.out.println("[7] Bantuan");
    }

    public void space() {
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
    }

    public void tableCardInfo(Card tableCard) {
        System.out.println("Table Card: ");
        System.out.println(tableCard.printCard());
        System.out.println("");
    }

    public void listCard(List<Card> playerCardList) {
        if (playerCardList.size() != 0) {
            System.out.println("Berikut adalah list kartumu:");
            for (int j = 0; j < playerCardList.size(); j++) {
                System.out.println((j + 1) + ". " + playerCardList.get(j).printCard());
            }
            System.out.println(" ");
        } else {
            System.out.println("Kamu tidak memiliki kartu lagi!");
        }
    }

    public void getColorOption() {
        new Print<String>("Kamu mengeluarkan sebuah wildcard").enterPrint();
        new Print<String>("1. Red").enterPrint();
        new Print<String>("2. Blue").enterPrint();
        new Print<String>("3. Yellow").enterPrint();
        new Print<String>("4. Green").enterPrint();
        new Print<String>("Warna apa yang kamu inginkan?").noEnterPrint();
    }

    public void getTableCard(Card card) {
        new Print<Character>(' ').enterPrint();;
        System.out.println("Table Card: ");
        System.out.println(card.printCard());
        new Print<Character>(' ').enterPrint();;
    }

    public void currentPlayerInfo(Player currentPlayer) {
        System.out.println("Pemain Saat Ini: ");
        System.out.println(currentPlayer.getName());
        System.out.println("");
    }

    public void viewPlayer(Player[] playerList, int currTurn) {
        for (int j = 0; j < playerList.length; j++) {
            if (playerList[j] == playerList[currTurn]) {
                System.out.println(playerList[j].getName() + " sedang giliran");
                j += 1;
                System.out.println(playerList[j % playerList.length].getName() + " giliran berikutnya");
                System.out.println("");
            }
        }
    }

    public void listPlayer(Player[] playerList, int currTurn) {
        for (int j = 0; j < playerList.length; j++) {
            System.out.println("Pemain " + (j + 1) + ": " + playerList[j].getName());
            System.out.println("Jumlah Kartu: " + (j + 1) + ": " + playerList[j].getCardLeft());
            if (playerList[j] == playerList[currTurn]) {
                System.out.println("Sedang giliran");
            } else {
                System.out.println("Tidak sedang giliran");
            }
            System.out.println("");
        }
    }

    public void help() {
        System.out.println("Bagaimana cara memainkan game ini?");
        System.out.println("Pertama, pemain harus memasukkan banyaknya dan nama pemain");
        System.out.println("Setelahnya kartu yang ada akan diacak dan dibagikan kepada pemain dengan setiap pemain mendapat 7 kartu");
        System.out.println("Lalu dipilih kartu pertama untuk acuan dan pemain pertama");
        System.out.println("Terdapat beberapa command penting. Diantaranya:");
        System.out.println("[1] Lihat list kartu");
        System.out.println("[2] Pilih Kartu");
        System.out.println("[3] List Pemain");
        System.out.println("[4] Urutan Pemain");
        System.out.println("[5] Ambil Kartu Dari Deck");
        System.out.println("[6] Declare Hiji");
        System.out.println("[7] Bantuan");
        
    }

    public static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
}