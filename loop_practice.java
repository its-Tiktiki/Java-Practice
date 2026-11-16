class Loop{
    public static void main(String[] args){

        // // comma seperated variation
        // for(int i = 1, j = 1, k = 1; i <= 10 || j <= 10 || k <= 10; i++, j+=2, k++){
        //     System.out.println(i*j*k);
        // }


        // // boolean
        // boolean b = true;
        // for(int i = 1; b == true; i++){
        //     System.out.println(i);
        //     if(i == 5)
        //         b = false;
        // }

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // labels of loop

        outer: for(int i = 1; i <= 5; i++){
            inner: for(int j = 1; j <= 5; j++){
                if(j == 4){
                    System.out.println("inner loop break");
                    break;}
                System.out.println("outside inner loop");
            }
        }

        // outer: if(true){
        //     inner: if(true){
        //         System.out.println("hello");
        //         break outer;
        //     }
        // }
    }
}