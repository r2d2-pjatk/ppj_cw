package zadanie8;

public class Main {
    static void main() {
        /*
        Zdefiniuj zmienną logiczną isFemale.
        Stwórz następnie zmienną typu final String i zainicjuj ją napisem "Woman" lub "Man"
        w zależności od wartosci zmiennej isFemale.
        Zdefiniuj dodatkowo zmienną isYoung.
        Zadeklaruj zmienną typu final String i zainicjuj ją napisem "Woman", "Man", "Boy" lub "Girl"
        w zależności od wartości zmiennych isFemale i isYoung.
        */
        boolean isFemale = false;
        final String gender = isFemale ? "Woman": "Man";
        boolean isYoung = true;
        final String genderAgewise = isYoung ? (isFemale ? "Girl": "Boy"): (isFemale ? "Woman": "Man");
        
        System.out.println("Gender: " + gender);
        System.out.println("Gender age-wise: " + genderAgewise);
    }
}
