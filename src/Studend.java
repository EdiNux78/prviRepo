public class Studend extends Person {

    int brojIndexa;

    public Studend (String studentIme, String studentPrezime, int studentIndex) {
        super(studentIme, studentPrezime); // poziva konstruktor sa super iz persona//
        this.brojIndexa = studentIndex;
// ako se doda rijec final npr public final class onda se zabranjuje nasljedjivanje
    }

    public void show() {
        System.out.println("Ime i prezime studenta je: " + name + " " + surname + " i broj indexa je:" + brojIndexa);
    }
}
