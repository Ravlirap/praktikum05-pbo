package abstraction;

public class DiskonMember implements Diskon {
    @Override
    public double hitungDiskon(double total) {
        return total * 0.1; // diskon 10%
    }
}