package com.lectures.lecture3.card;

/**
 * Created by User on 015 15.06.17.
 */
public class CardDeck {
    public static void main(String[] args) {
        String[] suit = new String[]{"Hearts", "Spades", "Clubs", "Diamonds"};
        String[] cardsWithPictures = new String[]{"2", "3", "4", "5", "6", "7",
                "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cards = new String[52];
        int d = 0;
        for (String i : suit) {
            for (String j : cardsWithPictures) {
                for (int k = 0; k < 1; k++) {
                    cards[d] = j + " of " + i;
                    d++;
                }

            }

        }
        System.out.println(cards[(int) (Math.random() * 52)]);
        /*for (String i : cards) {
          System.out.println(i);

        }*/

    }

}
