package abstraction;

public class PembayaranTest{
    public static void main(String[] args) {
        Pembayaran p1 = new TransferBank(500000);
        Pembayaran p2 = new DompetDigital(200000);

        p1.prosesPembayaran();
        p2.prosesPembayaran();

        Diskon d = new DiskonMember();
        System.out.println("Diskon: Rp" + d.hitungDiskon(100000));
    }
}