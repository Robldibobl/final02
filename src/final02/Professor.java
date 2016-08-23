package final02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Professor extends Person {
    private String chair;
    private List<Professor> professors;
    private double average;

    public Professor(String firstname, String surname, String chair) {
        super(firstname, surname);
        this.chair = chair;
    }

    public Professor() {
        professors = new ArrayList<>();
    }

    public String addProf(String[] param) throws InputException {
        Check.checkString(param[1]);
        Check.checkString(param[2]);
        Check.checkString(param[3]);

        professors.add(new Professor(param[1], param[2], param[3]));

        return "OK";
    }

    public String listProf() {
        String output = "";

        /////////// Reihenfolge! nach Vorname -> Nachname -> Lehrstuhl

        for (int i = 0; i < professors.size(); i++) {
            output += professors.get(i).getChair() + " " + professors.get(i).getFirstname() + " "
                    + professors.get(i).getSurname() + " " + professors.get(i).getAverage() + "\n";
        }

        output = output.trim();
        return output;
    }

    public String summProf(String[] param) {
        String output = "";

        for (Professor val : professors) {
            if (val.getFirstname().equals(param[1]) && val.getSurname().equals(param[2]) && val.getChair()
                    .equals(param[3])) {
                output += id + " " + name + " " + val.getModule.getAverage() + "\n";
            }
        }

        output = output.trim();
        return output;
    }

    public String getChair() {
        return chair;
    }

    public double getAverage() {
        return average;
    }
}
