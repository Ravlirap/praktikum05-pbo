package abstraction;

public class DompetDigital extends Pembayaran {
    public DompetDigital(double jumlah) {
        super(jumlah);
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran Rp" + jumlah + " melalui Dompet Digital berhasil!");
    }
}

