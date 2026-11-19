public class PrintfExercise {
    public static void main(String[] args) {

        // printf() = a method used to format output

        // %[data type][width][.precision][specifier-char]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello, %s\n", name); // %s for String
        System.out.printf("Your name starts with a %c\n", firstLetter);  // %c for Chars
        System.out.printf("You are %d years  old\n", age); // %d for integers
        System.out.printf("Your are %f inches tall\n", height); // %f for floating points
        System.out.printf("Employed: %b \n", isEmployed); // %b for Boolean values

        System.out.printf("%s is %d years old\n", name, age);

        // How does precision work?

        System.out.println("");

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -72.69;

        // We can also use different flags
        // + to output a plus in front
        // , a grouping separator
        // ( negative numbers are enclosed in ()
        // space = display a minus if it is negative

        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%(.2f\n", price3);

        /* Between the data type, put the precision you want it to go to, and voilà!
           It is useful for prices and other floating point numbers.
         */

        System.out.println("");

        // How to use width:

        // 0 = no padding (can also be left blank)
        // number = right padding
        // negative number = left padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        // This is extremely useful to align characters and pad numbers with different settings

    }
}
