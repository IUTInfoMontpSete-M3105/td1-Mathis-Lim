
import java.util.*;

/**
 *
 */
public abstract class Utilisateurs {

    /**
     * Default constructor
     */
    public Utilisateurs() {
    }

    /**
     *
     */
    private String nom;

    /**
     *
     */
    private String prenom ;

    /**
     *
     */
    private String adressePostale;

    /**
     *
     */
    private String adresseMail;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    @Override
    public String toString() {
        return
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                ',';
    }
}