

import processing.core.PApplet;

public class RPS extends PApplet{
	//dimensions of the canvas
	int xMax = 1200;
	int yMax = 1200;
	//instantiate the player classes
	HumanPlayer player1 = new HumanPlayer();
    ComputerPlayer player2 = new ComputerPlayer();
    
    
    
    
    public void setup() 
	{	
    	size(xMax,yMax);
		textSize(20);
		fill(0,0,0);
		textAlign(LEFT);
	}
    
    public void draw() {
		background(255,255,255); 
		displayInfo(player1, 100);
		displayInfo(player2, 700);
		displayCompetition(player1,player2);
		Rock(player1 ,100,700 );
 
		Paper(player1 ,200,700 );

		Scissors(player1 ,300,700);

		Rock(player2 ,600,300 );
 
		Paper(player2 ,700,500 );

		Scissors(player2 ,800,700 );
		Restart(player1,player2, 700);
		
		
		
}
    
    
    public void displayInfo(player player , int location) {
		fill(0,0,0);
		text(player.toString() ,  100 ,location);
		text("Wins:" + emeraldProject.player.win , 100, location + 100 );
		text("Losts:" + emeraldProject.player.fail  , 100, location +200 );
		text("Draws:" + emeraldProject.player.draw  , 100, location +300);
		if (player.getStatus()) {
		fill(0,0,0);
		text("The player has made his move", 100 , location + 70);
		}
		else {
			fill(0,0,0);
			text("The player has not yet made his move", 100 , location + 70);
		}
	}
    
    
    public void displayCompetition(player player1 , player player2) {
		fill(0,0,0);
		if (!player1.getStatus() || !player2.getStatus()) {
		fill(0,0,0);
		text("A player has not yet made his move", 750 , 450);
		}
		else {
			fill(0,0,0);
			text("Winner is:" + this.winner(player1,player2), 750 , 450);
			player1.played = false;
		}
	}
    
    
    public String winner(player player1, player player2) {		
    	if (player1.compareTo(player2) >0) {
    		player1.win();
    		player2.lose();
    		return player1.toString(); 
    	}
    	else if(player1.compareTo(player2) < 0) {
    		player1.lose();
    		player2.win();
    		return player2.toString(); 
    	}
    	else {
    		player1.draw();
    		player2.draw();
    		return "There is no winner; Draw";
    	}
    }
    
    
    public void Rock(player player , int xlocation, int ylocation) {
    	
    	if (player.getStatus()) {
    		return;}
    		if (player instanceof ComputerPlayer) {
    			player.generatePlay();
    			return;
    		}
    	
    	fill(0,0,0);
		rect(ylocation, xlocation , 150, 50, 7);
		fill(255,255,255);
		text("Rock" , ylocation + 50 , xlocation + 30);
		if (mouseY >= xlocation && mouseY <= xlocation+50 && mouseX >= ylocation && mouseX <= ylocation+150) {
			if (mousePressed == true) {
				player.generatePlay(0);
			}
		}
	
	}
    
    public void Paper(player player ,int xlocation, int ylocation) {
    	if (player.getStatus()) {
    		return;}
    		if (player instanceof ComputerPlayer) {
    			player.generatePlay();
    			return;
    		}
    	fill(0,0,0);
		rect(ylocation, xlocation , 150, 50, 7);
		fill(255,255,255);
		text("Paper" , ylocation + 50 , xlocation + 30);
		if (mouseY >= xlocation && mouseY <= xlocation+50 && mouseX >= ylocation && mouseX <= ylocation+150) {
			if (mousePressed == true) {
				player.generatePlay(1);
			}
		}
	
	}
	
	public void Scissors(player player , int xlocation, int ylocation) {
    	if (player.getStatus()) {
    		return;}
    		if (player instanceof ComputerPlayer) {
    			player.generatePlay();
    			return;
    		}
		fill(0,0,0);
		rect(ylocation, xlocation, 150, 50, 7);
		fill(255,255,255);
		text("Scissors" , ylocation + 50 , xlocation + 30);
		if (mouseY >= xlocation && mouseY <= xlocation+50 && mouseX >= ylocation && mouseX <= ylocation+150) {
			if (mousePressed == true) {
				player.generatePlay(2);
			}
		}
	
	}

	public void Restart(player player1,player player2 , int location) {
		fill(255,255,255);
		rect(700, location , 150, 50, 7);
		fill(0,0,0);
		text("Restart" , 750 , location + 30);
		if (mouseY >= location && mouseY <= location+50 && mouseX >= 100 && mouseX <= 250) {
			if (mousePressed == true) {
				player1.restart();
				player2.restart();
			}
		}
	
	}
	
	}
    
    
    
    