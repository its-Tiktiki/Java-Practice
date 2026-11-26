public class switchCase {
    public static void main(String[] args) {
        int a = 10;

        switch (a) {
            case 11:
                System.out.println(11);
                break;
            case 10:
                System.out.println(10);
            case 9:
                System.out.println(9);
                
            case 8:
                System.out.println(8);
                break;
            default:
                System.out.println(7);
                break;
        }

        System.out.println( a > 11);


        String s = "ara";
        switch(s){
            case "ada":
                System.out.println("ada");
                break;
            case "ara":
                System.out.println("ara");
                break;
            default:
                System.out.println("asa");

        }
    }
}
