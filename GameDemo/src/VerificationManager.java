
public class VerificationManager implements Verification {

	public void verification(Gamer gamer) {
		
  if(gamer.nickName.equals(gamer.getNickName())&& gamer.password.equals(gamer.getPassword())) {
	    	
	    	System.out.println("Kullan�c� bilgileriniz do�ru: "+ gamer.getNickName());
	    }else {
	    	System.out.println("Ge�ersiz kullan�c�, verilerinizi kontrol ederek tekrar deneyiniz.");
	    }
		
	}

	
}
