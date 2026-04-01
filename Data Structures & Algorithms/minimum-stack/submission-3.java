class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        this.stack= new Stack<>();
        this.minStack= new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
       int x= stack.peek();
       if(minStack.peek()==x){
        minStack.pop();
       }
       stack.pop();
    
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        System.out.println(minStack.peek());
        return minStack.peek();
        
        
        
    }
}
