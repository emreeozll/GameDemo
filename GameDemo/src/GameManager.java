
public class GameManager{

	

	
	public void gamesale(Game game, Gamer gamer) {
		
		System.out.println(game.getGameType()+" t�r�ndeki "+game.getGameName()+" adl� oyun "+" "+gamer.nickName+ " adl� oyuncu tarf�nda sat�n al�nm��t�r.");
	}
	
	
	public void discountgame(Game [] game, Gamer gamer, Campaign capCampaign) {
		
		for (Game game2 : game) {
			
			System.out.println(game2.gameName+ " adl� oyun "+ gamer.getNickName()+" adl� oyuncu taraf�ndan "+capCampaign.campaignname + capCampaign.campaigndiscount + " indirim ile sat�n alm��t�r.");
			
		}
	}
	
}
