package pl.homework.app;

import pl.homework.ex.*;
import pl.homework.lib.*;

public class ComputerTest {

     public static void main(String[] args) {
        try {
            Processor processor = new Processor("Xenon", "Intel", "333445500", 40, 30);
            Ram ram = new Ram("SDRAM", "GOODRAM", "123456789", 35,15, 4048);
            Disc disc = new Disc("SSD", "Samsung", "000001234", 240);

            Computer computer = new Computer(processor, ram, disc);
            System.out.println(computer);
            computer.getProcessor().turnUpClocking(150);
            computer.getRam().turnDownClocking(10);
            System.out.println(computer);
        } catch ( HighFrequencyException | LowFrequencyException | TemperatureExcededException | LowDiscCapasityException | LowAmountMemoryException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
