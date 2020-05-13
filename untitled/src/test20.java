import java.util.Stack;

public class test20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] ca = s.toCharArray();
        if (ca.length != 0) {
            if (ca[0] == '[' || ca[0] == '{' || ca[0] == '(') {
                for (int i = 0; i < ca.length; i++) {
                    if (ca[i] == '[' || ca[i] == '{' || ca[i] == '(' || ca[i] == ' ') {
                        stack.push(ca[i]);
                    } else if (stack.size() != 0) {
                        if (stack.peek() == '(' && ca[i] == ')') {
                            stack.pop();
                        } else if (stack.peek() == '[' && ca[i] == ']' ) {
                            stack.pop();
                        } else if (stack.peek() == '{' && ca[i] == '}') {
                            stack.pop();
                        } else {
                            return false;
                        }
                    }else if(stack.size()==0){
                        if(ca[i] == ']' || ca[i] == '}' || ca[i] == ')' || ca[i] == ' '){
                            return false;
                        }else{
                            return true;
                        }
                    }
                }
                if (stack.size() == 0) {
                    return true;
                } else {
                    return false;
                }
            } else{
                return false;
            }
        } else {
            return true;
        }
    }
}
