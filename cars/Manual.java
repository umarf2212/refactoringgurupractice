package cars;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * EN: Car manual is another product.
 * Note that it does not have the same ancestor as a Car. 
 * They are not related.
 */

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(
        CarType carType,
        int seats,
        Engine engine,
        Transmission transmission,
        TripComputer tripComputer,
        GPSNavigator gpsNavigator
    ) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";

        info += "Type of car: " + carType + "\n";
        info += "Number of Seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";

        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }

        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigation: N/A" + "\n";
        }

        return info;

    }
}
