package snakeLadder.Module;

import TicTacToe.Module.Pair;

public class Player {
	
	private int id;
	private String name;
	private Pair<Integer,Integer> coOrdinate;
	
	public Player() {
		
	}
	
	public Player(int id, String name, Pair<Integer,Integer> coordinate) {
		this.id=id;
		this.name=name;
		this.coOrdinate=coordinate;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pair<Integer, Integer> getCoOrdinate() {
		return coOrdinate;
	}
	public void setCoOrdinate(Pair<Integer, Integer> coOrdinate) {
		this.coOrdinate = coOrdinate;
	}

}
