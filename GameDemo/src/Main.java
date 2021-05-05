

public class Main {

	public static void main(String[] args) {
		
		
		Gamer gamer1= new Gamer(1, "Poiesy", "01234", "poiesy@gmail.com");
		Gamer gamer2 = new Gamer(2, "Rindor", "567890","rindor@gmail.com");
		
		
		System.out.println("Oyuncu:"+gamer1.nickName);
		System.out.println("Oyuncu:" + gamer2.nickName);
		
		System.out.println("------------------------------------------------------------");
		
		
		GamerManager gamerManager = new GamerManager();
		gamerManager.add(gamer1);
		gamerManager.add(gamer2);
		
		System.out.println("------------------------------------------------------------");
		
		gamerManager.delete(gamer1);
		gamerManager.delete(gamer2);
	
	    System.out.println("------------------------------------------------------------");
	
	    gamerManager.update(gamer1);
	    gamerManager.update(gamer2);
	    
	    System.out.println(" ");
	    System.out.println("Güncellenen veriler: "+ gamer1.newnick+" <---> "+gamer1.newpassword);
	    System.out.println("Güncellenen veriler: "+ gamer2.newnick2+" <---> "+gamer2.newpassword2);
	    
	    System.out.println("--------------------------------------------------------------------");
	    
	    gamerManager.verification(gamer1);
	    
	    System.out.println(gamer1.getNickName()+" ");
	    System.out.println(gamer1.getPassword());
	    
	    
	    System.out.println("-------------------------------------------------------------------- ");
	    
	    gamerManager.verification(gamer2);
	    
	    System.out.println(gamer2.nickName);
	    System.out.println(gamer2.password);
	    
	    System.out.println("***************************************************************************************************************");
	    System.out.println("***************************************************************************************************************");
	    System.out.println("***************************************************************************************************************");
	      
	      
	    
	    Game game1 = new Game("Skyrim", "Computer",100);
	    Game game2 = new Game("The Witcher3", "Playstation",250);
	    Game game3 = new Game("Pes 2020","Xbox",89);
	    
	    System.out.println("------------------GAMES-------------------- ");
	    System.out.println(game1.getGameType() + " " +game1.getGameName());
	    System.out.println(game2.getGameType()+ " "+ game2.getGameName());
	    System.out.println(game3.getGameType()+ game3.getGameName());

	    
	    GameManager gameManager = new GameManager();
	    gameManager.gamesale(game1, gamer1);
	    gameManager.gamesale(game3, gamer2);
	    
	    System.out.println("----------------------------------------------------------------------");
	
	    Game [] game = {game1,game2};

	    
	    Campaign campaign = new Campaign("Cadýlar Bayramýna Özel Ýndiirim %", 50);
	    Campaign campaign2 = new Campaign("Ramazan Bayramýna Özel Ýndiirim %", 30);
	    
	    
	    GameManager gameManager2 = new GameManager();
	        gameManager2.discountgame(game, gamer1, campaign);
	    
	
	     System.out.println("----------------------------------------------------------------------");
	        
	     VerificationManager manager = new VerificationManager(); 
	      manager.verification(gamer1);
	     
	}
	
	
	
	
	      

}
