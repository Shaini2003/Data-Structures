public class Queue {
    int front;
    int rear;
    int capacity;
    int queueArr[];

    Queue(int Size){
        capacity=Size;
        front=0;
        rear=-1;

        queueArr=new int[Size];
    }
    boolean isFull(){
        return rear+1 == capacity;
    }
    void enQueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
                rear++;
                queueArr[rear]=x;
                System.out.println("Inserted: "+x);

        }
    }
    boolean isEmpty(){
        return front>rear;
    }
    void deQueue(){
        if(isEmpty()){
            System.out.print("Queue is empty");
        }
        else{
            System.out.println("Removing: "+queueArr[front]);
            front++;

        }
    }
    void printQueue(){
        for(int i=front;i<=rear;i++){
            System.out.print(queueArr[i]+" ");
        }
    }


    public static void main(String[]args){
        Queue myQueue=new Queue(5);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);

        myQueue.deQueue();
        myQueue.deQueue();

        myQueue.printQueue();
    }
}
