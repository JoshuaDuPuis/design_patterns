import java.lang.Math;
/**
 * The Medium class defines the medium level of the trivia game.
 * @author Joshua DuPuis
 */
public class Medium implements State{
    private ArithemeticGame game;

    /**
     * The Medium constructor constructs the medium level of the game
     * @param game The trivia game being played
     */
    public Medium(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * The getNum method returns a number between one and 50
     * @return An int between one and 50
     */
    public int getNum() {
        int num = (int) ((Math.random() * 50) + 1);
        return num;
    }

    /**
     * The getOperation method randomly returns either "+", "-", or "*"
     * @return A String contianing either "+", "-", or "*"
     */
    public String getOperation() {
        int operation = (int) (Math.random() * 3);
        if (operation == 0) {
            return "+";
        } else if (operation == 1) {
            return "-";
        }
        return "*";
    }

    /**
     * The levelUp method moves the game to the hard state and prints out
     * an encouraging message.
     */
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }

    /**
     * The levelDown method moves the game back to the easy state and prints
     * out a message to the user.
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to the easy mode.");
        game.setState(game.getEasyState());
    }

 }