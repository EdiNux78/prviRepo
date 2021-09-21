package RpgHero;

public class Main {
    public static void main(String[] args) {
       DwarfWorrior DW = new DwarfWorrior();
        DW.death = false;
        DW.health = 25;
        DW.mana = 25;
        DW.show();
        DW.receiveHit();
        DW.show();
        DW.primaryFire();
        DW.show();
        DW.secondaryFire();
        DW.show();
        DW.receiveHit();
        DW.show();
        DW.primaryFire();
        DW.show();
        DW.secondaryFire();
        DW.show();
        DW.receiveHit();
        DW.show();
        ElfMage EM = new ElfMage();
        EM.death = false;
        EM.health = 75;
        EM.mana = 75;
        EM.show();
        EM.receiveHit();
        EM.show();
        EM.primaryFire();
        EM.show();
        EM.secondaryFire();
        EM.show();
        EM.receiveHit();
        EM.show();
        EM.primaryFire();
        EM.show();
        EM.secondaryFire();
        EM.show();
        EM.receiveHit();
        EM.show();
    }
}
