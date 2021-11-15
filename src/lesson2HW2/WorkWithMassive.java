package lesson2HW2;
//4. В WorkWithArray разработать метод void analyzeMassive (int[] massive, int varForComparing), в котором вывести сообщения
//Если значение масива больше varForComparing - massive[i] +" Value is more than " + varForComparing
//Если значение масива равно varForComparing - massive[i] +" Value is equal  " + varForComparing
//Если значение масива меньше varForComparing - massive[i] +" Value is less than " + varForComparing
//В методе обработать ексепшены.

public class WorkWithMassive {
    void analyzeMassive(int[] massive, int varForComparing) {
        if (massive == null) {
            System.out.println("Error: massive is null");
        } else
        for (int i = 0; i < massive.length; i++) {
              if (massive[i] > varForComparing) {
                System.out.println(massive[i] + " Value is more than " + varForComparing);
            } else if (massive[i] == varForComparing) {
                System.out.println(massive[i] + " Value is equal  " + varForComparing);
            } else {
                System.out.println(massive[i] + " Value is less than " + varForComparing);
            }

        }
    }

}
