package assignment;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Instructor extends Person {
    private String chair;
    private int exerciseCount;

    /**
     * Constructor of the class Instructor.
     *
     * @param firstname Firstname of a instructor
     * @param surname   Surname of a instructor
     * @param chair     Chair of a instructor
     */
    public Instructor(String firstname, String surname, String chair) {
        super(firstname, surname);
        this.chair = chair;
    }

    /**
     * Compares two instructors and returns true, if the first one is smaller, else false.
     *
     * @param otherInstructor Another instructor to compare the first one to
     * @return True or false
     */
    public boolean isSmaller(Instructor otherInstructor) {
        if (this.getFirstname().compareTo(otherInstructor.getFirstname()) < 0) {
            return true;
        } else if (this.getFirstname().compareTo(otherInstructor.getFirstname()) == 0) {
            if (this.getSurname().compareTo(otherInstructor.getSurname()) < 0) {
                return true;
            } else if (this.getSurname().compareTo(otherInstructor.getSurname()) == 0) {
                if (this.getChair().compareTo(otherInstructor.getChair()) < 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Getter for chair.
     *
     * @return Returns chair
     */
    public String getChair() {
        return chair;
    }

    @Override
    public String toString() {
        return chair + " " + getFirstname() + " " + getSurname() + " " + exerciseCount;
    }
}
