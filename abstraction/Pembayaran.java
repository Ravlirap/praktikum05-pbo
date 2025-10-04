package abstraction;

public abstract class Pembayaran {
    protected double jumlah;

    public Pembayaran(double jumlah) {
        this.jumlah = jumlah;
    }

    // Abstract method
    public abstract void prosesPembayaran();
}

