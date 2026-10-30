import java.util.Scanner;
class practice {
    public static void main(String[] args) {
        // single line comment 
        /* 
        multi line comment 
         */
        System.out.println("This is me!");
        
        // primitive data types
        byte age = 30;
        int phone = 1234567910;
        long phone2 = 123456789011L;
        float pi = 3.1416F;
        char letter = '@';
        boolean isAdult = true;

        System.out.println(pi);

        // non primitive data types
        String name1 = "Arpa";
        String name2 = "Rahman";
        String name3 = name1 + " and " + name2;

        System.out.println(name1.length());
        System.out.println(name3);
        System.out.println(name1.charAt(0));
        System.out.println(name2.replace('a', 'r'));
        System.out.println(name2);

        // substring

        String name = "Arpa and Aronno";
        System.out.println(name.substring(0, 4));
        
        // Array

        int[] ma = {1, 2, 3, 4};
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;
        System.out.println(marks.length);
        System.out.println(marks[2]);

        // input

        Scanner input = new Scanner(System.in);
        String me = input.nextLine();
        System.out.println(me);
        
 
    }
}