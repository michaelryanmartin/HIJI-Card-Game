# HIJI - Card Game
![hiji-logo](./doc/HIJI_Logo.png)

## Reference 
The game logic is built according to [official uno rules](https://en.wikipedia.org/wiki/Uno_(card_game)#Official_rules).

### Hiji Card

* Number Card : A normal card that can be played if the card color and/or number match with the card before
* Draw Two Action Card : A power card that can be played if the color matches the card before. It forces the next player to draw in 2 cards from the deck and skip that player turn. It can be add with another draw two action card that can accumulate and the next player can also throw the same card until the last player that can’t throw the same card.
* Wild Draw Four Card : A wild card that can be thrown whenever. It forces the next player to draw in 4 cards while giving the thrower a privilege to choose the color of the card.
* Wild Color Card : A wild card that can be thrown whenever. Give the thrower a choice of colors for the turn.
* Reverse Action Card : A power card that can be switch the order directions of game
* Skip Action Card : A power card that can next player in sequence and skipped their turn

Initially wild cards don't have a color. When drawn, a new value object is created with the chosen color.

### How to Play
* Input the numbers of the total players (2 - 6 players)
* Input the name of each player
* System will distribute 7 card to each players, and then 1 card will be randomize to be the first card
* Players turn will be randomize
* Game rules will be
   * Each turn the player can throw in one or more card that matches the requirement of that turn
   * If the player did not throw anything then that player must draw one card from the deck
   * If the card from the draw match the requirement of that turn then the player can throw the card but it’s not a must
   * If that card did not match the requirement then that turn is over without throwing a single card
* Some types of cards have a certain power that can affect the course of the game.
* If one of the players has 1 card left, the player has to declare HIJI within 3 seconds. If not the player must draw 2 cards from the deck.
* Game will be finished, if one of the players doesn't have any card again.

### Implemented Bonus
* Cheat

### Build and Execution 
```javac -target 8 -source 8 Main.java```
```java Main```

### Author
* Zachrandika Alif Syahreza (18219036)
* Michael Ryan Martin (18219046)
* Handy Zulkarnain (18219060)
* Natasya Jatiwicha Azzahra (18219065)
* Graciella Valeska Liander (18219075)
