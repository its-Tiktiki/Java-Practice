public class ChainingFunctions {
    public static void main(String[] args) {
        main();
        System.out.println("Function backtracking done.");
    }

    public static void main() {
        n();
        System.out.println("function main backtracking...");  
    }

    
    static void n(){
        System.out.println("helo");
        m();
        System.out.println("Function n backtracking...");
    }

    static void m(){
        System.out.println("bye");
    }

}
