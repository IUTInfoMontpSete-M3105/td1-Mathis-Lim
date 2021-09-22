
import java.util.*;

/**
 *
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours() {
    }

    /**
     *
     */
    private String nom;

    /**
     *
     */
    private int semestre;



    /**
     *
     */
    private Enseignants CDC;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setCDC(Enseignants CDC) {
        this.CDC = CDC;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "nom='" + nom + '\'' +
                ", semestre=" + semestre +
                CDC.toString() +
                '}';
    }
}