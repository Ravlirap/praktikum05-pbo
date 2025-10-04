public class Kucing extends Hewan {

    public Kucing (int usia){
        super(usia);
    }
    public void berkomunikasi(){
        System.out.println("Kucing berusia "+super.usia +" tahun"+" Miiiuww");
    }
}