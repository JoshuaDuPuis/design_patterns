/**
 * The Hard class defines the hard level of the trivia game.
 * @author Joshua DuPuis
 */
public class Hard implements State{
    private ArithemeticGame game;

    /**
     * The Hard constructor constructs the hard level of the game
     * @param game The trivia game being played
     */
    public Hard(ArithemeticGame game) {
        this.game = game;
    }

    /**
     * The getNum method returns a number between one and 100
     * @return An int between one and 100
     */
    public int getNum() {
        int num = (int) ((Math.random() * 100) + 1);
        return num;
    }

    /**
     * The getOperation method randomly returns either "+", "-", "*", or "/"
     * @return A String contianing either "+", "-", "*", or "/"
     */
    public String getOperation() {
        int operation = (int) (Math.random() * 4);
        if (operation == 0) {
            return "+";
        } else if (operation == 1) {
            return "-";
        } else if (operation == 2) {
            return "*";
        }
        return "/";
    }

    /**
     * The levelUp method prints out an encouraging message to tell the user
     * they are doing well. 
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }

    /**
     * The levelDown method moves the game back to the medium state and prints
     * out a message to the user.
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode");
        game.setState(game.getMediumState());
    }

 }