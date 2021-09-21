package RpgHero;

public abstract class BaseHero {
    public  double health, mana;
    public  boolean death;
    public void areaOfEfectHit () {
        receiveHit();
    }

    public abstract void receiveHit() ;
    public abstract void primaryFire() ;
    public abstract void secondaryFire() ;

}
