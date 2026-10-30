public class data_type {
    public static void main(String[] args) {

        // Integers --> byte , short, int, long
        // binary , octal, hexadecimal
        byte b = 5;
        // byte b = 0b101; // binary - 0b
        // byte b = 07; // ocatal - 0
        // byte b = 0x5; // hexadecimal - 0x
        short s = 128;
        int i = 1234562121;
        long l = 1234569082L;
        long l1 = 10_111_10;

        System.out.println("Integer values = " + b + ", "+ s + ", " + i + ", " + l);
    
        // real numbers
        float f = 10.43f;
        double d = 23.1234;
        double d1 = 6.22e23;
        System.out.println("Real numbers = " + f + ", " + d + ", " + d1);
    

        // characters
        char c = 'a';
        char c1 = 65;
        char c2 = 97;
        System.out.println("CHaracter values = " + c + ", " + c1 + ", " + c2);

        // boolean values
        boolean bool = true;
        boolean bool1 = false;

        System.out.println("Boolean values = " + bool +", " + bool1);


        int isa = 10;
        byte bsd = (byte) isa;
        System.out.println(bsd);
    }
}
