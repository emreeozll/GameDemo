
public class Game {

	int price;
	String gameName;
	String gameType;
	
	
	public Game(String gameName, String gameType, int price) {
		super();
		this.gameName = gameName;
		this.gameType = gameType;
		this.price = price;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getGameType() {
		return gameType;
	}


	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price=price;
	
       }
	
}
