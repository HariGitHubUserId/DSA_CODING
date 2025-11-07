class linkedlist {
    Node head;
    Node tail;

    class Node{
        int data;
        Node prev;
        Node Next;
        
    Node(int val){
        data = val;
        Next = null;
        prev = null;
    }    
    }

    linkedlist(){
        head = null;
        tail = null;
    }

    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        newNode.Next = head;
        if(head == null){
            tail = newNode;
        }
        else{
            head.prev = newNode;
        }
        head = newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.Next;
        }
        System.out.println("null");
    }

    public void displayrev(){
        if(tail == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public void insertAtpos(int pos, int val){
        if(pos == 0){
            insertAtBeginning(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 1; i<pos; i++){
            temp = temp.Next;
            if(temp == null){
                throw new IndexOutOfBoundsException("invalid pos" + pos);
            }
            newNode.Next = temp.Next;
            newNode.prev = temp;
            if(temp == tail){
                tail = newNode;
            }
            else{
                temp.Next.prev = newNode;
                temp.Next = newNode;
            }
        }
    }


    public void deleteAtpos(int pos){
        if(head == null){
            throw new IndexOutOfBoundsException("empty list");
        }

        if(pos == 0){
            head = head.Next;
            if(head == null){
                tail = null;
            }
            else{
                head.prev = null;
                return;
            }
        }

        Node temp = head;
        Node prev = null;

        for(int i = 1; i<=pos; i++){
            prev = temp;
            temp = temp.Next;
            if(temp == null){
                throw new IndexOutOfBoundsException("empty list");
            }
        }
        prev.Next = temp.Next;
        if(temp.Next == null){
            tail = prev;
        }
        else{
            temp.Next.prev = prev;
        }    
    }

    public void deleteAtBegining(){
        if(head == null){
                tail = null;
            }
            else{
                head.prev = null;
                return;
            }
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



public class doublyLinkedlistMethods{
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.insertAtBeginning(9);
        list.insertAtBeginning(10);
        list.insertAtBeginning(11);
        list.insertAtBeginning(12);

        list.display();
        System.out.println(" ");
        list.displayrev();

        
        list.insertAtpos(4, 234);
        System.out.println(" ");
        list.display();

        System.out.println(" ");
        list.displayrev();
        list.display();

        System.out.println(" ");
        System.out.println("Node position number : " + list.Search(12));
        list.display();
    }
}