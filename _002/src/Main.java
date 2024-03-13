import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Main {

    private static Map<String,Road> roadTypes = Map.of(
            "s",new Stoned(),
            "a", new Asphalt(),
            "m", new Mountain()
    );

    public static void main(String[] args) throws IOException {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        double distanceInMeters = Double.parseDouble(readFromConsole());
        System.out.println("Dystans do przejachania: " + distanceInMeters);

        Road road = roadTypes.get(readFromConsole().toLowerCase());
        Vehicle[] vehicles = {car, bicycle};
        for(Vehicle vehicle : vehicles){
            vehicle.run();
            System.out.println("moje zużycie paliwa to: " + vehicle.getFuelConsumption());
            double usedFuel = FuelCalculator.usedFuel(distanceInMeters, vehicle.getFuelConsumption(), road.getIncreasedFuelConsumption());
            System.out.println(usedFuel);
        }
    }

    private static String readFromConsole() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}