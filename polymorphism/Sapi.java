public class Sapi extends Hewan {

    public Sapi(int usia) {
        super(usia);
    }

    public void berkomunikasi() {
        System.out.println("Sapi berusia " + super.usia + " tahun" + " Moo");
    }
    
}
