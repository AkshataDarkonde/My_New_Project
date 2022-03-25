import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortKey {
    static void Map1() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("10", "Akii");
        map.put("5", "Harshada");
        map.put("2", "Prasad");
        map.put("20", "Dark");
        map.put("15", "Akshu");

        Map<String, String> sorted = new TreeMap<>(map);
        System.out.println("Sorted Map :");
        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map1();
    }
}

