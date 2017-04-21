// importing classes from java libraries

import org.junit.*;
import static org.junit.Assert.*;

// class declaration
public class HangManTest {
	// the first test to test first behaviour
	// checking if it takes a word
	@Test
	public void HangManTest_checkIfWord_true() {
		HangMan testWord = new HangMan();
		assertEquals(true, testWord.checkWord("cabbage"));
	}

	@Test
	public void CheckLetter_CheckIfGuess_badGuess() {
		HangMan testGuess = new HangMan();
		assertEquals(false, testGuess.checkGuess('a'));
	}
}
