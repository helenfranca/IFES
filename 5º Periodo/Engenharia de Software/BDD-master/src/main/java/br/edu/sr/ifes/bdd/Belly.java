package br.edu.sr.ifes.bdd;

/**
 * Created by paulo on 23/02/15.
 */
public class Belly {

    private int cukes;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public String getSound(int waitingTime) {
        if (cukes > 41 && waitingTime >= 1) {
            return "growl";
        } else {
            return "silent";
        }

    }

    public String getSound2(int waitingTime) {
        if (cukes > 41 && waitingTime >= 1) {
            return "rosnar";
        } else {
            return "silenciar";
        }

    }
}
