import java.util.Stack;

public class MatchingParenthesis {

    public boolean match(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0  ;i < s.length() ; i ++) {
            stack.push(s.charAt(i));
        }
        if ( stack.size()/2 != 0  ) {
            return false;
        }
        while (! stack.isEmpty()) {
            Character br1 = stack.pop();
            if (stack.isEmpty()) {
                return false;
            }
            Character br2 = stack.pop();
            if (br1 == ')' && br2 != '(') {
                return false;
            }

            if (br1 == '}' && br2 != '{') {
                return false;
            }

            if (br1 == ']' && br2 != '[') {
                return false;
            }

        }
        return true;
    }
}
