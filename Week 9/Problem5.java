
import java.util.*;

interface SaverMode {
    default double saveEnergy(double units) {
        return units * 0.75;
    }
}

abstract class Appliance {
    abstract double power();

    double units(double hours) {
        return power() * hours / 1000;
    }

    double cost(double units) {
        return units * 8;
    }
}

class Fridge extends Appliance {
    double power() {
        return 150;
    }
}

class AC extends Appliance implements SaverMode {
    double power() {
        return 1500;
    }
}

class TV extends Appliance {
    double power() {
        return 100;
    }
}

class Washer extends Appliance implements SaverMode {
    double power() {
        return 500;
    }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().trim().split("\\s+");
            String type = input[0];
            double hours = Double.parseDouble(input[1]);
            boolean saver = input.length > 2 &&
                            input[2].equals("SAVER");

            Appliance appliance;

            switch (type) {
                case "FRIDGE":
                    appliance = new Fridge();
                    break;
                case "AC":
                    appliance = new AC();
                    break;
                case "TV":
                    appliance = new TV();
                    break;
                case "WASHER":
                    appliance = new Washer();
                    break;
                default:
                    continue;
            }

            if (saver && !(appliance instanceof SaverMode)) {
                System.out.println(type + ": saver mode not supported");
                continue;
            }

            double units = appliance.units(hours);

            if (saver) {
                units = ((SaverMode) appliance).saveEnergy(units);
            }

            double cost = appliance.cost(units);
            totalCost += cost;

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n",
                type, units, cost
            );
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
        sc.close();
    }
}
