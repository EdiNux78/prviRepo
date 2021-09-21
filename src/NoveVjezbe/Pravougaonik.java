package NoveVjezbe;

public class Pravougaonik extends Shape {

    double a, b;


    public Pravougaonik(int x, int y, String boja, String naziv, double a, double b ) {
        super(x, y, boja, naziv);
        this.a = a;
        this.b = b;
    }
    public void dajPovrsinu () {
        super.dajPovrsinu();
        System.out.println ("pravougaonik p= " + (a*b));

    }
}
