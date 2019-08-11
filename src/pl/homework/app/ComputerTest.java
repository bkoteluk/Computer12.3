package pl.homework.app;

import pl.homework.ex.*;
import pl.homework.lib.*;

import java.util.InputMismatchException;

public class ComputerTest {

    public static Part[] assemble() throws TemperatureExcededException, LowFrequencyException, LowAmountMemoryException {
        Part[] parts = new Part[3];
        parts[0] = new Processor("Xenon", "Intel", "333445500", 40, 30);
        parts[1] = new Ram("SDRAM", "GOODRAM", "123456789", 35,15, 4048);
        parts[2] = new Disc("SSD", "Samsung", "000001234", 240);
        return parts;
    }

    public static void main(String[] args) {
        try {
            Computer computer = new Computer(assemble());
            System.out.println(computer);
            ((Processor) computer.getParts()[0]).turnUpClocking(150);
            ((Ram) computer.getParts()[1]).turnDownClocking(10);
            System.out.println(computer);
        } catch ( HighFrequencyException | LowFrequencyException | TemperatureExcededException | LowDiscCapasityException | LowAmountMemoryException ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
