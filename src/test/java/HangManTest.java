// importing classes from java libraries

import org.junit.*;
import static org.junit.Assert.*;

// class declaration
public class HangManTest {
	// the first to run before the test
	@Before
   public void before() {
      System.out.println("This is a game");
   }

	// checking if it takes a word
	@Test
	public void checkWord_checkIfWord_true() {
		HangMan testWord = new HangMan();
		assertEquals(true, testWord.checkWord("cabbage"));
	}

	@Test
	public void numberOfFaults_theNumberOfFaults_0() {
		HangMan testWord = new HangMan();
		assertEquals(0, testWord.numberOfFaults(
		));
	}



	// @Test
	// public void CheckLetter_CheckIfGuess_badGuess() {
	// 	HangMan testGuess = new HangMan();
	// 	assertEquals(false, testGuess.checkGuess('a'));
	// }

	// @Test
	// public void CheckLetter_CheckIfGuess_goodGuess(){
	// 	HangMan testGuess = new HangMan();
	// 	assertEquals(true, testGuess.checkGuess('a'));
	// }
}
