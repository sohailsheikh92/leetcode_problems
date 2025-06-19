class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public MinStack() {
        stack=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek())
            minStack.push(val);
        // if(minStack.isEmpty()==false){
        //     int top=minStack.peek();
        //     if(top>val)
        //         minStack.push(val);
        // }
    }
    
    public void pop() {
       int removed= stack.pop();
       if(removed==minStack.peek())
        minStack.pop();
    }
    
    public int top() {
        int top=stack.peek();
        return top;
    }
    
    public int getMin() {
        int min=minStack.peek();
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */