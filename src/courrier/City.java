package courrier;

import java.util.LinkedList;
import java.util.List;

public class City {
	
	
	private List<Inhabitant> fuckGaston;
	private List<Letter<?>> petitescrottes;
	private String name;

	public City(String n){
		List<Inhabitant> newlist = new LinkedList<Inhabitant>();
		this.name = n;
		this.fuckGaston = newlist;
		
	}
	
	
	public void addHabitant(Inhabitant habitant){
		this.fuckGaston.add(habitant);
		
	}
	
	public void distributeLetters(){
		
	}
	
	public void sendLetter(Letter letter){
		
	}
	
	public String toString(){
		
		return "bernard";
	}
	
	
	
}
