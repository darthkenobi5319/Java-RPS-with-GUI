

public class HumanPlayer extends player{
	
	HumanPlayer(){
		this.setToken('P');
	}
	
	@Override
	public String toString() {
		return "This is a human player;\nThe play is " + this.plays[this.indicator];
	}
	
	@Override
	public void generatePlay(int indicator) {
		this.generatePlay();
		this.indicator = indicator;	

	}
	
	
}