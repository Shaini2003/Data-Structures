public class stack {
    int arr[];
    int top;
    int capacity;

    //creating a stack
    stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //add elements into stack
    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Inserting: "+x);
            top++;
            arr[top] = x;
        }
    }

    //check if the stack is full
    Boolean isFull() {
        return top == capacity - 1;
    }

    //remove element from stack
    void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");

        } else {

            System.out.println("Removing: "+arr[top]);
            top--;

        }
    }


    Boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args){
        stack mystack = new stack(5);
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);
        mystack.push(40);
        mystack.push(50);

        mystack.pop();

        mystack.push(60);


    }
}

