import java.util.Scanner;

/**
 * The ArithmeticGameClass defines the arithmetic trivia game that the user
 * will interact with.
 * @author Joshua DuPuis
 */

public class ArithemeticGame {
    
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * The ArithmeticGame constructor initializes the score and state variables.
     */
    public ArithemeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
        reader = new Scanner(System.in);
    }

    /**
     * The pressQuestionButton method presents the user with a question and
     * reads in their answer. The method then tells the user if they are
     * correct and either increases or decreases their score accordingly. If
     * they do well enough or very poorly, this method also changes the level
     * of the game.
     */
    public void pressQuestionButton() {
        int firstNum = state.getNum();
        int secondNum = state.getNum();
        String operation = state.getOperation();
        System.out.print(firstNum + " " + operation + " " + secondNum + ": ");
        int response = reader.nextInt();
        int answer;
        if (operation.equals("+")) {
            answer = firstNum + secondNum;
        } else if (operation.equals("-")) {
            answer = firstNum - secondNum;
        } else if (operation.equals("*")) {
            answer = firstNum * secondNum;
        } else {
            answer = firstNum / secondNum;
        }
        if (response == answer) {
            System.out.println("Correct");
            score++;
            if (score >= 3) {
                state.levelUp();
                score = 0;
            }
            return;
        }
        System.out.println("Incorrect");
        score--;
        if (score <= -3) {
            state.levelDown();
            score = 0;
        }
        return;
    }

    /**
     * The setState method changes the state of the game depending on how well
     * the user answers questions.
     * @param state The new state of the game
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * The getEasyState method returns the easy state of the game
     * @return The easy state of the game
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * The getMediumState method returns the medium state of the game
     * @return The medium state of the game
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * The getHardState method returns the hard state of the game
     * @return The hard state of the game
     */
    public State getHardState() {
        return hardState;
    }
}
