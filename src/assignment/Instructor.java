package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Instructor extends Person {
    private String chair;
    private List<Instructor> instructors;
    private int exercises;

    public Instructor(String firstname, String surname, String chair) {
        super(firstname, surname);
        this.chair = chair;
    }

    public Instructor() {
    }

    public String addInstr(String[] param) throws InputException {
        Check.checkString(param[1]);
        Check.checkString(param[2]);
        Check.checkString(param[3]);

        instructors.add(new Instructor(param[1], param[2], param[3]));

        return "OK";
    }

    public String listInstr() {
        String output = "";

        /////////// Reihenfolge! nach Vorname -> Nachname -> Lehrstuhl

        for (int i = 0; i < instructors.size(); i++) {
            output += instructors.get(i).getChair() + " " + instructors.get(i).getFirstname() + " "
                    + instructors.get(i).getSurname() + " " + instructors.get(i).getExercises() + "\n";
        }

        output = output.trim();
        return output;
    }

    public String summInstr(String[] param) {
        String output = "";

        for (Instructor val : instructors) {
            if (val.getFirstname().equals(param[1]) && val.getSurname().equals(param[2]) && val.getChair()
                    .equals(param[3])) {
                output += id + " " + name + " " + examinationMarkings + " " + val.getModule().getId() + " " + val.getModule().getName() + "\n";
            }
        }

        output = output.trim();
        return output;
    }

    public String getChair() {
        return chair;
    }

    public int getExercises() {
        return exercises;
    }
}
