package abstraction;

public class TransferBank extends Pembayaran {
    public TransferBank(double jumlah) {
        super(jumlah);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran Rp" + jumlah + " melalui Transfer Bank berhasil!");
    }
}