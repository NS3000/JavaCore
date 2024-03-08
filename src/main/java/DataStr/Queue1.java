package DataStr;

public class Queue1 {
    private int capacity;int queueArr[];int front;int rear;int currentSize = 0;

    public Queue1(int size) {
        this.capacity = size;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];
    }
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!! Can not add more elements");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data + " added to the queue");
        }
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println(queueArr[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front - 1] + " removed from the queue");
            }
            currentSize--;
        }
    }

    public boolean isFull() {
        return (currentSize == capacity);
    }
    public boolean isEmpty() {
        return(currentSize == 0);
    }

    public static void main(String[] args) {
        Queue1 que = new Queue1(5);
        que.enqueue(5);
        que.enqueue(22);
        que.enqueue(97);
        que.dequeue();
        que.dequeue();
    }

}
