class linkedlist {
    Node head;

    class Node{
        int data;
        Node Next;
        
    Node(int val){
        data = val;
        Next = null;
    }    
    }

    linkedlist(){
        head = null;
    }

    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.Next = head;
            head = newNode;
        }
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.Next;
        }
        System.out.println("null");
    }

    public void deleteAtpos(int pos){
        if(head == null){
            throw new IndexOutOfBoundsException("empty list");
        }

        if(pos == 0){
            head = head.Next;
        }

        Node temp = head;
        Node prev = null;

        for(int i = 1; i<=pos; i++){
            prev = temp;
            temp = temp.Next;
        }
        prev.Next = temp.Next;
    }

    public void deleteAtBegining(){
        head = head.Next; 
    }

    public int Search(int val){
        Node temp = head;
        int pos = 0;
        while(temp != null){
            if(temp.data == val){
                return pos;
            }
            temp = temp.Next;
            pos++;
        }
        return -1;
    }
    

}



public class LinkedlistMethods{
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtBeginning(9);
        list.insertAtBeginning(10);
        list.insertAtBeginning(11);
        list.insertAtBeginning(12);
        list.display();

        System.out.println(" ");
        list.insertAtpos(1, 10);
        list.display();

        System.out.println(" ");
        System.out.println("Node position number : " + list.Search(12));
        list.display();
    }
}