class circularlinkedlist<T>{
    Node last;

        class Node{
        T data;
        Node next;

        Node( T val){
            data = val;
            next  = null;
        }
    }

    circularlinkedlist(){
        Node last = null;
    }

 public void insertAtBeginning(T val){
    Node newnode = new Node(val);
    if(last == null){
        newnode.next = newnode;
        last = newnode;
    }
    else{
        newnode.next = last.next;
        last.next = newnode;
    }
}


 public void insertAtEnd(T val){
    Node newnode = new Node(val);
    if(last == null){
        newnode.next = newnode;
        last = newnode;
    }
    else{
        newnode.next = last.next;
        last.next = newnode;
        last = newnode;
      }
 }
 public void display(){
    Node temp = last.next;
    do{
        System.out.println(temp.data + " ");
        temp = temp.next;
    }while(temp!= last.next);
 }
 public T deleteAtBegining(){
    if(last == null){
        throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    }
    T temp = last.next.data;
    if (last.next==last){
        last = null;
    }
    else{
        last.next = last.next.next; // last.next - sanjai , last.next.next - velu
    }
    return temp;
 }

 public void deleteAtEnd(){
    Node temp = last.next;
    if(last == null){
        throw new IndexOutOfBoundsException("Deletion attempted on empty list");
    }
    if (last.next==last){
        last = null;
    }
    else{
        while(temp.next != last.next){
            temp = temp.next; // jump statement
        }
        temp.next = last.next;
        temp = last;
    }

}

public class circular {
    public static void main(String[] args) {
        circularlinkedlist<String> list = new circularlinkedlist<>();

        list.insertAtBeginning("velu");
        list.insertAtBeginning("velu");
        list.insertAtBeginning("velu");
        list.display();
    }
 }
}
