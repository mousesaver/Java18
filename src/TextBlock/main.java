package TextBlock;

public class main {
    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Second Point";
        System.out.println(bulletIt);

        String textBlock = """
            Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Second Point
            """;
        System.out.println(textBlock);
        int age = 35;
        System.out.printf("Your age is %d%n", age);
        System.out.printf("Your age is %.2f%n", (float) age);
        int birthYear = 2022 - 35;
        System.out.printf("Age = %d, Birth Year = %d", age, birthYear);

        for (int i = 1; i < 100000; i *= 10) {
            System.out.printf("Printing %6d%n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
