package assignment;

import java.util.List;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Exercise {
    private String name;
    private int lectureId;
    private String firstnameInstr;
    private String surnameInstr;
    private String chairInstr;
    private List<Exercise> exercises;

    public Exercise(String name, int lectureId, String firstnameInstr, String surnameInstr, String chairInstr) {
        this.name = name;
        this.lectureId = lectureId;
        this.firstnameInstr = firstnameInstr;
        this.surnameInstr = surnameInstr;
        this.chairInstr = chairInstr;
    }

    public Exercise() {
    }

    public String addExercise(String[] param) throws InputException {
        Check.checkString(param[1]);
        Check.checkInteger(param[2]);
        Check.checkString(param[3]);
        Check.checkString(param[4]);
        Check.checkInteger(param[5]);

        exercises.add(new Exercise(param[1], Integer.parseInt(param[2]), param[3], param[4], param[5]));

        return "OK";
    }

    public String listExercise() {
        String output = "";


        return output;
    }

    public String summExercise(String[] param) {
        String output = "";



        return output;
    }
}
