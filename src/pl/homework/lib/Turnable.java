package pl.homework.lib;

import pl.homework.ex.HighFrequencyException;
import pl.homework.ex.LowFrequencyException;

public interface Turnable {
    void turnUpClocking(int frequency) throws HighFrequencyException;
    void turnDownClocking(int frequency) throws LowFrequencyException;

}
