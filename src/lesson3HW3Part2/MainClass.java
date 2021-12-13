package lesson3HW3Part2;

public class MainClass {
    public static void main(String[] args) {
        String test = "  Tesssst_String ";
        String trimmedTest = test.trim();
        //1
        System.out.println("Task 1");
        System.out.println(trimmedTest);
        //2
        String allBeforeCharacter = test.split("_")[0].trim();
        System.out.println("Task 2");
        System.out.println(allBeforeCharacter);
        //3
        System.out.println("Task 3");
        if (!test.isBlank()) {
            char firstNonEmpty = test.trim().charAt(0);
            if (firstNonEmpty == 't' || firstNonEmpty == 'T') {
                String output = "Первый символ - «Т»";
                System.out.println(output);
            }
        }
        //4
        System.out.println("Task 4");
        String output2 = "";
        output2 = test.replaceFirst("s", "y");
        System.out.println(output2);

    }
}
