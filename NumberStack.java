package number_stack;
import java.util.*;
/**
 * Implementation of Stack instead of LinkedList used on the previous version. Integers obtained from user input
 * will be validated then pushed into the stack using push method. The stack of integers then will be 
 * sorted from the smallest to the largest by calling the helper method sortStack.
 * The class consists of three methods: the main driver code, sortStack method and a validation method to ensure that 
 * the input is a valid integer. 
 * Example input: 4 7 9 3 q
 * Output: Sorted List: 
 * 3, 4, 7, 9
 * @author Mellissa Fierro
 * @since 2024-02-17
 * @version 2.0
 */
public class NumberStack {
    /**
     * This is the main method that keep asking for user to input integer until user input q. Input will be 
     * validated by calling isInteger method and valid input will be pushed instead of add in the previous version
     * into a new stack created. The numbers then will be sorted by calling another method new to this version that 
     * sort the stack passed in to the method.
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = new Stack<Integer>();

        System.out.println("Enter integer numbers (type 'q' to quit): ");
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if ("q".equals(input)) {
                break;
            } else if (isInteger(input)) { 
                int number = Integer.parseInt(input);
                numbers.push(number);
            } else {
                System.out.println("Invalid input: Please enter a valid integer.");
            }
        }
        sortStack(numbers); 
    }
    /**
    * This method sorts the stack of integer type passed in using the Collection framework. Previously, this
    * part of the code belongs to the main method.
    * @param numbers The stack of integers of user input created by the main method.
    * @return No return 
    */
    private static void sortStack(Stack<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println("Sorted List:");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
    }
    /**
     * This method is used to check if the user input is a valid integer.
     * @param input This is the user input from keyboard.
     * @return True if valid number, False if it is not an integer.
     */
    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}






