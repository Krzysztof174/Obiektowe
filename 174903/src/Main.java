import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class Main {
    static ArrayList<Integer> append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < tab1.size(); i++) {
            list.add(tab1.get(i));
        }
        for(int i = 0; i < tab2.size(); i++) {
            list.add(tab2.get(i));
        }
        System.out.println("ArrayList : " + list.toString());
        return list;
    }
    static ArrayList<Integer> merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int turn = 0;
        while(i + j < tab1.size() + tab2.size()) {
            if(i == tab1.size()) {
                list.add(tab2.get(j));
                j++;
                continue;
            }
            if(j == tab2.size()) {
                list.add(tab1.get(i));
                i++;
                continue;
            }
            if(turn == 0) {
                list.add(tab1.get(i));
                i++;
                turn = 1;
            }
            else {
                list.add(tab2.get(j));
                j++;
                turn = 0;
            }
        }
        System.out.println("ArrayList : " + list.toString());
        return list;
    }
    static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        ArrayList<Integer> mergedList = append(tab1, tab2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(mergedList.size() > 0) {
            int min = mergedList.get(0);
            int minIndex = 0;
            for (int i = 1; i < mergedList.size(); i++) {
                if (mergedList.get(i) < min) {
                    min = mergedList.get(i);
                    minIndex = i;
                }
            }
            list.add(min);
            mergedList.remove(minIndex);
        }
        System.out.println("ArrayList : " + list.toString());
        return list;
    }
    static ArrayList<String> toArrayList(String napis) {
        String[] strSplit = napis.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strSplit));

        Collections.sort(list);
        System.out.println("ArrayList : " + list.toString());
        return list;
    }
    static ArrayList<Integer> toArrayList(int liczba) {
        String str = liczba + "";
        String[] strSplit = str.split("");
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(strSplit));
        Collections.sort(stringList);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i< stringList.size(); i++) {
            list.add(Integer.parseInt(stringList.get(i)));
        }
        System.out.println("ArrayList : " + list.toString());
        return list;
    }
    static boolean checkChar(ArrayList<String> tab, char znak) {
        boolean found = false;
        for(int i = 0; i< tab.size(); i++) {
            if(znak == tab.get(i).charAt(0)) found = true;
        }
        return found;
    }
    static boolean checkDigit(ArrayList<Integer> tab, int cyfra) {
        boolean found = false;
        for(int i = 0; i< tab.size(); i++) {
            if(cyfra == tab.get(i)) found = true;
        }
        return found;
    }
    static int countChar(ArrayList<String> tab, char znak) {
        int count = 0;
        for(int i = 0; i< tab.size(); i++) {
            if(znak == tab.get(i).charAt(0)) count++;
        }
        return count;
    }
    static int countDigit(ArrayList<Integer> tab, int cyfra) {
        int count = 0;
        for(int i = 0; i< tab.size(); i++) {
            if(cyfra == tab.get(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // 1
        ArrayList<Integer> list1 = new ArrayList<Integer>() {{
            add(1);
            add(3);
        } };
        ArrayList<Integer> list2 = new ArrayList<Integer>() {{
            add(2);
            add(4);
        } };
        append(list1, list2);
        // 2
        merge(list1, list2);
        // 3
        mergeSorted(list1, list2);
        // 4
        toArrayList("bac");
        toArrayList(312);
        // 5
        System.out.println(checkChar(toArrayList("bac"), 'a'));
        System.out.println(checkDigit(toArrayList(312), 1));
        // 6
        System.out.println(countChar(toArrayList("baca"), 'a'));
        System.out.println(countDigit(toArrayList(3121), 1));
    }
}