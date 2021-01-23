package Demo;

import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>();

        map.put(1, "a");
        map.put(3, "c");
        map.put(2, "b");
        map.put(5, "b");
        map.put(4, "b");

        for (Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }

        map.remove(1);
    }
}
// Tree sap xep phan tu the thu tu tu nhien;

// HashMap ko theo thu tu;