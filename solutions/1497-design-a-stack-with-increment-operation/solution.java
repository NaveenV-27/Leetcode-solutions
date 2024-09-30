class CustomStack {
    int s[];
    int top;
    int size;
    public CustomStack(int maxSize) {
        s = new int[maxSize];
        top = -1;
        size = maxSize;
    }
    
    public void push(int x) {
        if(top < size-1) s[++top] = x;
    }
    
    public int pop() {
        if(top >= 0) return s[top--];
        else return -1;
    }
    
    public void increment(int k, int val) {
        for(int i=0; i<k&&i<size; i++) {
            s[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
