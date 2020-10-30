import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (facility.containsKey(unit)) {
            facility.get(unit).add(item);
        } else {
            ArrayList<String> arr = new ArrayList<>();
            arr.add(item);
            facility.put(unit, arr);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (facility.containsKey(storageUnit)) {
            return facility.get(storageUnit);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String storageUnit, String item) {
        if (facility.containsKey(storageUnit)) {
            facility.get(storageUnit).remove(item);

            if (facility.get(storageUnit).isEmpty()) {
                facility.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> arr = new ArrayList<>();
        for (String str : facility.keySet()) {
            arr.add(str);
        }

        return arr;
    }
}
