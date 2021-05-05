
public class VerificationManager implements Verification {

	public void verification(Gamer gamer) {
		
  if(gamer.nickName.equals(gamer.getNickName())&& gamer.password.equals(gamer.getPassword())) {
	    	
	    	System.out.println("Kullanýcý bilgileriniz doðru: "+ gamer.getNickName());
	    }else {
	    	System.out.println("Geçersiz kullanýcý, verilerinizi kontrol ederek tekrar deneyiniz.");
	    }
		
	}

	
}
