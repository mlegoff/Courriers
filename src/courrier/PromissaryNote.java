package courrier;

public class PromissaryNote extends Letter<Money> {

	protected final int DEFAULT_COST = 1;
	
	public PromissaryNote(Inhabitant sender, Inhabitant receiver, int content) {
		super(new Money(content), receiver, sender);
	}

	public int getCost() {
		
		return 0 ;
	}
	
	public void action() {
		
	}
	
	public String toString() {
	
		return receiver.toString() + " " + content.toString() + " " + sender.toString() ;
	}
	
}
