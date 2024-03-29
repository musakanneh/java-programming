package ProblemSolving.String.Easy;

/**
 * There is a programming language with only four operations and one variable X:
 *
 * ++X and X++ increments the value of the variable X by 1.
 * --X and X-- decrements the value of the variable X by 1.
 * Initially, the value of X is 0.
 *
 * Given an array of strings operations containing a list of operations,
 * return the final value of X after performing all the operations.
 */
public class FinalValueAfterOperations {

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations());
    }

    public static int finalValueAfterOperations() {
        String[] operations = {"++X","++X","X++"};
        int count = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                count++;
            } else {
                count--;
            }
        }
        return count;
    }
}
