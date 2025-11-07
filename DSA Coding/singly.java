import java.util.*;
class linkedlist{
    Node head; // starting position!

    class Node{
        int data; // value will take
        Node next; // next address of the data  

        Node(int val){
            data = val;
            next = null;
        }
    }

    linkedlist(){
        Node head = null;
    }

    public void insertAtBeginning(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int pos, int val){
        if(pos == 0){
            insertAtBeginning(val);
        }
        Node newnode = new Node(val);
        Node temp = head;
        for(int i = 0; i<pos-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void deleteAtPos(int pos){
        if(head == null){
            throw new IndexOutOfBoundsException("deletion attempted in empty list");
        }
        Node temp = head;
        Node prev = head;
        if(pos == 0){
            head = head.next;
        }
        for(int i = 0; i<pos-1; i++){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
}


public class singly{
    public static void main(String[] args) {
        linkedlist list = new linkedlist(); // object creted for linkedlist
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.display();

        System.out.println(" ");
        list.insertAtPos(0, 35);
        list.display();

        
    }
}
