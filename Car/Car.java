package Car;

public class Car {

    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity){
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;

    }

    public void addGas()

    public void addGas(double amount)

    public double getTotalMilesDriven() 

    public void drive(double distance) 

    public boolean canDrive (double distance) - returns true if the car has enough gas to travel the specified distance

    public double milesAvailable() - returns how many more miles the car could drive

    public double getGas() - returns the amount of gas left

}
