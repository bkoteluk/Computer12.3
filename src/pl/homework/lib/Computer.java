package pl.homework.lib;

import java.nio.file.Path;

public class Computer {
    private Processor processor;
    private Ram ram;
    private Disc disc;

    public Computer(Processor processor, Ram ram, Disc disc) {
        this.processor = processor;
        this.ram = ram;
        this.disc = disc;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Disc getDisc() {
        return disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    @Override
    public String toString() {
        return ">>> Komputer \n" + processor + ram + disc;
    }
}
