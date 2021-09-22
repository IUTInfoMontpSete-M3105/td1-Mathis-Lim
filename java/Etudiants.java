
import java.util.*;

/**
 *
 */
public class Etudiants extends Utilisateurs {

    /**
     * Default constructor
     */
    public Etudiants() {
    }

    /**
     *
     */
    private String ine;

    public void setIne(String ine) {
        this.ine = ine;
    }

    @Override
    public String toString() {
        return "Etudiants{" + super.toString() +
                "ine='" + ine + '\'' +
                '}';
    }
}