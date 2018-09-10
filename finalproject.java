

import java.util.Random;
import java.util.Scanner;
public class finalproject {
	private static int win=0;
	private static int fail=0;
	private static int draw=0;
	private static void check(int computer,int player){
		int t=0;
		if(player-computer==2) {
			t = -1;
		}else if(player-computer==-2) {
			t = 1;
		}else {
			t = player-computer;
		}
		if(t>0) {
			System.out.println("You Win!");
			win++;
		}else if(t==0) {
			System.out.println("Draw!");
			draw++;
		}else {
			System.out.println("You Lose!");
			fail++;
		}
	}
	
	public static void main(String[] args) {
		String input="";
		String computerStr="";
		Random random=new Random();
		int computer=0;
		int player=0;
		while(true){
			System.out.println("***********************Enter e/E to quit*******************");
			System.out.println("Which do you want to choose？S--Scissor, R--Rock, P--Paper");
			Scanner scan = new Scanner(System.in);
			input = scan.nextLine();
			computer = random.nextInt(3);
			if(computer==0) {
				computerStr="Scissor";
			}else if(computer==1) {
				computerStr="Rock";
			}else {
				computerStr="Paper";
			}
			if(input.equals("S")||input.equals("s")){
				player=0;
				System.out.println("You: Scissor");
				System.out.println("I:"+computerStr);
				check(computer,player);
			}else if(input.equals("R")||input.equals("r")){
				player=1;
				System.out.println("You: Rock");
				System.out.println("I:"+computerStr);
				check(computer,player);
			}else if(input.equals("P")||input.equals("P")){
				player=2;
				System.out.println("You: Paper");
				System.out.println("I:"+computerStr);
				check(computer,player);
			}else if(input.equals("E")||input.equals("e")){
				System.out.println("End");
				System.out.println("Results:");
				System.out.println("win: "+win);
				System.out.println("lose: "+fail);
				System.out.println("draw: "+draw);
				System.exit(0);
			}
		}
	}
}