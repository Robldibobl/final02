package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Professor extends Person {
    private String chair;
    private List<Lecture> professorLectures;
    private String outputAverage;
    private double average;

    /**
     * Constructor of the class Professor.
     *
     * @param firstname Firstname of a professor
     * @param surname   Surname of a professor
     * @param chair     Chair of the professor
     */
    public Professor(String firstname, String surname, String chair) {
        super(firstname, surname);
        this.chair = chair;
        average();
    }

    /**
     * Compares two professors and returns true, if the first one is smaller, else false.
     *
     * @param otherProfessor Another professor to compare the first one to
     * @return True or false
     */
    public boolean isSmaller(Professor otherProfessor) {
        if (this.getFirstname().compareTo(otherProfessor.getFirstname()) < 0) {
            return true;
        } else if (this.getFirstname().compareTo(otherProfessor.getFirstname()) == 0) {
            if (this.getSurname().compareTo(otherProfessor.getSurname()) < 0) {
                return true;
            } else if (this.getSurname().compareTo(otherProfessor.getSurname()) == 0) {
                if (this.getChair().compareTo(otherProfessor.getChair()) < 0) {
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

    private void average() {
        outputAverage = "none";

        if (average != 0) {
            outputAverage = "" + average;
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

    /**
     * Getter for professorLectures.
     *
     * @return Returns professorLectures
     */
    public List<Lecture> getProfessorLectures() {
        return professorLectures;
    }

    @Override
    public String toString() {
        return chair + " " + getFirstname() + " " + getSurname() + " " + outputAverage;
    }
}