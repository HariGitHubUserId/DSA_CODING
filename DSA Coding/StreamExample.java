import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

// public class collections{
//     public static void main(String[] args) {

//         <Integer> students = new p<>();

//         // students.add("hari");
//         // students.add("velu");
//         // students.add("mahesh");
//         // students.add("hari");
//         // students.add("null");
//         // students.add("7");

//         // // System.out.println("list out those elements" + students); 
//         // // System.out.println("size : " + students.size());
//         // // System.out.println("size : " + students.isEmpty());
//         // // System.out.println("size : " + students.contains("7"));
//         // // System.out.println("size : " + students.indexOf("7"));

//         // // System.out.println("size : " + students.lastIndexOf("7"));
//         // System.out.println("size : " + students.getFirst());
//         // System.out.println("size : " + students.getLast());
//         // System.out.println("size : " + students.get(2));

//         // students.removeFirst();
//         // System.out.println("after remove : " + students);

//         // students.addFirst("rajan");
//         // System.out.println(students + " ");

//         // students.addLast("sanjai");
//         // System.out.println(students + " ");

//         // // Object[]arr = students.toArray();    
//         // // System.out.println(Arrays.toString(arr));


//         // Iterator<String> it = students.iterator();
//         // while(it.hasNext()){
//         //     System.out.print(it.next() + " ");
//         // }



//         // // student.addFirst();
//         // // System.out.println("name of the students : " +student.lastIndexOf("vicky"));

//         // // Object [] arr = student.toArray();
//         // // System.out.println(Arrays.toString(arr));

//         // // Iterator <String> it = student.iterator();
//         // // while(it.hasNext()){
//         // //     System.out.println(it.next());
//         // // }
//         // // student.clear();
//         // // System.out.println("\n current size of list : "+student.size());
        



//     }
// }
 
// 

// public class collections{
//     public static void main(String[] args) {
//         LinkedHashMap<String,Integer> pq = new LinkedHashMap<>();
//         pq.put("velu",45);
//         pq.put("mani",15);
//         pq.put("hari",5);
// //         pq.put("sanjai",23); 
// //         pq.putIfAbsent("ram", 12);
        
//         // System.out.println(pq);


//         System.out.println(pq + " ");
//         // pq.removeIf( n -> n> 25);
//         // System.out.println(pq);
       
//         // // System.out.println(pq.comparator());
//         // System.out.println(pq.hashCode());

        


//         // System.out.println(q.poll());
//         // System.out.println(q.peek());
//         // System.out.println(q);
//         // System.out.println(q.hashCode());
//         // System.out.println(q.getClass());
        


//     }
// }

import java.util.*;
// import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        // Stream operations
        numbers.stream()
               .filter(n -> n % 2 == 0)       
               .map(n -> n * n)               
               .sorted()                      
               .forEach(System.out::println); 
    }
}

 


// import java.util.*;

// public class SortedSetExample {
//     public static void main(String[] args) {
//         SortedSet<Integer> set = new TreeSet<>();
//         set.add(10);
//         set.add(5);
//         set.add(20);

//         System.out.println("SortedSet: " + set); 
//         System.out.println("First: " + set.first()); 
//         System.out.println("Last: " + set.last());   
//         System.out.println("HeadSet(10): " + set.headSet(10)); 
//     }
// }


// import java.util.*;

// public class NavigableSetExample {
//     public static void main(String[] args) {
//         NavigableSet<Integer> set = new TreeSet<>();
//         set.add(10);
//         set.add(5);
//         set.add(20);

//         System.out.println("NavigableSet: " + set); // [5, 10, 20]
//         System.out.println("Lower(10): " + set.lower(10));     // 5
//         System.out.println("Floor(10): " + set.floor(10));     // 10
//         System.out.println("Ceiling(15): " + set.ceiling(15)); // 20
//         System.out.println("Higher(10): " + set.higher(10));   // 20
//         System.out.println("PollFirst(): " + set.pollFirst());  // 5
//         System.out.println("Set after pollFirst: " + set);      // [10, 20]
//     }
// }





// import java.util.*;

// public class Example {
//     public static void main(String[] args) {
//         TreeMap<Integer, String> map = new TreeMap<>();
//         map.put(3, "Banana");
//         map.put(1, "Apple");
//         map.put(2, "Cherry");

//         map.put(4, null);
//         map.put(null, null);

//         System.out.println(map); // {1=Apple, 2=Cherry, 3=Banana}
//     }
// }
