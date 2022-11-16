package tudelft.blackjack;

public class BlackJack {
//returns the hand closest to 21
    public int play(int player1, int player2) {
        int player1_hand = player1;
        int player2_hand = player2;
        if(player2_hand > 21)
            ln = 0;
        if(player1_hand > 21)
            rn = 0;
        if(player1_hand > player2_hand)
            return player1_hand;
        else
            return player2_hand;
    }
}
