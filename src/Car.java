public class Car {
    String make;
    String model;
    int numOfDoors;
    static  int wheels = 4;

    public static void  HowManyWheels (){
        System.out.println(wheels);

    }

    public void  printDetails (){

        System.out.println(" Car make: " + make);
        System.out.println(" Car model: " + model);
        System.out.println(" Number of doors: " + numOfDoors);

    }
    public  Car () {

        model = "I5";
        make = "BMW";
        numOfDoors = 5;

    }
}
