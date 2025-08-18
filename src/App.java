import java.util.HashMap;

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
        System.out.println(studentInfo.get("Amy"));

        for(String i : studentInfo.keySet()){
            System.out.println(i + " " + studentInfo.get(i));
        }
    }
}
