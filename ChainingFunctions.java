public class ChainingFunctions {
    public static void main(String[] args) {
        main();
        System.out.println("Function backtracking done.");
    }

    public static void main() {
        System.out.println("inside main function.");
        n();
        System.out.println("function main backtracking..");  
    }

    
    static void n(){
        System.out.println("inside n function");
        m();
        System.out.println("Function n backtracking...");
    }
    

    static void m(){
        System.out.println("inside m function");
        k();
        System.out.println("function m backtracking....");
    }

    static void k(){
        System.out.println("Inside k functing.");
        l();
        System.out.println("function l backtracking....");

    }

    static void l(){
        System.out.println("inside l fucntion.");
        f();
        System.out.println("function f backtracting.....");
    }

    static void f(){
        System.out.println("inside f function.");
    }

}
