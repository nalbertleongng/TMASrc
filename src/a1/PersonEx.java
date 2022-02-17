package a1;

public class PersonEx {
    public static void main(String[] args) {
        var people = Arrays.asList(new Person("Peter", 12),
                new Person("Mary", 15), new Person("Paul", 12),
                new Person("Peter", 10), new Person("Amy", 15));
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
// part b: call Collections.sort(people, ...);
        System.out.println(people);
    }
}
