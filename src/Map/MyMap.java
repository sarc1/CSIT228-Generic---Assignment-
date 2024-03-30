package Map;
import java.util.ArrayList;
public class MyMap<K, V> {
        private ArrayList<K> mgaKeys;
        private ArrayList<V> mgaValues;

        public MyMap() {
            mgaKeys = new ArrayList<>();
            mgaValues = new ArrayList<>();
        }

        public void put(K key, V value) {
            int index = mgaKeys.indexOf(key);
            if (index == -1) {
                mgaKeys.add(key);
                mgaValues.add(value);
            } else {
                mgaValues.set(index, value);
            }
        }

        public V get(K key) {
            int index = mgaKeys.indexOf(key);
            if (index == -1) {
                return null;
            } else {
                return mgaValues.get(index);
            }
        }

        public V remove(K key) {
            int index = mgaKeys.indexOf(key);
            if (index == -1) {
                return null;
            } else {
                mgaKeys.remove(index);
                return mgaValues.remove(index);
            }
        }
}
