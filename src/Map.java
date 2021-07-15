import java.security.Key;
import java.util.*;

public class Map<K, V> {

    java.util.Map<K, V> map = new HashMap<>();

    public void addMyEntry(MyEntry<K, V> KV) {
        map.put(KV.getKey(), KV.getValue());

    }

    public void deleteMyEntry(K key) {
        map.remove(key);
    }

    public void deleteMyEntryByV(V value) {
        for (Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator(); it.hasNext(); ) {
            java.util.Map.Entry mapEntry = it.next();
            if (mapEntry.getValue().equals(value)) {
                it.remove();
            }
        }
    }

    public void setKeys() {
        System.out.println(map.keySet());
    }

    public void listValues() {
        System.out.println(map.values());
    }

    public void showMap() {
        System.out.println(map);
    }


    @Override
    public String toString() {
        return "Map{" +
                "list=" + map +
                '}';
    }
}
