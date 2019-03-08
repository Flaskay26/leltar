package leltar;

/**
 *
 * @author Joe
 */
public class Eszkoz {
    private String nev;
    private String jellemzok;

    public Eszkoz(String nev, String jellemzok) {
        this.nev = nev;
        this.jellemzok = jellemzok;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getJellemzok() {
        return jellemzok;
    }

    public void setJellemzok(String jellemzok) {
        this.jellemzok = jellemzok;
    }
       
}
