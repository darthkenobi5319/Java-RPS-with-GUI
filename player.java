

public class player implements Comparable<player>{
	private char myToken;
	 static int win=0;
	 static int fail=0;
	 static int draw=0;
	protected int indicator;
	protected final String[] plays = {"Rock", "Paper","Scissors"};
	protected boolean played;
	
	
	public player() {
		
	}
	public void setToken(char s) {
		this.myToken = s;
	}
	
	
	public boolean getStatus() {
		return this.played;
	}
	
	public void restart() {
		this.played = false;
	}
	

	
	public void win() {
		player.win += 1;
		this.played = false;
	}
	public void lose() {
		player.fail += 1;
		this.played = false;
	}
	public void draw() {
		player.draw += 1;
		this.played = false;
	}

	
	@Override
	public int compareTo(player o) {
		if (this.indicator == o.indicator) {
		return 0;
	}
		else if (this.indicator == 0 && o.indicator == 1) {
			return 1;
		}
		else if (this.indicator == 1 && o.indicator == 2) {
			return 1;
		}
		else if (this.indicator == 2 && o.indicator == 0) {
			return 1;
		}
		else {
			return -1;
		}
	}


	public void generatePlay(int indicator) {
	}
	public void generatePlay() {		
		this.played = true;
	}
}
	
	
	
