public class Main {
    public static void main(String[] args){
        BujurSangkar bs = new BujurSangkar(5, "Merah");
        bs.printInfo();

        Lingkaran l = new Lingkaran(7, "Biru");
        l.printInfo();

        Silinder s = new Silinder(10, 7, "Hijau");
        s.printInfo();
    }
}