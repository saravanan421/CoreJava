package day1.TicTacToeGame;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacToe newGame= new TicTacToe();
		char cpu='o';
		boolean trigger=true;
		Scanner obj=new Scanner(System.in);
		System.out.println("choose X or O  ");
		char you=obj.next().charAt(0);
		System.out.println("you choosed "+you);
		if(you=='o') {
			cpu='x';
		}
		int limit=0;
		while(trigger==true) {
			limit=limit+1;
			for(int i=0;i<3;i++) {
		    	for(int j=0;j<3;j++) {
		    		System.out.print(newGame.board[i][j]+'|');
		    	}
		    	System.out.println("\n_________");
		    }
			System.out.println("your turn :  ");
			int usrpos=obj.nextInt();//get usr desire position 
		    int[] usrPos=newGame.moment(usrpos);//getting users positions
		    newGame.fix(Character.toString(you), usrPos);//placing the users value
		    int userCheck=newGame.checkMatch(you, you);
		    if(userCheck==11) {
		    	System.out.println("you won the game !!!!");
		    	break;
		    }
		    int cpupos=newGame.checkMatch(you, cpu);
		    System.out.println("val"+cpupos);
		    if(cpupos==0) {
		    	while(true) {
		    	cpupos=ThreadLocalRandom.current().nextInt(1,10);
		    	if(cpupos!=usrpos) {
		    	int[] cpuPos=newGame.moment(cpupos);
		    	newGame.fix(Character.toString(cpu), cpuPos);//cpu placing the value
		    	break;}
		    	}
		    	}
		    else {
		    	int[] cpuPos=newGame.moment(cpupos);
		    	newGame.fix(Character.toString(cpu), cpuPos);//cpu placing the value
		    }
		    
		    int cpuCheck=newGame.checkMatch(cpu,cpu);
		    if(cpuCheck==11) {
		    	System.out.println("cpu won the game !!!!");
		    	break;
		    }
		    if(limit==5) {
		    	System.out.println("match is tie:((( ");
		    	break;
		    }
}
	
	}
	}
		
