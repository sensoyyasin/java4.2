package Entities;

public class Game {
	private int id;
	private String gameName;
	private int token;
	
	public Game() {
		
	}
	
	public Game(int id,String gameName, int token) {
		this.id = id;
		this.gameName = gameName;
		this.token = token;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setgameName(String gameName) {
		this.gameName = gameName;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}
}
