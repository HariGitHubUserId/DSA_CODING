class QueueLinkedList {
    private Node front, rear;

    // Node class
    private static class Node {
        int data;
        Node next;
        Node(int value) {
            data = value;
            next = null;
        }
    }

    // Enqueue (add element at rear)
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue (remove element from front)
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue Underflow");
        }
        int value = front.data;
        front = front.next;
        if (front == null) rear = null; // if queue becomes empty
        return value;
    }

    // Peek front element
    public int peek() {
        if (front == null) {
            throw new RuntimeException("Queue is Empty");
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue elements
    public void display() {
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Dequeued: " + q.dequeue());
        q.display();

        System.out.println("Front Element: " + q.peek());
    }
}

