package firstProgram;
import java.util.Random;
import java.util.Scanner;





public class rock_paper_Scissor {

	public static void main(String[] args) {
		int userScore=0;
		int computerScore=0;
		// TODO Auto-generated method stub
System.out.println("THIS GAME IS ROCK PAPER AND SCISSORS");
System.out.println("LET'S GET STARTED!!!!!!");
System.out.println("rock : 0 \npaper:01 \nscissorrs:02 ");

Random random = new Random();
Scanner sc = new Scanner(System.in);

for(int i = 0; i<=2; i++) {
	System.out.println("enter your choice: ");
	int get = sc.nextInt();

	int x = random.nextInt(3);
	System.out.println("computer ji has choosen "+x);

    if (x==get) {
	System.out.println("do again");
	continue;
}else {

if((get == 0 && x==1)||(get == 1 && x==2)||(get == 2 && x==0)) {
	System.out.println("you won!! computer lost");
	userScore++;
}


else {
	System.out.println("computer won!! won lost");
	computerScore++;
}
}
	
}
if(computerScore>userScore) {
	System.out.println("computer won!!!");
}
else {
	System.out.println("congratulations!!!! you won!!");
}

	}

}
