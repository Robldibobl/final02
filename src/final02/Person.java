package final02;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public abstract class Person {
    private String firstname;
    private String surname;

    /**
     * Constructor of the abstract class final02.Person.
     *
     * @param firstname Firstname of a person
     * @param surname   Surname of a person
     */
    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    /**
     * Empty constructor of the class final02.Person.
     */
    public Person() {
    }
}
