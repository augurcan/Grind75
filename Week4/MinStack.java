package Week4;

import java.util.LinkedList;

public class MinStack {
    LinkedList<TplusMin> stack;
    private class TplusMin{
        int val;
        int min;
        public TplusMin(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
    public MinStack() {
        stack = new LinkedList<>();
    }
    
    public void push(int val) {
        int newMin;
        if(stack.size()==0) newMin=val;
        else{
            int currentMin = stack.peek().min;
            newMin=val<currentMin? val:currentMin;
        }
        stack.push(new TplusMin(val, newMin));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}
