package library.library;

public class Person {

    private final int age;

    public Person(final int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
