package test;

import java.util.ArrayList;

public class user {
	ArrayList<Integer> user1 = new ArrayList<Integer>();

	public user() {
		// TODO Auto-generated constructor stub
	}

	public user(ArrayList<Integer> list) {
		this.user1 = list;
	}
	
	@Override
	public String toString() {
		return "user [user1=" + user1 + "]";
	}

	public ArrayList<Integer> getUser1() {
		return user1;
	}

	public void setUser1(ArrayList<Integer> user1) {
		this.user1 = user1;
	}
	
	
	
	
}
