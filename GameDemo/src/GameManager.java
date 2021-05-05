
public class GameManager{

	

	
	public void gamesale(Game game, Gamer gamer) {
		
		System.out.println(game.getGameType()+" türündeki "+game.getGameName()+" adlý oyun "+" "+gamer.nickName+ " adlý oyuncu tarfýnda satýn alýnmýþtýr.");
	}
	
	
	public void discountgame(Game [] game, Gamer gamer, Campaign capCampaign) {
		
		for (Game game2 : game) {
			
			System.out.println(game2.gameName+ " adlý oyun "+ gamer.getNickName()+" adlý oyuncu tarafýndan "+capCampaign.campaignname + capCampaign.campaigndiscount + " indirim ile satýn almýþtýr.");
			
		}
	}
	
}
