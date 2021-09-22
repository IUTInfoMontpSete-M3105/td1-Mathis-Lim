
import java.util.*;

/**
 *
 */
public class Participation {

    /**
     * Default constructor
     */
    public Participation() {
    }

    /**
     *
     */
    private int NTP;

    /**
     *
     */
    private String Certificat;

    public void setNTP(int NTP) {
        this.NTP = NTP;
    }

    public void setCertificat(String certificat) {
        Certificat = certificat;
    }

    @Override
    public String toString() {
        return "Participation{" +
                "NTP=" + NTP +
                ", Certificat='" + Certificat + '\'' +
                '}';
    }
}