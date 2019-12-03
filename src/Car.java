public class Car{

  /*

  The attributes of a car (instance variables)

  */

    private String make;

    private String model;

    private double mpg;     //miles per gallon

    private double tankSize;   //in gallons

    private double amtFuel;    //in gallons



/*

Constructor for the Car. Initializes the instance variables for the Car.

*/


    public Car(String carMake, String carModel, double carMpg, double carTanksize){

        make = carMake;

        model = carModel;

        mpg = carMpg;

        tankSize = carTanksize;

        amtFuel = tankSize;

    }


/*

Methods for a Car

*/

    public String toString(){

        String result = "";

        result += "Make: " + make + ", Model: " + model + "\n";

        result+= "MPG: " + mpg + "Tank Size: " + tankSize + "\n";

        result+= " Current Amount of Fuel: " + amtFuel;

        return result;

    }


    public String getMake(){

        return make;

    }


    public String getModel(){

        return model;

    }


    public double getMpg(){

        return mpg;

    }

    public double gettankSize(){

        return tankSize;

    }


    public double getamtFuel(){

        return amtFuel;

    }

    public void setamtFuel(double newFuel){

        amtFuel = newFuel;

    }

    public void drive(double miles){

        miles = amtFuel * mpg;

        System.out.println("You have driven this far: " + miles + " miles");

        amtFuel = amtFuel - (miles/mpg);

        System.out.println("You have this amount of fuel left: " + amtFuel + " gallons");

    }

    public String addFuel(double fuel){

        String result = "";

        amtFuel += fuel;

        if( amtFuel > tankSize){

            amtFuel = tankSize;

            result+= "You added too much fuel";

        }

        result += "You now have " + amtFuel + " gallons in the tank";

        return result;

    }

}