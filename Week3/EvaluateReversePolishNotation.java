package Week3;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public long resolves(long a, long b, char operator){
        if(operator=='+') return a+b;
        if(operator=='-') return a-b;
        if(operator=='*') return a*b;
        return a/b;
    }
    public int evalRPN(String[] tokens){
        Stack<Long> stack = new Stack<>();
        int n = tokens.length;
        for (int i=0;i<n;i++){
            if(tokens[i].charAt(0)<48){
                long integer2= stack.pop();
                long integer1= stack.pop();
                char operator = tokens[i].charAt(0);
                long resolvedAnswer= resolves(integer1, integer2, operator);
                stack.push(resolvedAnswer);
            }
            else stack.push(Long.parseLong(tokens[i]));
        }
        return stack.pop().intValue();
    }
}