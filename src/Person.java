/**
 * @author Robin Fritz
 * @version 1.0
 */
public abstract class Person {
    private String firstname;
    private String surname;

    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public Person() {
    }
}
