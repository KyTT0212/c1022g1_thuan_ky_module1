package CaseStudy.Model.Repository.Facility;

import CaseStudy.Model.model.Facility.Falicity;
import CaseStudy.Model.model.Facility.Room;
import CaseStudy.Model.model.Facility.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepo implements IFacilityRepo {
    public static Map<Falicity, Integer> furuma = new LinkedHashMap<>();
    public static Map<Falicity, Integer> furumaMaintenance = new LinkedHashMap<>();

    static {
        furuma.put(new Room("SVRO_GOLD_001", "30m2", "22tr", 3, "month", "free wifi,don phong"), 1);
        furuma.put(new Room("SVRO_VIP_001", "45m2", "30tr", 5, "month", "free wifi,free water,don phong"), 2);
        furuma.put(new Villa("SVVL_VIPP_001", "700M2", "8tr", 40, "day", "view sea,bar,golf course", "35m2", 5), 10);

        furumaMaintenance.put(new Room("SVRO_VIP_004", "45m2", "30tr", 5, "month", "free wifi,free water,don phong"), 10);
        furumaMaintenance.put(new Villa("SVVL_MENBER_001", "100M2", "3.8tr", 15, "day", "view sea,bar,golf course", "20m2", 7), 7);
        furumaMaintenance.put(new Villa("SVVL_SILVER_001", "700M2", "8tr", 40, "day", "view sea,bar,golf course", "25m2", 5), 8);
    }

    @Override
    public void displayList() {
        for (Map.Entry<Falicity, Integer> dispalyList1 : furuma.entrySet()) {
            System.out.println(dispalyList1);
        }
        for (Map.Entry<Falicity, Integer> displayList2 : furumaMaintenance.entrySet()) {
            System.out.println(displayList2);
        }
    }

    @Override
    public void add(Falicity falicity1, int number) {
        if (number < 5) {
            furuma.put(falicity1, number);
        } else {
            furumaMaintenance.put(falicity1, number);
        }
    }

    @Override
    public void displayListMaintenance() {
        for (Map.Entry<Falicity, Integer> room : furuma.entrySet()) {
            if (room.getValue() >= 5)
                System.out.println(room);
        }
        for (Map.Entry<Falicity, Integer> villa : furumaMaintenance.entrySet()) {
            if (villa.getValue() >= 5)
                System.out.println(villa);
        }

    }
}
