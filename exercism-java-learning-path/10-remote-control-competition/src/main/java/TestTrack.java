import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    // Devuelve una lista nueva ordenada, sin modificar la original.
    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        List<ProductionRemoteControlCar> ranked = new ArrayList<>(cars);
        Collections.sort(ranked);
        return ranked;
    }
}
