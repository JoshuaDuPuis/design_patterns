import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * The TriviaGame class is a singleton class with a private constructor so that
 * only one instance of a TriviaGame can be created. The TriviaGame object will
 * hold an ArrayList of questions and facilitate interaction between the game
 * and the user.
 * @author Joshua DuPuis
 */
public class TriviaGame {
  private static TriviaGame triviaGame;
  private int score;
  private Random rand;
  private Scanner reader;
  private ArrayList<Question> questions;

  /**
   * The TriviaGame constructor is private so that only one instance can be
   * created. It initializes the questions ArrayList and fills it with
   * questions read in from the file.
   */
  private TriviaGame() {
    questions = new ArrayList<Question>();
    questions = DataLoader.getTriviaQuestions();
    rand = new Random();
    reader = new Scanner(System.in);
  }

  /**
   * The getInstance method returns the instance of the TriviaGame
   * @return The instance of the TriviaGame class
   */
  public static TriviaGame getInstance() {
    if (triviaGame == null) {
        triviaGame = new TriviaGame();
    }
    return triviaGame;
  }

  /**
   * The play method facilitates the gameplay and continually asks the user if
   * they want to keep playing until they decide to quit.
   */
  public void play() {
    String userEnter = "p";
    while (!(userEnter.equals("q"))) {
      if (playRound()) {
          score++;
      }
      System.out.println("(P)lay or (Q)uit: ");
      userEnter = reader.nextLine();
      while (!(userEnter.equals("q") || userEnter.equals("p"))) {
        userEnter = reader.nextLine();
        if (userEnter.equals("q") || userEnter.equals("p")) {
          System.out.println();
          break;
        }
        System.out.println("That is an invalid input, please enter \"p\" or \"q\"");
      }
    }
    System.out.println("You won " + score + " games!\nGoodbye");
  }

  /**
   * The playRound method displays a question in front of the user and allows
   * them to guess the answer. If they get it right, the method returns true,
   * if not, it displays the correct answer and returns false.
   * @return Returns true if the user guesses the answer, false otherwise
   */
  private boolean playRound() {
    int questionNumber = rand.nextInt(questions.size());
    System.out.println(questions.get(questionNumber));
    int answer = reader.nextInt();
    while (answer > 4 || answer < 1) {
        System.out.println("You entered an invalid number, please enter a value between 1 and 4");
        answer = reader.nextInt();
    }
    if (questions.get(questionNumber).isCorrect(answer)) {
        System.out.println("YAY! You got it right!");
        return true;
    }
    System.out.println("You got it wrong!");
    System.out.print("The correct answer is ");
    System.out.println(questions.get(questionNumber).getCorrectAnswer());
    return false;
  }
}
