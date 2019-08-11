package pl.homework.lib;

public class Computer {
    Part[] parts = new Part[3];

    public Computer(Part[] parts) {
        this.parts = parts;
    }

    public Part[] getParts() {
        return parts;
    }

    public void setParts(Part[] parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        String result = ">>> Komputer <<< \n";
        for (Part unit: parts) {
            result += unit;
        }
        return result;
    }
}
