package lesson4HW5;

import java.util.ArrayList;
import java.util.List;

public class ReverseValues {
    public static List<Integer> getReverseList(List<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() -1; i >=0; i--) {
            Integer reversedValue = list.get(i);
            reversedList.add(reversedValue);

        }
        return reversedList;
    }
}
