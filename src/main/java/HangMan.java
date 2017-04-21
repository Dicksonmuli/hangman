// importing classes from java libraries
import java.io.Console;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Random;


public class HangMan {
// declaration
String word;
List<Character> badGuesses = new ArrayList<>();
Random randomNumber  = new Random();
Scanner letterProvided = new Scanner(System.in);
 String mWordList[][] = {

{ "spy", "chicken", "pizza", "bread", "stones", "leaves", "soup", "hungry", "sleepy", "caring", "friends", "month", "day", "light"},

{ "destroy", "drain", "donkey", "religion", "triangle", "circle", "medicine", "passenger", "seven", "flower", "mountain", "hot"
},


{ " specification", " structure", " lexical", " likewise", " management", " manipulate", " mathematics", " hotjava", " vertex", " unsigned", " traditional"
}};


	public boolean checkWord(String word){
		return true;
	}

	public int game(){


		 char[] hidden = new char[word.length()];
		 // and filled it with '_'
		 for(int i = 0; i < word.length(); i++)
				 hidden[i] = '_';
		 // translate the word to guess into an array of char
		 char[] digit = word.toCharArray();
			// build a scaner to read user input
		 Scanner letterProvided = new Scanner(System.in);

		 do {
			 // print what we have
			 System.out.print("Progress: ");
					 for(int i = 0; i < word.length(); i++)
							 System.out.print(hidden[i]);

			 if (!badGuesses.isEmpty()) {
				 System.out.print("\nBad Attempts:");
				 for (Character badGuess : badGuesses) {
					 System.out.print(" " + badGuess);
				 }
			 }

			 // input letter from user
			 System.out.print("\nEnter your letter: ");
			 // put it in lower case
			 String letter = letterProvided.nextLine().toLowerCase();
			 // extract first char
			 char guess = letter.charAt(0);
			 // flag if found
			 boolean correctGuess = false;
			 // scan if it is a letter in the word
				 for(int i = 0; i < word.length(); i++)
					 {
							 // yes it is
							 if(guess == digit[i])
							 {
									 // so replace it by the char
									 hidden[i] = guess;
									 // and flag not to increment badGuesses counter
									 correctGuess = true;
							 }
					 }

					 // if not found increment bad guesses
					 if(!correctGuess)
							 badGuesses.add(guess);
		 }
		 while(badGuesses.size() < 10);   // <-- put here number of guess
		 System.out.println("Sorry You Lost!!!!");

		 return game();
}

public int getLevel(){
	String difficulty = JOptionPane.showInputDialog ("LEVEL : 1 for easy -- 2 for normal -- 3 for hard");

	int intDifficulty = Integer.parseInt(difficulty);
	intDifficulty = intDifficulty -1;

		 if(intDifficulty >= mWordList.length || intDifficulty < 0)
		 {
				 System.out.println("Wrong input, it has to be between 1 and 3");
		 }

		 String pickedArray[] = mWordList[intDifficulty];
		 String[] difficultyMsg = {"LEVEL 1", "LEVEL 2", "LEVEL 3"};
		 System.out.println(difficultyMsg[intDifficulty]);
		 return intDifficulty;
}

public void run(){
	game();
}

}
