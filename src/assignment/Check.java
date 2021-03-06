package assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public class Check {

    /**
     * Checks if input is an integer.
     *
     * @param input Input
     * @throws InputException For input format type errors
     */
    public static void checkInteger(String input) throws InputException {
        if (!input.matches("\\d*")) {
            throw new InputException("please choose a positive number!");
        }
    }

    /**
     * Checks if a string contains only letters.
     *
     * @param input Input
     * @return Returns true, if string is valid
     * @throws InputException For input format type errors
     */
    public static boolean checkString(String input) throws InputException {
        String temp;
        temp = input.replaceAll("\\d+.*", "");

        Pattern p = Pattern.compile("[A-Z0-9]");
        Matcher m = p.matcher("" + input.charAt(input.length() - 1));
        boolean b = m.find();

        if (input.equals("")) {
            throw new InputException("strings can not be empty!");
        }

        if (temp.equals(input)) {
            if (!input.contains("S")) {
                temp = temp.replaceAll("\\W", "");

                if (!temp.equals(input)) {
                    throw new InputException("game mode names only contain letters!");
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else if (!b) {
            throw new InputException("wrong input format!");
        }

        return true;
    }

    /**
     * Checks length of parameter array.
     *
     * @param param Input
     * @param n     Number of required parameters
     * @throws InputException For input format type errors
     */
    public static void checkAmount(String[] param, int n) throws InputException {
        if (param == null) {
            throw new InputException("wrong input format!");
        }
        if (param.length != n) {
            throw new InputException("wrong input format!");
        }
    }
}
