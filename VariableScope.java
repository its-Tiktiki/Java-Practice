public class VariableScope {
    static String name = "arpa";

    public static void main(String[] args){
        System.out.println(name);
        PrintNum(10);
        System.out.println("backtracking done.");
    }

    static void PrintNum(int n){

        if(n == 0){
            System.out.println("Backtracking start.");
            return;
        }

        System.out.println(n);
        PrintNum(n-1);

        System.out.println(n);
    }
    
}
