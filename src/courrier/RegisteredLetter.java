package courrier;

public class RegisteredLetter <T extends Letter<?>> extends AbstractLetterDecorator<T>{
	
	private int DEFAULT_TAX;

	public RegisteredLetter(T letter) {
		super(letter);
	}
	
	public void action() {
		
		
	}
	
	public String toString() {
		return "mmmmmmmmmmh What you say !";
	}
	
	public int getCost(){
		return this.content.getCost()+this.DEFAULT_TAX;
	}
}
