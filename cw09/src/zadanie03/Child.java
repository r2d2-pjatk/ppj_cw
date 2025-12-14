package zadanie03;

public class Child {
    
    private String name;
    private int numCandies = 2;
    
    public Child(String name, int numCandies) {
        this.name = name;
        this.numCandies = numCandies;
    }
    
    public Child(String name) {
        this.name = name;
    }
    
    public static Child getChildByName(Child[] children, String name) {
        for (Child child : children) {
            if (child.name.equals(name))
                return child;
        }
        return null;
    }
    
    public static void printChildren(Child[] children) {
        System.out.print("[ ");
        for (Child child : children) {
            System.out.print("(" + child.name + ", " + child.numCandies + " candies) ");
        }
        System.out.println("]");
    }
    
    public void givesCandyTo(Child other) {
        if (this.numCandies >= 1) {
            this.numCandies--;
            other.numCandies++;
        } else {
            System.out.println("No candies to give!");
        }
    }
    
}
