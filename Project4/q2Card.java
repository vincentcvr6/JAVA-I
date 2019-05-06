import java.util.Scanner;
import java.util.Random;
public class q2Card {
	/* 
	 * This program implements a card magic game where it can 
	 * accurately predict a user's card from a randomly generated 4x4 card matrix. 
	 */
	public static void main(String[] args) {
	
		// Variable  Declarations
		String []cardnumber = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", 
								"Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String [][]cardtype = {{" of Diamonds", " of Diamonds", " of Diamonds", " of Diamonds"},
								{" of Hearts", " of Hearts", " of Hearts", " of Hearts"},
								{" of Clubs", " of Clubs", " of Clubs", " of Clubs"},
								{" of Spades", " of Spades", " of Spades", " of Spades"}};
		String [][]matrix = new String [4][4];		//array for generating a random 4x4 matrix
		String []temp= new String [4];				//for storing the cardmuber temporarily
		String matrix_t;							//for swaping the data
		Scanner keyboard = new Scanner(System.in);  // Keyboard input variable
		String answer;								//the user's input
		Random random = new Random();				//random class

		
		// display a welcome message on the screen
		System.out.print("--------------------------------\n" + 
						"   Welcome to Card Magic 101\n" + 
						"--------------------------------\n");
		
		//continue the program when the user inputs y
		do 
		{

		
			for(int i=0;i<4;i++) 						//randomly generate 4 card types
			{
				matrix[i]= cardtype[random.nextInt(4)];
				for(int j=0;j<i;j++)
				{
					if(matrix[i].equals(matrix[j]))
					{
						i--;
						break;
					}
				}	
			}
			for(int i=0;i<4;i++)							//randomly generate cardnumber
			{
				temp[i] = cardnumber[random.nextInt(13)];
				for(int j=0;j<i;j++)
				{
					if(temp[i].equals(temp[j]))
					{
						i--;
						break;
					}
				}	
			}
			
			
			for(int i=0;i<4;i++)						//generate the matrix
			{
				for(int j=0;j<4;j++)
					matrix[i][j]= temp[j]+matrix[i][j];
			}
			
			
			
			for(int i=0;i<4;i++)						//print the original matrix
			{
				for(int j=0;j<4.;j++)
					System.out.printf("%-20s\t",matrix[i][j]);
				System.out.println();
			}
			
			// prompt the user for input 
			System.out.println("Please pick a card and enter the column number (1-4) where it appears");
			int column1 = keyboard.nextInt();
			
			for(int i=0;i<4;i++)						//transpose the card matrix
			{
				for(int j=0;j<i;j++)
				{
					matrix_t=matrix[i][j];
					matrix[i][j]=matrix[j][i];
					matrix[j][i]=matrix_t;
				}
			}
			for(int i=0;i<4;i++)						//print the matrix after transposing
			{
				for(int j=0;j<4.;j++)
					System.out.printf("%-20s\t",matrix[i][j]);
				System.out.println();
			}
		
			
			
			boolean validNum=false;					//ensure the input is a valid number
			while(!validNum)
			{
				validNum=true;
				System.out.println("Please indicate which column number (1-4) it is in now");
				String column2_string=keyboard.next(); //regard the user's input as a string
				char column2_char=column2_string.charAt(0);
				boolean validInt=false;
				while(!validInt)						//ensure the input is a integer
				{
					validInt=true;
					for(int i=0;i<column2_string.length();i++)
					{
						column2_char=column2_string.charAt(i);
						if(column2_char<48 || column2_char>57)		
						{
							validInt=false;
							break;
						}
					}
					if(validInt==true)
						break;
					System.out.println("Please enter an integer value between 1 and 4");
					column2_string=keyboard.next();
				}	
				if(column2_string.length()>1 || column2_char<49|| column2_char>52)
					validNum=false;
				if(validNum==true) 				//when the input is valid, print the information of the card
				{
					int column2=(int)column2_char-48;
					System.out.println("Your card is "+matrix[column1-1][column2-1]);
					break;
				}
			};
			System.out.println("Do you want a different outcome? y or n");
			answer=keyboard.next();
		}while(answer.equals("y"));
		
		keyboard.close();      // close the scanner object
		// display a closing message
		System.out.println("Thank you for using the JAVA Magic 101 Program");
	}
}