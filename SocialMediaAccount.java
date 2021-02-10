public class SocialMediaAccount {
	
	private String username;
	private int birthYear;
    
	public SocialMediaAccount(String username, int birthYear) {
		this.username = username;
		this.birthYear = birthYear;
	}
    
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
    
	public int getBirthYear() {
		return birthYear;
	}
    
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
}
