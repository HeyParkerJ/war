package framework;

import java.util.HashSet;

public class BattleResolution {
	private final Player winner;
	private final HashSet<Card> pot;
	private final Card winningCard;
	
	public BattleResolution(Player winner, HashSet<Card> pot, Card winningCard) {
		this.winner = winner;
		this.pot = pot;
		this.winningCard = winningCard;
	}

	public Player getWinner() {
		return winner;
	}

	public HashSet<Card> getPot() {
		return pot;
	}

	public Card getWinningCard() {
		return winningCard;
	}
}