package lesson4HW5;

import java.util.Collections;
import java.util.List;

public class MaxValue {

    public static Integer findMaxValue(List<Integer> list) {
        if (list == null) {
            return null;
        } else if (list.size() == 0) {
            return null;
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            Integer max = list.get(0);
            int n = list.size();
            for (int i = 0; i < n; i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            return max;
        }
    }
}
