import java.util.*;
class DyanamicArraymethods{
    private static final int initialCapacity = 16;
    private int arr[];
    private int size;
    private int capacity;

    DyanamicArraymethods(){
        size = 0;
        arr = new int [initialCapacity];
        capacity = initialCapacity;
    }

    public void add(int val){
        if(size == capacity){
            expandArray();
        }
        arr[size ++] = val;
    }

    private void expandArray(){
        capacity *= capacity;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public void display(){
        System.out.println("Enter the elements: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void insertAtPos(int pos , int val){
        if(size == capacity){
            expandArray();
        }
        for(int i = size - 1; i >= pos; i--){
            arr[i + 1] = arr[i];
            size ++;
        }
    }

    public void deleteAtPos(int pos){
        if(capacity > initialCapacity && capacity > 3*size){
            shrinkArray();
        }
        for(int i = pos + 1; i <size ; i++){
             arr[i - 1] = arr[i];
            size ++;
        }
    }

    private void shrinkArray(){
        capacity /= 2;
        arr = java.util.Arrays.copyOf(arr, capacity);
    }

    public int length(){
        return size;
    }


}

    

public class arrays{
    public static void main(String[] args) {
        int val , pos;
        DyanamicArraymethods list = new DyanamicArraymethods();
        Scanner sb = new Scanner(System.in);
        while(true){
        System.out.println("\n---------- List Menu----------\n");
        System.out.println("1.Insert at End\n");
        System.out.println("2.Display the list\n");
        System.out.println("3.Insert at specified position \n");
        System.out.println("4.Delete from the specified position \n");
        System.out.println("5.Exit\n");
        System.out.println("\n------------------------\n");
        System.out.println("Enter your choice: \t");
        int choice = sb.nextInt();
        switch(choice){
            case 1: System.out.print("Enter a data");
                    val = sb.nextInt();
                    list.add(val);
                    break;

            case 2: list.display();
                    break;
            case 3: System.out.print("Enter the pos(starts at 0): ");
                    pos = sb.nextInt();
                    if(pos< 0){
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.print("Enter a data: ");
                    val = sb.nextInt();
                    list.insertAtPos(pos , val);
                    break; 
            case 4: System.out.print("Enter the pos(starts at 0): ");
                    pos = sb.nextInt();
                    if(pos< 0){
                        System.out.println("Invalid position");
                        break;
                    }
                    list.deleteAtPos(pos);
            case 5: System.exit(0);
            default:System.out.println("invalid choice");                              
            }  
        }
        
    }
}
 