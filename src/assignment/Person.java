package assignment;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public abstract class Person {
    private String firstname;
    private String surname;

    /**
     * Constructor of the abstract class assignment.Person.
     *
     * @param firstname Firstname of a person
     * @param surname   Surname of a person
     */
    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    /**
     * Empty constructor of the class assignment.Person.
     */
    public Person() {
    }

    /**
     * Getter for firstname.
     *
     * @return Returns firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Getter for surname.
     *
     * @return Returns surname
     */
    public String getSurname() {
        return surname;
    }
}
