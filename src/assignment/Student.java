package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Student extends Person {
    private int matrikelNumber;
    private List<Student> students;
    private int average;

    public Student(String firstname, String surname, int matrikelNumber) {
        super(firstname, surname);
        this.matrikelNumber = matrikelNumber;
    }

    public Student() {
    }

    public String addStud(String[] param) throws InputException {
        Check.checkString(param[1]);
        Check.checkString(param[2]);
        Check.checkInteger(param[3]);

        students.add(new Student(param[1], param[2], Integer.parseInt(param[3])));

        return "OK";
    }

    public String listStud() {
        String output = "";

        /////////// Reihenfolge! nach Matrikelnummer

        for (int i = 0; i < students.size(); i++) {
            output += students.get(i).getMatrikelNumber() + " " + students.get(i).getFirstname() + " "
                    + students.get(i).getSurname() + " " + students.get(i).getAverage() + "\n";
        }

        output = output.trim();
        return output;
    }

    public String summStud(String[] param) {




        return "";
    }

    public int getMatrikelNumber() {
        return matrikelNumber;
    }

    public int getAverage() {
        return average;
    }
}
