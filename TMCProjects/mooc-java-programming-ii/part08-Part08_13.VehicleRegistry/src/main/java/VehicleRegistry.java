import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> regis;

    public VehicleRegistry() {
        regis = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!this.regis.containsKey(licensePlate)) {
            this.regis.put(licensePlate, owner);
            return true;
        }

        return false;
    }

    public String get(LicensePlate licensePlate) {
        return regis.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.regis.containsKey(licensePlate)) {
            regis.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : regis.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String ow : regis.values()) {
            if (!owners.contains(ow)) {
                owners.add(ow);
            }
        }

        for (String o : owners) {
            System.out.println(o);
        }
    }
}
