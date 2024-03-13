public class FuelCalculator {
    public static double usedFuel(double distanceInMeters, double fuelConsumption, double increasedFuelConsumption){
        double distanceInKilometers = distanceInMeters / 1000;
        double usedFuel;
        usedFuel = distanceInKilometers * fuelConsumption / 100;
        usedFuel = usedFuel + usedFuel * increasedFuelConsumption;
        return usedFuel;
    }
}
