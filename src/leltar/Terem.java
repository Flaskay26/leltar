/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leltar;

/**
 *
 * @author t1
 */
public class Terem {
    private String terem;
    private String felhasznalas;

    public Terem(String terem, String felhasznalas) {
        this.terem = terem;
        this.felhasznalas = felhasznalas;
    }

    public String getTerem() {
        return terem;
    }

    public void setTerem(String terem) {
        this.terem = terem;
    }

    public String getFelhasznalas() {
        return felhasznalas;
    }

    public void setFelhasznalas(String felhasznalas) {
        this.felhasznalas = felhasznalas;
    }
    
}
