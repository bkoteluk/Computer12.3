package pl.homework.app;

import pl.homework.ex.HighFrequencyException;
import pl.homework.ex.LowDiscCapasityException;
import pl.homework.ex.LowFrequencyException;
import pl.homework.ex.TemperatureExeededException;
import pl.homework.lib.*;

public class ComputerTest {

    public static Part[] assemble() throws TemperatureExeededException, LowFrequencyException {
        Part[] parts = new Part[3];
        parts[0] = new Processor("Xenon", "Intel", "333445500", 40, 40);
        parts[1] = new Ram("SDRAM", "GOODRAM", "123456789", 35,24, 4048);
        parts[2] = new Disc("SSD", "Samsung", "000001234", 240);
        return parts;
    }

    public static void main(String[] args) {
        try {
            Computer computer = new Computer(assemble());
            System.out.println(computer);
            ((Processor) computer.getParts()[0]).turnUpClocking(1150);
            ((Ram) computer.getParts()[1]).turnDownClocking(10);
            System.out.println(computer);
        } catch ( HighFrequencyException | LowFrequencyException | TemperatureExeededException | LowDiscCapasityException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
