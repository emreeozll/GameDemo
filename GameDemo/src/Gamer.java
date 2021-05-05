
public class Gamer {

	
	int gamerNumber;
	String nickName;
	String password;
	String mail;
	String newnick="swager";
	String newnick2 = "Mokolaçi";
	String newpassword="þifre123";
	String newpassword2="123þifre";
	
	
	public Gamer(int gamerNumber, String nickName, String password, String mail) {
	
		this.gamerNumber = gamerNumber;
		this.nickName = nickName;
		this.password = password;
		this.mail = mail;
	}


	

	public int getGamerNumber() {
		return gamerNumber;
	}


	public void setGamerNumber(int gamerNumber) {
		this.gamerNumber = gamerNumber;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
}
