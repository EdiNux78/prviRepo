package NoveVjezbe;

public class Kvadrat extends Shape {

    double a;


    public Kvadrat(int x, int y, String boja, String naziv, double a) {
        super(x, y, boja, naziv);
        this.a = a;

    }

    @Override
    public void dajPovrsinu() {
        super.dajPovrsinu();
        System.out.println("kavdrat p = " + (a*a));
    }
}
