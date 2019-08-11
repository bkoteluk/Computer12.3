package pl.homework.lib;

import pl.homework.ex.LowDiscCapasityException;

public class Disc extends Part {
    private int capasity;

    public Disc(String model, String producer, String sn, int capasity) {
        super(model, producer, sn);
        setCapasity(capasity);
    }

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        if(capasity<=0) {
            throw new LowDiscCapasityException();
        } else {
            this.capasity = capasity;
        }
    }

    @Override
    public String toString() {
        return ">>> dysk twardy: " + capasity + "GB; " + super.toString() + "\n";
    }
}
