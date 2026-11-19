public class StringMethods {
    public static void main(String[] args) {

        String name = "Hamad Mehmood";

        int len = name.length(); // gets the length of your string
        char letter = name.charAt(9); // gets the character at the specified index in the string
        int index = name.indexOf("d"); // outputs index of where specified char appears first
        int lastIndex = name.lastIndexOf("m"); // outputs index of where specified char appears last
        name = name.toUpperCase(); // turns specified string into full uppercase chars

        System.out.println("The name is "+len+" characters long.");
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);

        name = name.toLowerCase(); // turns specified string into full lowercase chars

        System.out.println(name);

        name = "     Hamad Mehmood     ";
        name = name.trim(); // trims unnecessary spaces in the string
        System.out.println(name);

        name = name.replace("a", "o"); // replaces chars with ones specified
        System.out.println(name);

        name = "Hamad Mehmood";

        System.out.println(name.isEmpty()); // performs boolean check for empty strings

        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Your name is "+ name);
        }

        if(name.contains(" ")){ // evidently, it checks or certain chars inside strings
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Your name does not contain a space");
        }

        if(name.equals("Hamad Mehmood")) { // checks if a string is equal to another one
            System.out.println("I know you");
        } // however it has the downside of not ignoring cases so we use .equalsIgnoreCase
        else{
            System.out.println("I DON'T know you");
        }
    }
}
