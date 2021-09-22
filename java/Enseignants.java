
import java.util.*;

/**
 *
 */
public class Enseignants extends Utilisateurs {

    /**
     * Default constructor
     */
    public Enseignants() {
    }

    /**
     *
     */
    private int numem;

    /**
     *
     */
    private int harpege;

    public void setNumem(int numem) {
        this.numem = numem;
    }

    public void setHarpege(int harpege) {
        this.harpege = harpege;
    }

    @Override
    public String toString() {
        return "Enseignants{" + super.toString() +
                "numem=" + numem +
                ", harpege=" + harpege +
                '}';
    }
}