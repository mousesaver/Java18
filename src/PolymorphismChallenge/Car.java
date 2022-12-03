package PolymorphismChallenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }
}
class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterSize;

    public ElectricCar(String description, double avgKmPerCharge, int batterSize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterSize = batterSize;
    }

    public ElectricCar(String description) {
        super(description);
    }
    @Override
    public void startEngine() {
        System.out.printf("BEV -> Switch %d kWh battery on, Ready!%n", batterSize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avgKmPerCharge);
    }

}

class HybridCar extends Car {
    private double avgKmPerLiter;
    private int batterSize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter, int batterSize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterSize = batterSize;
        this.cylinders = cylinders;
    }

    public HybridCar(String description) {
        super(description);
    }
    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders);
        System.out.printf("Hybrid -> Switch %d kWh battery on, Ready!%n", batterSize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below the average: %.2f %n", avgKmPerLiter);
    }

}
