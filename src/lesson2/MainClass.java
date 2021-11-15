package lesson2;

public class MainClass {
    public static void main(String[] args) {
        Calc2 calc2 = new Calc2();
        calc2.sumDouble(5, 10);
        calc2.sumDouble(5, "11test");
        calc2.sumDouble("11", 5);
        calc2.sumDouble("11a1", 5);

        int[] massive = {11, 5, 10, 4, 8, 0};
        System.out.println(massive);
        System.out.println(massive[2]);
        System.out.println(massive.length);

        int[] massive2 = new int[3];
        massive2[0] = 6;
        massive2[1] = 7;
        massive2[2] = 8;

        for (int i = 0; i < 4; i = i + 1) {
            System.out.println(massive[i]);
        }
        //i++ = (i = i + 1)

        for (int i = 0; i < massive2.length; i = i + 1) {
            if (massive2[i] >= 5) {
                System.out.println("Element on position N = " + (i + 1) + " number " + massive2[i]);
            } else {
                System.out.println(massive2[i] + "element is less than 5");
            }
        }

        System.out.println("---The end---");
    }
}
