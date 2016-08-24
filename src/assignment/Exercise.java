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
}
