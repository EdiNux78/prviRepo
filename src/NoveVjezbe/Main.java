package NoveVjezbe;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        /*Person osoba1 = new Person ();
        osoba1.name = "Test";
        osoba1.surname = "LastTest";
        osoba1.age = 20;
        osoba1.height =  170;
        osoba1.weight =  75;*/
        Pravougaonik pravougaonik = new Pravougaonik(1, 2, "plava", "pr1", 2, 3);
        pravougaonik.dajPovrsinu();

        Krug krug = new Krug(2, 3, "crvena", "krug1", 5);
        krug.dajPovrsinu();

        Kvadrat kvadrat = new Kvadrat(3, 4, "zuta", "kvadrat", 5);
        kvadrat.dajPovrsinu();
    }
}
