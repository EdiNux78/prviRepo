public class Profesor extends Person{
// kad se napise extdends bude crveno dodjes do toga misem i izbaci ti kreate konstruktor meching super ili pritisnes alt i enter
    String classRoom;
    public Profesor (String novoIme, String novoPrezime, String classRoom) {
        super(novoIme, novoPrezime);
        this.classRoom = classRoom;
    }

    @Override
    public void show() {
        System.out.println("Profesor je " + name + " " + surname + " i profesor je u: " + classRoom );
        //super.show();
    }
}
