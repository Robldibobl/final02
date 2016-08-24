package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Instructor extends Person {
    private String chair;
    private int exercises;

    public Instructor(String firstname, String surname, String chair) {
        super(firstname, surname);
        this.chair = chair;
    }

    public Instructor() {
    }

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

    public String getChair() {
        return chair;
    }

    public int getExercises() {
        return exercises;
    }

    @Override
    public String toString() {
        return chair + " " + getFirstname() + " " + getSurname() + " " + exercises;
    }
}
