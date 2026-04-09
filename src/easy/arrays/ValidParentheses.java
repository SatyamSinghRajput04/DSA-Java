package easy.arrays;

import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {

                // if stack empty -> invalid
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // check matching brackets
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // if stack empty -> valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        String s = "([])";

        boolean result = isValid(s);

        System.out.println("Is valid parentheses: " + result);
    }
}

/*
 * ------------------------------------------------------------
 * Approach 1: Brute Force / Replacement Method
 * Time Complexity: O(n^2)
 * 
 * Idea:
 * Repeatedly remove valid pairs like:
 * "()", "{}", "[]"
 * until the string stops changing.
 * 
 * while(s.contains("()") || s.contains("{}") || s.contains("[]")){
 * s = s.replace("()", "");
 * s = s.replace("{}", "");
 * s = s.replace("[]", "");
 * }
 * 
 * return s.isEmpty();
 * 
 * ------------------------------------------------------------
 * Approach 2: Stack (Optimal)
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Idea:
 * Use stack to track opening brackets.
 * 
 * Push opening brackets.
 * When closing bracket appears:
 * pop from stack and check if they match.
 * 
 * If mismatch → return false.
 * 
 * At end:
 * stack must be empty.
 * ------------------------------------------------------------
 */
