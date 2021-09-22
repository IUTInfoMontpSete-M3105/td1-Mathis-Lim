
import java.io.File;
import java.util.*;

/**
 *
 */
public class Rendus {

    /**
     * Default constructor
     */
    public Rendus() {
    }

    /**
     *
     */
    private Date date;

    /**
     *
     */
    private File doc;

    /**
     *
     */

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDoc(File doc) {
        this.doc = doc;
    }

    @Override
    public String toString() {
        return "Rendus{" +
                "date=" + date +
                ", doc=" + doc +
                '}';
    }
}