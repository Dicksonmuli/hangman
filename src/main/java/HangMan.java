// importing classes from java libraries
import java.io.Console;
import java.util.*;


public class HangMan {
// declaration
private String mWord;
List<Character> badGuesses = new ArrayList<>();
Random randomNumber  = new Random();
Scanner letterProvided = new Scanner(System.in);
private static String mWordList[][] = {

{ "spy", "chicken", "pizza", "bread", "stones", "leaves", "soup", "hungry", "sleepy", "caring", "friends", "month", "day", "light"},

{ "destroy", "drain", "donkey", "religion", "triangle", "circle", "medicine", "passenger", "seven", "flower", "mountain", "hot"
},


{ " specification", " structure", " lexical", " likewise", " management", " manipulate", " mathematics", " hotjava", " vertex", " unsigned", " traditional"
}};


	public boolean checkWord(String word){
		return true;
	}
	public static boolean checkGuess(char l){
		return false;
	}
	public String getWord(){
		return mWord;
	}
	// int intDifficulty = Integer.parseInt(difficulty);
	// intDifficulty = intDifficulty -1;
	//
	// 		if(intDifficulty >= dictionaries.length || intDifficulty < 0)
	// 		{
	// 				System.out.println("Sorry answer between 1 and 3");
	// 				return;
	// 		}


}
