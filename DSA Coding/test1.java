class linkedlist1{
    Node head;

    class Node{
        int data;
        Node next;
        
    Node(int val){
        data = val;
        next = null;
    }    
    }

    linkedlist1(){
        head = null;
    }

    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(head == null){
            newNode = head;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public void insertAtPos(int pos ,int val){
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 1; i<pos-1; i++){
            temp = temp.next;
            if(head == null){
                throw new ArrayIndexOutOfBoundsException("Invalid position" + pos);
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void deleteAtPos(int pos){
        if(head == null){
            throw new ArrayIndexOutOfBoundsException("Invalid position" + pos);
        }

        if(pos == 0){
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        for(int i = 1; i<=pos; i++){
            prev = temp;
            temp = temp.next;
        }
    }

    public void deleteAtBegining(){
        head = head.next;
    }
}


public class test1 {
    public static void main(String[] args) {

        linkedlist list = new linkedlist();

        list.insertAtBeginning(9);
        list.insertAtBeginning(10);
        list.insertAtBeginning(11);
        list.insertAtBeginning(12);
        list.display();

        System.out.println(" ");
        list.insertAtPos(2)
        list.display();
        
    }
}
