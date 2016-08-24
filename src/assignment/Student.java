package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Student extends Person {
    private int matrikelNumber;

    private int average;

    public Student(String firstname, String surname, int matrikelNumber) {
        super(firstname, surname);
        this.matrikelNumber = matrikelNumber;
    }

    public Student() {
    }

    public int getMatrikelNumber() {
        return matrikelNumber;
    }

    public int getAverage() {
        return average;
    }
}