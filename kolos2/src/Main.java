import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static <T extends Comparable<T>> void sortDescending(T[] array) {
        Arrays.parallelSort(array, Comparator.reverseOrder());
    }
    public static void main(String[] args) {
        // zad 1
        House house1 = new House(100, "red", 5);
        System.out.println(house1.color + house1.numberOfRooms);
        // zad 6
        Integer[] array = new Integer[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = i%3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("sorted: ");
        sortDescending(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}