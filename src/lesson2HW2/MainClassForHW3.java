package lesson2HW2;

public class MainClassForHW3 {
    public static void main(String[] args) {
        Calculator3 calculator3 = new Calculator3();
        calculator3.division(10, 5);
        calculator3.division(10.5, 5.5);
        calculator3.division(10, 0);
        calculator3.division(10.5, 0);

        //3. В основной программе объявить массив {12, 5, -3, 45, 0, 10}
        int[] massive = {12, 5, -3, 45, 0, 10};

        WorkWithMassive workWithMassive = new WorkWithMassive();
        workWithMassive.analyzeMassive(massive, 10);
        workWithMassive.analyzeMassive(null,10);
    }
}
