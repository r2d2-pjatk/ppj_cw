package zadanie07;

public class Person {
    
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public static void sort(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            int minValIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].compareTo(people[minValIndex]) < 0)
                    minValIndex = j;
            }
            Person temp = people[minValIndex];
            people[minValIndex] = people[i];
            people[i] = temp;
        }
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int compareTo(Person other) {
        if (this.getAge() < other.getAge()) {
            return -1;
        } else if (this.getAge() > other.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString() {
        return "(" + "name=" + this.getName() + ", " + "age=" + this.getAge() + ")";
    }
    
}
