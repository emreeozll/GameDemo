

public class GamerManager extends VerificationManager{

	
	private Gamer gamer;
	
	
	public void add(Gamer gamer) {
		
		this.gamer=gamer;
		
		System.out.println("Oyuncu sisteme ekleniyor.... ");
		System.out.println("Oyuncu sisteme eklendi : "+ gamer.nickName);
	}
	

	public void delete(Gamer gamer) {
		
		this.gamer=gamer;
		
		System.out.println("Oyuncu sistemden siliniyor.... ");
		System.out.println("Sistemden silinen oyuncu : "+ gamer.nickName);
	}
	

	public void update(Gamer gamer) {
		
		this.gamer=gamer;
		
	
		if(gamer.nickName.equals("Poiesy")){
			System.out.println("Oyuncu verileri güncelleniyor.... ");
			gamer.password = gamer.newpassword;
			gamer.nickName = gamer.newnick;
			System.out.println("Verileri güncellenen oyuncunun yeni nickName --->> "+ gamer.nickName);
			System.out.println(("Verileri güncellenen oyuncunun yeni password -->>"+gamer.password));
			System.out.println(" ");
		}else if (gamer.nickName.equals("Rindor")){
			System.out.println("Oyuncu verileri güncelleniyor.... ");
			gamer.nickName = gamer.newnick2;
			gamer.password = gamer.newpassword2;
			System.out.println("Verileri güncellenen oyuncunun yeni nickName --->> "+ gamer.nickName);
			System.out.println(("Verileri güncellenen oyuncunun yeni password -->>"+gamer.password));
		}
	
	}

  
	
   
	
	
		
	
	
}
