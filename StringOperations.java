public class StringOperations {
    public static void main(String[] args) {

        // concatination of strings
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        // length of string
        int length = str3.length();
        System.out.println("Length of string: " + length);

        // substring of string
        String substr = str3.substring(0, 5);
        System.out.println("Substring: " + substr);

        // replace characters in string
        String replacedStr = str3.replace("World", "Java");
        System.out.println("Replaced string: " + replacedStr);

        // convert string to uppercase
        String upperStr = str3.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);

        // convert string to lowercase
        String lowerStr = str3.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);

        // trim whitespace from string
        String strWithSpaces = "   Hello World   ";
        String trimmedStr = strWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");

        // check if string contains a substring
        boolean contains = str3.contains("World");
        System.out.println("Contains 'World': " + contains);

        // check if string starts with a prefix
        boolean startsWith = str3.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith);

        // check if string ends with a suffix
        boolean endsWith = str3.endsWith("World");
        System.out.println("Ends with 'World': " + endsWith);

        // convert string to character array
        char[] charArray = str3.toCharArray();
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        // split string into an array of substrings
        String[] strArray = str3.split(" ");
        System.out.print("\nString array: ");
        for (String s : strArray) {
            System.out.print(s + " ");
        }

        // compare two strings
        String str4 = "Hello";
        boolean isEqual = str1.equals(str4);
        System.out.println("\nIs str1 equal to str4: " + isEqual);

        // compare two strings ignoring case
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str4);
        System.out.println("Is str1 equal to str4 ignoring case: " + isEqualIgnoreCase);

        // check if string is empty
        boolean isEmpty = str3.isEmpty();
        System.out.println("Is str3 empty: " + isEmpty);

        // check if string is blank
        boolean isBlank = str3.isBlank();
        System.out.println("Is str3 blank: " + isBlank);


    }
    
}
