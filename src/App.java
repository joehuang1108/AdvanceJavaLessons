import java.util.HashMap;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) throws Exception {
        
        // HashMap - unique Key and value pairs
        // put() - to add to HashMap
        // get() - Access value to HashMap
        // remove() - removes key/value pair
        HashMap<String, Integer> studentInfo = new HashMap<>();
        studentInfo.put("Amy", 9);
        studentInfo.put("Eric", 10);
        studentInfo.put("Josh", 11);
        studentInfo.put("Amy", 11);
        studentInfo.remove("Josh");

        // System.out.println(studentInfo);
        // System.out.println(studentInfo.get("Amy"));

        for(String i : studentInfo.keySet()){
            // System.out.println(i + " " + studentInfo.get(i));
            continue;
        }

        // Priority Queue 
        // First come first serve - FIFO (First in First out)
        // Stack - LIFO (Last in First out)
        // Specific condition that gives priority 

        // Default priority is smallest to largest (Natural Ordering)
        String head = "";
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Milk");
        pq.add("Cookies");
        pq.add("Milk");

        // Removes the first occurance
        pq.remove("Milk");
        pq.add("Bread");
        System.out.println("Priority Queue before poll: " + pq);
        head = pq.poll();
        System.out.println("Priority Queue after poll: " + pq);

        System.out.println(pq.peek());



        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        
        pq1.add(5);
        pq1.add(12);
        pq1.add(1);
        pq1.add(20);
        pq1.add(10);

        System.out.println(pq1);


        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a, b) -> Double.compare(b, a));
        
        pq2.add(5);
        pq2.add(12);
        pq2.add(1);
        pq2.add(20);
        pq2.add(10);

        System.out.println(pq2);
        pq2.poll();
        System.out.println(pq2);


        




        
    }
}
