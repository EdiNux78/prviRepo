package NoveVjezbe;

public class Krug extends Shape {

    int r;
    final static double Pi = 3.14;


    public Krug(int x, int y, String boja, String naziv, int r) {
        super(x, y, boja, naziv);
        this.r = r;
    }

    @Override
    public void dajPovrsinu() {
        super.dajPovrsinu();
        System.out.println(" krug p = " + (r*r*Pi));
}

}
