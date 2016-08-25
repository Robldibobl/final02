package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Student extends Person {
    private List<Exercise> examCompetence;
    private int matriculationNumber;
    private int average;

    /**
     * Constructor of the class Student.
     *
     * @param firstname      Firstname of a student
     * @param surname        Surname of a student
     * @param matrikelNumber Matrikel
     */
    public Student(String firstname, String surname, int matrikelNumber) {
        super(firstname, surname);
        this.matriculationNumber = matrikelNumber;
    }

    private void calcAverage() {

    }

    /**
     * Getter for matriculationNumber.
     *
     * @return Returns matriculationNumber
     */
    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    @Override
    public String toString() {
        return matriculationNumber + " " + getFirstname() + " " + getSurname() + " " + average;
    }
}