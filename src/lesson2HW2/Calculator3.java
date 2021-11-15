package lesson2HW2;

//2. Разработать метод
//int division(int var1, int var2)
//и метод
//double division(double var1 , double var2)
//В данных методах обработать исключения там где это нужно.

public class Calculator3 {
    int division(int var1, int var2) {
        try {
            int var3 = var1 / var2;
            System.out.println("Division Result is - " + var3);
            return var3;
        } catch (Exception e) {
            System.out.println("Error - " + e);
            return 0;
        } finally {
            System.out.println("Finally");
        }
    }

    double division(double var1, double var2) {
        try {
            double var3 = var1 / var2;
            System.out.println("Division Result is - " + var3);
            return var3;
        } catch (Exception e) {
            System.out.println("Error - " + e);
            return 0;
        } finally {
            System.out.println("Finally");
        }
    }
}
