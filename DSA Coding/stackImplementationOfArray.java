class ArrayStack{
    public static final int max_size = 30;
     int arr[] = new int[max_size];
     int top;

    ArrayStack(){
        top = -1; // stack is empty
    }

    public void push(int val){
        if(top == max_size -1){ // 29 == 29
            throw new IndexOutOfBoundsException("stack is overflow");
        }
        arr[top++] = val;
    }

    public int pop(){
        if(top == -1){ // 29 == 29
            throw new IndexOutOfBoundsException("stack is underflow");
        }
        return arr[top--];
    }

    public int peek(){
        return arr[top];
    }

    public boolean isEmpty(){
        return ( top == -1);
    }

    public boolean isFull(){
        return ( top == -1);
    }

    public void display(){
        if(top == -1){ // 29 == 29
            throw new IndexOutOfBoundsException("stack is underflow");
        }
        System.out.println("Elements in stack: ");
        for(int i = 0; i< top; i++){
            System.out.println(arr[i] + " ");
        }
    }

}



public class stackImplementationOfArray{
    public static void main(String[] args) {
        
        ArrayStack stack = new ArrayStack();

        stack.push(60);
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.display();

        System.out.println("popped element : " + stack.pop());
        System.out.println(" stack is full : " + stack.isFull());

    }
}
