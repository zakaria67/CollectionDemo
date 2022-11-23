import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> customers = new PriorityQueue<>();
        customers.add("Said");
        customers.add("JAn");
        customers.add("Sara");
        customers.offer("Emarah");
        while (customers.size()>0) {
            System.out.println("Treating right now: " + customers.poll());
        }
        for (String name : customers){
            System.out.println(name);
        }
    }
}
