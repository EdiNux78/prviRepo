public class Person {
    String name;
    String surname;
    /*int age;
    int height;
    int weight;*/
    public Person (String novoIme, String novoPrezime)
    /* Person p = new Person ("Rijad", "Muhic" zasto je ovo mogao da uradi, zato sto je iznad stavio
     public Person i on prima jedan i drugi parametar a oba su stringovi i postaviti ih na dole ispod this
     firstname i this lastname. Ovo ode this predstavlja ovu klasu sto znaci iz ove klase uzmi ove this
     i kad napises p.show ono bi napisala Rijad Muhic */
    {
        this.name=novoIme;
        this.surname=novoPrezime;
    }
    public void show(){

        System.out.println("Ime i prezime osobe je:"+ ""+name+ " "+ surname);
    }

}
