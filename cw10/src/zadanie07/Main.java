package zadanie07;

public class Main {
    static void main() {
        Person[] people = {
            new Person("Artur", 30),
            new Person("Jagoda", 22),
            new Person("Tadeusz", 45),
            new Person("Adam", 19),
            new Person("Bianka", 27),
            new Person("Janusz", 70),
            new Person("Grażyna", 52),
        };
        
        for (Person person : people)
            System.out.println(person);
        System.out.println();
        
        Person.sort(people);
        
        for (Person person : people)
            System.out.println(person);
        System.out.println();
        
    }
    
}
