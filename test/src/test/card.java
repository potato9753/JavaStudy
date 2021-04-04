package test;

import java.util.ArrayList;

public class card {
	ArrayList<Integer> card1 = new ArrayList<Integer>();

	public card() {
		// TODO Auto-generated constructor stub
	}

	public card(ArrayList<Integer> card1) {
		this.card1 = card1;
	}

	public ArrayList<Integer> getCard1() {
		return card1;
	}

	public void setCard1(ArrayList<Integer> card1) {
		this.card1 = card1;
	}

	@Override
	public String toString() {
		return "card [card1=" + card1 + "]";
	}
	
	
	
}
