package day1.TicTacToeGame;
public class TicTacToe {
String[][] board= {{" "," "," "},{" "," "," "},{" "," "," "}};
 public TicTacToe(int i,int j,String value) {
	// TODO Auto-generated constructor stub
	 board[i][j]=value;
 }
 public TicTacToe() {
		// TODO Auto-generated constructor stub
		
	 }
 void fix(String value,int[] pos) {
	 board[pos[0]][pos[1]]=value;
 }
 int[] moment(int position) {
	 int[] move=new int[2];
	 switch(position){	 
	 case 1: 
		 move[0]= 0;
		 move[1]=0;
		 break;
		
	 case 2: 
		 move[0]= 0;
		 move[1]=1;
		 break;
	 case 3: 
		 move[0]= 0;
		 move[1]=2;
		
		 break;
	 case 4: 
		 move[0]=1;
		 move[1]=0;
		break;
	 case 5: 
		 move[0]= 1;
		 move[1]=1;
		
		 break;
	 case 6: 
		 move[0]=1;
		 move[1]=2;
		
		 break;
	 case 7: 
		 move[0]=2;
		 move[1]=0;
		break;
	 case 8: 
		 move[0]=2;
		 move[1]=1;
		break;
	 case 9:
		 move[0]=2;
		 move[1]=2;
		break;
	 }
	 return move;
 }
 
int row1(char value){
	int count=0;
	int emptyPos=0;
	for(int i=1;i<4;i++) {
		int[] positions=moment(i);
		boolean trigger=board[positions[0]][positions[1]].equals(String.valueOf(value));
		if (trigger==true) {
			count=count+1;	
			}
		else {
			if(board[positions[0]][positions[1]].equals(String.valueOf(" "))) {
				emptyPos=i;
			}
		}
	}
	if(count>=1&& count<3) {
		if(count==1) {return 0;}
		else{return emptyPos;}
	}
	else {
		if(count==0) {return count;}
		else{return 11;}
	}
} 
int row2(char value){
	int count=0;
	int emptyPos=0;
	for(int i=4;i<7;i++) {
		int[] positions=moment(i);
		boolean trigger=board[positions[0]][positions[1]].equals(String.valueOf(value));
		if (trigger==true) {
			count=count+1;	
			}
		else {
			if(board[positions[0]][positions[1]].equals(String.valueOf(" "))) {
				emptyPos=i;
			}
		}
	}
	if(count>=1&& count<3) {
		if(count==1) {return 0;}
		else{return emptyPos;}
	}
	else {

		if(count==0) {return count;}
		else{return 11;}
	}
	}
int row3(char value){
	int count=0;
	int emptyPos=0;
	for(int i=7;i<10;i++) {
		int[] positions=moment(i);
		boolean trigger=board[positions[0]][positions[1]].equals(String.valueOf(value));
		if (trigger==true) {
			count=count+1;	
			}
		else {
			if(board[positions[0]][positions[1]].equals(String.valueOf(" "))) {
				emptyPos=i;
			}
		}
	}
	if(count>=1&& count<3) {
		if(count==1) {return 0;}
		else{return emptyPos;}
	}
	else {

		if(count==0) {return count;}
		else{return 11;}}
}
int col1(char value){
	int count=0;
	int emptyPos=0;
	for(int i=1;i<8;i=i+3) {
		int[] positions=moment(i);
		boolean trigger=board[positions[0]][positions[1]].equals(String.valueOf(value));
		if (trigger==true) {
			count=count+1;	
			}
		else {
			if(board[positions[0]][positions[1]].equals(String.valueOf(" "))) {
				emptyPos=i;
			}
		}
	}
	if(count>=1&& count<3) {
		if(count==1) {return 0;}
		else{return emptyPos;}}
	else {

		if(count==0) {return count;}
		else{return 11;}
	}
}
int col2(char value){
	int count=0;
	int emptyPos=0;
	for(int i=2;i<9;i=i+3) {
		int[] positions=moment(i);
		boolean trigger=board[positions[0]][positions[1]].equals(String.valueOf(value));
		if (trigger==true) {
			count=count+1;	
			}
		else {
			if(board[positions[0]][positions[1]].equals(String.valueOf(" "))) {
				emptyPos=i;
			}
		}
	}
	if(count>=1&& count<3) {
		if(count==1) {return 0;}
		else{return emptyPos;}}
	else {

		if(count==0) {return count;}
		else{return 11;}}
}
int col3(char value){
	int count=0;
	int emptyPos=0;
	for(int i=3;i<10;i=i+3) {
		int[] positions=moment(i);
		boolean trigger=board[positions[0]][positions[1]].equals(String.valueOf(value));
		if (trigger==true) {
			count=count+1;	
			}
		else {
			if(board[positions[0]][positions[1]].equals(String.valueOf(" "))) {
				emptyPos=i;
			}
		}
	}
	if(count>=1&& count<3) {
		if(count==1) {return 0;}
		else{return emptyPos;}}
	else {

		if(count==0) {return count;}
		else{return 11;}
		}
}

int leftCross(char value) {
		int count=0;
		int emptyPos=0;
		for(int i=1;i<10;i=i+4) {
			int[] positions=moment(i);
			boolean trigger=board[positions[0]][positions[1]].equals(String.valueOf(value));
			if (trigger==true) {
				count=count+1;	
				}
			else {
				if(board[positions[0]][positions[1]].equals(String.valueOf(" "))) {
					emptyPos=i;
				}
			}
		}
		if(count>=1&& count<3) {
			if(count==1) {return 0;}
			else{return emptyPos;}}
		else {

			if(count==0) {return count;}
			else{return 11;}}
}
int crossRight(char value){
	int count=0;
	int emptyPos=0;
	for(int i=3;i<8;i=i+2) {
		int[] positions=moment(i);
		boolean trigger=board[positions[0]][positions[1]].equals(String.valueOf(value));
		if (trigger==true) {
			count=count+1;	
			}
		else {
			if(board[positions[0]][positions[1]].equals(String.valueOf(" "))) {
				emptyPos=i;
			}
		}
	}
	if(count>=1&& count<3){
		if(count==1) {return 0;}
		else{return emptyPos;}}
	else{
		if(count==0) {return count;}
		else{return 11;}}
}
int  checkMatch(char value,char usrval) {
	int[] posiblities= {row1(value),row2(value),row3(value),col1(value),col2(value),col3(value),crossRight(value),leftCross(value)};
	int retval=0;
	if(value==usrval) {

		for(int i:posiblities) {
		if(i==11) {
			return 11;
		}		
}
	}
	else {
		for(int i:posiblities) {
			if(i<12 && i>0) {
				retval=i;
}
}

}
	return retval;
}
}