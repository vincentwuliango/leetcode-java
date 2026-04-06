package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 */

public class LC20 {
    void main() {
        String s = "()";
//        IO.println(isValid(s));
        IO.println(isValidOnlyWithStack(s));
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        for (char c : s.toCharArray()) {
            if (map.containsValue(c)) {
                stack.push(c);
            } else if (map.containsKey(c)) {
                if (stack.isEmpty() || map.get(c)  != stack.pop()) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public boolean isValidOnlyWithStack(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            
            if (!stack.isEmpty()) {
                char last = stack.peek();
                if (isPair(last, curr)) {
                    stack.pop();
                    continue;
                }
            }
            
            stack.push(curr);
        }
        
        return stack.isEmpty();
    }
    
    private boolean isPair(char last, char curr) {
        return (last == '(' && curr == ')') ||
                (last == '{' && curr == '}') ||
                (last == '[' && curr == ']');
    }
}
