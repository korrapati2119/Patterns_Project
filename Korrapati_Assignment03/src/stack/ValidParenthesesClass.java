package stack;

/**
 * @author venkatakishorekorrapati
 */
import java.util.*;

public class ValidParenthesesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner object to read input from user
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String userInput = scanner.nextLine();
		
		// Creating stacks to store operands,operators and braces
		Stack<String> operands = new Stack<>();
		Stack<String> operators = new Stack<>();
		
		// Used to check if braces are balanced
		Stack<String> braces = new Stack<>();
		// Stores all encountered braces for output
		Stack<String> cbraces = new Stack<>();
		
		//Flag to track if braces are correctly closed
		boolean isValid = true;
		
		// this loop will check the input string
		for(int i=0; i < userInput.length(); i++) {
			char ch = userInput.charAt(i);
			// if the input character is letter(a-z or A-Z) or digit(0-9) then it will push into the operands stack
			if(Character.isLetterOrDigit(ch)) {
				operands.push(String.valueOf(ch));
			}
			// if the input character is an operator(+,-,*,/,%) then it will push into the operators stack
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				operators.push(String.valueOf(ch));
			}
            // If the character is an opening brace, push it onto both stacks
			else if(ch == '[' || ch == '{' || ch == '(') {
				braces.push(String.valueOf(ch));
				cbraces.push(String.valueOf(ch));
			}
            // If the character is a closing brace, check for matching opening brace
			else if(ch == ')' || ch == '}' || ch == ']') {
				cbraces.push(String.valueOf(ch));
                // If there is no matching opening brace exists, mark as invalid and exit loop
				if(braces.isEmpty()) {
					isValid = false;
					break;
				}
                // Pop the last opening brace from the stack
			   String topBrace = braces.pop();
               // Check if the popped brace matches the current closing brace
			   if((ch == ')' && !topBrace.equals("(")) || (ch == '}' && !topBrace.equals("{")) || (ch == ']' && !topBrace.equals("["))){
                	  isValid = false;
                	  break;
                  }
			}
	}
		// If there are still unmatched opening braces, mark as invalid
        if (!braces.isEmpty()) {
            isValid = false;
        }

        // Display the results
        System.out.println("Operands Stack: " + operands);
        System.out.println("Operators Stack: " + operators);
        System.out.println("Braces Stack: " + cbraces);

        if (isValid) {
            System.out.println("The braces are closed correctly.");
        } else {
            System.out.println("The braces aren't closed correctly.");
        }
		scanner.close();
	}
}
