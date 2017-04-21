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

	@Test
	public void guessedLetter_EmptyAtFirst() {
		HangMan testWord = new HangMan();
		assertEquals("", testWord.guessedLetter(
		));
	}

	@Test
	public void getLevel_1() {
		HangMan testWord = new HangMan();
		boolean intDifficult=false;
		assertEquals(intDifficult, testWord.getLevel() == 1);
	}

	@Test
	public void getLevel_2() {
		HangMan testWord = new HangMan();
		boolean expected=false;
		assertEquals(expected, testWord.getLevel() == 2);
	}

	// @Test
	// public void rightGuessHasNoEffectOnFaults() {
	// 	char s = "0";
	// 	HangMan testWord = new HangMan();
	// 	testWord.guessedLetter(s);
	// 	assertEquals("", testWord.numberOfFaults() == 0
	// 	));
	// }

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
