package lesson4HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(57);
        myList.add(10);

        Integer maxValue = MaxValue.findMaxValue(myList);
        System.out.println(maxValue);

        List<Integer> reversedList = ReverseValues.getReverseList(myList);
        System.out.println(reversedList);

    }
}
