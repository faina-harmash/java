package lesson1;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello");
        int var;
        var = 5;
        int var2 = 10;
        int result = var + var2;
        System.out.println(result);
        System.out.println("Result = " + (result + var));

        Calc.sum(var, var2);

        Calc calc = new Calc();
        int result1 = calc.mult(5, 10);
        calc.mult(var, 5);
        calc.mult(result1, 2);

        calc.sum (calc.sum("test ", " pass"), "!!!");
    }
}
