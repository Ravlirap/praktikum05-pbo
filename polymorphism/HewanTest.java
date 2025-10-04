public class HewanTest {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing(2);
        kucing1.berkomunikasi();
        Kambing kambing1 = new Kambing(3);
        kambing1.berkomunikasi();
        Sapi sapi1 = new Sapi(5);
        sapi1.berkomunikasi();

        Hewan hewan1 = new Hewan("Azhar", 8);
        hewan1.berkomunikasi();
        Hewan hewan2 = new Hewan("Karin", 6);
        hewan2.berkomunikasi();
    }
}
