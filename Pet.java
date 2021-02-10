public class Pet {
	
	private String name;
	private String sound;
	
	public Pet(String inputName, String inputSound) {
		name = inputName;
		sound = inputSound;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getSound() {
		return sound;
	}
	
	public void setSound(String newSound) {
		sound = newSound;
	}	
}
