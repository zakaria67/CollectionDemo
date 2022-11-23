import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan",21);
        Person person2 = new Person("Josh",12);
        Person person3 = new Person("Marie",50);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        for (Person person:people){
            System.out.println(person);
        }
        System.out.println("----------");
        Person jan = new Person("Jan",21);

       // System.out.println(people.contains(jan));

        Set<Person> personSet =new HashSet<>();
        Set<Person> personSet1 = new TreeSet<>(Comparator.comparing(Person::getAge)
                .thenComparing(Person::getName));
        personSet.addAll(people);
        personSet.add(jan);

        for (Person person : personSet){
            System.out.println(person);
        }
    }
}
