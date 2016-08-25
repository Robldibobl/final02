package assignment;

/**
 * @author Robin Fritz
 * @version 1.0
 */
public abstract class Studies {
    private static int idCount = 0;

    /**
     * Constructor of the class Studies.
     */
    public Studies() {
    }

    /**
     * Getter for idCount.
     *
     * @return Returns idCount
     */
    public static int getIdCount() {
        return ++idCount;
    }
}
