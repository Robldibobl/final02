package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Professor extends Person {
    private String chair;
    private List<Lecture> professorLectures;
    private double average; // default "none"

    public Professor(String firstname, String surname, String chair) {
        super(firstname, surname);
        this.chair = chair;
    }

    public String getChair() {
        return chair;
    }

    public double getAverage() {
        return average;
    }

    public boolean isSmaller(Professor otherProfessor) {
        if (this.getFirstname().compareTo(otherProfessor.getFirstname()) < 0) {
            return true;
        } else if (this.getFirstname().compareTo(otherProfessor.getFirstname()) == 0) {
            if (this.getSurname().compareTo(otherProfessor.getSurname()) < 0) {
                return true;
            } else if (this.getSurname().compareTo(otherProfessor.getSurname()) == 0) {
                if (this.getChair().compareTo(otherProfessor.getChair()) <0) {
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

    @Override
    public String toString() {
        return chair + " " + getFirstname() + " " + getSurname() + " " + average;
    }
}