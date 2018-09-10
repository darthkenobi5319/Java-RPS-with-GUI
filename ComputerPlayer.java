

public class ComputerPlayer extends player{
	
	ComputerPlayer(){
		this.setToken('C');
	}
	
	@Override
	public String toString() {
		return "This is a computer player;\nThe play is " + this.plays[this.indicator];
	}
	@Override
	public void generatePlay() {
		this.indicator =  (int) (Math.random() *3) ;
		System.out.println(this.indicator);
		this.played = true;
	}
	

}