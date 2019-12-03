public class CarTester{

    public static void main(String[] args){

        Car myCar = new Car("Subaru", "Crosstrek", 29.7, 13.0);


        System.out.println(myCar);


        myCar.drive(12.2);  //drive the car for 12.2 miles


        System.out.println("Drove 12.2 miles: " + myCar);


        myCar.addFuel(10.5); //add 10.5 gallons of fuel to carTankSize


        System.out.println("Added 10.5 gallons of fuel: " + myCar);

    }

}