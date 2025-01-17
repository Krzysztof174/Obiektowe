import java.util.*;

public class Main {
        public static <T> boolean isEqual(T a, T b) {
                return a.equals(b);
        }
        public static <T> void swap(T[] list, int i, int j) {
                if(i > list.length - 1 || j > list.length - 1) return;
                if(i < 0 || j < 0) return;
                T tmp = list[i];
                list[i] = list[j];
                list[j] = tmp;
        }
        public static <T extends Comparable<T>> T minValue(T[] list) {
                if(list.length == 0) return null;

                T smallestElement = list[0];
                for(int i = 1; i < list.length; i++) {
                        if(list[i].compareTo(smallestElement) < 0) smallestElement = list[i];
                }
                return smallestElement;
        }
        public static <T extends Comparable<T>> Animal findMax(Pair<? extends Animal> pair) {
                if(pair.firstObject.compareTo(pair.secondObject) >= 0) {
                        return pair.firstObject;
                }
                return pair.secondObject;
        }

        public static <T> void printUnique(Collection<T> list) {
                Set<T> uniqueElements = new HashSet<T>(list);

                for(T item : uniqueElements) {
                        System.out.println(item);
                }
        }
        public static <T> int countOccurences(Collection<T> items, T element) {
                int count = 0;
                for(T item : items) {
                        if(item.equals(element)) {
                                count++;
                        }
                }
                return count;
        }
        public static <T> ArrayList<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2) {
                ArrayList<T> result = new ArrayList<>();
                result.addAll(list1);
                result.addAll(list2);
                return result;
        }
        public static <T> boolean isPalindrome(LinkedList<T> list) {
                for(int i = 0; i < list.size() / 2; i++) {
                        if(list.get(i) != list.get(list.size() - 1 - i)) {
                                return false;
                        }
                }
                return true;
        }
        public static <T> HashSet<T> findUniqueElements(List<T> list) {
                return new HashSet<T>(list);
        }
        public static <T> TreeSet<T> findElementsInRange(TreeSet<T> list, T lowerBound, T upperBound) {
                return new TreeSet<>(list.subSet(lowerBound, true, upperBound, true));
        }
        public static <K, V> TreeMap<K, V> subMapInRange(TreeMap<K, V> map, K startKey, K endKey) {
                return new TreeMap<K, V>(map.subMap(startKey, true, endKey, true));
        }
        public static <K, V> HashMap<V, Integer> countValueOccurences(HashMap<K, V> map) {
                HashMap<V, Integer> result = new HashMap<>();
                for(int i = 0; i < map.size(); i++) {
                        int occurences = 1;
                        if(map.containsKey(map.get(i))) {
                                occurences = result.get(map.get(i)) + 1;
                        }
                        result.put(map.get(i), occurences);
                }
                return result;
        }
        public static void main(String[] args) {
                TreeSet<Integer> set = new TreeSet<>();
                set.add(5);
                set.add(6);
                set.add(7);
                set.add(8);
                TreeSet<Integer> newSet = new TreeSet<>(findElementsInRange(set, 6, 7));
                System.out.println(newSet);
        }
}
