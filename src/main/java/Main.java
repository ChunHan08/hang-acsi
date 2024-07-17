import java.io.Console;
import java.util.Scanner;

System.out.print("Please guess a letter;");
char guess = s.nextLine().toUpperCase().charAt(0);

System.out.println(m);

public class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the ASCII Version of Hangman!);
  }
char[] puzzle = new char[letters.length];
  for(int i = 0; i < puzzle.length; i++) {
  puzzle[i] = '_';
  Man m = new Man();
  Scanner sc = new Scanner(System.in);
  }
if (m.isAlive()) Sytem.out.println("YAYYYY! Player 2 wins");
else System.out.println("GAME OVER! Player 1 wins!");
}

while (m.isAlive()) {
  System.out.println("Puzzle to solve: ");
  for(int i = 0; i < puzzle.length; i++) {
    system.out.print(puzzle[i] + " ");
  }
  System.out.println();
}
if (!containsGuess) m.hang();

boolean checkUnderscore = false;
for (int i = 0; i < puzzle.length; i++) {
  if(puzzle[i] == '_') checkUnderscore=true;
}
if (!checkUnderscore) break;


boolean containsGuess = false;
for (int i = 0; i < letters.length && !containsGuess; i++) {
  if(letters[i] == guess) {
    containsGuess = true;
    for (int j = 0; j < puzzle.length; j++) {
      if (letters[j] == guess) puzzle[j] = guess;
    }
    break;
  }
}
public class Man {
  static final Int MAX_INCORRECT_GUESSES = 6;
  int numIncorrect;
  char[] body;
  public Man() {
    body = new char[] {' ', ' ', ' ', '\n', ' ', ' ', ' ', '\n', ' ', ' ', ' ', '\n'};
    numIncorrect = 0; 
    }
  public boolean isAlive() {
      return numIncorrect < MAX_INCORRECT_GUESSES;
  }
  public String tostring() {
    return new String(body);
  }
  public static void main(String[] args) {
    Man m = new Man();
    for(int i=0; i<Man.MAX_INCORRECT; i++) {
      m.hang();
      System.out.println(m);
      
    }
  }
}

public void hang() {
  numIncorrect++;
  swith (numIncorrect){
    case 1:
      body[1] = 'O';
      break;
    case 2:
      body[5] = '|';
      break;
    case 3:
      body[4] = '\\';
      break;
    case 4:
      body[6] = '/';
      break;
    case 5:
      body[8] = '/';
      break;
    case 6:
      body[10] = '\\';
      break;
  }
}
Console c = System.console();
char[] letters = c.readPassword("Enter the secret word!: ");
for(int i=0; i<letters.length; i++) {
  letters[1] = Character.toUpperCase(letters[i]);
  
}
