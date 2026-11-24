public class FuntionOverloading {
    public static void main(String[] args) {
        
        // fuction overloading

        System.out.println(Sum(2, 3, 4));
        greet(19, "arpa");
        greet("arpa", 19);
    }

    // sum function
    static int Sum(int i, int j){
        return i+j;
    }

    static int Sum(int i, int j, int k){
        return i+j+k;
    }

    static int Sum(double i, double j, double k){
        return (int)(i+j+k);
    }


    static void greet(String name, int age){
        System.out.println("Hi, "+ name + ". Your age is " + age);
    }

    static void greet(int age, String name){
        System.out.println("Hello, "+name+". Your age is "+age);
    }

}
