package pl.homework.lib;

import java.nio.file.Path;

public class Computer {
    Processor processor;
    Ram ram;
    Disc disc;

    public Computer(Part[] parts) {
        this((Processor)parts[0], (Ram)parts[1], (Disc)parts[2]);
    }

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
