
import java.util.*;

/**
 *
 */
public class Devoirs {

    /**
     * Default constructor
     */
    public Devoirs() {
    }

    /**
     *
     */
    private String nom;

    /**
     *
     */
    private String description;

    /**
     *
     */
    private Date deadline;

    /**
     *
     */
    private int points;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Devoirs{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", points=" + points +
                '}';
    }
}