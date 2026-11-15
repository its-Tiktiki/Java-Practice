public class demo{

    public static void main() {
        System.out.println("send");
        
    }
    static void main(String[] args){

    int a = 100;
    int b = 200;

    if (a < b)
        System.out.println("hello");
    else if (b < a)
        System.out.println("hsdf");
    else 
        System.out.println("hs");

    System.out.println(args[0]);

    main();

    
    int i = 1;
    if(i < 5)
        System.out.println("3 is greater than 2");
        System.out.println("3 is greater than 2");
        i++;
    System.out.println("i is: " + i);


    for(int j = 0; j < 5; j++)
        System.out.println("j is: " + j);
        /* System.out.println("j is: " + j);   for any loop without curly braces, it counts one statement after the loop
        as its block statement*/
    

    }
}