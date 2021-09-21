package NoveVjezbe;

public class Rekurzija {
    public Rekurzija(){

    }
    public static int rekurzivnaFunkcija(int brojPonavljanja){
        if(brojPonavljanja<=0)return 0;
        return 2 + rekurzivnaFunkcija(brojPonavljanja-1);
    }
}
