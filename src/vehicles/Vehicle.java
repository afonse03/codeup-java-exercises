package vehicles;//mini exercise on 9/14
/*
mini exercises:

Create a vehicles.Vehicle class with two properties: a name instance variable and a makeNoise() method. The instance variable should be private and have getters and setters (in IntelliJ try cmd-N). The makeNoise method should just sout out a typical vehicle noise. Then create a more specific vehicle subclass, such as Motorcycle, Car, Truck, Tractor, whatever. Make the specific vehicle class extend the vehicles.Vehicle class. Otherwise, keep it empty. Create a test class, perhaps calling it VehicleTest Instantiate the specific vehicle, assign a value to the name property and run the methods on the specific vehicle. Notice the inherited method works and the inherited name property is assignable on the subclass.

Create a method in the subclass of the vehicle class that overrides the superclass makeNoise method

Create a breakingDownNoise() method in the subclass. It should call super.makeNoise() and then add a second sout that adds a second noise after the first one

Create a Car class if you have not already done so. It should be a subclass of vehicles.Vehicle. Create a Garage class with two properties. It should have a vehicles.Vehicle array called vehicles, and an alarmCascade() method that simulates all the vehicles in the array having their alarms go off in sequence. Create a GarageTest class. Create at least three cars and set their names. Put them in an array of vehicles. Instantiate a garage, assign your array to the garage's vehicles property and run the alarmCascade method. Now replace one of the cars with another type of vehicle. Run the alarmCascade method again and note that the vehicles array is polymorphic and can contain different types of vehicles.

Bonus: create a findVehicle method. the findVehicle method should be part of the Garage class. It takes a string and an array of Vehicles. It returns the vehicle that the customer is looking for (the vehicle the name of which matches the string). If the vehicle is not in the garage, it returns a vehicles.Vehicle with a null name.

warmup on 9/16/21:
Create a new kind of vehicle that extends vehicle. Define the class as final. Create a makeNoise method that overrides the superclass method. Test it in your VehicleTest class. Now alter it so your subclass makeNoise method calls the superclass makeNoise method in addition to its own noise. Add one of your new kinds of vehicles to the array of vehicles in your Garage or Marina or Hangar and trigger the alarmCascade method to verify that your new car can exist in a polymorphic array. Add a subclass constructor that takes a String argument and make sure you have no errors.

continued from 9/16/21:
Challenge.
In the birds package, create an Ornithologist class. The ornithologist should have a changeBirdName method that takes a String newBirdName and a Bird birdToRename as its parameters. It should allow the ornithologist to change the bird's name and announce that it has changed the name from the old name to the new name. Create an OrnithologyConference class. Instantiate an ornithologist and a new bird and have the ornithologist announce the name change on the new bird.

continued from 9/16/21:
Challenge.
Modify the Birds class so as to keep count of how many birds are created and output the bird count every time a new bird is created. DRY out the code.
 */

public class Vehicle {
    private String vehicle;

    public Vehicle() {

    }

    public String getName() {
        return vehicle;
    }

    public void setName(String vehicle) {
        this.vehicle = vehicle;
    }

    public String makeNoise() {
        return "beep beep";
    }
}