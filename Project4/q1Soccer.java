import java.util.Scanner;
import java.util.Random;
public class q1Soccer {
	/* 
	 * This program asks a user for names of 8 soccer teams and 
	 * randomly outputs a possible road map of 4 quarter finals, 
	 * 2 semifinals, 1 final and the final winner of a tournament.
	 */
	public static void main(String[] args) {
		
		// Variable  Declarations
		String []team_ini = new String [8];			//the array for storing the initial user's input
		String []team = new String [8];				//the array for storing information of teams
		String tournament_name;						//the name of tournament
		String answer;								//the user's input about y or n
		String QF1, QF2, QF3, QF4, SF1, SF2, FF;	//QF1 stands for the winner of Quater Final 1
													//SF1 stands for the winner of Semi-Final 1
													//FF stands for the winner of Final
		Scanner keyboard = new Scanner(System.in);  // Keyboard input variable
		Random randomGenerator = new Random();		//random class
		
		// display a welcome message on the screen
		System.out.println("-----------------------------------------------------\n"+
						   "   Welcome to Tournament Outcome Predictor Program\n"+
						   "-----------------------------------------------------");
		
		// prompt the user for input 
		System.out.println("Please enter a name for the soccer tournament");
		tournament_name = keyboard.nextLine( );
		System.out.println("\nPlease enter the 8 participating teams");
		
		//store the 9 participating teams into the array
		for(int i=0;i<8;i++)
			team_ini[i]=keyboard.nextLine();
		
		//continue the program when the user inputs y
		do 
		{
		System.out.println("\n       ----- "+tournament_name+" Outcome Predictions -----\n");
		for(int j=0;j<8;j++)
		{
			team[j] = team_ini[randomGenerator.nextInt(8)];   //randomly choosing teams
			for(int k=0;k<j;k++)								//excludes the data have been chosen
			{
				if(team[j]==team[k])
				{
					j--;
					break;
				}
			}
		}
		QF1=team[(int)(Math.random()*2)];                //randomly generate the winnier of QF1
		QF2=team[(int)(Math.random()*2)+2];				//randomly generate the winnier of QF2
		QF3=team[(int)(Math.random()*2)+4];				//randomly generate the winnier of QF3
		QF4=team[(int)(Math.random()*2)+6];				//randomly generate the winnier of QF4
		String []semifinal1= {QF1, QF4};					//store the date of teams into SF1
		String []semifinal2= {QF2, QF3};					//store the data of teams into SF2
		SF1=semifinal1[(int)(Math.random()*2)];			//randomly generate the winner of SF1
		SF2=semifinal2[(int)(Math.random()*2)];			//randomly generate the winner of SF2
		String []finalgame= {SF1, SF2};					//store the data of teams into Final
		FF=finalgame[(int)(Math.random()*2)];			//randomly generate the winner of Fianl
		
		System.out.print("Quater Final 1: "+team[0]+" Vs "+team[1]+
						"\n"+QF1+" Wins !!!\n"+
						"\nQuater Final 2: "+team[2]+" Vs "+team[3]+
						"\n"+QF2+" Wins !!!\n"+
						"\nQuater Final 3: "+team[4]+" Vs "+team[5]+
						"\n"+QF3+" Wins !!!\n"+
						"\nQuater Final 4: "+team[6]+" Vs "+team[7]+
						"\n"+QF4+" Wins !!!\n"+
						"\nSemi-Final 1: "+QF1+" Vs "+QF4+
						"\n"+SF1+" Wins !!!\n"+
						"\nSemi-Final 2: "+QF2+" Vs "+QF3+
						"\n"+SF2+" Wins !!!\n"+
						"\nFinal: "+SF1+" Vs "+SF2+
						"\n"+FF+" Wins !!!\n");
		
		System.out.println("\nDo you want a different outcome? y or n");
		answer=keyboard.next();
		}while(answer.equals("y"));
		
		keyboard.close();        // close the scanner object
		// display a closing message
		System.out.println("Thank you for using the JAVA Tournament Winner Predictor Program");
	}
}