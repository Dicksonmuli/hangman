import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		System.out.println("----------------------------------");
		System.out.println("Welcome to HangMan Game!");
		System.out.println("       | |  | |\n      -| |  | |-\n  _    | |- | |\n-| |   | |  | |-\n   |.|  -| ||/  |\n| |-  |  ___/\n -|.|   | | |\n |  `_|| |  0\n  `____  |  +\n   |   | |- ;;\n       | |\n      -| | hang\n       |_|");
		System.out.println("----------------------------------");


		HangMan gameNow = new HangMan();

		gameNow.getLevel();

	}
}
