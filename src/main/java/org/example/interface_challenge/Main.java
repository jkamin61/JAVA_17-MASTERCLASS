package org.example.interface_challenge;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("Warsaw Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Polish Parliament House", UsageType.GOVERNMENT));
        mappables.add(new Building("Polish National Stadium", UsageType.SPORTS));

        for (var building : mappables) {
            Mappable.map(building);
        }

        List<UtilityLine> utilityLines = new ArrayList<>();

        utilityLines.add(new UtilityLine("College St", UtilityType.FIBER_OPTIC));
        utilityLines.add(new UtilityLine("Olympic Blvd", UtilityType.WATER));

        for (var utilityLine : utilityLines) {
            Mappable.map(utilityLine);
        }
    }
}
