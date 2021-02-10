package Homework26;

public class Pet {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	private String sound;
	public Pet(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	
}
