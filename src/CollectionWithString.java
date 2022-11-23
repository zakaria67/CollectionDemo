import java.util.*;

public class CollectionWithString {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lychee");
        fruits.add("durian");
        fruits.add("durian");
        fruits.remove(1);
        fruits.add(1,"pear");
        fruits.remove(0);


        System.out.println(fruits.contains("banana"));

        fruits.forEach(s-> System.out.println(s));

        System.out.println("-------------");

        Set<String> fruitSet =new HashSet<>(fruits);
        fruitSet.addAll(fruits);
        fruitSet.add("banana");
        fruitSet.add("cocount");
        fruitSet.add("cocount");
        fruitSet.add("cherry");
        fruitSet.remove("coconut");


        for (String fruit: fruitSet){
            System.out.println(fruit);

        }

        System.out.println("---------");
        SortedSet<String> fruitsSortedSet = new TreeSet<>();
        fruitsSortedSet.addAll(fruitSet);
        for (String fruit : fruitsSortedSet){
            System.out.println(fruit);
        }
    }
}
