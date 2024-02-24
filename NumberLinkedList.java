package number_linkedlist;
import java.util.*;


/**
 * Implementation of Linked List of integers from user input and 
 * sorted from the smallest to the largest. 
 * The class consists of two methods: the main driver code and a method to ensure that 
 * the input is a valid integer.
 * Example input: 4 7 9 3
 * Output: Sorted List: 
 * 3, 4, 7, 9
 * @author Mellissa Fierro
 * @since 2024-02-10
 * @version 1.0
 */
public class NumberLinkedList {
    /**
     * This is the main method that keep asking for user to input integer and add it to 
     * the Linked List if the input is a valid integer.
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<>();

        System.out.println("Enter integer numbers (type 'q' to quit): ");
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            if ("q".equals(input)) {
                break;
            } else if (isInteger(input)) { 
                int number = Integer.parseInt(input);
                numbers.add(number);
            } else {
                System.out.println("Invalid input: Please enter a valid integer.");
            }
        }

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






