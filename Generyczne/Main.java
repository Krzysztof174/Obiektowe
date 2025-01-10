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
        public static void main(String[] args) {
                Box<String> box1 = new Box<>();
                box1.setObject("Objekt 1");
                System.out.println(box1.getObject());

                Counter<String> stringCounter = new Counter<>();
                stringCounter.add("jeden");
                stringCounter.add("dwa");
                System.out.println(stringCounter.getCount());

                Person2[] person2Array = new Person2[2];
                person2Array[0] = new Person2("adam", 19);
                person2Array[1] = new Person2("ola", 23);
                System.out.println(minValue(person2Array));

                Dog firstDog = new Dog(5, "azor", "cos");
                Dog secondDog = new Dog(8, "pimpek", "cos");
                Pair pair = new Pair(firstDog, secondDog);
                System.out.println(findMax(pair).age);
        }
}
