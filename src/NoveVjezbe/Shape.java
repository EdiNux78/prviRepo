package NoveVjezbe;

import java.sql.SQLOutput;

public class Shape {
    int x, y;
    String boja, naziv;

    public Shape ( int x, int y, String boja, String naziv)  {
        this.x = x;
        this.y = y;
        this.boja = boja;
        this.naziv = naziv;
    }

    public void dajPovrsinu () {
        System.out.println("Povrsina iznosi : ");
    }


}
